package com.codegnan.university.managment;

public class Course {
	private String title;
	
	

	public Course(String title) {
		super();
		this.title = title;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Course [title=" + title + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
