package model;

public class Student extends Person{
	private String major;
	private String degree;
	public Student(int ssn,String name,String password,String major,String degree) {
		// TODO Auto-generated constructor stub
		super();
		this.major=major;
		this.degree=degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void addSection(){
		
	}
	public void dropSection(){
		
	}
	public void IsEnrolledIn(){
		
	}
}
