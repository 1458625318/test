/**
 * 
 * 
 * 创建时间：2016-4-29 上午11:44:58
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller.admin.home;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.jbit.webbs.entity.SysMenuOption;

/**
 * 菜单节点
 * 
 * 创建时间：2016-4-29 上午11:44:58
 * 
 * @author moshco zhu
 * 
 */
public class Option implements Serializable {

	// 记录编号
	protected Integer id = null;

	// 标题
	protected String text = null;

	// 状态
	protected String state = null;

	// 附加属性
	protected Map<String, Object> attributes = null;

	// 子菜单项列表
	protected List<Option> children = null;

	/**
	 * 
	 * 构造函数
	 * 
	 * 开发时间：2016-4-29 上午11:48:16
	 * 
	 * @author：moshco zhu
	 */
	public Option() {
	}

	/**
	 * 
	 * 构造函数
	 * 
	 * 开发时间：2016-4-29 上午11:48:46
	 * 
	 * @author：moshco zhu
	 * @param sysMeneOption
	 */
	public Option(SysMenuOption sysMeneOption) {
		this.id = sysMeneOption.getId();
		this.text = sysMeneOption.getTitle();
		String url = sysMeneOption.getUrl();
		if (url != null && !url.equals("")) {
			attributes = new HashMap<String, Object>();
			attributes.put("url", url);
		}
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the children
	 */
	public List<Option> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(List<Option> children) {
		this.children = children;
	}

}
