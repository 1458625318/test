// 当页面加载完毕后运行
$(window).load(function() {

	// 加载我的账户信息
	loadMyAccountInfo();

	// 加载我的交易记录
	loadMyTradeRecord();

});

/**
 * 加载我的账户信息
 * 
 * 开发时间：2016-8-25 上午11:56:34
 * 
 * @author moshco zhu
 * 
 */
function loadMyAccountInfo() {
	try {
		// 我的账户信息对象
		var myAccountInfo = $(".my-account-info");
		// 读取url
		var url = myAccountInfo.attr("url");
		// 加载页面内容
		myAccountInfo.html("正在加载账户信息......").load(url);
	} catch (e) {
		alert(e.message);
	}
}

/**
 * 加载我的交易记录
 * 
 * 开发时间：2016-8-25 上午11:56:55
 * 
 * @author moshco zhu
 * 
 */
function loadMyTradeRecord() {
	try {
		// 我的交易记录对象
		var myTradeRecord = $(".my-trade-record");
		// 读取url
		var url = myTradeRecord.attr("url");
		// 加载页面内容
		myTradeRecord.html("正在加载交易记录......").load(url);
	} catch (e) {
		alert(e.message);
	}
}

/**
 * 去充值
 * 
 * 开发时间：2016-8-27 上午11:02:11
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function toRecharge(oBtn) {
	try {
		// 创建对话框的jQuery对象
		var dialogDiv = $("<form name='frmRecharge'></form>").addClass(
				"to-recharge-form");
		// 对话框的内容
		var dialogContentHtml = $("form[name=frmRecharge].to-recharge-form")
				.html();
		// 设置给对话框
		dialogDiv.append(dialogContentHtml);
		// 构建对话框
		dialogDiv.dialog({
			"title" : "支付宝充值金额录入",// 标题
			"width" : 500,// 宽度
			"height" : 220,// 高度
			"modal" : true,// 模式对话框
			"autoOpen" : true,// 对话框构建起来就显示出来
			"open" : function() {
			},
			"close" : function() {
				$(this).dialog("destroy");
			},
			"buttons" : {
				"提交支付" : function() {
					// 读取url
					var url = oBtn.attr("href");
					// 提交支付
					submitRecharge(url, dialogDiv);
				},
				"关闭" : function() {
					$(this).dialog("close");
				}
			}
		});

	} catch (e) {
		alert(e.message);
	}
	// 返回函数值
	return false;
}

/**
 * 提交支付
 * 
 * 开发时间：2016-8-26 下午7:16:39
 * 
 * @author moshco zhu
 * 
 * @param url
 * @param dialogDiv
 */
function submitRecharge(url, dialogDiv) {
	try {

		// 获取表单数据

		// 充值金额
		var rechargeMoney = dialogDiv.find("input[name=rechargeMoney]").val();

		// 验证结果
		var verifyResult = true;
		// 消息
		var message = null;

		// 金额不能为空
		if (rechargeMoney == null || rechargeMoney == "") {
			verifyResult = false;
			message = "金额录入不能为空。";
		}

		// 有效金额
		if (verifyResult) {
			if (isNaN(parseFloat(rechargeMoney))) {
				verifyResult = false;
				message = "请输入有效金额。";
			}
		}

		// 验证不通过
		if (!verifyResult) {
			dialogDiv.find(".message").html(message).removeClass("hidden");
			return;
		}

		// 发送请求
		$.post(url, {
			"rechargeMoney" : rechargeMoney
		}, function(returnResult) {
			try {
				// 生成不成功
				if (!returnResult.isSuccess) {
					dialogDiv.find(".message").html(returnResult.message)
							.removeClass("hidden");
					return;
				}
				// 打开新的窗体：通过获取到的url，页面会进入到MHPay项目去实现支付
				window.open(returnResult.url);
				// 读取属性cookie-path的值：cookie存储的url路径
				var cookiePath = dialogDiv.find("input[name=cookie-path]")
						.val();
				// 关闭对话框
				dialogDiv.dialog("close");
				// 显示等待充值成功的消息对话框
				showWaitRechargeResult(returnResult.message, cookiePath);
			} catch (e) {
				alert(e.message);
			}
		});

	} catch (e) {
		alert(e.message);
	}
}

