package model;

public class Course {
	private int courseNo;
	private String courseName;
	private int credits;
	public Course(int courseNo,String courseName,int credits) {
		// TODO Auto-generated constructor stub
		this.courseNo=courseNo;
		this.courseName=courseName;
		this.credits=credits;
	}
	public int getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public void ScheduleSection(){
		
	}
	public void AddPrerequisite(){
		
	}
	public void HasPrerequisite(){
		
	}
}
