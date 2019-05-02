package io.jpmg.src;

import io.jpmg.comportement.*;

public class Guerrila extends Personnage {
	public Guerrila(){
		this.battle = new PistoletFight();
	}
	public Guerrila(BattleThinking theBattle, Move theMove, Heal theHeal){
		this.battle = theBattle;
		this.move = theMove;
		this.heal = theHeal;
	}
}