package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.AddressDto;

@Mapper
public interface AddressMapper {
	// 공지사항 조회
	public List<String> listAddress() throws SQLException;

}
