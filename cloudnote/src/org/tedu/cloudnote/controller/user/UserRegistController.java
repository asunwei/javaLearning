package org.tedu.cloudnote.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tedu.cloudnote.service.UserService;
import org.tedu.cloudnote.util.NoteResult;

@Controller
@RequestMapping("/user")
public class UserRegistController {
	@Resource
	private UserService userService;
	@RequestMapping("/regist.do")
	@ResponseBody
	public NoteResult execute(String name,String password,String nick) throws Exception{
		NoteResult result = userService.registUser(name, password, nick);
		return result;
	}
}
