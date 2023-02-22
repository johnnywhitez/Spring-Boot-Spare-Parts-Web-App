package com.spareparts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spareparts.entity.Stock;
import com.spareparts.repository.StockRepository;
import com.spareparts.service.StockService;


@Service
public class StockServiceimpl implements StockService {
	
	public StockRepository StockRepository;
	public StockServiceimpl(StockRepository stockRepository) {
		super();
		StockRepository = stockRepository;
	}


	@Override
	public List<Stock> getAllStock(){
		return StockRepository.findAll();
	}

}
