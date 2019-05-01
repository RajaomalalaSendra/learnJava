package openClassroom.pattern.participant;

import openClassroom.pattern.strategy.Personage;

public class Patient extends Personage{
	public Patient(){
		
	}
	public void toMove(){
		System.out.println("I cannot  move by foot anymore but I am just stay here on the bed.");
	}
	public void toBattle(){
		System.out.println("I have finish my battle for this moment!!!");
	}
}