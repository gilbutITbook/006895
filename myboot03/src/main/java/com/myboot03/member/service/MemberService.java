package com.myboot03.member.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.myboot03.member.vo.MemberVO;

public interface MemberService {
	 public List listMembers() throws Exception;
	 public int addMember(MemberVO memberVO) throws Exception;
	 public int removeMember(String id) throws Exception;
	 public MemberVO login(MemberVO memberVO) throws Exception;
}
