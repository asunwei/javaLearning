package org.tedu.cloudnote.controller.notebook;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tedu.cloudnote.service.BookService;
import org.tedu.cloudnote.util.NoteResult;

@Controller
@RequestMapping("/notebook")
public class AddBookController {
	@Resource
	private BookService bookService;
	@RequestMapping("/add.do")
	@ResponseBody
	public NoteResult excute(String userId,String bookName){
		NoteResult result = bookService.addBook(userId, bookName);
		return result;
	}
}
