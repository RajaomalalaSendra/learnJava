package flsh.student;

import flsh.common.Common;

public class Student {
    Common common;
    String level;
    String status;
    public Student(String level, String status,Common common){
        this.level = level;
        this.status = status;
        this.common = common;
    }
    public String getLevel(){
    	return this.level;
    }
    public String getStatus(){
    	if(this.status.equals("P")){
            return "Passable";
        }else if (this.status.equals("R")) {
            return "Redoublant";            
        }else{
            return "Triplant";
        }
    }
}