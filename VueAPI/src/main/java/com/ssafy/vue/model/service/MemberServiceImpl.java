package com.ssafy.vue.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.MemberDto;
import com.ssafy.vue.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 로그인
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if(memberDto.getUserid() == null || memberDto.getUserpwd() == null)
			return null;
		return sqlSession.getMapper(MemberMapper.class).login(memberDto);
	}

	// 조회
	@Override
	public MemberDto userInfo(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).userInfo(userid);
	}

	// 회원가입
	@Override
	public boolean registerUser(MemberDto memberDto) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).registerUser(memberDto) == 1;
	}

	// 수정
	@Override
	public boolean updateUser(MemberDto memberDto) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).updateUser(memberDto) == 1;
	}

	// 삭제
	@Override
	public boolean deleteUser(String userid) throws Exception {
		return sqlSession.getMapper(MemberMapper.class).deleteUser(userid) == 1;
	}

}
