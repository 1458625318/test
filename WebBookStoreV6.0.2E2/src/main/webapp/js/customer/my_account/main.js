// 当页面加载完毕后运行
$(window).load(function() {

	// 进入二级菜单的第一个tab所对应的页面
	{
		// 标签组对象
		var tabGroup = $("body>.page-middle>.page-content>.tab-group.row");
		// 读取第一个tab的href属性
		var url = tabGroup.find(".tab:first").attr("href");
		// 页面转向
		window.location.href = url;
	}

});