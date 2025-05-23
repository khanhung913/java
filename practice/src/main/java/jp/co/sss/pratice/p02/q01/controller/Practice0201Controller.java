package jp.co.sss.pratice.p02.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {
	@RequestMapping("/opening")
	public String opening() {
		return "/Practice2-01/opening";
	}

	@RequestMapping("/")
	public String welcome() {
		return "Practice2-01/index";
	}
}
