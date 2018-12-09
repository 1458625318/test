/**
 * 
 * 
 * 创建时间：2016-8-24 上午10:16:03
 * @author：moshco zhu
 */
package cn.jbit.webbs;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 系统配置参数
 * 
 * 创建时间：2016-8-24 上午10:16:03
 * 
 * @author moshco zhu
 * 
 */
public class SysConfiguration implements Serializable {

	// 日志对象
	protected final static Logger logger = Logger.getLogger(SysConfiguration.class);

	// 系统配置参数对象
	private static SysConfiguration sysConfiguration = null;

	// web service访问配置：项目Id
	@Value("${wservice.project-id}")
	protected Integer projectId = null;

	// web service访问配置：项目帐号
	@Value("${wservice.user-name}")
	protected String projectUserName = null;

	// web service访问配置：项目密码
	@Value("${wservice.password}")
	protected String projectPassword = null;

	// MHPay支付：网关url
	@Value("${mhpay.recharge.gateway_url}")
	protected String mhpayRechargeGatewayUrl = null;

	// MHPay支付：项目Id
	@Value("${mhpay.recharge.project_id}")
	protected String mhpayRechargeProjectId = null;

	// MHPay支付：项目帐号
	@Value("${mhpay.recharge.project_user_name}")
	protected String mhpayRechargeProjectUserName = null;

	// MHPay支付：项目帐号密码
	@Value("${mhpay.recharge.project_password}")
	protected String mhpayRechargeProjectPassword = null;

	// MHPay支付：同步返回Url
	@Value("${mhpay.recharge.return_url}")
	protected String mhpayRechargeReturnUrl = null;

	/**
	 * 初始化
	 * 
	 * 
	 * 开发时间：2016-8-24 上午10:19:16
	 * 
	 * @author：moshco zhu
	 */
	@PostConstruct
	public void init() {

		logger.info("正在初始化系统配置参数对象......");

		sysConfiguration = this;
	}

	/**
	 * @return the sysConfiguration
	 */
	public static SysConfiguration getSysConfiguration() {
		return sysConfiguration;
	}

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @return the projectUserName
	 */
	public String getProjectUserName() {
		return projectUserName;
	}

	/**
	 * @return the projectPassword
	 */
	public String getProjectPassword() {
		return projectPassword;
	}

	/**
	 * @return the mhpayRechargeGatewayUrl
	 */
	public String getMhpayRechargeGatewayUrl() {
		return mhpayRechargeGatewayUrl;
	}

	/**
	 * @return the mhpayRechargeProjectId
	 */
	public String getMhpayRechargeProjectId() {
		return mhpayRechargeProjectId;
	}

	/**
	 * @return the mhpayRechargeProjectUserName
	 */
	public String getMhpayRechargeProjectUserName() {
		return mhpayRechargeProjectUserName;
	}

	/**
	 * @return the mhpayRechargeProjectPassword
	 */
	public String getMhpayRechargeProjectPassword() {
		return mhpayRechargeProjectPassword;
	}

	/**
	 * @return the mhpayRechargeReturnUrl
	 */
	public String getMhpayRechargeReturnUrl() {
		return mhpayRechargeReturnUrl;
	}

}
