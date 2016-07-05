package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImpl.SqliteSectionDaoImpl;
import util.DataConnection;

/**
 * Servlet implementation class addgradeServlet
 */
@WebServlet("/addgradeServlet")
public class addgradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addgradeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		response.setCharacterEncoding("UTF-8");
		String cno = request.getParameter("cno");
		String sno = request.getParameter("sno");
		String grade = request.getParameter("grade");
		/*String sno = "1";
		String cno = "1";
		String grade = "23";*/
		int flag = 0 ; 
		SqliteSectionDaoImpl data = new SqliteSectionDaoImpl();
		flag = data.addGrade(cno,sno,grade);
		/*flag=addGrade("1","1","12");*/
		if(flag!=0){
			request.getRequestDispatcher("teachersuccess.jsp").forward(request,response);
		}else{
			//request.setAttribute("fail","fail");
			request.getRequestDispatcher("failure.jsp").forward(request,response);
		}
		
		}
	private  int addGrade(String cno,String sno,String grade) {
		// TODO Auto-generated method stub
		 DataConnection jdbc = new DataConnection();
		 Connection conn=jdbc.connection;
		 ResultSet re = null;
		 PreparedStatement pr = null;
		
		int flag = 0;
		 
		 try{				
				pr = conn.prepareStatement("update elected set ecgrade=? where esno =? and ecno = ?");
				pr.setString(1, sno);			
				pr.setString(3, cno);			
				pr.setString(8, grade);				
				flag = pr.executeUpdate(); 
		 }catch (SQLException se) {
					se.printStackTrace();
				
		 }
		return flag;
	}
}
