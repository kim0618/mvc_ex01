package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController02 {

@RequestMapping(value="index01")
public String Quizindex(Model model) {
	model.addAttribute("index","기본 페이지이다");
	return "member02/index01";
}
@RequestMapping(value="login01")
public String Quizlogin(Model model) {
	model.addAttribute("login","로그인 페이지이다");
	return "member02/login01";
}

@RequestMapping(value="logout01")
public String Quizlogout(Model model) {
	model.addAttribute("logout","로그아웃 페이지이다");
	return "member02/logout01";
}

}
