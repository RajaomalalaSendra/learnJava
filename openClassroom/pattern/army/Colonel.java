package openClassroom.pattern.army;

import openClassroom.pattern.strategy.Personage;

public class Colonel extends Personage implements Weapon{
	public  Colonel() {

	}
	public  void toBattle(){
		System.out.println("I give the strategy for the battle.");
	}
	public void toMove(){
		System.out.println("Most of the time I move by car.");
	}
	public void toUseWeapon(){
		System.out.println("My best weapon is multraeuses!!!!");
	}
}