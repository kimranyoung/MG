package com.MG.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.MG.domain.ProductVO;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Inject
	private SqlSession session;
	
	private static final String namespace="com.MG.mapper.ProductMapper";
	
	//������ ����
	public void insert(ProductVO vo) throws Exception{
		session.insert(namespace+".insert",vo);
		
	}
	
}
