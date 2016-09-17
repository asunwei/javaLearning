package org.tedu.cloudnote.service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tedu.cloudnote.dao.BookDao;
import org.tedu.cloudnote.entity.Book;
import org.tedu.cloudnote.util.NoteResult;
import org.tedu.cloudnote.util.NoteUtil;
@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
	@Resource
	private BookDao bookDao;
	public NoteResult loadUserBooks(String userId) {
		NoteResult result = new NoteResult();
		List<Book> books = bookDao.findByUserId(userId);
		result.setStatus(0);
		result.setData("加载笔记本成功");
		result.setData(books);
		return result;
	}
	public NoteResult addBook(String userId,String bookName) {
		NoteResult result = new NoteResult();
		Book book = new Book();
		String bookId = NoteUtil.creatId();
		book.setCn_user_id(userId);
		book.setCn_notebook_name(bookName);
		book.setCn_notebook_id(bookId);
		book.setCn_notebook_type_id("5");
		book.setCn_notebook_desc("");
		Timestamp time = new Timestamp(System.currentTimeMillis());
		book.setCn_notebook_createtime(time);
		bookDao.save(book);
		result.setStatus(0);
		result.setMsg("创建成功");
		result.setData(book.getCn_notebook_id());
		return result;
	}

}
