package openClassroom.pattern.army;

import openClassroom.pattern.strategy.Personage;

public class Sniper extends Personage implements Weapon{
	public Sniper(){
		
	}
	public  void toBattle(){
		System.out.println("I snipe my enemy from far away.");
	}
	public void toMove(){
		System.out.println("Most of the time I walk by foot.");
	}
	public void toUseWeapon(){
		System.out.println("My best weapon is the sniper long porte!!!!");
	}
}