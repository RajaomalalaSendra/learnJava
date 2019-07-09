package flsh.teacher;

import flsh.common.Common;

public class Teacher{
	String diploma;
    String position;
    public Common common;
    public Teacher(String diploma, String position, Common common){
    	this.diploma = diploma;
    	this.position = position;
    	this.common = common;
    }
    public String getDiploma(){
    	return this.diploma;
    }
    public String getPosition(){
    	return this.position;
    }
} 