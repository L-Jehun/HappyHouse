package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.FacilityCountDto;
import com.ssafy.vue.model.FaqDto;

@Mapper
public interface FacilityMapper {
	
	// 시도 구군으로 각 편의시설 개수 조회 
	public List<FacilityCountDto> countGugun(String sido, String gugun) throws SQLException;
	// 시도 구군 동으로 각 편의시설 개수 조회 
	public List<FacilityCountDto> countDong(String sido, String gugun, String dong) throws SQLException;
	
}
