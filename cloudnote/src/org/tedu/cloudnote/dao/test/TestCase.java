package org.tedu.cloudnote.dao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tedu.cloudnote.dao.NoteDao;
import org.tedu.cloudnote.entity.Note;
import org.tedu.cloudnote.entity.Share;
import org.tedu.cloudnote.util.NoteUtil;

public class TestCase {
	@Test
	//测试updateContent方法
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		NoteDao noteDao = ac.getBean("noteDao",NoteDao.class);
		Note note = noteDao.findById("f4cce0e5-ba14-4deb-bc04-e396f53c40f3");
		note.setCn_note_body("中国");
		note.setCn_note_title("2016");
		noteDao.updateContent(note);
		System.out.println(note.getCn_note_body()+":"+note.getCn_note_title());
	}
	
	@Test
	//测试笔记分享添加方法
	public void test2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		NoteDao noteDao = ac.getBean("noteDao",NoteDao.class);
		Note note = noteDao.findById("f4cce0e5-ba14-4deb-bc04-e396f53c40f3");
		Share share = new Share();
		share.setCn_share_title(note.getCn_note_title());
		share.setCn_share_body(note.getCn_note_body());
		String shareId = NoteUtil.creatId();
		share.setCn_share_id(shareId);
		share.setCn_note_id("f4cce0e5-ba14-4deb-bc04-e396f53c40f3");
		System.out.println(share.getCn_share_id()+":"+share.getCn_note_id());
		
	}
}
