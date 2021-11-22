package com.ssafy.vue.model.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ssafy.vue.model.HouseInfoDto;
import com.ssafy.vue.model.SidoGugunCodeDto;
import com.ssafy.vue.model.mapper.HouseMapMapper;

public interface HouseMapService {

	String getSidoCode(String sidoName) throws Exception;
	String getGugunCode(SidoGugunCodeDto sidoGugunCodeDto) throws Exception;
	
//	List<SidoGugunCodeDto> getSido() throws Exception;
//	List<SidoGugunCodeDto> getGugunInSido(String sido) throws Exception;
//	List<HouseInfoDto> getDongInGugun(String gugun) throws Exception;
//	List<HouseInfoDto> getAptInDong(String dong) throws Exception;
	
}
