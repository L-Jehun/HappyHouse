package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.AddressDto;
import com.ssafy.vue.model.mapper.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 조회
	@Override
	public List<String> listAddress() throws Exception{
		return sqlSession.getMapper(AddressMapper.class).listAddress();
	}
	
}
