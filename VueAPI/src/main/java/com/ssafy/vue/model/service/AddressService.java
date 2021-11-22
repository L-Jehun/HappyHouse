package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.AddressDto;

public interface AddressService {

	// 주소 조회
	public List<String> listAddress() throws Exception;
	
}
