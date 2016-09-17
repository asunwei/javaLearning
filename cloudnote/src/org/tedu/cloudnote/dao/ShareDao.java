package org.tedu.cloudnote.dao;

import org.tedu.cloudnote.entity.Share;

public interface ShareDao {
	public void save(Share share);
	public Share findByNoteId(String noteId);
}
