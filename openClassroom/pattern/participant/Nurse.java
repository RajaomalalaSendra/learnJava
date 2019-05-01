package openClassroom.pattern.participant;

import openClassroom.pattern.strategy.Personage;

public class Nurse extends Personage implements Another{
	public Nurse(){
		
	}
	public void toMove(){
		System.out.println("I can move by foot as well.");
	}
	public void toBattle(){
		System.out.println("As for myself I cannot go to the field to battle But I am just here!!!");
	}
	public void toHeal(){
		System.out.println("I am here to heal all those soldiers who are wound. to help also the doctor!!!");
	}    
}