/**
 * 
 * 
 * 创建时间：2016-8-26 下午7:49:26
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.customer.my_account.account;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jbit.webbs.controller.customer.CustomerController;
import cn.jbit.webbs.entity.Customer;

/**
 * 提交充值
 * 
 * 创建时间：2016-8-26 下午7:49:26
 * 
 * @author moshco zhu
 * 
 */
@Controller("customer.my_account.account.submitRechargeController")
@RequestMapping("/customer/my_account/account/")
public class SubmitRechargeController extends CustomerController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-26 下午7:51:32
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @param rechargeMoney
	 * @return
	 */
	@RequestMapping("submitRecharge")
	@ResponseBody
	public Map<String, Object> execute(HttpServletRequest request,
			String rechargeMoney) {

		// 验证结果
		boolean verifyResult = true;
		// 消息
		String message = null;

		// 空验证
		if (rechargeMoney == null || rechargeMoney.trim().equals("")) {
			verifyResult = false;
			message = "充值金额不能为空。";
		}

		// 结果的Map集合
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 验证不通过
		if (!verifyResult) {
			// 设置返回结果
			resultMap.put("isSuccess", false);
			resultMap.put("message", message);
			// 返回函数值
			return resultMap;
		}

		// 获取当前登录的客户对象
		Customer currentCustomer = getCurrentCustomer(request);

		// 参数集合
		Map<String, String> paramMap = new HashMap<String, String>();
		// MHPay支付：项目Id
		paramMap.put("projectId", sysConfiguration.getMhpayRechargeProjectId());
		// MHPay支付：项目帐号名
		paramMap.put("projectUserName",
				sysConfiguration.getMhpayRechargeProjectUserName());
		// MHPay支付：同步返回的Url
		paramMap.put("returnUrl", sysConfiguration.getMhpayRechargeReturnUrl());
		// 账户Id
		paramMap.put("accountId", currentCustomer.getAccountId() + "");
		// 客户Id
		paramMap.put("customerId", currentCustomer.getId() + "");
		// 客户帐号名
		paramMap.put("customerUserName", currentCustomer.getUserName() + "");
		// 客户姓名
		paramMap.put("customerTrueName", currentCustomer.getTrueName() + "");
		// 充值金额
		paramMap.put("rechargeMoney", rechargeMoney);

		// 构建安全的url
		String submitRechargeUrl = buildRechargeUrl(
				sysConfiguration.getMhpayRechargeGatewayUrl(), paramMap,
				sysConfiguration.getMhpayRechargeProjectPassword());

		// 设置返回数据
		resultMap.put("url", submitRechargeUrl);
		resultMap.put("isSuccess", true);
		resultMap.put("message", "恭喜，验证通过，url生成成功。");

		// 返回函数值
		return resultMap;
	}

}
