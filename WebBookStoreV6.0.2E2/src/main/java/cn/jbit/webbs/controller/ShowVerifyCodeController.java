/**
 * 
 * 
 * 创建时间：2016-8-25 上午10:01:09
 * @author：moshco zhu
 */
package cn.jbit.webbs.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jbit.webbs.entity.VerifyCode;

/**
 * 显示验证码图片
 * 
 * 创建时间：2016-8-25 上午10:01:09
 * 
 * @author moshco zhu
 * 
 */
@Controller("showVerifyCodeController")
@RequestMapping("/")
public class ShowVerifyCodeController extends WebBookStoreBaseController {

	/**
	 * 业务实现
	 * 
	 * 
	 * 开发时间：2016-8-25 上午10:03:13
	 * 
	 * @author：moshco zhu
	 * @param response
	 *            客户端响应对象
	 * @param session
	 *            回话对象
	 * @param actionPlace
	 *            验证码生成的位置
	 * @return
	 */
	@RequestMapping("showVerifyCode")
	public void execute(HttpServletResponse response, HttpSession session, String actionPlace) {

		// 验证码
		String verifyCode = null;

		// 图片对象
		BufferedImage image = null;

		try {
			// 创建图片对象
			image = new BufferedImage(60, 24, BufferedImage.TYPE_INT_RGB);
			// 获取图片画笔
			Graphics graphics = image.getGraphics();

			// 设置画笔颜色
			graphics.setColor(Color.WHITE);
			// 将图片背景涂为白色
			graphics.fillRect(0, 0, 60, 24);

			// 创建随机对象
			Random random = new Random(System.currentTimeMillis());

			// 随机点的数组
			int[][] randomPoints = new int[9][2];

			// 生成随机的点
			for (int i = 0; i < randomPoints.length; i++) {
				randomPoints[i][0] = random.nextInt(60);
				randomPoints[i][1] = random.nextInt(24);
			}

			// 设置画笔颜色
			graphics.setColor(Color.BLACK);
			// 将随机的点按顺序连接起来
			for (int i = 1; i < randomPoints.length; i++) {
				graphics.drawLine(randomPoints[i - 1][0], randomPoints[i - 1][1], randomPoints[i][0],
						randomPoints[i][1]);
			}

			// 生成验证码编码
			StringBuffer strbVerifyCode = new StringBuffer();
			for (int i = 0; i < 4; i++) {
				strbVerifyCode.append(random.nextInt(10));
			}
			verifyCode = strbVerifyCode.toString();

			// 设置画笔颜色
			graphics.setColor(Color.RED);
			// 设置字体
			graphics.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			// 在图片上绘制字符串
			graphics.drawString(verifyCode, 10, 14);

			// 释放资源
			graphics.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			// 创建验证码记录
			VerifyCode record = new VerifyCode();
			record.setCode(verifyCode);
			record.setSort("掩码");
			record.setSessionId(session.getId());
			record.setActionPlace(transformCode(actionPlace));
			record.setBegingTime(new Date());
			record.setEndTime(new Date(System.currentTimeMillis() + 3 * 60 * 1000));
			record.setValidateLength(3);
			record.setIsVerify(0);
			record.setCreateTime(new Date());

			// 保存到数据库
			baseService.save(record);

			/**
			 * record.setCreateTime(new Date()); baseService.update(record);
			 * 
			 * baseService.remove(record);
			 * 
			 * record = baseService.find(VerifyCode.class, "code", "5706");
			 * 
			 * System.out.println("id：" + record.getId());
			 * 
			 * Map<String, Object> queryParam = new HashMap<String, Object>();
			 * queryParam.put("validateLength", 3); queryParam.put("code",
			 * "9721"); queryParam.put("actionPlace", "客户登录"); record =
			 * baseService.find(VerifyCode.class, queryParam);
			 * 
			 * System.out.println("id：" + record.getId());
			 * 
			 * List<VerifyCode> list = baseService.query(VerifyCode.class,
			 * "code", "%9%");
			 * 
			 * System.out.println("size：" + list.size());
			 * 
			 * queryParam = new HashMap<String, Object>();
			 * queryParam.put("sort", "掩码"); queryParam.put("code", "%9%");
			 * queryParam.put("actionPlace", "客户登录"); List<VerifyCode> list2 =
			 * baseService.query(VerifyCode.class, queryParam);
			 * 
			 * System.out.println("size：" + list2.size());
			 * 
			 * Object[] pagination =
			 * baseService.queryPagination(VerifyCode.class, queryParam, 1, 2);
			 * System.out.println("totalRecord：" + pagination[0]);
			 * List<VerifyCode> list3 = (List<VerifyCode>) pagination[1];
			 * System.out.println("size：" + list3.size());
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			/**
			 * 设置下面这段就是文件下载
			 */
			// 设置头信息
			response.setHeader("Content-Disposition", "attachment;filename=image.png");

			// 设置内容类型
			response.setContentType("image/png;charset=utf-8");

			// 获取客户端输出流
			OutputStream os = response.getOutputStream();
			// 输出数据
			ImageIO.write(image, "png", os);
			// 刷新
			os.flush();
			// 关闭输出流
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
