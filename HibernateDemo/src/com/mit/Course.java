package com.mit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcourse")
public class Course {
	public static Course obj;
	@Id
	@Column(name="course_id")
	private int courseID;
	@Column(name="course_name")
	private String courseName;
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	
	public Course(int courseID, String courseName) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course() {}
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]";
	}

}