// 日历组件
$(".page-content>.form-panel input[name=publicationDate1]").datebox({
	width : 154,
	height : 28
});
$(".page-content>.form-panel input[name=publicationDate2]").datebox({
	width : 154,
	height : 28
});

/**
 * 加载图书列表
 * 
 * 开发时间：2016-5-6 上午11:00:39
 * 
 * @author moshco zhu
 * 
 */
function loadBookDataGrid() {

	// 查询结果
	var queryResult = $(".page-content>.query-result-panel");
	// 获取url
	var url = queryResult.attr("url");
	// 表格的列
	var columns = [ {
		field : "id",
		checkbox : true,
		align : "center"
	}, {
		field : "title",
		title : "书名",
		width : 150
	}, {
		field : "isbn",
		title : "ISBN",
		width : 120
	}, {
		field : "author",
		title : "作者",
		width : 90
	}, {
		field : "press",
		title : "出版社",
		width : 150
	}, {
		field : "publicationDate",
		title : "出版时间",
		width : 120,
		formatter : formatterPublicationDate
	}, {
		field : "originalCost",
		title : "原价",
		width : 70,
		align : "right",
		formatter : formatterOriginalCost
	}, {
		field : "totalInventory",
		title : "总库存",
		width : 70,
		align : "right"
	}, {
		field : "operating",
		title : "操作",
		width : 120,
		align : "right",
		formatter : formatterOperator
	} ];

	// 创建数据网格
	queryResult.datagrid({
		url : url,
		queryParams : {},
		pagination : true,
		pageSize : 10,
		pageList : [ 2, 5, 10, 15, 30, 50 ],
		columns : [ columns ],
		singleSelect : true,
		rownumbers : true,
		iconCls : "icon-search",
		fitColumns : true,
		striped : true,
		loadMsg : "正在加载图书数据......",
		onBeforeLoad : function(params) {
		}
	});

}

/**
 * 格式化字段：出版时间
 * 
 * 开发时间：2016-5-6 上午11:26:26
 * 
 * @author moshco zhu
 * 
 * @param value
 * @param record
 * @param index
 * @returns {String}
 */
function formatterPublicationDate(value, record, index) {
	if (value != null && value != "") {
		var dt = new Date(value);
		return dt.getFullYear() + "-" + (dt.getMonth() + 1) + "-"
				+ dt.getDate();
	}
	return "";
}

/**
 * 格式化字段：原价
 * 
 * 开发时间：2016-5-6 上午11:26:32
 * 
 * @author moshco zhu
 * 
 * @param value
 * @param record
 * @param index
 * @returns {String}
 */
function formatterOriginalCost(value, record, index) {
	return "￥" + value;
}

/**
 * 格式化字段：操作
 * 
 * 开发时间：2016-5-9 上午8:37:53
 * 
 * @author moshco zhu
 * 
 * @param value
 * @param record
 * @param index
 */
