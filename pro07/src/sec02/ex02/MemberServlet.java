package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/member3")*/
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      MemberDAO dao=new MemberDAO();
      PrintWriter out=response.getWriter();
      String command=request.getParameter("command");
      if(command!= null && command.equals("addMember")){
		 String _id=request.getParameter("id");
		 String _pwd=request.getParameter("pwd");
		 String _name=request.getParameter("name");
		 String _email=request.getParameter("email");
		 
		 MemberVO vo=new MemberVO();
		 vo.setId(_id);
		 vo.setPwd(_pwd);
		 vo.setName(_name);
		 vo.setEmail(_email);
	     dao.addMember(vo);
      }else if(command!= null && command.equals("delMember")) {
    	  String id = request.getParameter("id");
    	  dao.delMember(id);
      }
       List list=dao.listMembers();
     out.print("<html><body>");
     out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
     out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td >삭제</td></tr>");
    
     for (int i=0; i<list.size();i++){
 		MemberVO memberVO=(MemberVO) list.get(i);
 		String id=memberVO.getId();
 		String pwd = memberVO.getPwd();
 		String name = memberVO.getName();
 		String email =memberVO.getEmail();
 		Date joinDate = memberVO.getJoinDate();
 		out.print("<tr><td>"+id+"</td><td>"
 			                +pwd+"</td><td>"
 			                +name+"</td><td>"
 			                +email+"</td><td>"
 			                +joinDate+"</td><td>"
 		                    +"<a href='/pro07/member3?command=delMember&id="+id+"'>삭제 </a></td></tr>");

 	 }
 	 out.print("</table></body></html>");
     out.print("<a href='/pro07/memberForm.html'>새 회원 등록하기</a");
   }
}
