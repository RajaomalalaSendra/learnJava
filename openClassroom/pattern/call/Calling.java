package openClassroom.pattern.call;

import openClassroom.pattern.army.Colonel;
import openClassroom.pattern.participant.Medecin;

public class Calling{
	public static void main(String[] args) {
		Colonel col = new Colonel();
		Medecin med = new Medecin();

		System.out.println("=====================================");
		col.toBattle();
		col.toMove();
		col.toUseWeapon();
		System.out.println("=====================================");
		med.toBattle();
		med.toMove();
		med.toHeal();
		System.out.println("=====================================");
		
	}
}