package com.spring.MongoMicroService.model;
import org.springframework.data.annotation.Id;
//import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.*;

//@Getter
@Document(collection="Employees")
public class Employees {
	
	@Id	
	private int id;
	private String Fname;
	private String Lname;
	private String Dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", Dept=" + Dept + "]";
	}
	
	

}
