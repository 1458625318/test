/**
 * 改变验证码
 * 
 * 开发时间：2016-4-28 下午3:08:25
 * 
 * @author moshco zhu
 * 
 * @param oBtn
 * @returns {Boolean}
 */
function changeVerifyCode(oBtn) {

	// 找寻验证码图片
	var image = oBtn.parents("form:first").find("input[type=image]");
	// 读取url
	var url = image.attr("src") + "&p=1";
	// 设置新的url
	image.attr("src", url);

	// 返回函数值
	return false;
}