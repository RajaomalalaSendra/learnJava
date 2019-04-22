package com.five;

public class Name {
     private String name;
     private String lastName;

     public String getName(){
     	return this.name;
     }
     public String getLastName(){
     	return this.lastName;
     }
     public void setName(String name){
        if (name!=null && name.length() > 2) {
        	this.name = name;
        } else {
        	this.name = "anonymous";
        }
     }
     public void setLastName(String lastName){
     	if (lastName!=null && lastName.length() > 2) {
     		this.lastName = lastName;
     	}else {
     		this.lastName = "anonymous";
     	}
     }
}