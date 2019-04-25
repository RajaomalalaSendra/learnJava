package mine.yours;

import java.util.Scanner;
import mine.his.His;
import mine.theirs.Theirs;

public class Yours {
    // creation of the variabbles of all of theses
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    Theirs theirs = new Theirs();
	    // Enter the formulaire
	    System.out.println("==========================");
	    System.out.println("THe formulaire");
	    System.out.println("==========================");

	    // about the user
	    System.out.print("Name: ");
	    String name = scan.nextLine();
        theirs.setName(name);
        System.out.println("==========================");

        System.out.print("Last Name: ");
	    String lastName = scan.nextLine();
        theirs.setLastName(lastName);
        System.out.println("==========================");

        System.out.print("Adress: ");
	    String adress = scan.nextLine();
        theirs.setAdress(adress);
        System.out.println("==========================");

        System.out.print("Email: ");
	    String email = scan.nextLine();
        theirs.setEmail(email);
        System.out.println("==========================");

        System.out.print("Tel: ");
	    String tel = scan.nextLine();
        theirs.setTel(tel);
        System.out.println("==========================");

        // about the user as an employee
        System.out.print("position: ");
	    String position = scan.nextLine();
        System.out.println("==========================");

        System.out.print("Salary: ");
	    int salary = scan.nextInt();
        System.out.println("==========================");

        // creation of the His 
        His his = new His(position, salary, theirs);
        	if(theirs.getName()!="anonymous" && theirs.getLastName()!="anonymous" && theirs.getAdress()!="unknownAdress"
        	&& theirs.getMail()!="default@email.com" && theirs.getTel()!="+26123--------"){
                 System.out.println("Account has been created!!!");
                 System.out.println("About your account.");
                 System.out.println("============================");
                 System.out.println("Name: " + his.theirs.getName());
                 System.out.println("Email: " + his.theirs.getMail());
                 System.out.println("Position: " + his.getPosition());
                 System.out.println("Salary: " + his.getSalary());
                 System.out.println("============================");
        	}else{
        		System.out.print("We are very sorry for that because.\nYou need to reenter the information about you!!!");
        	}
    }
}