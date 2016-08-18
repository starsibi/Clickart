package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.model.Product;
import com.service.ProductService;

@Controller
public class BrandsController {
	@Autowired
	private ProductService productservice;

	@RequestMapping("/nikonbrand")
	public String getnik(Map<String, Object> map) {
		Product product = new Product();
		String brand="nikon";
		map.put("product", product);
		map.put("productList", productservice.getnikon(brand));
		return "brand";
	}
	
	
	@RequestMapping("/canonbrand")
	public String getcan(Map<String, Object> map) {
		Product product = new Product();
		String brand="canon";
		map.put("product", product);
		map.put("productList", productservice.getnikon(brand));
		return "brand";
	}
	
	
	@RequestMapping("/sonybrand")
	public String getsony(Map<String, Object> map) {
		Product product = new Product();
		String brand="sony";
		map.put("product", product);
		map.put("productList", productservice.getnikon(brand));
		return "brand";
	}
	

}
