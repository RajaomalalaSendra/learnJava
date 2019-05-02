package io.jpmg.comportement;

public class NoHeal implements Heal {
	public void toHeal(){
		System.out.println("I don't heal for now!!!!!!");
	}
}