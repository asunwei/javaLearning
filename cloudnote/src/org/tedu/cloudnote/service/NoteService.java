package org.tedu.cloudnote.service;

import org.tedu.cloudnote.util.NoteResult;

public interface NoteService {
	public NoteResult loadBookNotes(String bookId);
	public NoteResult loadNote(String noteId);
	public NoteResult addNote(String bookId,String userId,String noteTitle);
	public NoteResult updateNote(String noteId,String noteTitle,String noteBody);
	public NoteResult recycleNote(String noteId);
}
