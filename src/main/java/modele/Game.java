package modele;

public class Game {
	private int h;
	private int w;
	public Piece[][] board;
	
	//constructeurs
	public Game() {
		this.h=0;
		this.w=0;
	}
	
	public Game(int h, int w, Piece[][] board) {
		this.h=h; //height
		this.w=w; //width
		this.board=board;
	}
	
	//Getter
	public int getH() {
		return h;
	}
	public int getW() {
		return w;
	}
	public Piece[][] getBoard() {
		return board;
	}
	
	//Setter
	public void setH(int h) {
		this.h=h;
	}
	public void setW(int w) {
		this.w=w;
	}
	public void setBoard(Piece[][] board) {
		this.board=board;
	}
	
	//Methodes
	
	public boolean isResolu() { //
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(!isConnected(this.board[i][j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isConnected(Piece p) {
		int i=p.getI();
		int j=p.getJ();
		Piece p2=null;;
		if(j-1>=0) { //le cote gauche est connecte?
			p2=this.board[i][j-1];
			if (p2!= null) {
				if(p2.isDroite()) {
					if (!p.isGauche())return false;
				}
				else if (p.isGauche()) return false;
			}
			else if (p.isGauche()) return false;
		}
		if(j+1<this.w) { //le cote droit est connecte?
			p2=this.board[i][j+1];
			if (p2!=null) {
				if(p2.isGauche()) {
					if (!p.isDroite())return false;
				}
				else if (p.isDroite())return false;
			}
			else if (p.isDroite()) return false;
		}
		if(i-1>=0) { //le haut est connecte?
			p2=this.board[i-1][j];
			if (p2!=null) {
				if(p2.isBas()) {
					if (!p.isHaut())return false;
				}
				else if (p.isHaut())return false;
			}
			else if (p.isHaut()) return false;
		}
		if(i+1<this.h) { //le bas est connecte?
			p2=this.board[i+1][j];
			if (p2!=null) {
				if(p2.isHaut()) {
					if (!p.isBas())return false;
				}
				else if (p.isBas())return false;
			}
			else if (p.isBas()) return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		String sb="";
		for(int i=0; i<h;i++) {
			for(int j =0; j<w;j++) {
				Piece p = board[i][j];
				sb+=(p.getUnicode());
			}
			sb+=("\n");
		}
		return sb.toString();
	}
	
	
}
