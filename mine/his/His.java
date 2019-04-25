package mine.his;

import mine.theirs.Theirs;

public class His {
    public Theirs theirs;
    String position;
    int salary;
    // the class His
    public His(String position, int salary, Theirs theirs){
    	this.position = position;
    	this.salary = salary;
    	this.theirs = theirs;
    }
    // get the position and position
    public String getPosition() {
    	return this.position;
    }
    public int getSalary() {
    	return this.salary;
    }
}