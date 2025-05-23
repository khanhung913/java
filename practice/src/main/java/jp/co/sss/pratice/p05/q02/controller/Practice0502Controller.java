package jp.co.sss.pratice.p05.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0502Controller {
	@GetMapping("/numguess/start")
	public String start(HttpSession session) {
		int hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNumber", hitNumber);
		System.out.println(hitNumber);
		return "Practice5-02/numguess_start";
	}

	@GetMapping("/numguess/input")
	public String input() {
		return "Practice5-02/numguess_input";
	}

	@GetMapping("/numguess/judge")
	public String judge(HttpSession session, @RequestParam int inputNum) {
		int hitNumber = (int) session.getAttribute("hitNumber");
		if (hitNumber == inputNum)
			return "redirect:/numguess/hit";
		else
			return "Practice5-02/numguess_judge";
	}

	@GetMapping("/numguess/hit")
	public String hit(Model model, HttpSession session) {
		int hitNumber = (int) session.getAttribute("hitNumber");
		String message = "当たりです！ 正解は" + hitNumber + "でした。";
		model.addAttribute("message", message);
		session.removeAttribute("hitNumber");
		return "Practice5-02/numguess_end";
	}
}
