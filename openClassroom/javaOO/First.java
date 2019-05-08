package  openClassroom.javaOO;

import java.util.Scanner;

public class First {
	String name;
	public static void main(String[] args) {
		First see = new First();
		Scanner scan = new Scanner(System.in);
		String answer;
		char response = 'O';
		while(response == 'O'){
			System.out.println("Give the name: ");
            answer = scan.nextLine();
            see.setName(answer);
            System.out.println("Hello " + see.getName());
            response = ' ';
			//Tant que la réponse n'est pas O ou N, on repose la question
			while(response != 'O' && response != 'N')
			{
				//On demande si la personne veut faire un autre essai
				System.out.println("Voulez-vous réessayer ? (O/N)");
				response = scan.nextLine().charAt(0);
			}
		}

	}
	public void setName(String name){
		if (name!=null) {
			this.name = name;
		} else {
			this.name = "None";
		}
	}
	public String getName(){
		return this.name;
	}
}