package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.QnaDto;

@Mapper
public interface QnaMapper {
	// 1:1문의 질문 등록
	public int writeQuestion(QnaDto qnaDto) throws SQLException;
	
	// 1:1문의 답변 등록
	public int writeAnswer(QnaDto qnaDto) throws SQLException;

	// 1:1문의 질문 삭제
	public int deleteQna(int no) throws SQLException;
	
	// 1:1문의 답변 삭제
	public int deleteAnswer(int no) throws SQLException;

	// 1:1문의 질문 수정
	public int modifyQuestion(QnaDto qnaDto) throws SQLException;
	
	// 1:1문의 답변 수정
	public int modifyAnswer(QnaDto qnaDto) throws SQLException;

	// 1:1문의 조회
	public List<QnaDto> listQna() throws SQLException;

	// 1:1문의 상세 조회
	public QnaDto getQna(int no) throws SQLException;

}
