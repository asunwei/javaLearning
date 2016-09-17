package org.tedu.cloudnote.service.test;

import junit.framework.Assert;

import org.junit.Test;
import org.tedu.cloudnote.service.NoteService;
import org.tedu.cloudnote.util.NoteResult;

public class TestLoadNote extends Servicetest{
	@Test
	public void test(){
		NoteService service = super.getContext().getBean("noteService",NoteService.class);
		NoteResult result = service.loadNote("9598cb72-4215-4b58-b7c6-b51ed0b7b3b4");
		Assert.assertEquals(0, result.getStatus());
	}
}
