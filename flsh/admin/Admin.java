package flsh.admin;

import flsh.common.Common;

public class Admin {
	public Common common;
    private String pseudo;
    private String password;
    public Admin(String pseudo, String password, Common common) {
    	this.pseudo = pseudo;
    	this.password = password;
    	this.common = common;
    }
    public String getPseudo(){
    	return this.pseudo;
    }
    public String getPassword(){
    	return this.password;
    }
}