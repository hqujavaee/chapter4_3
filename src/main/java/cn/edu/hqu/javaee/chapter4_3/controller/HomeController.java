package cn.edu.hqu.javaee.chapter4_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/","index"})
	public String home() {
		return "home";
	}
}
