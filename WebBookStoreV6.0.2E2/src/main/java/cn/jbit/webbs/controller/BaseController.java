/**
 * 
 * 
 * 创建时间：2016-10-20 上午10:01:32
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.jbit.webbs.service.BaseService;

/**
 * 公共业务（业务无关）
 * 
 * 创建时间：2016-10-20 上午10:01:32
 * 
 * @author moshco zhu
 * 
 */
public abstract class BaseController implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(BaseController.class.getName());

	// 公共业务（业务无关）
	@Autowired
	@Qualifier("baseService")
	protected BaseService baseService = null;

	/**
	 * 解决get请求的中文乱码问题
	 * 
	 * 
	 * 开发时间：2016-7-20 上午9:04:43
	 * 
	 * @author：moshco zhu
	 * @param paramValue
	 * @return
	 */
	public static String transformCode(String paramValue) {
		if (paramValue == null) {
			return null;
		}
		try {
			paramValue = new String(paramValue.getBytes("iso-8859-1"), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return paramValue;
	}

	/**
	 * 验证字符串是否是数字
	 * 
	 * 
	 * 开发时间：2016-1-4 上午8:43:08
	 * 
	 * @author：moshco zhu
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		if (str == null || str.equals("")) {
			return false;
		}
		try {
			Double.parseDouble(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 覆盖Bean的数据
	 * 
	 * 
	 * 开发时间：2016-1-4 下午12:31:26
	 * 
	 * @author：moshco zhu
	 * @param paramMap
	 * @param bean
	 * @param isCover
	 */
	public static void cover(Map<String, ?> paramMap, Object bean, boolean isCover) {

		// 集合不能为空
		if (paramMap == null || paramMap.size() <= 0) {
			return;
		}

		// java bean也不能为空
		if (bean == null) {
			return;
		}

		// 读取bean对象的所有字段
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		// 当前的Class
		Class<?> currentClass = bean.getClass();
		while (true) {
			// 获取Class内的所有定义的字段
			Field[] aryField = currentClass.getDeclaredFields();
			// 逐一读取每一个字段
			if (aryField != null && aryField.length > 0) {
				for (Field field : aryField) {
					// 获取字段名 去除“_” 大写转小写
					String strFieldName = field.getName().toLowerCase().replace("_", "");
					// 加入到集合中
					fieldMap.put(strFieldName, field);
				}
			}
			// 读取父类的class
			currentClass = currentClass.getSuperclass();
			// 如果没有父类，则中断循环
			if (currentClass == null) {
				break;
			}
		}

		// 读取所有的键
		Set<String> stKey = paramMap.keySet();
		// 逐一设置每一个字段的值
		for (String strParam : stKey) {

			// 去掉参数名中的"_" true_name trueName
			String strParam1 = strParam.replaceAll("_", "").toLowerCase();
			// 读取对应的字段
			Field field = fieldMap.get(strParam1);

			// 为空就不用设置值
			if (field == null) {
				continue;
			}

			// 读取参数的值
			Object value = paramMap.get(strParam);
			// 是否有写权限
			boolean isEditable = true;
			if (!field.isAccessible()) {
				// 没有写权限
				isEditable = false;
				// 修改字段的写权限
				field.setAccessible(true);
			}

			try {
				// 如果bean的值不为空，且不需要覆盖
				if (field.get(bean) != null && !isCover) {
					// 不需要设置值
				} else {

					if (value == null) {
						// 值为空
						// 设置值
						field.set(bean, null);
					} else {
						// 值不为空

						// 读取字段的类型
						Class<?> clsField = field.getType();
						// 读取值的类型
						Class<?> clsValue = value.getClass();
						if (clsField.isAssignableFrom(clsValue)) {
							// clsValue是clsField的相同类型或子类类型
							// 设置值
							field.set(bean, value);
						} else {
							// 类型转换
							Object oValue = toType(value, clsField);
							// 设置值
							field.set(bean, oValue);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 将字段的权限还原
			if (!isEditable) {
				// 修改字段的写权限
				field.setAccessible(false);
			}
		}
	}

	/**
	 * 将值转换为指定类型
	 * 
	 * 
	 * 开发时间：2016-1-6 上午8:43:37
	 * 
	 * @author：moshco zhu
	 * @param value
	 * @param clsType
	 * @return
	 */
	public static Object toType(Object value, Class<?> clsType) throws Exception {
		// 读取值的类型
		Class<?> clsValue = value.getClass();
		// 转换后的值
		Object oValue = null;
		if (String.class.isAssignableFrom(clsValue)) {

			String strValue = (String) value;

			if (Integer.class.isAssignableFrom(clsType) || int.class.isAssignableFrom(clsType)) {
				// Integer类型 或 int类型
				oValue = Integer.parseInt(strValue);
			} else if (Long.class.isAssignableFrom(clsType) || long.class.isAssignableFrom(clsType)) {
				// Long类型 或 long类型
				oValue = Long.parseLong(strValue);
			} else if (Short.class.isAssignableFrom(clsType) || short.class.isAssignableFrom(clsType)) {
				// Short类型 或 short类型
				oValue = Short.parseShort(strValue);
			} else if (Double.class.isAssignableFrom(clsType) || double.class.isAssignableFrom(clsType)) {
				// Double类型 或 double类型
				oValue = Double.parseDouble(strValue);
			} else if (Float.class.isAssignableFrom(clsType) || float.class.isAssignableFrom(clsType)) {
				// Float类型 或 float类型
				oValue = Float.parseFloat(strValue);
			} else if (Character.class.isAssignableFrom(clsType) || char.class.isAssignableFrom(clsType)) {
				// Character类型 或 char类型
				oValue = strValue.charAt(0);
			} else if (Boolean.class.isAssignableFrom(clsType) || boolean.class.isAssignableFrom(clsType)) {
				// Boolean类型 或 boolean类型
				oValue = Boolean.parseBoolean(strValue);
			}
		} else if (Integer.class.isAssignableFrom(clsValue) || Long.class.isAssignableFrom(clsValue)
				|| Short.class.isAssignableFrom(clsValue) || Double.class.isAssignableFrom(clsValue)
				|| Float.class.isAssignableFrom(clsValue) || Character.class.isAssignableFrom(clsValue)
				|| Boolean.class.isAssignableFrom(clsValue) || int.class.isAssignableFrom(clsValue)
				|| long.class.isAssignableFrom(clsValue) || short.class.isAssignableFrom(clsValue)
				|| double.class.isAssignableFrom(clsValue) || float.class.isAssignableFrom(clsValue)
				|| char.class.isAssignableFrom(clsValue) || boolean.class.isAssignableFrom(clsValue)) {

			if (String.class.isAssignableFrom(clsType)) {
				// 字符串类型
				oValue = value.toString();
			}
		}
		// 返回函数值
		return oValue;
	}

	/**
	 * 是否存在空值
	 * 
	 * 
	 * 开发时间：2016-8-8 下午3:02:22
	 * 
	 * @author：moshco zhu
	 * @param aryValue
	 * @return
	 */
	public static boolean existNullValue(Object[] aryValue) {

		// 数组为空
		if (aryValue == null || aryValue.length <= 0) {
			return true;
		}

		// 逐一验证每一项值
		for (Object value : aryValue) {
			// 等于null或者等于空字符串
			if (value == null || value.equals("")) {
				return true;
			}
		}

		// 验证通过
		return false;

	}

	/**
	 * 保存实体对象
	 * 
	 * 
	 * 开发时间：2016-8-3 上午8:04:43
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 */
	protected <T> void save(T entityBean) {
		baseService.save(entityBean);
	}

	/**
	 * 通过主键Id找寻实体对象
	 * 
	 * 
	 * 开发时间：2016-8-3 上午8:16:31
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param keyId
	 * @return
	 */
	protected <T> T find(Class<T> entityClass, Serializable keyId) {
		return baseService.find(entityClass, keyId);
	}

	/**
	 * 通过多个条件找寻实体对象
	 * 
	 * 
	 * 开发时间：2016-8-3 上午8:16:49
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @return
	 */
	protected <T> T find(Class<T> entityClass, Map<String, Object> queryParam) {
		return baseService.find(entityClass, queryParam);
	}

	/**
	 * 通过唯一字段找寻实体对象
	 * 
	 * 
	 * 开发时间：2016-8-3 上午8:17:14
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	protected <T> T find(Class<T> entityClass, String fieldName, Object fieldValue) {
		return baseService.find(entityClass, fieldName, fieldValue);
	}

	/**
	 * 更新实体对象
	 * 
	 * 
	 * 开发时间：2016-8-3 上午8:17:30
	 * 
	 * @author：moshco zhu
	 * @param entityBean
	 */
	protected <T> void update(T entityBean) {
		baseService.update(entityBean);
	}

	/**
	 * 查询指定实体（通过指定的字段匹配）
	 * 
	 * 
	 * 开发时间：2016-8-10 下午7:05:00
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	protected <T> List<T> query(Class<T> entityClass, String fieldName, Object fieldValue) {
		return baseService.query(entityClass, fieldName, fieldValue);
	}

	/**
	 * 查询指定实体（通过多个字段匹配）
	 * 
	 * 
	 * 开发时间：2016-8-10 下午7:22:29
	 * 
	 * @author：moshco zhu
	 * @param entityClass
	 * @param queryParam
	 * @return
	 */
	protected <T> List<T> query(Class<T> entityClass, Map<String, Object> queryParam) {
		return baseService.query(entityClass, queryParam);
	}

	/**
	 * 从request中读取所有参数
	 * 
	 * 
	 * 开发时间：2016年11月27日 下午1:57:39
	 * 
	 * @author：moshco zhu
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getAllParam(HttpServletRequest request) {

		logger.info("开始转换支付宝参数集合......");
		logger.info("-------------------------------------------------------------------");

		// 请求模式
		String method = request.getMethod();

		// 解决post请求的中文乱码问题
		if (method.equalsIgnoreCase("post")) {
			try {
				request.setCharacterEncoding("utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 获取所有参数的集合
		Map<String, String[]> allParamMap = request.getParameterMap();

		// 获取参数名的集合
		Set<String> paramNameSet = allParamMap.keySet();

		// 构建结果参数集合
		Map<String, String> paramMap = new HashMap<String, String>();

		// 转换
		if (paramNameSet != null && paramNameSet.size() > 0) {
			for (String paramName : paramNameSet) {
				// 参数对应的值
				Object paramValue = allParamMap.get(paramName);
				if (paramValue == null) {
					continue;
				}
				// 转换为字符串数组
				String[] aryValue = (String[]) paramValue;
				if (aryValue == null || aryValue.length <= 0) {
					continue;
				}
				// 将多个值使用“,”连接起来
				StringBuffer valueBuffer = new StringBuffer();
				for (int i = 0; i < aryValue.length; i++) {
					// 连接符
					if (valueBuffer.length() > 0) {
						valueBuffer.append(",");
					}
					// 解决get请求的中文乱码问题
					String value = aryValue[i];
					if (method.equalsIgnoreCase("get")) {
						try {
							value = new String(value.getBytes("iso-8859-1"), "utf-8");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					// 连接起来
					valueBuffer.append(value);
				}
				// 保存到集合中
				paramMap.put(paramName, valueBuffer.toString());
				logger.info(paramName + ":" + valueBuffer.toString());
			}
		}

		logger.info("-------------------------------------------------------------------");

		// 返回函数值
		return paramMap;
	}

}
