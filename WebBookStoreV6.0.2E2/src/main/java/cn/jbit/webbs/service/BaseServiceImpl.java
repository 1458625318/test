/**
 * 
 * 
 * 创建时间：2016-11-22 下午2:56:50
 * @author：moshco zhu
 */
package cn.jbit.webbs.service;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.MapUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jbit.webbs.dao.BaseDao;

/**
 * 公共业务（业务无关）
 * 
 * 创建时间：2016-11-22 下午2:56:50
 * 
 * @author moshco zhu
 * 
 */
@Service("baseService")
public class BaseServiceImpl implements BaseService {

	// 日志对象
	private final static Logger logger = Logger.getLogger(BaseServiceImpl.class);

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseDao")
	protected BaseDao baseDao = null;

	/**
	 * 通过主键Id找寻实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:46:32
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param keyId
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> T find(Class<T> entityClass, Serializable keyId) {

		logger.info("开始找寻数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 键值
		paramMap.put("keyId", keyId);
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据
		Map<String, Object> rowMap = baseDao.find(paramMap);
		// 转换为Bean对象
		T entityBen = toEntityBean(entityClass, rowMap);

		logger.info("找寻数据完毕。");

		// 返回函数值
		return entityBen;

	}

	/**
	 * 通过唯一索引字段找寻实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:47:46
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> T find(Class<T> entityClass, String fieldName, Object fieldValue) {

		logger.info("开始通过普通字段（" + fieldName + "）找寻数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// where子句的SQL
		paramMap.put("whereSQL", buildWhereSQL(entityClass, fieldName, fieldValue));
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据
		Map<String, Object> rowMap = baseDao.findByField(paramMap);
		// 转换为Bean对象
		T entityBen = toEntityBean(entityClass, rowMap);

		logger.info("找寻数据完毕。");

		// 返回函数值
		return entityBen;

	}

	/**
	 * 通过多个条件找寻实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:47:05
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> T find(Class<T> entityClass, Map<String, Object> queryParam) {

		logger.info("开始通过普通字段（" + MapUtils.toProperties(queryParam).toString() + "）找寻数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// where子句的SQL
		paramMap.put("whereSQL", buildWhereSQL(entityClass, queryParam));
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据
		Map<String, Object> rowMap = baseDao.findByFields(paramMap);
		// 转换为Bean对象
		T entityBean = toEntityBean(entityClass, rowMap);

		logger.info("找寻数据完毕。");

		// 返回函数值
		return entityBean;
	}

	/**
	 * 更新实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:48:05
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 */
	@Transactional
	public <T> void update(T entityBean) {

		logger.info("开始更新数据......");

		// 实体Bean对象为空
		if (entityBean == null) {
			throw new RuntimeException("要修改的实体Bean对象不能为空。");
		}

		// 主键的值
		Integer keyId = (Integer) getFieldValue(entityBean, "id");
		// 实体类型
		Class<T> beanClass = (Class<T>) entityBean.getClass();
		// 将数据查询出来
		T olderEntityBean = find(beanClass, keyId);

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 表名
		paramMap.put("tableName", getTableName(beanClass));
		// 设值的SQL
		String setValueSQL = buildSetValueSQL(entityBean, olderEntityBean);
		if (setValueSQL != null && !setValueSQL.equals("")) {
			// 设值的SQL
			paramMap.put("setValueSQL", setValueSQL);
			// 主键的值
			paramMap.put("keyId", keyId);

			// 调用sql更新数据
			baseDao.update(paramMap);
			logger.info("修改完毕（id：" + keyId + "）。");
		} else {
			logger.info("数据没有改变（id：" + keyId + "）未执行任何的更新。");
		}

	}

	/**
	 * 保存实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:48:19
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 */
	@Transactional
	public <T> void save(T entityBean) {

		logger.info("开始保存数据......");

		// 实体Bean对象为空
		if (entityBean == null) {
			throw new RuntimeException("要保存的实体Bean对象不能为空。");
		}

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 表名
		paramMap.put("tableName", getTableName(entityBean.getClass()));
		// 字段名的SQL
		paramMap.put("fieldNameSQL", buildFieldNameSQL(entityBean.getClass()));
		// 字段值的SQL
		paramMap.put("fieldValueSQL", buildFieldValueSQL(entityBean));

		// 调用sql添加数据
		baseDao.save(paramMap);

		logger.info("id：" + paramMap.get("id"));

		// 将主键值设置给Bean对象
		setFieldValue(entityBean, "id", paramMap.get("id"));

		logger.info("保存完毕（id：" + paramMap.get("id") + "）。");

	}

