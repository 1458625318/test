/**
 * 
 * 
 * 创建时间：2016-8-24 上午10:39:53
 * @author：moshco zhu
 */
package cn.jbit.mhpay.ws.client;

import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Value;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 安全验证的拦截器
 * 
 * 创建时间：2016-8-24 上午10:39:53
 * 
 * @author moshco zhu
 * 
 */
public class SecurityVerifyInterceptor extends AbstractSoapInterceptor {

	// 命名空间
	private final static String NAMESPACE_URI = "http://mhpay.jbit.cn/ws";

	// 头元素名
	private final static String ELEMENT_HEADER = "soap:Header";

	// 安全验证的元素名
	private final static String ELEMENT_AUTHENTICATION = "auth:authentication";

	// 项目Id的元素名
	private final static String ELEMENT_APPID = "auth:appId";

	// 项目的帐号元素名
	private final static String ELEMENT_USER_NAME = "auth:userName";

	// 项目的密码元素名
	private final static String ELEMENT_PASSWORD = "auth:password";

	// 项目Id
	@Value("${wservice.project-id}")
	protected String projectId = null;

	// 项目帐号
	@Value("${wservice.user-name}")
	protected String userName = null;

	// 项目帐号密码
	@Value("${wservice.password}")
	protected String password = null;

	/**
	 * 
	 * 构造函数
	 * 
	 * 开发时间：2016-8-24 上午10:41:08
	 * 
	 * @author：moshco zhu
	 */
	public SecurityVerifyInterceptor() {
		// 在写入时激发
		super(Phase.WRITE);
	}

	/**
	 * 业务实现
	 * 
	 * 开发时间：2016-8-24 上午10:39:53
	 * 
	 * @author：moshco zhu
	 * @param message
	 * @throws Fault
	 */
	@Override
	public void handleMessage(SoapMessage message) throws Fault {

		// 创建文档对象
		Document doc = null;
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			doc = builder.newDocument();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 创建头元素
		Element headerElement = doc.createElement(ELEMENT_HEADER);

		// 创建安全验证的元素
		Element authenticationElement = doc.createElementNS(NAMESPACE_URI, ELEMENT_AUTHENTICATION);
		// 追加到头元素下面
		headerElement.appendChild(authenticationElement);

		// 创建项目Id的元素
		Element appIdElement = doc.createElementNS(NAMESPACE_URI, ELEMENT_APPID);
		// 设置值
		appIdElement.setTextContent(projectId);
		// 追加到安全验证的元素下面
		authenticationElement.appendChild(appIdElement);

		// 创建项目帐号的元素
		Element userNameElement = doc.createElementNS(NAMESPACE_URI, ELEMENT_USER_NAME);
		// 设置值
		userNameElement.setTextContent(userName);
		// 追加到安全验证的元素下面
		authenticationElement.appendChild(userNameElement);

		// 创建项目帐号密码的元素
		Element passwordElement = doc.createElementNS(NAMESPACE_URI, ELEMENT_PASSWORD);
		// 设置值
		passwordElement.setTextContent(password);
		// 追加到安全验证的元素下面
		authenticationElement.appendChild(passwordElement);

		// 创建头元素的QName对象
		QName headerQName = new QName(ELEMENT_HEADER);
		// 创建头元素的SOAP对象
		SoapHeader soapHeader = new SoapHeader(headerQName, headerElement);

		// 读取消息的头对象列表
		List<Header> headerList = message.getHeaders();
		// 将新建头的SOAP对象加入到列表中
		headerList.add(soapHeader);
	}

}
