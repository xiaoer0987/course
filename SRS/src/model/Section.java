package model;

import java.util.HashMap;

public class Section {
	private int sectionNo;
	private String dayofWeek;
	private String timeofDay;
	private String room;
	private int seatingCapacity;
	private String representedCourse;
	private String instructor;
	public Section() {
		// TODO Auto-generated constructor stub
		this.setSectionNo(sectionNo);
		this.setDayofWeek(dayofWeek);
		this.setTimeofDay(timeofDay);
		this.setRoom(room);
		this.setSeatingCapacity(seatingCapacity);
		this.setRepresentedCourse(representedCourse);
		this.setInstructor(instructor);
	/*	this.sectionNo=sectionNo;
		this.dayofWeek=dayofWeek;
		this.timeOfDay=timeOfDay;
		this.room=room;
		this.seatingCapacity=seatingCapacity;
		this.representedCourse=representedCourse;
		this.instructor=instructor;*/
	}
	public int getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}
	public String getDayofWeek() {
		return dayofWeek;
	}
	public void setDayofWeek(String dayofWeek) {
		this.dayofWeek = dayofWeek;
	}
	public String getTimeofDay() {
		return timeofDay;
	}
	public void setTimeofDay(String timeofDay) {
		this.timeofDay = timeofDay;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int capacity) {
		this.seatingCapacity = capacity;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public void Enroll(){
		
	}
	public void Drop(){
		
	}
	public void PostGrade(){
		
	}
	public void ConfirmSeatAvailability(){
		
	}
	private HashMap<String, Student> enrolledStudents; 
	private HashMap<Student, TranscriptEntry> assignedGrades; 
/*	public Section(int sectionNo,String dayOfWeek,String timeOfDay,String room,int seatingCapacity,String representedCourse,String instructor) {
		setSectionNo(sectionNo);
		setDayOfWeek(dayofWeek);
		setTimeOfDay(timeofDay);
		setRepresentedCourse(course);
		setRoom(room);
		setSeatingCapacity(capacity);

		// A Professor has not yet been identified.

		setInstructor(null);

		// Note that we're instantiating empty support Collection(s).

		enrolledStudents = new HashMap<String, Student>();
		assignedGrades = new HashMap<Student, TranscriptEntry>();
	}*/
/*	private void setInstructor(Object object) {
		// TODO Auto-generated method stub
		
	}
	private void setRepresentedCourse(Course course) {
		// TODO Auto-generated method stub
		
	}*/
	public String getRepresentedCourse() {
		return representedCourse;
	}
	public void setRepresentedCourse(String representedCourse) {
		this.representedCourse = representedCourse;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