	/**
	 * 分页查询实体（通过多个字段匹配）
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:48:45
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> Object[] queryPagination(Class<T> entityClass, Map<String, Object> queryParam, Integer pageIndex,
			Integer pageSize) {

		logger.info("开始通过普通字段（" + MapUtils.toProperties(queryParam).toString() + "）查询分页（pageIndex：" + pageIndex
				+ " pageSize：" + pageSize + "）数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// where子句的SQL
		paramMap.put("whereSQL", buildWhereSQL(entityClass, queryParam));
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据：当前页列表
		Integer totalRecord = baseDao.queryPaginationCount(paramMap);

		// 起始序号
		paramMap.put("beginIndex", (pageIndex - 1) * pageSize);
		// 页面尺寸
		paramMap.put("pageSize", pageSize);

		// 调用sql查询数据：当前页列表
		List<Map<String, Object>> rowMapList = baseDao.queryPaginationList(paramMap);

		// 行记录的列表
		List<T> beanList = null;
		if (rowMapList != null && rowMapList.size() > 0) {
			for (Map<String, Object> rowMap : rowMapList) {
				// 转换为Bean对象
				T entityBen = toEntityBean(entityClass, rowMap);
				// 创建列表对象
				if (beanList == null) {
					beanList = new ArrayList<T>();
				}
				// 加入到列表中
				beanList.add(entityBen);
			}
		}

		logger.info("查询数据完毕。");

		// 封装查询结果
		Object[] aryPagination = new Object[] { totalRecord, beanList };

		// 返回函数值
		return aryPagination;
	}

	/**
	 * 删除实体对象
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:49:00
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 */
	@Transactional
	public <T> void remove(T entityBean) {

		logger.info("开始删除数据......");

		// 实体Bean对象为空
		if (entityBean == null) {
			throw new RuntimeException("要删除的实体Bean对象不能为空。");
		}

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 表名
		paramMap.put("tableName", getTableName(entityBean.getClass()));

		// 主键的值
		Integer keyId = (Integer) getFieldValue(entityBean, "id");
		paramMap.put("keyId", keyId);

		// 调用sql删除数据
		baseDao.delete(paramMap);

		logger.info("删除完毕（id：" + keyId + "）。");

	}

	/**
	 * 查询实体列表（通过指定的字段匹配）
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:49:39
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> List<T> query(Class<T> entityClass, String fieldName, Object fieldValue) {

		logger.info("开始通过普通字段（" + fieldName + "）查询数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// where子句的SQL
		paramMap.put("whereSQL", buildWhereSQL(entityClass, fieldName, fieldValue));
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据
		List<Map<String, Object>> rowMapList = baseDao.queryByField(paramMap);

		// 行记录的列表
		List<T> beanList = null;
		if (rowMapList != null && rowMapList.size() > 0) {
			for (Map<String, Object> rowMap : rowMapList) {
				// 转换为Bean对象
				T entityBen = toEntityBean(entityClass, rowMap);
				// 创建列表对象
				if (beanList == null) {
					beanList = new ArrayList<T>();
				}
				// 加入到列表中
				beanList.add(entityBen);
			}
		}

		logger.info("查询数据完毕。");

		// 返回函数的值
		return beanList;
	}

	/**
	 * 查询实体列表（通过多个字段匹配）
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:50:05
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @return
	 */
	@Transactional(readOnly = true)
	public <T> List<T> query(Class<T> entityClass, Map<String, Object> queryParam) {

		logger.info("开始通过普通字段（" + MapUtils.toProperties(queryParam).toString() + "）查询数据......");

		// 参数的集合
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// where子句的SQL
		paramMap.put("whereSQL", buildWhereSQL(entityClass, queryParam));
		// 表名
		paramMap.put("tableName", getTableName(entityClass));

		// 调用sql查询数据
		List<Map<String, Object>> rowMapList = baseDao.queryByFields(paramMap);

		// 行记录的列表
		List<T> beanList = null;
		if (rowMapList != null && rowMapList.size() > 0) {
			for (Map<String, Object> rowMap : rowMapList) {
				// 转换为Bean对象
				T entityBen = toEntityBean(entityClass, rowMap);
				// 创建列表对象
				if (beanList == null) {
					beanList = new ArrayList<T>();
				}
				// 加入到列表中
				beanList.add(entityBen);
			}
		}

		logger.info("查询数据完毕。");

		// 返回函数的值
		return beanList;
	}

	/**
	 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 */

	// 时间日期格式化对象
	protected static SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S");

