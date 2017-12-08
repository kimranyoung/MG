package com.MG.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.MG.domain.ProductVO;
import com.MG.persistence.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	private ProductDAO dao;
	
	public void register(ProductVO vo) throws Exception{
		dao.insert(vo);
	}
	
}
