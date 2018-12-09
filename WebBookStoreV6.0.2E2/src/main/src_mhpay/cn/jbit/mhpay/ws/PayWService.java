/**
 * 
 * 
 * 创建时间：2016-8-24 上午9:07:16
 * @author：moshco zhu
 */
package cn.jbit.mhpay.ws;

import java.io.Serializable;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cn.jbit.mhpay.entity.UserAccount;

/**
 * 支付业务
 * 
 * 创建时间：2016-8-24 上午9:07:16
 * 
 * @author moshco zhu
 * 
 */
@WebService(serviceName = "PayWService", targetNamespace = "http://mhpay.jbit.cn/ws")
public interface PayWService extends Serializable {

	// 找寻账户记录
	@WebResult(name = "findUserAccountByUserNameResult")
	public UserAccount findUserAccountByUserName(
			@WebParam(name = "projectId", targetNamespace = "http://mhpay.jbit.cn/ws") Integer projectId,
			@WebParam(name = "userName", targetNamespace = "http://mhpay.jbit.cn/ws") String userName);

	// 找寻账户记录
	@WebResult(name = "findUserAccountResult")
	public UserAccount findUserAccount(
			@WebParam(name = "userAccountId", targetNamespace = "http://mhpay.jbit.cn/ws") Integer userAccountId);

	// 分页查询交易记录
	@WebResult(name = "queryPaginationTradeRecordResult")
	public PaginationTradeRecord queryPaginationTradeRecord(
			@WebParam(name = "queryParamMap", targetNamespace = "http://mhpay.jbit.cn/ws") Map<String, Object> queryParamMap,
			@WebParam(name = "pageIndex", targetNamespace = "http://mhpay.jbit.cn/ws") Integer pageIndex,
			@WebParam(name = "pageSize", targetNamespace = "http://mhpay.jbit.cn/ws") Integer pageSize);

}
