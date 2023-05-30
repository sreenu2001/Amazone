package com.gsreenu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
private int empid;
private String empname;
public Employee() {
	super();
}
public int getEmpid() {
	return empid;
}
@Value("101")
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
@Value("ganesh")
public void setEmpname(String empname) {
	this.empname = empname;
}
public void print() {
	System.out.println(empid);
	System.out.println(empname);
}

}
