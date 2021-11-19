package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.FaqDto;

@Mapper
public interface FaqMapper {

	// 자주 묻는 질문 등록
	public int writeFaq(FaqDto faqDto) throws SQLException;
	// 자주 묻는 질문 삭제
	public int deleteFaq(int no) throws SQLException;
	// 자주 묻는 질문 수정
	public int modifyFaq(FaqDto faqDto) throws SQLException;
	// 자주 묻는 질문 조회
	public List<FaqDto> listFaq() throws SQLException;
	// 자주 묻는 질문 상세 조회
	public FaqDto getFaq(int no) throws SQLException;
	
}
