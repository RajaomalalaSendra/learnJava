package mine.his;

public class Theirs { 
    String name;
    String lastName;
    String adress;
    String[] contact = new String[2];
    // setter of theirs
    public String getName(){
    	return this.name;
    }
    public String getLastName(){
    	return this.lastName;
    }
    public String getAdress(){
    	return this.adress;
    }
    public String getMail(){
    	return this.contact[0];
    }
    public String getTel(){
    	return this.contact[1];
    }
    // getter of theirs
    public void String setName(String name){
    	if (name!=null && name.length() > 2) {
    		this.name = name;    		
    	} else {
    		this.name = "anonymous";
    	}
    }
    public void String setLastName(String lastName){
    	if (lastName != null && lastName.length() > 3) {
    		this.lastName = lastName;    		
    	} else {
    		this.lastName = "anonymous";
    	}
    }
    public void String setAdress(String adress){
    	if (adress!=null && adress.length > 3) {
    		this.adress = adress;
    	}else {
    		this.adress = "unknownAdress";
    	}
    }
    public void String setEmail(String email){
    	if (email!=null && email.length() > 4) {
    		this.contact[0] = email;
    	}else {
    		this.contact[0] = "default@email.com";
    	}
    }
    public void String setTel(String tel){
    	if (tel!=null && tel.length() < 20) {
    		this.contact[1] = tel;
    	}else {
    		this.contact[1] = "+26123--------";
    	}
    }
}