/**
 * 显示等待充值成功的消息对话框
 * 
 * 开发时间：2016-8-26 下午7:50:49
 * 
 * @author moshco zhu
 * 
 * @param message
 * @param cookiePath
 */
function showWaitRechargeResult(message, cookiePath) {
	try {
		// 构建对话框的jQuery对象
		var dialogDiv = $("<div>正在支付中，请耐心等待......</div>");
		// 构建对话框
		dialogDiv.dialog({
			"title" : "正在充值中......",// 标题
			"width" : 500,// 宽度
			"height" : 150,// 高度
			"modal" : true,// 模式对话框
			"autoOpen" : true,// 对话框构建起来就显示出来
			"open" : function() {
			},
			"close" : function() {
				try {
					// 销毁对话框
					$(this).dialog("destroy");
					// 停止循环监测
					$("iframe[name=ifRefreshCookie]").attr("src", "");
					// 加载我的账户信息
					loadMyAccountInfo();
					// 加载我的交易记录
					loadMyTradeRecord();
				} catch (e) {
					alert(e.message);
				}
			},
			"buttons" : {
				"关闭" : function() {
					$(this).dialog("close");
				}
			}
		});

		// 为对话框添加一个标示的class
		dialogDiv.addClass("wait-recharge-result-dialog");
		// 记录对话框的class
		$("iframe[name=ifRefreshCookie]").attr("dialog-class",
				"wait-recharge-result-dialog");

		// 启动程序监测充值结果
		{
			// 删除以前的cookie
			document.cookie = "isRecharge=;path=" + cookiePath;

			// 设置窗体的src,刷新iframe的页面
			var url = $("iframe[name=ifRefreshCookie]").attr("url");
			$("iframe[name=ifRefreshCookie]").attr("src", url);
		}

	} catch (e) {
		alert(e.message);
	}
}

/**
 * 监测cookie的值
 * 
 * 开发时间：2016-8-27 上午10:10:34
 * 
 * @author moshco zhu
 * 
 * @param oFrame
 */
function checkCookie(oFrame) {

	try {

		// 当页面刚刚打开时不要启动循环
		// 当frame的src属性被设置为空时循环将中断
		if ($(oFrame).attr("src") == null || $(oFrame).attr("src") == "") {
			return;
		}

		// 读取iframe内部页面cookie的值
		var isRechargeSuccess = $(ifRefreshCookie.document).find(
				"input[name=isRecharge]").val();

		if (isRechargeSuccess != null && isRechargeSuccess != "") {

			// 获取监测对话框的class
			var dialogClass = $(oFrame).attr("dialog-class");
			// 关闭监测的对话框
			$("." + dialogClass).dialog("close");

			// 在新的对话框中显示结果信息
			if (isRechargeSuccess == "true") {
				showRechargeResult("恭喜，充值成功了！");
			} else {
				showRechargeResult("充值失败了！");
			}

			// 加载我的账户信息
			loadMyAccountInfo();

			// 加载我的交易记录
			loadMyTradeRecord();

			// 中断循环
			return;
		}

	} catch (e) {
		alert(e.message);
	}

	// 间隔循环执行
	window.setTimeout("ifRefreshCookie.location.reload();", 1000);

}

/**
 * 显示充值结果
 * 
 * 开发时间：2016-8-27 上午11:03:41
 * 
 * @author moshco zhu
 * 
 * @param message
 */
function showRechargeResult(message) {
	try {
		// 构建对话框的jQuery对象
		var dialogDiv = $("<div>" + message + "</div>");
		// 构建对话框
		dialogDiv.dialog({
			"title" : "充值结果",// 标题
			"width" : 300,// 宽度
			"height" : 150,// 高度
			"modal" : true,// 模式对话框
			"autoOpen" : true,// 对话框构建起来就显示出来
			"open" : function() {
			},
			"close" : function() {
				$(this).dialog("destroy");
			},
			"buttons" : {
				"关闭" : function() {
					$(this).dialog("close");
				}
			}
		});
	} catch (e) {
		alert(e.message);
	}
}

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
