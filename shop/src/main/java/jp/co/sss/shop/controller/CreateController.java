package jp.co.sss.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.shop.entity.Category;
import jp.co.sss.shop.entity.ItemWithCategory;
import jp.co.sss.shop.form.ItemWithCategoryForm;
import jp.co.sss.shop.repository.ItemWithCategoryRepository;

@Controller
public class CreateController {
	@Autowired
	ItemWithCategoryRepository repository;

	@RequestMapping("/create/input")
	public String createInput() {
		return "create/create_input";
	}

	@RequestMapping("/create/complete")
	public String createComplete(ItemWithCategoryForm form, Model model) {
		ItemWithCategory itemWithCategory = new ItemWithCategory();
		BeanUtils.copyProperties(form, itemWithCategory);
		Category category = new Category();
		category.setId(form.getCategoryId());
		itemWithCategory.setCategory(category);
		itemWithCategory = repository.save(itemWithCategory);
		model.addAttribute("item", itemWithCategory);
		return "create/create_complete";
	}
}
