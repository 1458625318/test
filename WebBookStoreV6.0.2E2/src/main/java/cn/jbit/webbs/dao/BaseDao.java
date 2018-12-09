/**
 * 
 * 
 * 创建时间：2017年9月12日 下午12:01:38
 * @author：moshco zhu
 */
package cn.jbit.webbs.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 公共业务（业务无关）
 * 
 * 创建时间：2017年9月12日 下午12:01:38
 * 
 * @author moshco zhu
 * 
 */
@Repository
public interface BaseDao extends Serializable {

	// 通过主键Id找寻实体对象
	public <T> T find(Map<String, Object> paramMap);

	// 通过唯一索引字段找寻实体对象
	public Map<String, Object> findByField(Map<String, Object> paramMap);

	// 通过多个条件找寻实体对象
	public Map<String, Object> findByFields(Map<String, Object> paramMap);

	// 更新实体对象
	public void update(Map<String, Object> paramMap);

	// 保存实体对象
	public void save(Map<String, Object> paramMap);

	// 分页查询实体（通过多个字段匹配）：统计记录的总数
	public Integer queryPaginationCount(Map<String, Object> paramMap);

	// 分页查询实体（通过多个字段匹配）：查询当前页列表
	public List<Map<String, Object>> queryPaginationList(Map<String, Object> paramMap);

	// 删除实体对象
	public void delete(Map<String, Object> paramMap);

	// 查询实体列表（通过指定的字段匹配）
	public List<Map<String, Object>> queryByField(Map<String, Object> paramMap);

	// 查询实体列表（通过多个字段匹配）
	public List<Map<String, Object>> queryByFields(Map<String, Object> paramMap);

}
