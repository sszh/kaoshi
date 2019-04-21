package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.product.service.Product;
import com.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/index")
	public String loginPage() {
		return "search";
	}

	@RequestMapping(value = "/search")
	public ModelAndView loginCheck(IdCommand idCommand) {
		Product p = productService.search(idCommand.getId());
		ModelAndView mv=new ModelAndView("search"); 
		mv.addObject("pdt", p);
		return mv;
	}
}





