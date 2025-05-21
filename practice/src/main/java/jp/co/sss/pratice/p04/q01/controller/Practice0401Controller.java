package jp.co.sss.pratice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Practice0401Controller {
	@RequestMapping("/input")
	public String homePage() {
		return "Practice04/01/input_form";
	}

	@RequestMapping("/send/get_method")
	public String sendGetMethod(@RequestParam String color) {
		System.out.println(color);
		return "Practice04/01/get_result";
	}
	@RequestMapping("/send/post_method")
	public String sendPostMethod(@RequestParam String color) {
		System.out.println(color);
		return "Practice04/01/post_result";
	}

}
