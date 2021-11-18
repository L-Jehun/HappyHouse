package com.ssafy.vue.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.MemberDto;

@Mapper
public interface MemberMapper {
	
	// 회원가입
	public int registerUser(MemberDto memberDto) throws SQLException;
	// 로그인
	public MemberDto login(MemberDto memberDto) throws SQLException;
	// 조회
	public MemberDto userInfo(String userid) throws SQLException;
	// 수정
	public int updateUser(MemberDto memberDto) throws SQLException;
	// 삭제
	public int deleteUser(String userid) throws SQLException;
	
}
