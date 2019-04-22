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
     public Name(String name, String lastName){
     	this.name = name;
     	this.lastName = lastName;
     }
}