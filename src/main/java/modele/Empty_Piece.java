package modele;

public class Empty_Piece extends Piece {
	
	//contructeur
	public Empty_Piece(int i,int j,int orientation) {
		super(orientation,i,j);
		unicode=" ";
		linksImage=getClass().getResource("/images/Piece00.png");
	}
	
	@Override
	public void rotation() {
		super.rotation();
	}
	
	
}

