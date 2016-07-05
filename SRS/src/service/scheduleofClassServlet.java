package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Section;

import util.DataConnection;

/**
 * Servlet implementation class scheduleofClassServlet
 */
@WebServlet("/scheduleofClassServlet")
public class scheduleofClassServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public scheduleofClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8"); 
		request.setCharacterEncoding("utf-8");
			
		List<Section> section = new ArrayList<Section>();
		section = findAll();
		
		request.setAttribute("section",section);
		
		request.getRequestDispatcher("/enrollcourse.jsp").forward(request,response);
		PrintWriter out = response.getWriter();
		out.println("woaini");
	/*	List<Section> list = new ArrayList<Section>();
		 for (Iterator i = list.iterator(); i.hasNext(); ){
			 Section section = (Section)i.next();
			 out.println(section.getSectionNo() + section.getDayofWeek() );
		 }
		*/
		
	
	}

	public String getAllSection( ) throws Exception{
		String result = "";
		String sql = "select * from section ";
		DataConnection jdbc = new DataConnection();
		Connection conn=jdbc.connection;
		System.out.println(conn);
		ResultSet re = null;
		List<Section> list = new ArrayList<Section>();
		
	try{
			
			PreparedStatement ptmt = conn.prepareStatement(sql);
			re = ptmt.executeQuery();
			while(re.next()){
				Section section = new Section();
				section.setSectionNo(re.getInt(1));
				section.setDayofWeek(re.getString(2));
				section.setTimeofDay(re.getString(3));
				section.setRoom(re.getString(4));
				section.setSeatingCapacity(re.getInt(5));
				section.setRepresentedCourse(re.getString(6));
				section.setInstructor(re.getString(7));
				list.add(section);
				result = section.getInstructor()+section.getTimeofDay();
				System.out.println(section.getInstructor());
			}
			return result;
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return result;
			
			
		}	

	public List<Section> findAll() {
		DataConnection jdbc = new DataConnection();
		Connection conn=jdbc.connection;
		String sql = "select * from section ";
		List<Section> list = new ArrayList<Section>();
		String result = "";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Section section = new Section();
				section.setSectionNo(rs.getInt(1));
				section.setDayofWeek(rs.getString(2));
				section.setTimeofDay(rs.getString(3));
				section.setRoom(rs.getString(4));
				section.setSeatingCapacity(rs.getInt(5));
				section.setRepresentedCourse(rs.getString(6));
				section.setInstructor(rs.getString(7));
				list.add(section);
				result = section.getInstructor()+section.getTimeofDay();
				System.out.println(section.getInstructor());
			}			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch(Exception e){
		    e.printStackTrace();	
		}finally{
			try{
		         if(conn!=null)
		        	 conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return list;
	}
	

}





