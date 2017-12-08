package com.MG.www;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MG.domain.ProductVO;
import com.MG.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Inject
	private ProductService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void registerGET(ProductVO vo, Model model) throws Exception{
		logger.info("registerGET com");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(ProductVO vo, Model model) throws Exception{
		
		service.register(vo);
		
		return "redirect:/success";
	}
}
