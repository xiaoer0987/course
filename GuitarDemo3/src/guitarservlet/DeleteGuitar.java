package guitarservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FactoryImpl.MysqlFactory;
import FactoryImpl.SqliteFactory;
import IFactory.IDaoFactory;

/**
 * Servlet implementation class DeleteGuitar
 */
@WebServlet("/DeleteGuitar")
public class DeleteGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String serialNumber=request.getParameter("serialNumber");
		IDaoFactory iDaoFactory=new  SqliteFactory();
		PrintWriter out=response.getWriter();
		
		try {
			boolean a=iDaoFactory.GetGuitarInstance().deleteGuitar(serialNumber);
		if(a){
			out.println("deleted");
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
