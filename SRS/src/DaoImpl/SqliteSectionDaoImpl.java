package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Dao.SectionDao;

import model.Course;

import model.Section;

import util.DataConnection;

public class SqliteSectionDaoImpl implements SectionDao{
	
	@Override
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
	public int enrollCourse(String sno,String cno){

		
		 DataConnection jdbc = new DataConnection();
		 Connection conn=jdbc.connection;
		 ResultSet re = null;
		 PreparedStatement pr = null;
		int flag = 1;
		String esno = null;
		String esname = null;
		String ecno = null;
		String etno = null;
		String ecname = null;
		String etname = null;
		String ecaddress = null;
		try{
			pr = conn.prepareStatement("select * from person where ssn=?");
			pr.setString(1, sno);//根据学号从person表里查到学生姓名
			re = pr.executeQuery();
			if (re.next()) {
				esname = re.getString("esname");
				/*System.out.println(esname);*/
				
			}/*if (esname == null) {
				pr = conn.prepareStatement("select * from person where ssn=?");
				pr.setString(1, sno);
				re = pr.executeQuery();
				if (re.next()) {
					esno = re.getInt("sno");
					esname = re.getString("sname");*/
					/*etno=re.getInt("tno");
					etname=re.getString("tname");*/
					
				
				/*}*/
				pr = conn.prepareStatement("select * from section where sectionNo=?");
				pr.setString(1, cno);
				re = pr.executeQuery();
				if (re.next()) {
					ecaddress = re.getString("room");
					ecname=re.getString("representedCourse");
					etname=re.getString("instructor");
				}
				pr = conn.prepareStatement("select * from person where ssn=?");
				pr.setString(4,etname);
				re = pr.executeQuery();
				if(re.next()){
					etno=re.getString("ssn");
				}pr = conn.prepareStatement("insert into elected(esno,esname,ecno,etno,ecname,etname,ecaddress,ecgrade) values(?,?,?,?,?,?,?,?)");
				pr.setString(1, esno);
				pr.setString(2, esname);
				pr.setString(3, ecno);
				pr.setString(4, etno);
				pr.setString(5, ecname);
				pr.setString(6, etname);
				pr.setString(7, ecaddress);
				flag = pr.executeUpdate();
			
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
		return flag;
	}
		
	
	
	
/*	@Override
	public HashMap<String, Section> findBySemester(String semester) {
		// 根据semester获取相应的section数据,此处直接手动给出section数据
		HashMap<String, Section> sections = new HashMap<String, Section>();
		Map<String, Course> allCourses = new SqliteCourseDaoImpl().findAll();
        
		Section sec1, sec2, sec3, sec4, sec5, sec6, sec7;
		Course c;
		c = allCourses.get("CMP101");
		sec1 = new Section(1,"", "8:10 - 10:00 PM", "",30,"","");
		sections.put(c.getCourseNo() + "-" + sec1.getSectionNo(), sec1);
		sec2 = new Section(2,'W', "6:10 - 8:00 PM", c , "GOVT202", 30);
		sections.put(c.getCourseNo() + "-" + sec2.getSectionNo(), sec2);
		
		c = allCourses.get("OBJ101");
		sec3 = new Section(1,'R', "4:10 - 6:00 PM", allCourses.get("OBJ101"), "GOVT105", 25);
		sections.put(c.getCourseNo() + "-" + sec3.getSectionNo(), sec3);
		sec4 = new Section(2,'T', "6:10 - 8:00 PM", allCourses.get("OBJ101"), "SCI330", 25);
		sections.put(c.getCourseNo() + "-" + sec4.getSectionNo(), sec4);
		
		
		c = allCourses.get("CMP283");
		sec5 = new Section(1,'M', "6:10 - 8:00 PM", allCourses.get("CMP283"), "GOVT101", 20);
		sections.put(c.getCourseNo() + "-" + sec5.getSectionNo(), sec5);
		
		c = allCourses.get("CMP999");
		sec6 = new Section(1, 'R', "4:10 - 6:00 PM", allCourses.get("CMP999"), "SCI241", 15);
		sections.put(c.getCourseNo() + "-" + sec6.getSectionNo(), sec6);
		
		c = allCourses.get("ART101");
		sec7 = new Section(1, 'M', "4:10 - 6:00 PM", allCourses.get("ART101"), "ARTS25", 40);
		sections.put(c.getCourseNo() + "-" + sec7.getSectionNo(), sec7);
		
		return sections;
	}*/


	public SqliteSectionDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean Enroll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Drop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PostGrade() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean seatingCapacity() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public HashMap<String, Section> findBySemester(String semester) {
		// TODO Auto-generated method stub
		return null;
	}
	public  int addGrade(String cno,String sno,String grade) {
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

