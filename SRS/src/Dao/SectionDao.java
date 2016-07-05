package Dao;

import java.util.HashMap;
import java.util.List;

import model.Section;

public interface SectionDao {
	public boolean Enroll();
	public boolean Drop();
	public boolean PostGrade();
	public boolean seatingCapacity();
	public int enrollCourse(String sno,String cno);
	List<Section> findAll();
	HashMap<String, Section> findBySemester(String semester);
}
