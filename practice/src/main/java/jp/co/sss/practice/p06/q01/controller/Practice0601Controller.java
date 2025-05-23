package jp.co.sss.practice.p06.q01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0601Controller {
	@Autowired
	FruitsSeasonRepository repository;

	@GetMapping("/fruits/list/all")
	public String showList(Model model) {
		model.addAttribute("fruits", this.repository.findAll());
		return "Practice6-01/fruits_list";
	}
}
