package web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * ��������Զ����ǩ���������ϵͳʱ��
 * ʱ�����Ĭ�ϸ�ʽyyyy-MM-dd HH:mm:ss
 * Ҳ�����޸������ʽ
 * @author Administrator
 *
 */

public class SystemDateTag extends SimpleTagSupport {
	/**
	 * ���ڵĸ�ʽ����Ĭ��ֵ����ʹ�ñ�ǩʱ�����ֵ��
	 * ��Ĭ��ֵ������
	 */
	private String format = "yyyy-MM-dd HH:mm:ss";
	@Override
	public void doTag() throws JspException, IOException {
		/*
		 * 1.��ȡ��ǰϵͳʱ��
		 * 2.��ʽ��ʱ��
		 * 3.���ʱ��
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
		//�˴���Ҫ�ر�writer ����������ǩ���޷�ʹ��writer
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
