// 窗体加载完毕后运行
$(window).load(function() {

	// 获取page对象
	var page = $(".page.pg34234524");

	// cookie的名字
	var cookieName = page.attr("cookie-name");
	// 上一次打开的页面
	var url = getUrl(cookieName);
	if (url == null || url == "") {
		// 使用默认url
		url = page.attr("default-url");
	}

	// 打开页面
	if (url != null && url != "") {
		openPage(url);
	}

	// 初始化创建左边菜单
	initMenu();

});

/**
 * 打开页面
 * 
 * 开发时间：2016-4-29 上午9:55:26
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function openPage(oBtn) {
	try {

		// page对象
		var page = $(".page.pg34234524");

		// 获取url
		var url = null;
		if (typeof (oBtn) == "string") {
			url = oBtn;
		} else {
			url = oBtn.attr("href");
			if (url == null) {
				url = oBtn.attr("url");
			}
		}

		page.html("<br />正在发送请求......");

		// 发送Ajax请求
		$.ajax({
			type : "get",
			url : url,
			async : true,
			data : null,
			dataType : "text",
			processData : true,
			traditional : true,
			success : function(strHtml) {
				page.html(strHtml);
			},
			error : function(e) {
				page.html("请求处理出错。");
			}
		});

	} catch (e) {
		alert(e.message);
	}
	// 返回函数值
	return false;
}

/**
 * 初始化创建左边菜单
 * 
 * 开发时间：2016-4-29 上午11:23:12
 * 
 * @author moshco zhu
 * 
 */
function initMenu() {

	// 菜单容器
	var menuContainer = $(".menu-container.mu4556367567");
	var contextPath = menuContainer.attr("context-path");
	var menuUrl = menuContainer.attr("url");
	var cookieName = menuContainer.attr("cookie-name");

	// 生成树状菜单
	menuContainer.tree({
		url : menuUrl,
		animate : true,
		checkbox : false,
		cascadeCheck : false,
		dnd : false,
		onClick : function(node) {
			// 单击事件
			if (node.attributes != null && node.attributes.url != null) {
				// 页面url
				var pageUrl = contextPath + node.attributes.url;
				// 保存url
				saveUrl(cookieName, pageUrl);
				// 打开页面
				openPage(pageUrl);
			}
		},
		onDblClick : function(node) {
			// 双击事件
			// 打开或关闭
			$(this).tree("toggle", node.target);
		}
	});

}

/**
 * 从cookie中读取指定名称的值
 * 
 * 开发时间：2016-4-29 下午3:08:10
 * 
 * @author moshco zhu
 * 
 * @param cookieName
 */
function getUrl(cookieName) {

	// cookie为空
	if (document.cookie == null || document.cookie == "") {
		return "";
	}

	// cookie的值
	var cookieValue = "";

	// 找寻起始点
	var startIndex = document.cookie.indexOf(cookieName + "=");
	if (startIndex >= 0) {
		// 值的起始点序号
		startIndex = startIndex + (cookieName + "=").length;
		// 值的结束点的序号
		var endIndex = document.cookie.indexOf(";", startIndex);
		if (endIndex < 0) {
			endIndex = document.cookie.length;
		}
		// 截取cookie的值
		cookieValue = document.cookie.substring(startIndex, endIndex);
		// 解密
		cookieValue = unescape(cookieValue);
	}

	// 返回函数值
	return cookieValue;

}

/**
 * 保存url
 * 
 * 开发时间：2016-4-29 下午2:56:26
 * 
 * @author moshco zhu
 * 
 * @param cookieName
 * @param url
 */
function saveUrl(cookieName, url) {
	// 过期日期
	var expireDate = new Date();
	expireDate.setDate(expireDate.getDate() + 60);
	// 保存到cookie中
	document.cookie = cookieName + "=" + escape(url) + ";expires="
			+ expireDate.toGMTString();
}
