package io.jpmg.src;

import io.jpmg.comportement.*;

public class Doctor extends Personnage {
	public Doctor(){
		this.heal = new FirstHeal();
	}
	public Doctor(BattleThinking theBattle, Move theMove, Heal theHeal){
		this.battle = theBattle;
		this.move = theMove;
		this.heal = theHeal;
	}
}