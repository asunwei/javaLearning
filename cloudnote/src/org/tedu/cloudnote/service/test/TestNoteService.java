package org.tedu.cloudnote.service.test;

import junit.framework.Assert;

import org.junit.Test;
import org.tedu.cloudnote.service.NoteService;
import org.tedu.cloudnote.util.NoteResult;

public class TestNoteService extends Servicetest{

	@Test
	public void test(){
		NoteService service = super.getContext().getBean("noteService",NoteService.class);
		NoteResult result = service.loadBookNotes("516f6f4f-eaa3-4c76-84ff-530b92c7f64d");
		Assert.assertEquals(0, result.getStatus());
	}
}
