package com.spareparts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spareparts.service.*;

@Controller
public class StockController {

		public StockService StockService;

		public StockController(com.spareparts.service.StockService stockService) {
			super();
			StockService = stockService;
		}
		
	//handler method to handle list students and return mode and view
		@GetMapping("/Stock")
	public String listStock(Model model) {
			model.addAttribute("Stock", StockService.getAllStock());
			return "Stock";
			
		
	}
		
		
	
}