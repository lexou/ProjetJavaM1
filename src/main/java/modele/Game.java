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
	
	@Override
	public String toString() {
		String s="";
		for(int i=0; i<h;i++) {
			for(int j =0; j<w;j++) {
				Piece p = board[i][j];
				s+=(p.getUnicode());
			}
			s+=("\n");
		}
		return s.toString();
	}
	
	
}
