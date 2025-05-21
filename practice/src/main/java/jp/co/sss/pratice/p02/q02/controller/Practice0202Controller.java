package jp.co.sss.pratice.p02.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0202Controller {
	@RequestMapping("/hello/world")
	public String helloPage() {
		return "Practice2-01/hello";
	}
	
}
