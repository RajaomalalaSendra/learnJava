package io.jpmg.main;

import io.jpmg.src.*;

public class Apps{
	public static void main(String[] args) {
        Personnage[] tPers = {new Guerrila(), new Civil(), new Doctor()};
        System.out.println("*****************************************");
        for(int i = 0; i < tPers.length; i++){
			System.out.println("\nInstance de " + tPers[i].getClass().getName());
			System.out.println("*****************************************");
			tPers[i].getBattle();
			tPers[i].getMove();
			tPers[i].getHeal();
		}
		System.out.println("*****************************************");		
	}
}