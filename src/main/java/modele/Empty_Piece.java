package modele;

public class Empty_Piece extends Piece {
	
	//contructeur
	public Empty_Piece(int i,int j,int orientation) {
		super(i,j,orientation);
		unicode=" ";
		linksImage=getClass().getResource("/images/Piece00.png");
	}
	
	@Override
	public void rotation() {
		super.rotation();
	}
	
	
}

