package com.five;

public  class Account{
	private String email;
	private String password;
	private String passwordConfirmation;

	public String getEmail(){
		return this.email;
	}
	public String getPassword(){
		return this.password;
	}
	public  String getPasswordConfirmation(){
		return this.passwordConfirmation;
	}
	public void setEmail(String email){
		if (email!=null && email.length() > 5) {
			this.email = email;			
		} else {
			this.email = "default@email.email";
		}
	}
	public void setPassword(String password) {
		if (password!=null && password.length() > 2) {
			this.password = password;
		} else {
			this.password = "anonymous";
		}
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		if (passwordConfirmation!=null && passwordConfirmation.length() > 2) {
			this.passwordConfirmation = passwordConfirmation;
		}else {
			this.passwordConfirmation = "anonymous";
		}
	}
}