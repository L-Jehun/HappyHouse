package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	// 회원가입
	public boolean registerUser(MemberDto memberDto) throws Exception;
	// 로그인
	public MemberDto login(MemberDto memberDto) throws Exception;
	// 조회
	public MemberDto userInfo(String userid) throws Exception;
	// 수정
	public boolean updateUser(MemberDto memberDto) throws Exception;
	// 삭제
	public boolean deleteUser(String userid) throws Exception;
	
	
	// 최근본방 추가
	// 최근본방 삭제
	// 찜한방 추가
	// 찜한방 삭제
	// 1:1문의내역 추가
	// 1:1문의내역 삭제
	// 아이디 및 비밀번호 찾기

	
}
