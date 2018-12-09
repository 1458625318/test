/**
 * 
 * 
 * 创建时间：2016-11-22 下午2:56:02
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 公共业务（业务无关）
 * 
 * 创建时间：2016-11-22 下午2:56:02
 * 
 * @author moshco zhu
 * 
 */
public interface BaseService extends Serializable {

	// 通过主键Id找寻实体对象
	<T> T find(Class<T> entityClass, Serializable keyId);

	// 通过多个条件找寻实体对象
	<T> T find(Class<T> entityClass, Map<String, Object> queryParam);

	// 通过唯一字段找寻实体对象
	<T> T find(Class<T> entityClass, String fieldName, Object fieldValue);

	// 更新实体对象
	<T> void update(T entityBean);

	// 保存实体对象
	<T> void save(T entityBean);

	// 分页查询
	<T> Object[] queryPagination(Class<T> entityClass, Map<String, Object> queryParam, Integer pageIndex,
			Integer pageSize);

	// 删除实体对象
	<T> void remove(T entityBean);

	// 查询指定实体（通过指定的字段匹配）
	<T> List<T> query(Class<T> entityClass, String fieldName, Object fieldValue);

	// 查询指定实体（通过多个字段匹配）
	<T> List<T> query(Class<T> entityClass, Map<String, Object> queryParam);

}
