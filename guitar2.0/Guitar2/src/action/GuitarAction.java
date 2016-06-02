package action;

import java.io.IOException;
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

import entity.Guitar;
import entity.GuitarSpec;
import entity.Inventory;
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
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String builder = request.getParameter("builder");
		String type = request.getParameter("type");
		String backwood = request.getParameter("backwood");
		String topwood = request.getParameter("topwood");
		

		//根据查询条件，分装成一个查询对象GuitarSpec
		GuitarSpec guitarspec = new GuitarSpec(builder, type,backwood,topwood);
		
		Inventory inventory = new Inventory();
		initInventory(inventory);
		
		List<Guitar> matchingGuitars = inventory.search(guitarspec);

		request.setAttribute("matchingGuitar", matchingGuitars);
		request.getRequestDispatcher("/result.jsp").forward(request,response);
	}
	

	private static void initInventory(Inventory inventory){
		Connection connection = null;
		DBHelper jdbc =  new DBHelper();
		PreparedStatement ps = null;
		connection = jdbc.connection;
		
		try {
				ps = connection.prepareStatement("select * from Guitar");
	
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()){			
					inventory.addGuitar(rs.getString(1),rs.getDouble(2),rs.getString(5),rs.getInt(8), new GuitarSpec(rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(7)));
				}
				if(rs != null){
					rs.close();
				}
				if(ps != null){
					ps.close();
				}
				connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
