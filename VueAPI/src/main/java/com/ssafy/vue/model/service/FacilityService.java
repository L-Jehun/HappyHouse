package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.FacilityCountDto;

public interface FacilityService {

	// 시도 구군으로 각 편의시설 개수 조회 
	public List<FacilityCountDto> countGugun(String sido, String gugun) throws Exception;
	// 시도 구군 동으로 각 편의시설 개수 조회 
	public List<FacilityCountDto> countDong(String sido, String gugun, String dong) throws Exception;
	
}
