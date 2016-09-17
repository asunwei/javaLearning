package web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * 这个类是自定义标签，用来输出系统时间
 * 时间具有默认格式yyyy-MM-dd HH:mm:ss
 * 也可以修改这个格式
 * @author Administrator
 *
 */

public class SystemDateTag extends SimpleTagSupport {
	/**
	 * 日期的格式，有默认值。若使用便签时传入该值，
	 * 则默认值被覆盖
	 */
	private String format = "yyyy-MM-dd HH:mm:ss";
	@Override
	public void doTag() throws JspException, IOException {
		/*
		 * 1.获取当前系统时间
		 * 2.格式化时间
		 * 3.输出时间
		 */
		//1
		Date date = new Date();
		//2
		SimpleDateFormat fmt = new SimpleDateFormat(format);
		String now = fmt.format(date);
		//3
		PageContext ctx =(PageContext) getJspContext();
		JspWriter w = ctx.getOut();
		w.println(now);
		//此处不要关闭writer 否则其他标签就无法使用writer
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
