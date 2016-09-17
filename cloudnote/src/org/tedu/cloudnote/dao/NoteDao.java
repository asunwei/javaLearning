package org.tedu.cloudnote.dao;

import java.util.List;
import java.util.Map;

import org.tedu.cloudnote.entity.Note;

public interface NoteDao {
	public List<Note> findByBookId(String bookId);
	public Note findById(String noteId);
	public void save(Note note);
	public int updateContent(Note note);
	public int updateStatus(Map<String,Object> map);
}
