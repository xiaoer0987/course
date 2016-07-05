package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImpl.SqliteSectionDaoImpl;
import util.DataConnection;

/**
 * Servlet implementation class enrollCourseServlet
 */
@WebServlet("/enrollCourseServlet")
public class enrollCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enrollCourseServlet() {
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
		String sno = request.getParameter("sno");
		String cno = request.getParameter("cno");
		int flag = 0 ; 
		SqliteSectionDaoImpl data = new SqliteSectionDaoImpl();
		flag = data.enrollCourse(sno,cno);
		if(flag!=0){
			request.setAttribute("success",flag);
			request.setAttribute("sno",sno);
			request.setAttribute("cno",cno);
			request.getRequestDispatcher("chengjichaxun.jsp").forward(request,response);
		}
		System.out.println(flag);
		/*PrintWriter out = response.getWriter();
	    String selected = request.getParameter("selested");
	    DataConnection jdbc = new DataConnection();
	    Connection conn=jdbc.connection;
	    ResultSet re = null;*/
	   /* request.getRequestDispatcher("enrollcoursesuccess.jsp").forward(request,response);*/
		/*try {
			PreparedStatement ptmt = conn.prepareStatement("insert into person values (?,?,?,?,?)");
			ptmt.setString(5,selected);
			ptmt.executeUpdate();*/
            //此处直接返回选课成功，没有执行选课逻辑
			//System.out.println(AjaxResult.Success("选课成功！"));
			/*out.print(AjaxResult.success("选课成功！"));*/
			/*out.println("选课成功！");
			out.close();
			*/
			/*String var1 = ((ResultSet) ptmt).getString(2);
			
			if(!(var1.equals(""))){
				request.getRequestDispatcher("enrollcoursesuccess.jsp").forward(request,response);*/
			
	/*	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
	}
	}

