package com.controller;


import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Product;
import com.service.ProductService;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product")
	public String setupForm(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("productList", productService.getAllProduct());
		return "product";
	}
	
	@RequestMapping("delete/{productid}")
	public String delitem(@PathVariable("productid")int id,ModelMap model)
	{
		productService.delete(id);
		return"redirect:/viewall";
	}
	
	@RequestMapping("edit/{productid}")
	public String edititem(@PathVariable("productid")int id,@ModelAttribute Product product, BindingResult result,Map<String, Object> map)
	{	
		product=productService.getProduct(id);
		map.put("product", product);
		map.put("productList", productService.getAllProduct());
		return "product";
		
	}
	
	@RequestMapping({"/viewall","edit/viewall"})
	public String getvieform(Map<String,Object>map)
	{
		Product product=new Product();
		map.put("product",product);
		map.put("productList", productService.getAllProduct());
		return"viewall";
	}
	
	@RequestMapping(value={"/crudoper","edit/product.do"}, method=RequestMethod.POST)
	public String doActions(@ModelAttribute Product product, BindingResult result, @RequestParam String action,Map<String, Object> map){
		Product productResult = new Product();
		System.out.println("ProductController");
		switch(action.toLowerCase()){	
		case "add":
			productService.add(product);
			productResult = product;
			break;
		case "edit":
			productService.edit(product);
			productResult = product;
			break;
		case "delete":
			productService.delete(product.getproductid());
			productResult = new Product();
			break;
		case "search":
			Product searchedProduct = productService.getProduct(product.getproductid());
			productResult = searchedProduct!=null ? searchedProduct : new Product();
			break;
		}
		map.put("product", productResult);
		map.put("productList", productService.getAllProduct());
		return "product";
	}
}
