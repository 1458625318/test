/**
 * 
 * 
 * 创建时间：2016-8-30 下午7:29:26
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.my_account.account;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.webbs.controller.customer.CustomerController;
import cn.jbit.webbs.entity.Customer;

/**
 * 客户平台 - 我的账户 - 账户：充值同步返回
 * 
 * 创建时间：2016-8-30 下午7:29:26
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.my_account.account.returnRechargeController")
@RequestMapping("/customer/my_account/account/")
public class ReturnRechargeController extends CustomerController {

	// 日志对象
	private final static Logger logger = Logger.getLogger(ReturnRechargeController.class);

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-30 下午7:31:44
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("returnRecharge")
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {

		logger.info("收到一个同步返回的通知......");

		try {

			// 读取所有参数
			Map<String, String> paramMap = getAllParam(request);

			// 验证结果
			boolean verifyResult = true;
			// 消息
			String message = null;

			// 支付宝的同步通知在MHPay项目中是否验证通过
			String verifyResultStr = paramMap.get("verifyResult");
			if (verifyResultStr == null || verifyResultStr.trim().length() <= 0
					|| verifyResultStr.equalsIgnoreCase("false")) {
				verifyResult = false;
				message = paramMap.get("message");
				logger.info(message);
			}

			// 签证验证
			if (verifyResult) {
				// 构建生成签证码
				String sign = buildSign(paramMap, sysConfiguration.getMhpayRechargeProjectPassword());
				if (sign == null || !sign.equals(paramMap.get("sign"))) {
					verifyResult = false;
					message = "验证失败（签证验证不通过）。";
					logger.info(message);
				}
			}

			// 帐号Id的有效性
			Integer customerId = null;
			if (verifyResult) {
				// 客户Id
				String customerIdStr = paramMap.get("customerId");
				if (customerIdStr == null || customerIdStr.trim().length() <= 0) {
					verifyResult = false;
					message = "验证失败（无效的客户Id：" + customerIdStr + "）。";
					logger.info(message);
				} else {
					try {
						customerId = Integer.parseInt(customerIdStr);
					} catch (Exception e) {
						customerId = null;
					}
					if (customerId == null) {
						verifyResult = false;
						message = "验证失败（无效的客户Id：" + customerIdStr + "）。";
						logger.info(message);
					}
				}
			}

			// 验证客户对象
			Customer customer = null;
			if (verifyResult) {
				// 找寻客户记录
				customer = find(Customer.class, customerId);
				if (customer == null) {
					verifyResult = false;
					message = "不存在对应的客户记录（customerId：" + customerId + "）。";
					logger.info(message);
				}
			}

			// 创建Cookie
			Cookie cookie = new Cookie("isRecharge", paramMap.get("isRecharge"));
			// 设置cookie的路径
			cookie.setPath(request.getContextPath() + "/html/customer/my_account/account");
			// 保存起来
			response.addCookie(cookie);

			// 处理验证失败
			if (!verifyResult) {

				logger.info("验证失败。");

				// 创建对象
				ModelAndView mav = new ModelAndView();
				// 保存验证结果
				mav.addObject("verifyResult", verifyResult);
				// 保存消息
				mav.addObject("message", message);
				// 设置视图名称
				mav.setViewName("customer/my_account/account/return_recharge_result");

				// 返回函数值
				return mav;
			}

			logger.info("验证通过，正在执行操作......");

			// 创建对象
			ModelAndView mav = new ModelAndView();
			// 验证结果
			mav.addObject("verifyResult", verifyResult);
			// 消息
			message = paramMap.get("message");
			mav.addObject("message", message);
			// 是否充值
			String isRecharge = paramMap.get("isRecharge");
			mav.addObject("isRecharge", Boolean.parseBoolean(isRecharge));
			// 充值金额
			String rechargeMoney = paramMap.get("rechargeMoney");
			mav.addObject("rechargeMoney", rechargeMoney);
			// 账户余额
			String totalMoney = paramMap.get("totalMoney");
			mav.addObject("totalMoney", totalMoney);
			// 锁定金额
			String lockMoney = paramMap.get("lockMoney");
			mav.addObject("lockMoney", lockMoney);
			// 项目接口帐号
			String projectUserName = paramMap.get("projectUserName");
			mav.addObject("projectUserName", projectUserName);

			// 设置视图名称
			mav.setViewName("customer/my_account/account/return_recharge_result");

			// 返回函数值
			return mav;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
