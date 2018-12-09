/**
 * 显示用户信息
 * 
 * 开发时间：2016-5-5 下午3:04:30
 * 
 * @author moshco zhu
 * 
 */
function showUserInfo() {

	$(".page-content>.unit.user-info").html("正在加载用户信息......");

	// 读取url
	var url = $(".page-content>.unit.user-info").attr("url");
	// 发送ajax请求
	$(".page-content>.unit.user-info").load(url);
}

// 加载用户信息
showUserInfo();

/**
 * 文件上传完毕后运行
 * 
 * 开发时间：2016-5-4 下午12:02:08
 * 
 * @author moshco zhu
 * 
 */
function onAfterUploadHeadPhoto() {
	// 内部帧窗体文档对象
	var doc = $(uploadHeadPhotoTarget.document);
	if (doc.find("input[name=headPhoto]").length <= 0) {
		return;
	}

	// 显示消息
	$("#uploadHeadPhotoTarget").parents(".head-photo:first").find(".message")
			.html("恭喜，头像上传成功！正在更新显示......").show();

	// 图片对象
	var image = $("#uploadHeadPhotoTarget").parent().find("img");
	// 读取url
	var imageUrl = image.attr("src") + "&p=1";
	// 重新设置src属性
	image.attr("src", imageUrl);

	// 显示消息
	$("#uploadHeadPhotoTarget").parents(".head-photo:first").find(".message")
			.html("恭喜，头像上传成功！显示已经更新。").show();
	// 10秒后隐藏
	window.setTimeout("setTimeout1();", 10 * 1000);

}

/**
 * 定时事件1
 * 
 * 开发时间：2016-5-5 上午9:02:15
 * 
 * @author moshco zhu
 * 
 */
function setTimeout1() {
	// 隐藏消息
	$("#uploadHeadPhotoTarget").parents(".head-photo:first").find(".message")
			.empty().fadeOut(3000);
}

/**
 * 去编辑头像
 * 
 * 开发时间：2016-5-4 下午12:26:17
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 */
function toEditHeadPhoto(oBtn) {
	// 显示头像上传的表单
	oBtn.parent().parent().find("form").show();
	// 隐藏按钮所在行
	oBtn.parent().hide();
}

/**
 * 取消编辑头像
 * 
 * 开发时间：2016-5-4 下午12:31:18
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 */
function cancelEditHeadPhoto(oBtn) {
	// 显示头像上传的表单
	oBtn.parent().hide();
	// 隐藏按钮所在行
	oBtn.parent().parent().find(".row.actions").show();
}

/**
 * 提交上传头像的表单后运行
 * 
 * 开发时间：2016-5-5 上午8:39:42
 * 
 * @author moshco zhu
 * 
 * @param oForm
 */
function onsubmitUploadHeadPhoto(oForm) {

	// 头像文件
	var headPhoto = oForm.find("input[name=headPhoto]").val();
	if (headPhoto == null || headPhoto == "") {
		// 显示消息
		oForm.parents(".head-photo:first").find(".message").html("请选择一个图片文件。")
				.show();
		// 返回函数值
		return false;
	}

	// 显示消息
	oForm.parents(".head-photo:first").find(".message").html("正在上传头像......")
			.show();
	// 返回函数值
	return true;

}

/**
 * 去编辑员工信息
 * 
 * 开发时间：2016-5-5 上午10:50:58
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 */
function toEditEmployee(oBtn) {
	// 获取url
	var url = oBtn.attr("url");
	// 创建对话框内容的jQuery对象
	var oDialog = $("<div />");
	// 创建对话框
	oDialog.dialog({
		title : "编辑个人信息",
		width : 400,
		height : 480,
		collapsible : false,
		closed : false,
		cache : false,
		modal : true,
		href : url,
		onClose : function() {
			// 销毁窗体
			$(this).dialog("destroy");
		},
		buttons : [ {
			text : "提交保存",
			handler : function() {
				// 提交保存
				submitEmployee(oDialog);
			}
		}, {
			text : "关闭",
			handler : function() {
				// 关闭窗体
				oDialog.dialog("close");
			}
		} ]
	});
	// 返回函数值
	return false;
}

/**
 * 提交保存个人信息
 * 
 * 开发时间：2016-5-5 下午12:09:37
 * 
 * @author moshco zhu
 * 
 * @param oDialog
 */
function submitEmployee(oDialog) {

	// 显示消息
	oDialog.find(".message").html("正在提交表单......").show();

	// 提交表单
	oDialog.find("form.dialog-panel.edit-employee").form("submit", {
		onSubmit : function() {
			return true;
		},
		success : function(strHtml) {
			// 关闭原有的对话框
			oDialog.dialog("close");
			// 刷新用户信息
			showUserInfo();
			// 在对话框中显示消息
			showSubmitEmployeeResult(strHtml);
		}
	});

}

/**
 * 显示提交员工结果的信息
 * 
 * 开发时间：2016-5-5 下午12:28:35
 * 
 * @author moshco zhu
 * 
 * @param strHtml
 */
function showSubmitEmployeeResult(strHtml) {
	// 创建对话框内容的jQuery对象
	var oDialog = $("<div />").append(strHtml);
	// 创建对话框
	oDialog.dialog({
		title : "编辑个人信息的结果",
		width : 400,
		height : 140,
		collapsible : false,
		closed : false,
		cache : false,
		modal : true,
		onClose : function() {
			// 销毁窗体
			$(this).dialog("destroy");
		},
		buttons : [ {
			text : "关闭",
			handler : function() {
				// 关闭窗体
				oDialog.dialog("close");
			}
		} ]
	});
}
