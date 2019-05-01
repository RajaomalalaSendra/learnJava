package openClassroom.pattern.army;

import openClassroom.pattern.strategy.Personage;

public class Soldier extends Personage implements Weapon{
	public Soldier(){
		
	}
	public  void toBattle(){
		System.out.println("I attack first in the battle.");
	}
	public void toMove(){
		System.out.println("Most of the time I walk by foot.");
	}
	public void toUseWeapon(){
		System.out.println("My best weapon is pistolet and the gun!!!!");
	}
}