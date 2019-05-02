package io.jpmg.src;

import io.jpmg.comportement.*;

public class Civil extends Personnage {
	public Civil(){}
	public Civil(BattleThinking theBattle, Move theMove, Heal theHeal){
		this.battle = theBattle;
		this.move = theMove;
		this.heal = theHeal;
	}
}