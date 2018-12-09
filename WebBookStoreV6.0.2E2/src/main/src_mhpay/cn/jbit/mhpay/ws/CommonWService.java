/**
 * 
 * 
 * 创建时间：2016-8-24 上午8:51:32
 * @author：moshco zhu
 */
package cn.jbit.mhpay.ws;

import java.io.Serializable;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 公共业务（无安全验证）
 * 
 * 创建时间：2016-8-24 上午8:51:32
 * 
 * @author moshco zhu
 * 
 */
@WebService(serviceName = "CommonWService", targetNamespace = "http://mhpay.jbit.cn/ws")
public interface CommonWService extends Serializable {

	// 问好
	@WebResult(name = "sayHelloResult")
	public String sayHello(
			@WebParam(name = "trueName", targetNamespace = "http://mhpay.jbit.cn/ws") String trueName);

}
