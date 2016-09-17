package org.tedu.cloudnote.service.test;

import junit.framework.Assert;

import org.junit.Test;
import org.tedu.cloudnote.service.BookService;
import org.tedu.cloudnote.util.NoteResult;

public class TestAddBook extends Servicetest{
	@Test
	public void test(){
		BookService service = super.getContext().getBean("bookService",BookService.class);
		//NoteResult result = service.addBook("2016年的一天");
		//Assert.assertEquals(0, result.getStatus());
	}
	
}
