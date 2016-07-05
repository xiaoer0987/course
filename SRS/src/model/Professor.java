package model;

public class Professor extends Person {
	private String title;
	private String department;
	public Professor(int ssn,String name, String password, String title,String department) {
		// TODO Auto-generated constructor stub
		super();
		this.title =title;
		this.department=department;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void AgreeToTeach(){
		
	}

}
