package com.spring.ex04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.ex01.MemberVO;

@WebServlet("/mem4.do")
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberDAO dao = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		String action = request.getParameter("action");
		String nextPage = "";

		if (action == null || action.equals("listMembers")) {
			List<MemberVO> membersList = dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			nextPage = "test03/listMembers.jsp";
		} else if (action.equals("selectMemberById")) {
			String id = request.getParameter("value");
			memberVO = dao.selectMemberById(id);
			request.setAttribute("member", memberVO);
			nextPage = "test03/memberInfo.jsp";
		} else if (action.equals("selectMemberByPwd")) {
			int pwd = Integer.parseInt(request.getParameter("value"));
			List<MemberVO> membersList = dao.selectMemberByPwd(pwd);
			request.setAttribute("membersList", membersList);
			nextPage = "test03/listMembers.jsp";
		}else if(action.equals("insertMember")) {
			String id=request.getParameter("id");
            String pwd=request.getParameter("pwd");
            String name=request.getParameter("name");
            String email = request.getParameter("email");
            memberVO.setId(id);
            memberVO.setPwd(pwd);
            memberVO.setName(name);
            memberVO.setEmail(email);
            dao.insertMember(memberVO);
            nextPage="/mem4.do?action=listMembers";
       }else if(action.equals("insertMember2")) {
           String id=request.getParameter("id");
           String pwd=request.getParameter("pwd");
           String name=request.getParameter("name");
           String email = request.getParameter("email");         
           Map<String, String> memberMap=new HashMap<String, String>();
           memberMap.put("id", id);
           memberMap.put("pwd", pwd);
           memberMap.put("name", name);
           memberMap.put("email", email);
           dao.insertMember2(memberMap);
           nextPage="/mem4.do?action=listMembers";
      }else if(action.equals("updateMember")){
          String id=request.getParameter("id");
          String pwd=request.getParameter("pwd");
          String name=request.getParameter("name");
          String email = request.getParameter("email");
          memberVO.setId(id);
          memberVO.setPwd(pwd);
          memberVO.setName(name);
          memberVO.setEmail(email);
          dao.updateMember(memberVO);
          nextPage="/mem4.do?action=listMembers";     
      }else if(action.equals("deleteMember")){
  	      String id=request.getParameter("id");
	      dao.deleteMember(id);
	      nextPage="/mem4.do?action=listMembers";
      }else if(action.equals("searchMember")){
          String name=request.getParameter("name");
          String email=request.getParameter("email");
          memberVO.setName(name);
          memberVO.setEmail(email);
          List<MemberVO> membersList =dao.searchMember(memberVO);
          request.setAttribute("membersList",membersList);
          nextPage="test03/listMembers.jsp";
       }else if(action.equals("foreachSelect")) {
		  List<String> nameList = new ArrayList<String>();
		  nameList.add("홍길동");
		  nameList.add("차범근");
		  nameList.add("이순신");
		  List<MemberVO> membersList=dao.foreachSelect(nameList);
		  request.setAttribute("membersList",membersList);
		  nextPage="test03/listMembers.jsp";
	   }else if(action.equals("foreachInsert")) {
          List<MemberVO> memList = new ArrayList<MemberVO>();
          memList.add(new MemberVO("m1", "1234", "박길동", "m1@test.com"));
          memList.add(new MemberVO("m2", "1234", "이길동", "m2@test.com"));
          memList.add(new MemberVO("m3", "1234", "김길동", "m3@test.com"));
          int result=dao.foreachInsert(memList);
          nextPage="/mem4.do?action=listMembers";
	    }else if(action.equals("selectLike")) {
	      String name="길동";
		  List<MemberVO> membersList=dao.selectLike(name);
		  request.setAttribute("membersList",membersList);
		  nextPage="test03/listMembers.jsp";
	   }
		
	   RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);  
	   dispatch.forward(request, response);


	}
}
