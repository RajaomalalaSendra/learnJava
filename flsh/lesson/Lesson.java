package flsh.lesson;

public class Lesson {
    String title;
    int duration;
    String date;

    Lesson(String title, int duration, String date){
    	this.title = title;
    	this.duration = duration;
    	this.date = date;
    }
    public String getTitle(){
    	return this.title;
    }
    public String getDuration(){
    	return this.duration;
    }
    public  String getDate(){
    	return this.date;
    }
}