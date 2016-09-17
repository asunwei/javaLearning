package org.tedu.cloudnote.service;

import org.tedu.cloudnote.util.NoteResult;

public interface BookService {
	public NoteResult loadUserBooks(String userId);
	public NoteResult addBook(String useId,String bookName);
}
