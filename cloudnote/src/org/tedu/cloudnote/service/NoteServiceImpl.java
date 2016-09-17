package org.tedu.cloudnote.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tedu.cloudnote.dao.NoteDao;
import org.tedu.cloudnote.entity.Note;
import org.tedu.cloudnote.util.NoteResult;
import org.tedu.cloudnote.util.NoteUtil;

@Service("noteService")
@Transactional
public class NoteServiceImpl implements NoteService {
	@Resource
	private NoteDao noteDao;
	
	public NoteResult loadBookNotes(String bookId) {
		NoteResult result = new NoteResult();
		List<Note> notes = noteDao.findByBookId(bookId);
		result.setStatus(0);
		result.setMsg("加载笔记本列表成功");
		result.setData(notes);
		return result;
	}

	public NoteResult loadNote(String noteId) {
		NoteResult result = new NoteResult();
		Note note  = noteDao.findById(noteId);
		result.setStatus(0);
		result.setMsg("显示笔记本内容&标题成功");
		result.setData(note);
		return result;
	}

	public NoteResult addNote(String bookId,String userId, String noteTitle) {
		NoteResult result = new NoteResult();
		Note note = new Note();
		note.setCn_note_body("");
		long time = System.currentTimeMillis();
		note.setCn_note_create_time(time);
		String noteId = NoteUtil.creatId();
		note.setCn_note_id(noteId);
		note.setCn_note_last_modify_time(time);
		note.setCn_note_status_id("1");
		note.setCn_note_title(noteTitle);
		note.setCn_note_type_id("1");
		note.setCn_notebook_id(bookId);
		note.setCn_user_id(userId);
		noteDao.save(note);
		result.setStatus(0);
		result.setMsg("创建笔记成功");
		result.setData(noteId);
		return result;
	}

	public NoteResult updateNote(String noteId, String noteTitle,
			String noteBody) {
		NoteResult result = new NoteResult();
		Note note = noteDao.findById(noteId);
		note.setCn_note_title(noteTitle);
		note.setCn_note_body(noteBody);
		long time = System.currentTimeMillis();
		note.setCn_note_last_modify_time(time);
		int rows = noteDao.updateContent(note);
		if(rows==0){
			result.setData(1);
			result.setMsg("保持笔记失败！");
		} else {
			result.setStatus(0);
			result.setMsg("保持笔记成功！");
		}
		return result;
	}

	public NoteResult recycleNote(String noteId) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("noteId", noteId);
		map.put("status", "2");
		NoteResult result = new NoteResult();
		int i = noteDao.updateStatus(map);
		if(i==0){
			result.setStatus(1);
			result.setMsg("删除失败！");
		} else{
			result.setStatus(0);
			result.setMsg("删除成功！");
		}
		return result;
	}

}
