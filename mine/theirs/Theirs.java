package mine.theirs;

public class Theirs { 
    String name;
    String lastName;
    String adress;
    String email;
    String tel;
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
    	return this.email;
    }
    public String getTel(){
    	return this.tel;
    }
    // getter of theirs
    public void setName(String name){
    	if (name!=null && name.length() > 2) {
    		this.name = name;    		
    	} else {
    		this.name = "anonymous";
    	}
    }
    public void setLastName(String lastName){
    	if (lastName != null && lastName.length() > 3) {
    		this.lastName = lastName;    		
    	} else {
    		this.lastName = "anonymous";
    	}
    }
    public void setAdress(String adress){
    	if (adress!=null && adress.length() > 3) {
    		this.adress = adress;
    	}else {
    		this.adress = "unknownAdress";
    	}
    }
    public void setEmail(String email){
    	if (email!=null && email.length() > 4) {
    		this.email = email;
    	}else {
    		this.email = "default@email.com";
    	}
    }
    public void setTel(String tel){
    	if (tel!=null && tel.length() < 20) {
    		this.tel = tel;
    	}else {
    		this.tel = "+26123--------";
    	}
    }
}