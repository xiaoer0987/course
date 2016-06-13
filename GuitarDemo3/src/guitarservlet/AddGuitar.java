package guitarservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FactoryImpl.SqliteFactory;
import IFactory.IDaoFactory;
import allenum.Builder;
import allenum.Wood;
import model.Guitar;
import model.GuitarSpec;
import sun.util.locale.provider.LocaleProviderAdapter.Type;

/**
 * Servlet implementation class AddGuitar
 */
@WebServlet("/AddGuitar")
public class AddGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		//response.setCharacterEncoding("utf-8");
		String serialNumber=request.getParameter("serialNumber");
		Wood backWood = Wood.valueOf(request.getParameter("backWood"));
		Wood topWood = Wood.valueOf(request.getParameter("topWood"));
		Double price=Double.parseDouble(request.getParameter("price"));
		Builder builder=Builder.valueOf(request.getParameter("builder"));;
		String model= request.getParameter("model");
		Type type=Type.valueOf(request.getParameter("type"));
		String numStrings = request.getParameter("numStrings");
		
		 	Guitar guitar=new Guitar(); 
			GuitarSpec spec = guitar.getSpec();
			guitar.setPrice(price);	
			guitar.setSerialNumber(serialNumber);
			spec.setBackWood(backWood);
			spec.setTopWood(topWood);
			spec.setBuilder(builder);
			spec.setModel(model);
			
			spec.setNumStrings(numStrings);
			
		
			//根据需要调换数据库
			IDaoFactory iDaoFactory=new  SqliteFactory();
			try {
				boolean a=iDaoFactory.GetGuitarInstance().addGuitar(guitar,spec);
			System.out.println(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	PrintWriter out=response.getWriter();
	out.println("success");
	
	}

	}