function formatterOperator(value, record, index) {
	var operator = $(".page-content>.operator");
	var operatorHtml = operator.html();
	operatorHtml = operatorHtml.replace(/#id/g, record.id);
	return operatorHtml;
}

// 加载图书列表
loadBookDataGrid();

/**
 * 查询图书
 * 
 * 开发时间：2016-5-6 下午1:56:33
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 */
function queryBook(oBtn) {

	// 查询参数
	var queryParams = $(".query-result-panel").datagrid("options").queryParams;

	// 表单
	var oForm = $(".page-content>.form-panel.query");
	// ISBN
	queryParams["isbn"] = oForm.find("input[name=isbn]").val();
	// 书名
	queryParams["title"] = oForm.find("input[name=title]").val();
	// 作者
	queryParams["author"] = oForm.find("input[name=author]").val();
	// 出版社
	queryParams["press"] = oForm.find("input[name=press]").val();
	// 出版时间
	queryParams["publicationDate1"] = oForm
			.find("input[name=publicationDate1]").val();
	queryParams["publicationDate2"] = oForm
			.find("input[name=publicationDate2]").val();

	// 查询数据
	$(".query-result").datagrid("load");

}

/**
 * 显示书本信息
 * 
 * 开发时间：2016-5-9 上午9:02:15
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function showBook(oBtn) {

	// 获取url
	var url = oBtn.attr("href");
	// 动态构建对话框的jQuery对象
	var dialogDiv = $("<div />");
	// 创建对话框组件
	dialogDiv.dialog({
		title : "图书详细信息",
		width : 580,
		height : 540,
		collapsible : false,
		close : false,
		cache : false,
		modal : true,
		href : url,
		onClose : function() {
			$(this).dialog("destroy");
		},
		buttons : [ {
			text : "关闭",
			handler : function() {
				dialogDiv.dialog("close");
			}
		} ]
	});

	// 返回函数值
	return false;
}

/**
 * 去删除图书
 * 
 * 开发时间：2016-5-9 上午10:55:21
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function toRemoveBook(oBtn) {

	// 获取url
	var url = oBtn.attr("href");
	// 动态构建对话框的jQuery对象
	var dialogDiv = $("<div />");
	// 创建对话框组件
	dialogDiv.dialog({
		title : "删除图书",
		width : 580,
		height : 560,
		collapsible : false,
		close : false,
		cache : false,
		modal : true,
		href : url,
		onClose : function() {
			$(this).dialog("destroy");
		},
		buttons : [ {
			text : "确认删除",
			handler : function() {
				// 删除图书
				submitRemoveBook(dialogDiv);
			}
		}, {
			text : "关闭",
			handler : function() {
				dialogDiv.dialog("close");
			}
		} ]
	});

	// 返回函数值
	return false;
}

/**
 * 删除图书
 * 
 * 开发时间：2016-5-9 上午11:05:31
 * 
 * @author moshco zhu
 * 
 * @param dialogDiv
 */
function submitRemoveBook(dialogDiv) {

	dialogDiv.find("form.to-remove-book>.message").html("正在提交表单......").css(
			"visibility", "visible");

	// 发送请求
	dialogDiv.find("form.to-remove-book").form("submit", {
		onSubmit : function() {
			return true;
		},
		success : function(strHtml) {
			// 关闭原有的对话框
			dialogDiv.dialog("close");
			// 刷新表格
			$(".query-result-panel").datagrid("load");
			// 显示结果
			showRemoveBookResult(strHtml);
		}
	});

}

/**
 * 显示删除图书的结果
 * 
 * 开发时间：2016-5-9 上午11:12:50
 * 
 * @author moshco zhu
 * 
 * @param strHtml
 */
function showRemoveBookResult(strHtml) {

	// 动态构建对话框的jQuery对象
	var dialogDiv = $("<div />").append(strHtml);
	// 创建对话框组件
	dialogDiv.dialog({
		title : "删除图书的结果",
		width : 320,
		height : 180,
		collapsible : false,
		close : false,
		cache : false,
		modal : true,
		onClose : function() {
			$(this).dialog("destroy");
		},
		buttons : [ {
			text : "关闭",
			handler : function() {
				dialogDiv.dialog("close");
			}
		} ]
	});

}

/**
 * 去添加图书
 * 
 * 开发时间：2016-5-10 上午8:48:43
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function toAddBook(oBtn) {

	// 获取url
	var url = oBtn.attr("href");
	// 构建对话框的jQuery对象
	var dialogDiv = $("<div />");
	// 构建对话框
	dialogDiv.dialog({
		title : "添加图书",
		width : 720,
		height : 560,
		collapsible : false,
		close : false,
		cache : false,
		modal : true,
		href : url,
		onClose : function() {
			$(this).dialog("destroy");
		},
		onLoad : function() {
			// 加载js
			$.getScript(dialogDiv.find("form").attr("js"));
		},
		buttons : [ {
			text : "保存图书",
			handler : function() {
				// 保存图书
				saveBook(dialogDiv);
			}
		}, {
			text : "关闭",
			handler : function() {
				// 关闭对话框
				dialogDiv.dialog("close");
			}
		} ]
	});

	// 返回函数值
	return false;
}

/**
 * 验证是否是有效的日期时间格式
 * 
 * 开发时间：2016-5-11 下午1:53:31
 * 
 * @author moshco zhu
 * 
 * @param str
 */
function validateDate(str) {
	if (str == null || str == "") {
		return false;
	}
	var ary = str.split("-");
	if (ary.length != 3) {
		return false;
	}
	for ( var i = 0; i < ary.length; i++) {
		var str1 = ary[i];
		if (i == 0) {
			if (str1.length != 4) {
				return false;
			}
			if (isNaN(parseInt(str1))) {
				return false;
			}
		} else if (i == 1) {
			if (str1.length < 1 || str1.length > 2) {
				return false;
			}
			if (str1.charAt(0) == '0') {
				str1 = str1.substr(1);
			}
			if (isNaN(parseInt(str1))) {
				return false;
			}
			if (parseInt(str1) < 1 || parseInt(str1) > 12) {
				return false;
			}
		} else if (i == 2) {
			if (str1.length < 1 || str1.length > 2) {
				return false;
			}
			if (str1.charAt(0) == '0') {
				str1 = str1.substr(1);
			}
			if (isNaN(parseInt(str1))) {
				return false;
			}
			if (parseInt(str1) < 1 || parseInt(str1) > 31) {
				return false;
			}
		}
	}

	return true;

}

/**
 * 保存图书
 * 
 * 开发时间：2016-5-10 上午11:14:30
 * 
 * @author moshco zhu
 * 
 * @param dialogDiv
 */
function saveBook(dialogDiv) {

	// 验证表单
	var validateForm = function(oForm) {

		// 书名
		var title = oForm.find("input[name=title]").val();
		if (title == null || title == "") {
			oForm.find(".message").html("书名不能为空。").css("visibility", "visible");
			return false;
		}

		// 作者
		var author = oForm.find("input[name=author]").val();
		if (author == null || author == "") {
			oForm.find(".message").html("作者不能为空。").css("visibility", "visible");
			return false;
		}

		// 出版社
		var press = oForm.find("input[name=press]").val();
		if (press == null || press == "") {
			oForm.find(".message").html("出版社不能为空。")
					.css("visibility", "visible");
			return false;
		}

		// ISBN
		var isbn = oForm.find("input[name=isbn]").val();
		if (isbn == null || isbn == "") {
			oForm.find(".message").html("ISBN不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 出版时间
		var publicationDate1 = oForm.find("input[name=publicationDate1]").val();
		if (publicationDate1 == null || publicationDate1 == "") {
			oForm.find(".message").html("出版时间不能为空。").css("visibility",
					"visible");
			return false;
		} else if (!validateDate(publicationDate1)) {
			oForm.find(".message").html("无效的出版时间。")
					.css("visibility", "visible");
			return false;
		}

		// 开本
		var bookSize = oForm.find("input[name=bookSize]").val();
		if (bookSize == null || bookSize == "") {
			oForm.find(".message").html("开本不能为空。").css("visibility", "visible");
			return false;
		}

		// 页码
		var pageNumber = oForm.find("input[name=pageNumber]").val();
		if (pageNumber == null || pageNumber == "") {
			oForm.find(".message").html("页码不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(pageNumber))) {
			oForm.find(".message").html("页码必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 版次
		var edition = oForm.find("input[name=edition]").val();
		if (edition == null || edition == "") {
			oForm.find(".message").html("版次不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(edition))) {
			oForm.find(".message").html("版次必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 原价
		var originalCost = oForm.find("input[name=originalCost]").val();
		if (originalCost == null || originalCost == "") {
			oForm.find(".message").html("原价不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseFloat(originalCost))) {
			oForm.find(".message").html("原价必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 总库存
		var totalInventory = oForm.find("input[name=totalInventory]").val();
		if (totalInventory == null || totalInventory == "") {
			oForm.find(".message").html("总库存不能为空。")
					.css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(totalInventory))) {
			oForm.find(".message").html("总库存必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 一级分类
		var firstClassify = oForm.find("input[name=firstClassify]").val();
		if (firstClassify == null || firstClassify == "") {
			oForm.find(".message").html("一级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 二级分类
		var secondClassify = oForm.find("input[name=secondClassify]").val();
		if (secondClassify == null || secondClassify == "") {
			oForm.find(".message").html("二级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 三级分类
		var thirdClassify = oForm.find("input[name=thirdClassify]").val();
		if (thirdClassify == null || thirdClassify == "") {
			oForm.find(".message").html("三级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 四级分类
		var fourthClassify = oForm.find("input[name=fourthClassify]").val();
		if (fourthClassify == null || fourthClassify == "") {
			oForm.find(".message").html("四级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 目录
		var directory = oForm.find("input[name=directory]").val();
		if (directory == null || directory == "") {
			oForm.find(".message").html("目录不能为空。").css("visibility", "visible");
			return false;
		}

		// 内容简介
		var bookDescription = oForm.find("input[name=bookDescription]").val();
		if (bookDescription == null || bookDescription == "") {
			oForm.find(".message").html("内容简介不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 前言
		var foreword = oForm.find("input[name=foreword]").val();
		if (foreword == null || foreword == "") {
			oForm.find(".message").html("前言不能为空。").css("visibility", "visible");
			return false;
		}

		// 序言
		var preface = oForm.find("input[name=preface]").val();
		if (preface == null || preface == "") {
			oForm.find(".message").html("序言不能为空。").css("visibility", "visible");
			return false;
		}

		// 返回函数值
		return true;

	};

	// 提交表单
	dialogDiv.find("form.dialog-panel.to-add-book").form(
			"submit",
			{
				onSubmit : function() {

					// 表单对象
					var oForm = dialogDiv.find("form.to-add-book");
					if (!validateForm(oForm)) {
						return false;
					}

					// 消息
					dialogDiv.find("form.dialog-panel.to-add-book>.message")
							.html("验证通过，正在提交表单......").css("visibility",
									"visible");

					// 验证表单数据
					return true;
				},
				success : function(strHtml) {
					// 关闭原来的对话框
					dialogDiv.dialog("close");
					// 刷新图书列表
					$(".query-result-panel").datagrid("reload");
					// 显示结果对话框
					showSaveBookResult(strHtml);
				}
			});

}

/**
 * 显示保存图书的结果
 * 
 * 开发时间：2016-5-10 上午11:21:33
 * 
 * @author moshco zhu
 * 
 * @param strHtml
 */
function showSaveBookResult(strHtml) {
	// 动态构建对话框的jQuery对象
	var dialogDiv = $("<div />").append(strHtml);
	// 添加是否成功
	var bookId = dialogDiv.find("input[name=id]").val();
	if (bookId != null && !isNaN(parseInt(bookId)) && parseInt(bookId) > 0) {
		// 添加成功

		// 创建对话框组件
		dialogDiv.dialog({
			title : "增加图书成功",
			width : 580,
			height : 560,
			collapsible : false,
			close : false,
			cache : false,
			modal : true,
			onClose : function() {
				$(this).dialog("destroy");
			},
			buttons : [ {
				text : "继续添加",
				handler : function() {
					// 关闭对话框
					dialogDiv.dialog("close");
					// 单击“增加图书”链接
					$("a.item.to-add-book").click();
				}
			}, {
				text : "编辑图书",
				handler : function() {
					// 关闭对话框
					dialogDiv.dialog("close");
					// 单击“编辑”链接
					$("a.item.to-edit-book[book-id=" + bookId + "]").click();
				}
			}, {
				text : "关闭",
				handler : function() {
					dialogDiv.dialog("close");
				}
			} ]
		});
	} else {
		// 添加失败

		// 创建对话框组件
		dialogDiv.dialog({
			title : "增加图书",
			width : 720,
			height : 560,
			collapsible : false,
			close : false,
			cache : false,
			modal : true,
			onClose : function() {
				$(this).dialog("destroy");
			},
			buttons : [ {
				text : "保存图书",
				handler : function() {
					// 保存图书
					saveBook(dialogDiv);
				}
			}, {
				text : "关闭",
				handler : function() {
					// 关闭对话框
					dialogDiv.dialog("close");
				}
			} ]
		});
	}

	// 加载js
	$.getScript(dialogDiv.find("form").attr("js"));

}

/**
 * 去编辑图书
 * 
 * 开发时间：2016-5-11 上午9:16:11
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function toEditBook(oBtn) {

	// 获取url
	var url = oBtn.attr("href");
	// 动态构建一个对话框的jQuery对象
	var dialogDiv = $("<div />");
	dialogDiv.dialog({
		title : "编辑图书",
		width : 720,
		height : 560,
		collapsible : false,
		close : false,
		cache : false,
		modal : true,
		href : url,
		onClose : function() {
			$(this).dialog("destroy");
		},
		onLoad : function() {
			// 加载js
			$.getScript(dialogDiv.find("form").attr("js"));
		},
		buttons : [ {
			text : "保存图书",
			handler : function() {
				// 保存图书
				updateBook(dialogDiv);
			}
		}, {
			text : "关闭",
			handler : function() {
				// 关闭对话框
				dialogDiv.dialog("close");
			}
		} ]
	});

	// 返回函数值
	return false;
}

/**
 * 编辑图书
 * 
 * 开发时间：2016-5-11 上午10:45:57
 * 
 * @author moshco zhu
 * 
 * @param dialogDiv
 */
function updateBook(dialogDiv) {

	// 验证表单
	var validateForm = function(oForm) {

		// 编号
		var id = oForm.find("input[name=id]").val();
		if (id == null || id == "") {
			oForm.find(".message").html("记录编号不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 书名
		var title = oForm.find("input[name=title]").val();
		if (title == null || title == "") {
			oForm.find(".message").html("书名不能为空。").css("visibility", "visible");
			return false;
		}

		// 作者
		var author = oForm.find("input[name=author]").val();
		if (author == null || author == "") {
			oForm.find(".message").html("作者不能为空。").css("visibility", "visible");
			return false;
		}

		// 出版社
		var press = oForm.find("input[name=press]").val();
		if (press == null || press == "") {
			oForm.find(".message").html("出版社不能为空。")
					.css("visibility", "visible");
			return false;
		}

		// ISBN
		var isbn = oForm.find("input[name=isbn]").val();
		if (isbn == null || isbn == "") {
			oForm.find(".message").html("ISBN不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 出版时间
		var publicationDate1 = oForm.find("input[name=publicationDate1]").val();
		if (publicationDate1 == null || publicationDate1 == "") {
			oForm.find(".message").html("出版时间不能为空。").css("visibility",
					"visible");
			return false;
		} else if (!validateDate(publicationDate1)) {
			oForm.find(".message").html("无效的出版时间。")
					.css("visibility", "visible");
			return false;
		}

		// 开本
		var bookSize = oForm.find("input[name=bookSize]").val();
		if (bookSize == null || bookSize == "") {
			oForm.find(".message").html("开本不能为空。").css("visibility", "visible");
			return false;
		}

		// 页码
		var pageNumber = oForm.find("input[name=pageNumber]").val();
		if (pageNumber == null || pageNumber == "") {
			oForm.find(".message").html("页码不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(pageNumber))) {
			oForm.find(".message").html("页码必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 版次
		var edition = oForm.find("input[name=edition]").val();
		if (edition == null || edition == "") {
			oForm.find(".message").html("版次不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(edition))) {
			oForm.find(".message").html("版次必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 原价
		var originalCost = oForm.find("input[name=originalCost]").val();
		if (originalCost == null || originalCost == "") {
			oForm.find(".message").html("原价不能为空。").css("visibility", "visible");
			return false;
		} else if (isNaN(parseFloat(originalCost))) {
			oForm.find(".message").html("原价必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 总库存
		var totalInventory = oForm.find("input[name=totalInventory]").val();
		if (totalInventory == null || totalInventory == "") {
			oForm.find(".message").html("总库存不能为空。")
					.css("visibility", "visible");
			return false;
		} else if (isNaN(parseInt(totalInventory))) {
			oForm.find(".message").html("总库存必须是一个数字。").css("visibility",
					"visible");
			return false;
		}

		// 一级分类
		var firstClassify = oForm.find("input[name=firstClassify]").val();
		if (firstClassify == null || firstClassify == "") {
			oForm.find(".message").html("一级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 二级分类
		var secondClassify = oForm.find("input[name=secondClassify]").val();
		if (secondClassify == null || secondClassify == "") {
			oForm.find(".message").html("二级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 三级分类
		var thirdClassify = oForm.find("input[name=thirdClassify]").val();
		if (thirdClassify == null || thirdClassify == "") {
			oForm.find(".message").html("三级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 四级分类
		var fourthClassify = oForm.find("input[name=fourthClassify]").val();
		if (fourthClassify == null || fourthClassify == "") {
			oForm.find(".message").html("四级分类不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 目录
		var directory = oForm.find("input[name=directory]").val();
		if (directory == null || directory == "") {
			oForm.find(".message").html("目录不能为空。").css("visibility", "visible");
			return false;
		}

		// 内容简介
		var bookDescription = oForm.find("input[name=bookDescription]").val();
		if (bookDescription == null || bookDescription == "") {
			oForm.find(".message").html("内容简介不能为空。").css("visibility",
					"visible");
			return false;
		}

		// 前言
		var foreword = oForm.find("input[name=foreword]").val();
		if (foreword == null || foreword == "") {
			oForm.find(".message").html("前言不能为空。").css("visibility", "visible");
			return false;
		}

		// 序言
		var preface = oForm.find("input[name=preface]").val();
		if (preface == null || preface == "") {
			oForm.find(".message").html("序言不能为空。").css("visibility", "visible");
			return false;
		}

		// 返回函数值
		return true;

	};

	// 提交表单
	dialogDiv.find("form.dialog-panel.to-edit-book").form(
			"submit",
			{
				onSubmit : function() {
					// 表单对象
					var oForm = dialogDiv.find("form.to-edit-book");
					if (!validateForm(oForm)) {
						return false;
					}

					// 消息
					dialogDiv.find("form.dialog-panel.to-edit-book>.message")
							.html("验证通过，正在提交表单......").css("visibility",
									"visible");

					// 验证表单数据
					return true;
				},
				success : function(strHtml) {
					// 关闭原来的对话框
					dialogDiv.dialog("close");
					// 刷新图书列表
					$(".query-result-panel").datagrid("load");
					// 显示编辑的结果对话框
					showEditBookResult(strHtml);
				}
			});

}

/**
 * 显示编辑的结果对话框
 * 
 * 开发时间：2016-5-11 上午10:50:25
 * 
 * @author moshco zhu
 * 
 * @param strHtml
 */
function showEditBookResult(strHtml) {

	// 动态构建对话框的jQuery对象
	var dialogDiv = $("<div />").append(strHtml);
	// 读取图书Id
	var bookId = dialogDiv.find("input[name=id]").val();
	// 找寻面板对象
	var dialogPanel = dialogDiv.find(".dialog-panel");
	if (dialogPanel.hasClass("show-book")) {
		// 编辑成功

		// 创建对话框组件
		dialogDiv.dialog({
			title : "编辑图书成功",
			width : 580,
			height : 560,
			collapsible : false,
			close : false,
			cache : false,
			modal : true,
			onClose : function() {
				$(this).dialog("destroy");
			},
			buttons : [ {
				text : "继续编辑",
				handler : function() {
					// 关闭对话框
					dialogDiv.dialog("close");
					// 单击“编辑”链接
					$("a.item.to-edit-book[book-id=" + bookId + "]").click();
				}
			}, {
				text : "关闭",
				handler : function() {
					dialogDiv.dialog("close");
				}
			} ]
		});
	} else {
		// 编辑失败

		// 创建对话框组件
		dialogDiv.dialog({
			title : "编辑图书",
			width : 720,
			height : 560,
			collapsible : false,
			close : false,
			cache : false,
			modal : true,
			onClose : function() {
				$(this).dialog("destroy");
			},
			buttons : [ {
				text : "保存图书",
				handler : function() {
					// 保存图书
					updateBook(dialogDiv);
				}
			}, {
				text : "关闭",
				handler : function() {
					// 关闭对话框
					dialogDiv.dialog("close");
				}
			} ]
		});
	}

	// 加载js
	$.getScript(dialogDiv.find("form").attr("js"));

}
