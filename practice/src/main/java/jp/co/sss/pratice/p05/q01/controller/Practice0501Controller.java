package jp.co.sss.pratice.p05.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.sss.pratice.p05.q01.form.BmiForm;

@Controller
public class Practice0501Controller {
	@GetMapping("/bmi/input")
	public String input() {
		return "Practice5-01/bmi_input";
	}

	@PostMapping("/bmi/result")
	public String result(BmiForm bmiForm, Model model) {
		double height = bmiForm.getHeight();
		double weight = bmiForm.getWeight();
		bmiForm.setBmi(weight / Math.pow((height / 100), 2));
		model.addAttribute("bmi", bmiForm);
		return "Practice5-01/bmi_result";
	}
}