	// 时间日期格式化对象
	protected static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 构建where子句SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午3:58:08
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @return
	 */
	protected static String buildWhereSQL(Class<?> entityClass, Map<String, Object> queryParam) {

		// 查询参数不能为空
		if (queryParam == null || queryParam.size() <= 0) {
			throw new RuntimeException("查询参数不能为空。");
		}

		// SQL语句
		StringBuffer sqlBuffer = new StringBuffer();

		// 参数名的集合
		Set<String> paramNameSet = queryParam.keySet();

		for (String fieldName1 : paramNameSet) {

			// 获取字段名
			char[] fieldNameChars = fieldName1.toCharArray();
			StringBuffer fieldBuffer = new StringBuffer();
			for (int i = 0; i < fieldNameChars.length; i++) {
				if (fieldNameChars[i] >= 'A' && fieldNameChars[i] <= 'Z' && i > 0) {
					fieldBuffer.append("_");
				}
				fieldBuffer.append(fieldNameChars[i]);
			}
			// 字段名字
			String fieldName = fieldBuffer.toString();
			// 转换为小写的字符
			fieldName = fieldName.toLowerCase();

			// 连接符号
			if (sqlBuffer.length() > 0) {
				sqlBuffer.append(" and ");
			}

			// 读取参数的值
			Object fieldValue = queryParam.get(fieldName1);

			// 构建匹配字段的值的SQL
			String fieldMatchingSQL = buildFieldMatchingSQL(fieldName, fieldValue);
			sqlBuffer.append("(");
			sqlBuffer.append(fieldMatchingSQL);
			sqlBuffer.append(")");

		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;

	}

	/**
	 * 构建匹配字段的值的SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午7:07:47
	 * 
	 * @author：moshco zhu
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	protected static String buildFieldMatchingSQL(String fieldName, Object fieldValue) {

		// SQL的语句
		StringBuffer sqlBuffer = new StringBuffer();

		if (fieldValue == null) {
			sqlBuffer.append(fieldName);
			sqlBuffer.append(" is null");
		} else {
			// 对字段值的Class
			Class<?> fieldClass = fieldValue.getClass();

			if (fieldClass.isArray()) {
				// 数组
				Object[] array = (Object[]) fieldValue;
				String fieldMatchingSQL = buildFieldMatchingSQL(fieldName, array);
				sqlBuffer.append("(");
				sqlBuffer.append(fieldMatchingSQL);
				sqlBuffer.append(")");
			} else if (List.class.isAssignableFrom(fieldClass)) {
				// 列表
				List<Object> list = (List<Object>) fieldValue;
				String fieldMatchingSQL = buildFieldMatchingSQL(fieldName, list);
				sqlBuffer.append("(");
				sqlBuffer.append(fieldMatchingSQL);
				sqlBuffer.append(")");
			} else if (String.class.isAssignableFrom(fieldClass)) {
				sqlBuffer.append(fieldName);
				sqlBuffer.append(" like '");
				sqlBuffer.append(fieldValue.toString());
				sqlBuffer.append("'");
			} else if (java.util.Date.class.isAssignableFrom(fieldClass)) {
				sqlBuffer.append(fieldName);
				sqlBuffer.append(" = ");
				sqlBuffer.append("str_to_date('");
				sqlBuffer.append(sdf0.format((java.util.Date) fieldValue));
				sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
			} else {
				sqlBuffer.append(fieldName);
				sqlBuffer.append(" = ");
				sqlBuffer.append(fieldValue.toString());
			}

		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;

	}

	/**
	 * 构建匹配字段的值的SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午7:04:46
	 * 
	 * @author：moshco zhu
	 * @param fieldName
	 * @param list
	 * @return
	 */
	protected static String buildFieldMatchingSQL(String fieldName, List<Object> list) {
		return null;
	}

	/**
	 * 构建匹配字段的值的SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午7:05:15
	 * 
	 * @author：moshco zhu
	 * @param fieldName
	 * @param array
	 * @return
	 */
	protected static String buildFieldMatchingSQL(String fieldName, Object[] array) {

		// SQL的语句
		StringBuffer sqlBuffer = new StringBuffer();

		if (array == null) {
			sqlBuffer.append(fieldName);
			sqlBuffer.append(" is null");
		} else {
			if (array.length == 2 && isSuitableType(array)) {
				// 数组长度为2位并且是合适的类型
				if ((array[0] != null && array[0].getClass() == Number.class)
						|| (array[1] != null && array[1].getClass() == Number.class)) {
					if (array[0] == null) {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" <= ");
						sqlBuffer.append(array[1]);
					} else if (array[1] == null) {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" >= ");
						sqlBuffer.append(array[0]);
					} else {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" between ");
						sqlBuffer.append(array[0]);
						sqlBuffer.append(" and ");
						sqlBuffer.append(array[1]);
					}
				} else if ((array[0] != null && array[0].getClass() == java.util.Date.class)
						|| (array[1] != null && array[1].getClass() == java.util.Date.class)) {
					if (array[0] == null) {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" <= ");
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) array[1]));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
					} else if (array[1] == null) {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" >= ");
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) array[0]));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
					} else {
						sqlBuffer.append(fieldName);
						sqlBuffer.append(" between ");
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) array[0]));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
						sqlBuffer.append(" and ");
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) array[1]));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
					}
				}
			} else {
				// 数组长度不是2位
				sqlBuffer.append(fieldName);
				if (isSameType(array)) {
					// 数组元素类型一致且都不为空
					sqlBuffer.append(" in (");
					sqlBuffer.append(")");
				} else {
					// 数组原属类型不一致或有的为空
					sqlBuffer.append(" in (");
					sqlBuffer.append(")");
				}

			}
		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;

	}

	/**
	 * 是否是同一种类型
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午9:49:46
	 * 
	 * @author：moshco zhu
	 * @param array
	 * @return
	 */
	protected static boolean isSameType(Object[] array) {

		if (array == null || array.length <= 0) {
			throw new RuntimeException("空的数组。");
		}

		if (array.length == 1) {
			return true;
		}

		Class<?> itemClass = (array[0] == null) ? null : array[0].getClass();
		for (Object item : array) {
			if (itemClass == null) {
				if (item != null) {
					return false;
				}
			} else {
				if (item == null || item.getClass() != itemClass) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * 是否是合适的类型
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午10:17:24
	 * 
	 * @author：moshco zhu
	 * @param array
	 * @return
	 */
	protected static boolean isSuitableType(Object[] array) {

		if (array == null || array.length <= 0) {
			throw new RuntimeException("空的数组。");
		}

		Class<?> itemClass = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (itemClass == null) {
					itemClass = array[i].getClass();
				} else {
					if (itemClass != array[i].getClass()) {
						return false;
					}
				}
			}
		}

		if (itemClass == null) {
			throw new RuntimeException("空的数组。");
		}

		if (!Number.class.isAssignableFrom(itemClass) && !java.util.Date.class.isAssignableFrom(itemClass)) {
			return false;
		}

		return true;
	}

	/**
	 * 构建where子句SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午2:57:27
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	protected static String buildWhereSQL(Class<?> entityClass, String fieldName, Object fieldValue) {

		// 字段名不能为空
		if (fieldName == null || fieldName.equals("")) {
			throw new RuntimeException("字段名称不能为空。");
		}

		// 获取字段名
		char[] fieldNameChars = fieldName.toCharArray();
		StringBuffer fieldBuffer = new StringBuffer();
		for (int i = 0; i < fieldNameChars.length; i++) {
			if (fieldNameChars[i] >= 'A' && fieldNameChars[i] <= 'Z' && i > 0) {
				fieldBuffer.append("_");
			}
			fieldBuffer.append(fieldNameChars[i]);
		}
		// 字段名字
		fieldName = fieldBuffer.toString();
		// 转换为小写的字符
		fieldName = fieldName.toLowerCase();

		// 构建匹配字段的值的SQL
		String sql = buildFieldMatchingSQL(fieldName, fieldValue);

		// 返回函数的值
		return sql;

	}

	/**
	 * 读取指定字段的值
	 * 
	 * 
	 * 开发时间：2017年2月23日 上午10:02:36
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 * @param fieldName
	 * @return
	 */
	protected static Object getFieldValue(Object entityBean, String fieldName) {

		// 实体对象不能为空
		if (entityBean == null) {
			throw new RuntimeException("读取字段的值，实体对象不能为空。");
		}

		// 获取Bean的Class
		Class<?> beanClass = entityBean.getClass();

		// 得到get方法名
		String getterMethodName = getGetterName(fieldName);

		// getter方法
		Method getterMethod = null;
		try {
			getterMethod = beanClass.getMethod(getterMethodName, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// getter方法不能为空
		if (getterMethod == null) {
			throw new RuntimeException("没有对应的getter（" + getterMethodName + "）方法。");
		}

		// 属性字段的值
		Object fieldValue = null;
		try {
			// 运行get方法
			fieldValue = getterMethod.invoke(entityBean, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 返回函数的值
		return fieldValue;
	}

	/**
	 * 构建设值的SQL
	 * 
	 * 
	 * 开发时间：2017年2月23日 上午10:02:11
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 * @param olderEntityBean
	 * @return
	 */
	protected static String buildSetValueSQL(Object entityBean, Object olderEntityBean) {

		// 所有的public修饰的方法
		Method[] publicMethods = entityBean.getClass().getMethods();

		// SQL语句
		StringBuffer sqlBuffer = new StringBuffer();

		if (publicMethods != null && publicMethods.length > 0) {
			for (Method publicMethod : publicMethods) {

				// 方法名称
				String methodName = publicMethod.getName();
				// 必须以get开头并且没有参数
				if (!methodName.startsWith("get") || methodName.equals("getClass")
						|| (publicMethod.getParameterTypes().length != 0)
						|| (publicMethod.getReturnType().isAssignableFrom(void.class))
						|| (publicMethod.getReturnType().isAssignableFrom(Void.class))) {
					continue;
				}

				// 获取字段名
				char[] methodNameChars = methodName.toCharArray();
				StringBuffer fieldBuffer = new StringBuffer();
				for (int i = 3; i < methodNameChars.length; i++) {
					if (methodNameChars[i] >= 'A' && methodNameChars[i] <= 'Z' && i > 3) {
						fieldBuffer.append("_");
					}
					fieldBuffer.append(methodNameChars[i]);
				}
				// 字段名字
				String fieldName = fieldBuffer.toString();
				fieldName = fieldName.toLowerCase();

				// 读取字段的值
				Object fieldValue = null;
				try {
					fieldValue = publicMethod.invoke(entityBean, null);
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 读取字段原来的值
				Object fieldOldValue = null;
				try {
					fieldOldValue = publicMethod.invoke(olderEntityBean, null);
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 字段的值没有改变就不用重新设置
				if ((fieldValue == null && fieldOldValue == null) || (fieldValue != null
						&& (fieldValue.equals(fieldOldValue) || (fieldValue != null && fieldOldValue != null
								&& fieldValue instanceof java.util.Date && fieldOldValue instanceof java.util.Date
								&& equalsDate((java.util.Date) fieldValue, (java.util.Date) fieldOldValue))))) {
					continue;
				}

				// 连接符号
				if (sqlBuffer.length() > 0) {
					sqlBuffer.append(" , ");
				}

				// 拼接字段名字的SQL语句
				sqlBuffer.append(fieldName);
				sqlBuffer.append(" = ");

				if (fieldValue == null) {
					sqlBuffer.append("null");
				} else {
					// 字段类型
					Class<?> fieldClass = fieldValue.getClass();
					if (String.class.isAssignableFrom(fieldClass)) {
						sqlBuffer.append("'");
						sqlBuffer.append(fieldValue.toString());
						sqlBuffer.append("'");
					} else if (Number.class.isAssignableFrom(fieldClass) || byte.class.isAssignableFrom(fieldClass)
							|| double.class.isAssignableFrom(fieldClass) || float.class.isAssignableFrom(fieldClass)
							|| int.class.isAssignableFrom(fieldClass) || long.class.isAssignableFrom(fieldClass)
							|| short.class.isAssignableFrom(fieldClass)) {
						sqlBuffer.append(fieldValue.toString());
					} else if (java.util.Date.class.isAssignableFrom(fieldClass)) {
						/**
						 * sqlBuffer.append("to_timestamp('");
						 * sqlBuffer.append(sdf0.format((java.util.Date)
						 * fieldValue)); sqlBuffer.append("','yyyy-mm-dd
						 * hh24:mi:ss ff')");
						 */
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) fieldValue));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
					}
				}

			}

		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;
	}

	/**
	 * 为指定字段设置值
	 * 
	 * 
	 * 开发时间：2017年2月22日 下午8:10:00
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 * @param fieldName
	 * @param fieldValue
	 */
	protected static void setFieldValue(Object entityBean, String fieldName, Object fieldValue) {

		// 实体对象不能为空
		if (entityBean == null) {
			throw new RuntimeException("设置字段的值，实体对象不能为空。");
		}

		// 获取Bean的Class
		Class<?> beanClass = entityBean.getClass();

		// 得到set方法名
		String setterMethodName = getSetterName(fieldName);

		// 读取所有public修饰的方法
		Method[] pubMethods = beanClass.getMethods();

		// 值的类型
		Class<?> valueClass = (fieldValue != null) ? fieldValue.getClass() : null;

		// 完全匹配方法
		Method method1 = null;
		// 相识匹配方法
		Method method2 = null;
		for (int i = 0; i < pubMethods.length; i++) {
			if (pubMethods[i].getName().equals(setterMethodName)
					&& pubMethods[i].getReturnType().isAssignableFrom(void.class)
					&& pubMethods[i].getParameterTypes().length == 1) {
				if (fieldValue == null) {
					// 空值
					method2 = pubMethods[i];
					break;
				} else if (valueClass.equals(pubMethods[i].getParameterTypes()[0])) {
					// 完全匹配方法
					method1 = pubMethods[i];
					break;
				} else if (pubMethods[i].getParameterTypes()[0].isAssignableFrom(valueClass)) {
					// 相识匹配方法
					method2 = pubMethods[i];
				}
			}
		}

		// setter方法
		Method setterMethod = (method1 != null) ? method1 : method2;

		// setter方法不能为空
		if (setterMethod == null) {
			throw new RuntimeException("没有对应的setter（" + setterMethodName + "）方法。");
		}

		try {
			// 运行set方法
			setterMethod.invoke(entityBean, fieldValue);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 获取属性字段的Set方法名
	 * 
	 * 
	 * 开发时间：2017年2月23日 上午11:03:33
	 * 
	 * @author：moshco zhu
	 * @param attributeFieldName
	 * @return
	 */
	protected static String getGetterName(String attributeFieldName) {

		if (attributeFieldName == null || attributeFieldName.length() == 0) {
			return null;
		}

		// 读取第一个字符
		char cFirst = attributeFieldName.charAt(0);

		// 第一个字符是特殊字符
		if (cFirst == '$' || cFirst == '_') {
			return "get" + attributeFieldName;
		}

		// 第一个字符小写，第二个字符大写，比如aBc => setaBc
		if (cFirst >= 'a' && cFirst <= 'z' && attributeFieldName.length() >= 2) {
			char cSecond = attributeFieldName.charAt(1);
			if (cSecond >= 'A' && cSecond <= 'Z') {
				return "get" + attributeFieldName;
			}
		}

		// 第一个字符大写
		if (cFirst >= 'A' && cFirst <= 'Z') {
			return "get" + attributeFieldName;
		}

		// 其它情况
		StringBuffer strb = new StringBuffer("get");
		if (cFirst >= 'a' || cFirst <= 'z') {
			char c = (char) ('A' + (cFirst - 'a'));
			strb.append(c);
		}
		if (attributeFieldName.length() > 1) {
			strb.append(attributeFieldName.substring(1));
		}
		String strSetterMethod = strb.toString();
		return strSetterMethod;
	}

	/**
	 * 获取属性字段的Set方法名
	 * 
	 * 
	 * 开发时间：2017年2月23日 上午11:03:33
	 * 
	 * @author：moshco zhu
	 * @param attributeFieldName
	 * @return
	 */
	protected static String getSetterName(String attributeFieldName) {

		if (attributeFieldName == null || attributeFieldName.length() == 0) {
			return null;
		}

		// 读取第一个字符
		char cFirst = attributeFieldName.charAt(0);

		// 第一个字符是特殊字符
		if (cFirst == '$' || cFirst == '_') {
			return "set" + attributeFieldName;
		}

		// 第一个字符小写，第二个字符大写，比如aBc => setaBc
		if (cFirst >= 'a' && cFirst <= 'z' && attributeFieldName.length() >= 2) {
			char cSecond = attributeFieldName.charAt(1);
			if (cSecond >= 'A' && cSecond <= 'Z') {
				return "set" + attributeFieldName;
			}
		}

		// 第一个字符大写
		if (cFirst >= 'A' && cFirst <= 'Z') {
			return "set" + attributeFieldName;
		}

		// 其它情况
		StringBuffer strb = new StringBuffer("set");
		if (cFirst >= 'a' || cFirst <= 'z') {
			char c = (char) ('A' + (cFirst - 'a'));
			strb.append(c);
		}
		if (attributeFieldName.length() > 1) {
			strb.append(attributeFieldName.substring(1));
		}
		String strSetterMethod = strb.toString();
		return strSetterMethod;
	}

	/**
	 * 比较两个日期时间是否相等
	 * 
	 * 
	 * 开发时间：2017年2月23日 下午2:11:06
	 * 
	 * @author：moshco zhu
	 * @param date1
	 * @param date2
	 * @return
	 */
	protected static boolean equalsDate(Date date1, Date date2) {

		if (date1 == null && date2 == null) {
			return true;
		}

		if (date1 != null && date2 != null) {
			Class<?> dateClass = date1.getClass();
			String str1 = null;
			String str2 = null;
			if (Timestamp.class == dateClass) {
				str1 = sdf0.format(date1);
				str2 = sdf0.format(date2);
			} else {
				str1 = sdf1.format(date1);
				str2 = sdf1.format(date2);
			}
			return str1.equals(str2);
		}

		return false;
	}

	/**
	 * 读取字段值的SQL语句
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午6:47:16
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 * @return
	 */
	protected static String buildFieldValueSQL(Object entityBean) {

		// 所有的public修饰的方法
		Method[] publicMethods = entityBean.getClass().getMethods();

		// SQL语句
		StringBuffer sqlBuffer = new StringBuffer();

		if (publicMethods != null && publicMethods.length > 0) {
			for (Method publicMethod : publicMethods) {

				// 方法名称
				String methodName = publicMethod.getName();
				// 必须以get开头并且没有参数
				if (!methodName.startsWith("get") || methodName.equals("getClass")
						|| (publicMethod.getParameterTypes().length != 0)
						|| (publicMethod.getReturnType().isAssignableFrom(void.class))
						|| (publicMethod.getReturnType().isAssignableFrom(Void.class))) {
					continue;
				}

				// 读取字段的值
				Object fieldValue = null;
				try {
					fieldValue = publicMethod.invoke(entityBean, null);
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 连接符号
				if (sqlBuffer.length() > 0) {
					sqlBuffer.append(",");
				}

				if (fieldValue == null) {
					sqlBuffer.append("null");
				} else {
					// 字段类型
					Class<?> fieldClass = fieldValue.getClass();
					if (String.class.isAssignableFrom(fieldClass)) {
						sqlBuffer.append("'");
						sqlBuffer.append(fieldValue.toString());
						sqlBuffer.append("'");
					} else if (Number.class.isAssignableFrom(fieldClass) || byte.class.isAssignableFrom(fieldClass)
							|| double.class.isAssignableFrom(fieldClass) || float.class.isAssignableFrom(fieldClass)
							|| int.class.isAssignableFrom(fieldClass) || long.class.isAssignableFrom(fieldClass)
							|| short.class.isAssignableFrom(fieldClass)) {
						sqlBuffer.append(fieldValue.toString());
					} else if (java.util.Date.class.isAssignableFrom(fieldClass)) {
						/**
						 * sqlBuffer.append("to_timestamp('");
						 * sqlBuffer.append(sdf0.format((java.util.Date)
						 * fieldValue)); sqlBuffer.append("','yyyy-mm-dd
						 * hh24:mi:ss ff')");
						 */
						sqlBuffer.append("str_to_date('");
						sqlBuffer.append(sdf0.format((java.util.Date) fieldValue));
						sqlBuffer.append("','%Y-%m-%d %H:%i:%s %x')");
					}
				}

			}

		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;
	}

	/**
	 * 读取字段名的SQL语句
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午6:47:11
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @return
	 */
	protected static String buildFieldNameSQL(Class<?> entityClass) {

		// 所有的public修饰的方法
		Method[] publicMethods = entityClass.getMethods();

		// SQL语句
		StringBuffer sqlBuffer = new StringBuffer();

		if (publicMethods != null && publicMethods.length > 0) {
			for (Method publicMethod : publicMethods) {

				// 方法名称
				String methodName = publicMethod.getName();
				// 必须以get开头并且没有参数
				if (!methodName.startsWith("get") || methodName.equals("getClass")
						|| (publicMethod.getParameterTypes().length != 0)
						|| (publicMethod.getReturnType().isAssignableFrom(void.class))
						|| (publicMethod.getReturnType().isAssignableFrom(Void.class))) {
					continue;
				}

				// 获取字段名
				char[] methodNameChars = methodName.toCharArray();
				StringBuffer fieldBuffer = new StringBuffer();
				for (int i = 3; i < methodNameChars.length; i++) {
					if (methodNameChars[i] >= 'A' && methodNameChars[i] <= 'Z' && i > 3) {
						fieldBuffer.append("_");
					}
					fieldBuffer.append(methodNameChars[i]);
				}
				String fieldName = fieldBuffer.toString();
				fieldName = fieldName.toLowerCase();

				// 连接符号
				if (sqlBuffer.length() > 0) {
					sqlBuffer.append(",");
				}

				// 连接字段
				sqlBuffer.append(fieldName);

			}
		}

		// 转换为字符串
		String sql = sqlBuffer.toString();

		// 返回函数的值
		return sql;
	}

	/**
	 * 实体所对应的表名
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午6:25:50
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @return
	 */
	protected static String getTableName(Class<?> entityClass) {
		String className = entityClass.getSimpleName();
		char[] classNameChars = className.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < classNameChars.length; i++) {
			if (classNameChars[i] >= 'A' && classNameChars[i] <= 'Z' && i > 0) {
				buffer.append("_");
			}
			buffer.append(classNameChars[i]);
		}
		String tableName = buffer.toString();
		tableName = tableName.toLowerCase();
		return tableName;
	}

	/**
	 * 将记录行数据转换为实体对象
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午1:17:08
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param rowMap
	 * @return
	 */
	protected static <T> T toEntityBean(Class<T> entityClass, Map<String, Object> rowMap) {

		// 实体的Class不能为空
		if (entityClass == null) {
			throw new RuntimeException("实体的Class不能为空。");
		}

		// 如果记录为空
		if (rowMap == null) {
			return null;
		}

		// 实体对象
		T entityBean = null;

		try {

			// 所有键值
			Set<String> fieldNameSet = rowMap.keySet();

			// 读取所有的数据库字段
			List<String> fieldNameList = new ArrayList<String>(fieldNameSet);

			// 获取类中的set方法的映射集合
			Map<String, Method> fieldSetterMap = getFieldSetterMapping(fieldNameList, entityClass);

			// 实例化对象
			entityBean = entityClass.newInstance();

			// 将行记录的数据设置给实体属性
			for (int i = 0; i < fieldNameList.size(); i++) {
				// 字段名称
				String fieldName = fieldNameList.get(i);
				// setter方法
				Method setterMethod = fieldSetterMap.get(fieldName);
				if (setterMethod != null) {
					// 读取字段的值
					Object fieldValue = rowMap.get(fieldName);
					// 运行setter方法
					invokeMethod(setterMethod, entityBean, fieldValue);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 返回函数的值
		return entityBean;
	}

	/**
	 * 运行指定方法
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午5:40:57
	 * 
	 * @author：moshco zhu
	 * @param method
	 * @param bean
	 * @param value
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	protected static void invokeMethod(Method method, Object bean, Object value)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// 运行setter方法
		if (value == null) {
			method.invoke(bean, null);
			return;
		}

		// 将值转为字符串
		String str = toString(value);

		// 读取参数类型
		Class<?> argumentType = method.getParameterTypes()[0];
		// 转换为指定类型的
		value = toType(str, argumentType);

		// 运行方法
		method.invoke(bean, value);

	}

	/**
	 * 将字符串转换为指定类型
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午5:57:53
	 * 
	 * @author：moshco zhu
	 * @param str
	 * @param toType
	 * @return
	 */
	protected static Object toType(String str, Class<?> toType) {
		Object ojbValue = null;
		try {
			if (toType == String.class) {
				ojbValue = new String(str);
			} else if (toType == int.class || toType == Integer.class) {
				// 转换为Integer类型
				ojbValue = Integer.parseInt(str);
			} else if (toType == short.class || toType == Short.class) {
				ojbValue = Short.parseShort(str);
			} else if (toType == long.class || toType == Long.class) {
				ojbValue = Long.parseLong(str);
			} else if (toType == byte.class || toType == Byte.class) {
				ojbValue = Byte.parseByte(str);
			} else if (toType == char.class || toType == Character.class) {
				ojbValue = str.charAt(0);
			} else if (toType == boolean.class || toType == Boolean.class) {
				ojbValue = Boolean.parseBoolean(str);
			} else if (toType == float.class || toType == Float.class) {
				ojbValue = Float.parseFloat(str);
			} else if (toType == double.class || toType == Double.class) {
				ojbValue = Double.parseDouble(str);
			} else if (java.util.Date.class.isAssignableFrom(toType)) {
				// 日期类型

				if (toType == java.sql.Date.class) {
					java.util.Date date = sdf1.parse(str);
					ojbValue = new java.sql.Date(date.getTime());
				} else if (toType == java.sql.Time.class) {
					java.util.Date date = sdf1.parse(str);
					ojbValue = new java.sql.Time(date.getTime());
				} else if (toType == java.sql.Timestamp.class) {
					java.util.Date date = sdf0.parse(str);
					ojbValue = new java.sql.Timestamp(date.getTime());
				} else if (toType == java.util.Date.class) {
					java.util.Date date = sdf1.parse(str);
					ojbValue = new java.util.Date(date.getTime());
				} else {
					java.util.Date date = sdf1.parse(str);
					ojbValue = new java.util.Date(date.getTime());
				}
			}
		} catch (Exception e) {
			ojbValue = null;
		}
		return ojbValue;
	}

	/**
	 * 将值转换为字符串
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午5:56:15
	 * 
	 * @author：moshco zhu
	 * @param value
	 * @return
	 */
	protected static String toString(Object value) {
		Class<?> valueClass = value.getClass();
		if (java.util.Date.class.isAssignableFrom(valueClass)) {
			java.util.Date date = (java.util.Date) value;
			String str = sdf0.format(date);
			return str;
		} else {
			return value.toString();
		}
	}

	/**
	 * 获取类中的set方法的映射集合
	 * 
	 * 
	 * 开发时间：2017年2月21日 下午5:43:34
	 * 
	 * @author：moshco zhu
	 * @param fieldNameList
	 * @param entityClass
	 * @return
	 */
	protected static Map<String, Method> getFieldSetterMapping(List<String> fieldNameList, Class<?> entityClass) {

		// 读取修饰符为public的方法
		Method[] publicMethods = entityClass.getMethods();

		// 创建集合对象
		Map<String, Method> fieldSetterMap = new HashMap<String, Method>();

		for (String fieldName : fieldNameList) {

			// 去除"_"字符
			String setterMethodName = "set" + fieldName.replaceAll("_", "");

			// 匹配方法
			for (Method setterMethod : publicMethods) {
				if (setterMethodName.equalsIgnoreCase(setterMethod.getName())
						&& setterMethod.getParameterTypes().length == 1) {
					// 加入到集合中
					fieldSetterMap.put(fieldName, setterMethod);
					// 中断循环
					break;
				}
			}
		}

		// 返回函数的值
		return fieldSetterMap;
	}

}
