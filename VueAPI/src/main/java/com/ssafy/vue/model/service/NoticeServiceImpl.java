package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.util.PageNavigation;
import com.ssafy.vue.model.NoticeDto;
import com.ssafy.vue.model.ParameterDto;
import com.ssafy.vue.model.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private SqlSession sqlSession;

	// 공지사항 등록
	@Override
	public boolean writeNotice(NoticeDto noticeDto) throws Exception {
		if(noticeDto.getTitle() == null || noticeDto.getContent() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(NoticeMapper.class).writeNotice(noticeDto) == 1;
	}

	// 공지사항 삭제
	@Override
	public boolean deleteNotice(int no) throws Exception {
		return sqlSession.getMapper(NoticeMapper.class).deleteNotice(no) == 1;
	}

	// 공지사항 수정
	@Override
	public boolean modifyNotice(NoticeDto noticeDto) throws Exception {
		return sqlSession.getMapper(NoticeMapper.class).modifyNotice(noticeDto) == 1;
	}

	// 공지사항 상세 조회
	@Override
	public NoticeDto getNotice(int no) throws Exception {
		return sqlSession.getMapper(NoticeMapper.class).getNotice(no);
	}
	
	// 공지사항 조회
	@Override
	public List<NoticeDto> listNotice(ParameterDto parameterDto) throws Exception {
		int start = parameterDto.getPg() == 0 ? 0 : (parameterDto.getPg() - 1) * parameterDto.getSpp();
		parameterDto.setStart(start);
		return sqlSession.getMapper(NoticeMapper.class).listNotice(parameterDto);
	}
	
	@Override
	public PageNavigation makePageNavigation(ParameterDto parameterDto) throws Exception {
		int naviSize = 5;
		PageNavigation pageNavigation = new PageNavigation();
		pageNavigation.setCurrentPage(parameterDto.getPg());
		pageNavigation.setNaviSize(naviSize);
		
		int totalCount = sqlSession.getMapper(NoticeMapper.class).getTotalCount(parameterDto);//총글갯수  269
		pageNavigation.setTotalCount(totalCount);  
		
		int totalPageCount = (totalCount - 1) / parameterDto.getSpp() + 1;//27
		pageNavigation.setTotalPageCount(totalPageCount);
		
		boolean startRange = parameterDto.getPg() <= naviSize;
		pageNavigation.setStartRange(startRange);
		
		boolean endRange = (totalPageCount - 1) / naviSize * naviSize < parameterDto.getPg();
		pageNavigation.setEndRange(endRange);
		pageNavigation.makeNavigator();
		
		return pageNavigation;
	}

}
