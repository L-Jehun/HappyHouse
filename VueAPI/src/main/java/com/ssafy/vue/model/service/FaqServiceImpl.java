package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.FaqDto;
import com.ssafy.vue.model.mapper.FaqMapper;


@Service
public class FaqServiceImpl implements FaqService {
	
	@Autowired
	private SqlSession sqlSession;

	// 자주 묻는 질문 등록
	@Override
	public boolean writeFaq(FaqDto faqDto) throws Exception {
		if(faqDto.getQuestion() == null || faqDto.getAnswer() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(FaqMapper.class).writeFaq(faqDto) == 1;
	}

	// 자주 묻는 질문 삭제
	@Override
	public boolean deleteFaq(int no) throws Exception {
		return sqlSession.getMapper(FaqMapper.class).deleteFaq(no) == 1;
	}

	// 자주 묻는 질문 수정
	@Override
	public boolean modifyFaq(FaqDto faqDto) throws Exception {
		return sqlSession.getMapper(FaqMapper.class).modifyFaq(faqDto) == 1;
	}

	// 자주 묻는 질문 조회
	@Override
	public List<FaqDto> listFaq() throws Exception {
		return sqlSession.getMapper(FaqMapper.class).listFaq();
	}

	// 자주 묻는 질문 상세 조회
	@Override
	public FaqDto getFaq(int no) throws Exception {
		return sqlSession.getMapper(FaqMapper.class).getFaq(no);
	}

}
