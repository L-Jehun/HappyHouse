package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.NoticeDto;
import com.ssafy.vue.model.ParameterDto;

@Mapper
public interface NoticeMapper {

	// 공지사항 등록
	public int writeNotice(NoticeDto noticeDto) throws SQLException;
	// 공지사항 삭제
	public int deleteNotice(int no) throws SQLException;
	// 공지사항 수정
	public int modifyNotice(NoticeDto noticeDto) throws SQLException;
	// 공지사항 상세 조회
	public NoticeDto getNotice(int no) throws SQLException;
	// 공지사항 조회
	public List<NoticeDto> listNotice(ParameterDto parameterDto) throws SQLException;
	// 공지사항 개수
	public int getTotalCount(ParameterDto parameterDto) throws SQLException;
}
