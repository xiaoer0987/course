package Action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Guitar;
import util.DBHelper;

/**
 * Servlet implementation class GuitarAction
 */
@WebServlet("/GuitarAction")
public class GuitarAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuitarAction() {
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
		
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html;charset=UTF-8");
		String content = request.getParameter("content");	
		
	
		request.setAttribute("guitar", getAllGuitar(content));
		request.getRequestDispatcher("/result.jsp").forward(request,response);
	}
public static List<Guitar> getAllGuitar(String content){
		
		DBHelper jdbc = new DBHelper();
		Connection connection = jdbc.connection;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Guitar> list = new ArrayList<Guitar>();
		try{
			stmt = connection.prepareStatement("select * from Guitar where serialNmumber=? and price = ? and model = ? and builder=? and backwood=? and topwood=? and type=?");
			stmt.setString(1, content);
			stmt.setString(2, content);
			stmt.setString(3, content);
			stmt.setString(4, content);
			stmt.setString(5, content);
			stmt.setString(6, content);
			stmt.setString(7, content);
			rs = stmt.executeQuery();
			while(rs.next()){
				Guitar guitar = new Guitar();
				
				guitar.setSerialNumber(rs.getString("serialNumber"));
				guitar.setPrice(rs.getDouble("price"));
				guitar.setBuilder(rs.getString("builder"));
				guitar.setType(rs.getString("type"));
				guitar.setModel(rs.getString("model"));
				guitar.setBackWood(rs.getString("backWood"));
				guitar.setTopWood(rs.getString("topWood"));
				list.add(guitar);
			}
			return list;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}finally{
			if(rs!=null){
				try{
					rs.close();
					rs=null;
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
			if(stmt!=null){
				try{
					stmt.close();
					rs=null;
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}
}

}
