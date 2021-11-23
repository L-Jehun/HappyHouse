package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.QnaDto;
import com.ssafy.vue.model.mapper.QnaMapper;

@Service
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	private SqlSession sqlSession;

	// 1:1문의 질문 등록
	@Override
	public boolean writeQuestion(QnaDto qnaDto) throws Exception {
		if(qnaDto.getTitle() == null || qnaDto.getContent() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(QnaMapper.class).writeQuestion(qnaDto) == 1;
	}
	
	// 1:1문의 답변 등록
	@Override
	public boolean writeAnswer(QnaDto qnaDto) throws Exception {
		if(qnaDto.getAnswer() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(QnaMapper.class).writeAnswer(qnaDto) == 1;
	}

	// 1:1문의 질문 삭제
	@Override
	public boolean deleteQna(int no) throws Exception {
		return sqlSession.getMapper(QnaMapper.class).deleteQna(no) == 1;
	}
	
	// 1:1문의 답변 삭제
	@Override
	public boolean deleteAnswer(int no) throws Exception {
		return sqlSession.getMapper(QnaMapper.class).deleteAnswer(no) == 1;
	}

	// 1:1문의 질문 수정
	@Override
	public boolean modifyQuestion(QnaDto qnaDto) throws Exception {
		return sqlSession.getMapper(QnaMapper.class).modifyQuestion(qnaDto) == 1;
	}
	
	// 1:1문의 답변 수정
	@Override
	public boolean modifyAnswer(QnaDto qnaDto) throws Exception {
		return sqlSession.getMapper(QnaMapper.class).modifyAnswer(qnaDto) == 1;
	}

	// 1:1문의 조회
	@Override
	public List<QnaDto> listQna() throws Exception {
		return sqlSession.getMapper(QnaMapper.class).listQna();
	}

	// 1:1문의 상세 조회
	@Override
	public QnaDto getQna(int no) throws Exception {
		return sqlSession.getMapper(QnaMapper.class).getQna(no);
	}

}
