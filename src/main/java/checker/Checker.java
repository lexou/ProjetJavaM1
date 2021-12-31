package checker;

import modele.Game;
import modele.Piece;

public class Checker {
	public Game game;
	
	public Checker(Game game) {
		this.game=game;
	}
	
	//Getter
	public Game getGame() {
		return this.game;
	}
	
	//Methodes
	public boolean isResolu() { //
		for(int i=0; i<this.game.getH(); i++) {
			for(int j=0; j<this.game.getW(); j++) {
				if(!isConnected(this.game.board[i][j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isConnected(Piece p) {
		int i=p.getI();
		int j=p.getJ();
		Piece p2=null;
		if(j-1>=0) { //le cote gauche est connecte?
			p2=this.game.board[i][j-1];
			if (p2!= null) {
				if(p2.isDroite()) {
					if (!p.isGauche()) {
						return false;
						}
				}
				else if (p.isGauche()) {
					return false;
				}
			}
			else if (p.isGauche()) {
				return false;
			}
		}
		if(j+1<this.game.getW()) { //le cote droit est connecte?
			p2=this.game.board[i][j+1];
			if (p2!=null) {
				if(p2.isGauche()) {
					if (!p.isDroite()) {
						return false;
					}
				}
				else if (p.isDroite()) {
					return false;
				}
			}
			else if (p.isDroite()) {
				return false;
			}
		}
		if(i-1>=0) { //le haut est connecte?
			p2=this.game.board[i-1][j];
			if (p2!=null) {
				if(p2.isBas()) {
					if (!p.isHaut()) {
						return false;
					}
				}
				else if (p.isHaut()) {
					return false;
				}
			}
			else if (p.isHaut()) {
				return false;
			}
		}
		if(i+1<this.game.getH()) { //le bas est connecte?
			p2=this.game.board[i+1][j];
			if (p2!=null) {
				if(p2.isHaut()) {
					if (!p.isBas()) {
						return false;
					}
				}
				else if (p.isBas()) {
					return false;
				}
			}
			else if (p.isBas()) {
				return false;
			}
		}
		return true;
	}
}
