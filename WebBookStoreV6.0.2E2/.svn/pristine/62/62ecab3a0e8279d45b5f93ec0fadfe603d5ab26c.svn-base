/**
 * 
 * 
 * 创建时间：2016-10-20 上午10:03:28
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jbit.mhpay.ws.CommonWService;
import cn.jbit.mhpay.ws.PayWService;
import cn.jbit.webbs.SysConfiguration;
import cn.jbit.webbs.entity.Announcement;
import cn.jbit.webbs.service.WebBookStoreBaseService;

/**
 * 公共业务（业务有关）
 * 
 * 创建时间：2016-10-20 上午10:03:28
 * 
 * @author moshco zhu
 * 
 */
public abstract class WebBookStoreBaseController extends BaseController {

	// 日志对象
	private final static Logger logger = Logger.getLogger(WebBookStoreBaseController.class);

	// 公共业务（业务有关）
	@Autowired
	@Qualifier("webBookStoreBaseService")
	protected WebBookStoreBaseService webBookStoreBaseService = null;

	// 公共业务（无安全验证）
	@Autowired
	@Qualifier("commonWService")
	protected CommonWService commonWService = null;

	// 支付业务
	@Autowired
	@Qualifier("payWService")
	protected PayWService payWService = null;

	// 系统配置参数对象
	@Autowired
	@Qualifier("sysConfiguration")
	protected SysConfiguration sysConfiguration = null;

	/**
	 * 构建充值的Url
	 * 
	 * 
	 * 开发时间：2016-8-27 下午3:19:25
	 * 
	 * @author：moshco zhu
	 * @param gatewayUrl
	 * @param paramMap
	 * @param projectPassword
	 * @return
	 */
	protected String buildRechargeUrl(String gatewayUrl, Map<String, String> paramMap, String projectPassword) {

		// 生成签证码
		String sign = buildSign(paramMap, projectPassword);

		// 获取参数名的集合
		Set<String> paramNameSet = paramMap.keySet();

		// 拼接生成url的参数
		StringBuffer urlParamBuffer = new StringBuffer();
		// 拼接生成url参数
		if (paramNameSet != null && paramNameSet.size() > 0) {
			for (String paramName : paramNameSet) {
				// sign参数不参与拼接
				if ("sign".equals(paramName)) {
					continue;
				}
				// 读取参数值
				String paramValue = paramMap.get(paramName);
				try {
					// 中文参数加密
					paramValue = java.net.URLEncoder.encode(paramValue, "utf-8");
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 连接符
				if (urlParamBuffer.length() > 0) {
					urlParamBuffer.append("&");
				}
				// 拼接参数
				urlParamBuffer.append(paramName);
				urlParamBuffer.append("=");
				urlParamBuffer.append(paramValue);
			}
		}

		// 生成重定向去充值的url
		StringBuffer rechargeUrl = new StringBuffer();
		// 网关的url
		rechargeUrl.append(gatewayUrl);
		// 连接符
		if (!gatewayUrl.endsWith("?")) {
			rechargeUrl.append("?");
		}
		// url参数
		rechargeUrl.append(urlParamBuffer);
		// 签证码
		if (urlParamBuffer.length() > 0) {
			rechargeUrl.append("&");
		}
		rechargeUrl.append("sign=");
		rechargeUrl.append(sign);
		// 转换为字符串
		String url = rechargeUrl.toString();

		// 返回函数值
		return url;
	}

	/**
	 * 构建生成签证码
	 * 
	 * 
	 * 开发时间：2016-8-27 下午3:36:24
	 * 
	 * @author：moshco zhu
	 * @param paramMap
	 * @param projectPassword
	 * @return
	 */
	protected String buildSign(Map<String, String> paramMap, String projectPassword) {

		// 构建一个新的参数集合
		Map<String, String> newParamMap = new HashMap<String, String>(paramMap);
		// 删除已经存在的sign参数
		newParamMap.remove("sign");

		// 获取参数名的集合
		Set<String> paramNameSet = newParamMap.keySet();
		// 构建参数名的List
		List<String> paramNameList = new ArrayList<String>(paramNameSet);
		// 排序
		Collections.sort(paramNameList);

		// 参数Url
		StringBuffer urlParamBuffer = new StringBuffer();
		if (paramNameList != null && paramNameList.size() > 0) {
			for (String paramName : paramNameList) {
				// 空的参数名不参与url拼接
				if (paramName == null || paramName.equals("")) {
					continue;
				}
				// 读取参数值
				String paramValue = newParamMap.get(paramName);
				// 空的值不参与url拼接
				if (paramValue == null || paramValue.equals("")) {
					continue;
				}
				// 连接符
				if (urlParamBuffer.length() > 0) {
					urlParamBuffer.append("&");
				}
				// 连接参数
				urlParamBuffer.append(paramName);
				urlParamBuffer.append("=");
				urlParamBuffer.append(paramValue);
			}
		}
		// 连接密码
		urlParamBuffer.append(projectPassword);
		// 使用md5将字符串加密
		String sign = DigestUtils.md5Hex(urlParamBuffer.toString());

		// 返回函数值
		return sign;
	}

	/**
	 * 找寻指定日期的通告
	 * 
	 * 
	 * 开发时间：2017年7月7日 下午5:00:17
	 * 
	 * @author：moshco zhu
	 * @param date
	 * @return
	 */
	protected Announcement findAnnouncement(Date date) {

		// 查询参数集合
		Map<String, Object> queryParamMap = new HashMap<String, Object>();
		queryParamMap.put("isPublish", 1);
		queryParamMap.put("date", date);
		// 找寻数据
		Announcement announcement = webBookStoreBaseService.findAnnouncement(queryParamMap);
		// 返回函数的值
		return announcement;

	}

}
