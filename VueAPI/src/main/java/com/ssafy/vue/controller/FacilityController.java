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

import com.ssafy.vue.model.FacilityCountDto;
import com.ssafy.vue.model.SidoGugunCodeDto;
import com.ssafy.vue.model.service.FacilityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/facillity")
@Api("Facility 컨트롤러  API V1")
public class FacilityController {
	
	private final Logger logger = LoggerFactory.getLogger(FacilityController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private FacilityService facilityService;
	
	@ApiOperation(value = "시도 구군 편의시설 정보", notes = "시도 구군 편의시설 정보를 반환한다.", response = List.class)
	@GetMapping("/gugun")
	public ResponseEntity<List<FacilityCountDto>> countGugun(String sido, String gugun) throws Exception {
		logger.info("countGugun - 호출");
		return new ResponseEntity<List<FacilityCountDto>>(facilityService.countGugun(sido, gugun), HttpStatus.OK);
	}
	
	@ApiOperation(value = "시도 구군 동 편의시설 정보", notes = "시도 구군 동 편의시설 정보를 반환한다.", response = List.class)
	@GetMapping("/dong")
	public ResponseEntity<List<FacilityCountDto>> countDong(String sido, String gugun, String dong) throws Exception {
		logger.info("countDong - 호출");
		return new ResponseEntity<List<FacilityCountDto>>(facilityService.countDong(sido, gugun, dong), HttpStatus.OK);
	}
	
	
}
