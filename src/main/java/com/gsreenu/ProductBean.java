package com.gsreenu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductBean {
private int proid;
private String proname;
public ProductBean() {
	super();
}
public int getProid() {
	return proid;
}
@Value("101")
public void setProid(int proid) {
	this.proid = proid;
}
public String getProname() {
	return proname;
}
@Value("laptop")
public void setProname(String proname) {
	this.proname = proname;
}
public void printpro() {
	System.out.println(proname);
	System.out.println(proid);
}
}
