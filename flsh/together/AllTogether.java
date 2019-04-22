package flsh.together;

import flsh.admin.Admin;
import flsh.common.Common;

public class AllTogether{
	public static void main(String[] args) {
		Common com = new Common("Malala", "Nomenjanahary", 24, "Ankatso II", "malala@tiana.com | +234 45 68 435");
		Admin adm = new Admin("Nitoki", "tokitoki", com);
		System.out.println("==========================================");
		System.out.println("Pseudo: " + adm.getPseudo());
		System.out.println("Password: " + adm.getPassword());
		System.out.println("==========================================");
		System.out.println("Name: " + adm.common.getName());
		System.out.println("Last Name: " + adm.common.getLastName());
		System.out.println("Age: " + adm.common.getAge());
		System.out.println("Address: " + adm.common.getAddress());
		System.out.println("Contact: " + adm.common.getContact());
		System.out.println("==========================================");
	}
}