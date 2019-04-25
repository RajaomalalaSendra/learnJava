package flsh.common;

public class Common {
    private String name;
    private String lastName;
    private int age;
    private  String address;
    private String contact;
    private String email;
    public Common(String name, String lastName, int age, String address,String email, String contact) {
    	this.name = name;
    	this.lastName = lastName;
    	this.age = age;
        this.address = address;
        this.email = email;
        this.contact = contact;
    }
    public String getName(){
    	return this.name;
    }
    public String getLastName(){
    	return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
    public String getContact(){
        return this.contact;
    }
    public  String getEmail(){
        return this.email;
    }
}