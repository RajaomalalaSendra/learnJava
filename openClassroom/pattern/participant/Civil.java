package openClassroom.pattern.participant;

import openClassroom.pattern.strategy.Personage;

public class Civil extends Personage{
	public Civil(){
		
	}
	public void toMove(){
		System.out.println("I walk by foot for now.");
	}
	public void toBattle(){
		System.out.println("I dont go to battle!!!");
	}
}