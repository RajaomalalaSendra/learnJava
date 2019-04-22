import java.util.Scanner;

public class ScannerInput {
    Namer namer;
    Count count;
    public ScannerInput(Namer namer, Count count){
    	this.namer = namer;
    	this.count = count;
    }
    public static void main(String[] args) {
    	// Declaration of the variables inside of all of these
        System.out.println("Please enter your first and your last name, on separate lines.");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		String lastNameR = scanner.nextLine();
		
        // creation of the namer
		Namer thatName = new Namer();
		thatName.setName(firstName);
		thatName.setLastName(lastNameR);

        // next input
        System.out.println("Please enter your email adress: ");
		String emailUser = scanner.nextLine();
		System.out.println("Enter your password: ");
		String passwordUser = scanner.nextLine();
		System.out.println("Enter your password: ");
		String passwordConfirmationUser = scanner.nextLine();
		
        
        // condition if the user has enter the same password
        if (passwordUser.equals(passwordConfirmationUser)) {
            // creation of the account
			Count user = new Count();
			user.setEmail(emailUser);
			user.setPassword(passwordUser);
			user.setPasswordConfirmation(passwordConfirmationUser);

            // Print all about the user
			ScannerInput get = new ScannerInput(thatName, user);
			System.out.print("Hello, ");
			System.out.print(get.namer.getName());
			System.out.print(" ");
			System.out.print(get.namer.getLastName());
			System.out.println("!");
			System.out.println("Your account has created successfully!!");
			System.out.println("Email: " + get.count.getEmail());		
        } else {
        	System.out.println("Wrong password!! See you next time!");
        }
    }
}
class Namer {
	private String name;
	private String lastName;

	public String getName(){
		return this.name;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setName(String name){
		if (name!=null && name.length()>2){
			this.name = name;
		} else {
			this.name = "Anonymous";
		}
	}
	public void setLastName(String lastName){
		if(lastName!=null && lastName.length()>3){
			this.lastName = lastName;
		}else{
			this.lastName = "Anonymous";
		}
	}
}
class Count{
	private String email;
	private String password;
	private String passwordConfirmation;
	public String getEmail(){
		return this.email;
	}
	public String getPassword(){
		return this.password;
	}
	public String getPasswordConfirmation(){
		return this.passwordConfirmation;
	}
	public void setEmail(String email){
		if (email!=null && email.length()>5) {
			this.email = email;
		} else {
			this.email = "email@email.email";
		}
	}
	public void setPassword(String password){
		if (password != null && password.length() > 3) {
			this.password = password;
		} else {
			this.password = "default";
		}
	}
	public void setPasswordConfirmation(String passwordConfirmation){
		if (passwordConfirmation != null && passwordConfirmation.length() > 3) {
			this.passwordConfirmation = passwordConfirmation;
		} else {
			this.passwordConfirmation = "default";
		}
	}
}