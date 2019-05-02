package io.jpmg.src;

import io.jpmg.comportement.*;

public abstract class Personnage {
	// the instance of the comportements;
	protected BattleThinking battle = new Pacifist();
	protected Move move = new Walk();
	protected Heal heal = new NoHeal();

	// the personnage inside the abstract personnage;
    public Personnage(){}
    public Personnage(BattleThinking theBattle, Move theMove, Heal theHeal){
    	this.move = theMove;
    	this.battle = theBattle;
    	this.heal = theHeal;
    }
    // method getter of the personnage
    public void getMove(){
    	move.toMove();
    }
    public void getHeal(){
    	heal.toHeal();
    }
    public void getBattle(){
    	battle.toBattle();
    }
    // method setter of the personnage
    public void setMove(Move theMove){
    	this.move = theMove;
    }
    public void setHeal(Heal theHeal){
    	this.heal = theHeal;
    }
    public void setBattle(BattleThinking theBattle){
    	this.battle = theBattle;
    }
}