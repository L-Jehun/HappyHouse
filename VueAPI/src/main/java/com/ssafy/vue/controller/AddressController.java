package com.ssafy.vue.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.AddressDto;
import com.ssafy.vue.model.service.AddressService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/address")
@Api("주소 컨트롤러  API V1")
public class AddressController {

	public static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	

	@Autowired
	private AddressService addressService;

	
	@ApiOperation(value = "주소 정보 리스트", notes = "주소 정보 조회 리스트를 반환한다.", response = List.class)
	@GetMapping
	public ResponseEntity<List<String>> listAddress() throws Exception {
		logger.info("listAddress - 호출");
		return new ResponseEntity<List<String>>(addressService.listAddress(), HttpStatus.OK);
	}
	
}
