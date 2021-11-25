package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.FacilityCountDto;
import com.ssafy.vue.model.mapper.FacilityMapper;


@Service
public class FacilityServiceImpl implements FacilityService {
	
	@Autowired
	private SqlSession sqlSession;

	// 시도 구군으로 각 편의시설 개수 조회 
	@Override
	public List<FacilityCountDto> countGugun(String sido, String gugun) throws Exception{
		return sqlSession.getMapper(FacilityMapper.class).countGugun(sido, gugun);
	}
	
	// 시도 구군 동으로 각 편의시설 개수 조회 
	@Override
	public List<FacilityCountDto> countDong(String sido, String gugun, String dong) throws Exception{
		return sqlSession.getMapper(FacilityMapper.class).countDong(sido, gugun, dong);
	}
	

}
