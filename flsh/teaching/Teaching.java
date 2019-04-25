package flsh.teaching;

public class Teaching {
    String title;
    int duration;
    String date;
    String room;
    // to show the general way of the Teaching
    public Teaching(String title, int duration, String date, String room){
    	this.title = title;
    	this.duration = duration;
    	this.date = date;
    	this.room = room;
    }
    // to get all about the teaching
    public String getTitle(){
    	return this.title;
    }
    public int getDuration(){
    	return this.duration;
    }
    public  String getDate(){
    	return this.date;
    }
    public String getRoom(){
    	return this.room;
    }
}