package openClassroom.pattern.participant;

import openClassroom.pattern.strategy.Personage;

public class Medecin extends Personage implements Another{
	public Medecin(){
		
	}
	public void toMove(){
		System.out.println("I can move by foot.");
	}
	public void toBattle(){
		System.out.println("As for myself I cannot go to the field to battle!!!");
	}
	public void toHeal(){
		System.out.println("I am here to heal all those soldiers who are wound....");
	}    
}