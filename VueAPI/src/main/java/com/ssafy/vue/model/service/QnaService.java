package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.QnaDto;

public interface QnaService {

	// 1:1문의 질문 등록
	public boolean writeQuestion(QnaDto qnaDto) throws Exception;
	// 1:1문의 답변 등록
	public boolean writeAnswer(QnaDto qnaDto) throws Exception;
	// 1:1문의 질문 삭제
	public boolean deleteQna(int no) throws Exception;
	// 1:1문의 답변 삭제
	public boolean deleteAnswer(int no) throws Exception;
	// 1:1문의 질문 수정
	public boolean modifyQuestion(QnaDto qnaDto) throws Exception;
	// 1:1문의 답변 수정
	public boolean modifyAnswer(QnaDto qnaDto) throws Exception;
	// 1:1문의 조회
	public List<QnaDto> listQna() throws Exception;
	// 1:1문의 상세 조회
	public QnaDto getQna(int no) throws Exception;
	
}
