package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoFactory.DaoFactory;
import FactoryImpl.SqliteFactory;

import model.Person;
import util.DataConnection;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		String ssn = request.getParameter("ssd");
		String  password = request.getParameter("password");
		String role = request.getParameter("radiobutton");
		String ver1;
		try {
			ver1 = Login(ssn,password,role);
			if(!(ver1.equals(""))){
				if("student".equals(ver1)){
					request.getRequestDispatcher("studentsuccess.jsp").forward(request,response);
				}
				if("teacher".equals(ver1)){
					request.getRequestDispatcher("teachersuccess.jsp").forward(request,response);
				}
				}else{
					request.getRequestDispatcher("failure.jsp").forward(request,response);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Person person = new Person();
		person.setSsn(ssn);
		person.setPassword(password);*/
		/*DaoFactory DaoFactory=new  SqliteFactory();
		try{
			boolean a = DaoFactory.GetPersonInstance().Login(person);

			if(a = true){
				
				request.getRequestDispatcher("success.jsp").forward(request,response);
			
			}else {
				request.getRequestDispatcher("failure.jsp").forward(request,response);
			     
				
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
}
}*/
		/*try {
			if(checkLogin(ssn,password,role)){
				request.getRequestDispatcher("success.jsp").forward(request,response);
				
			}else{
				request.getRequestDispatcher("failure.jsp").forward(request,response);
			
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}
	private String Login(String ssn, String password,String role) throws Exception {
		// TODO Auto-generated method stub
		String result = "";
		String sql = "select * from person where ssn=? ";
		DataConnection jdbc = new DataConnection();
		Connection conn=jdbc.connection;
		System.out.println(conn);
		ResultSet re = null;
		
		try{
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, ssn);
			re = ptmt.executeQuery();
			if (re.next()) {
				if(password.equals(re.getString(2))){
				result = role;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
