package org.tedu.cloudnote.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.tedu.cloudnote.service.NoteService;
import org.tedu.cloudnote.util.NoteResult;

public class testUpdateNote extends Servicetest{
	@Test
	public void test2() throws Exception{
		NoteService service = super.getContext().getBean("noteService",NoteService.class);
		NoteResult result = service.updateNote("f4cce0e5-ba14-4deb-bc04-e396f53c40f3", "ÖÐ¹ú", "2016");
		Assert.assertEquals(0, result.getStatus());	}
}
