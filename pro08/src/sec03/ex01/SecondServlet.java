package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/second")*/
public class SecondServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException {
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();

     /* out.println("<html><body>");
      out.println("dispatch를 이용한 forward 실습입니다.");
      out.println("</body></html>");*/
      
      String name=request.getParameter("name");
      out.println("<html><body>");
      out.println("이름:"+name);
      out.println("<br>");
      out.println("dispatch를 이용한 forward 실습입니다.");
      out.println("</body></html>");   

   }
}
