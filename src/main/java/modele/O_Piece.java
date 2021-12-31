package modele;

public class O_Piece extends Piece {
	
	//constructeur
	public O_Piece (int i,int j,int orientation) {
		super(orientation,i,j);
		if(orientation==0) {
			haut=true;
			unicode="╹h";
			linksImage=getClass().getResource("/images/Piece10.png");
		}
		else if (orientation==1) {
			droite=true;
			unicode="d╺";
			linksImage=getClass().getResource("/images/Piece11.png");
		}
		else if (orientation==2) {
			bas=true;
			unicode="╻b";
			linksImage=getClass().getResource("/images/Piece12.png");
		}
		else {
			gauche=true;
			unicode="╸g";
			linksImage=getClass().getResource("/images/Piece13.png");
		}
	}
	
	@Override
	public void rotation() {
		super.rotation();
		this.setOrientation((orientation+1)%4);
	}
	
	@Override
	public void setOrientation(int orientation) {
		super.setOrientation(orientation);
		if(orientation==0) {this.unicode="╹h";linksImage=getClass().getResource("/images/Piece10.png");}
		else if (orientation==1) {this.unicode="d╺";linksImage=getClass().getResource("/images/Piece11.png");}
		else if (orientation==2) { this.unicode="╻b";linksImage=getClass().getResource("/images/Piece12.png");}
		else {this.unicode="╸g";linksImage=getClass().getResource("/images/Piece13.png");}
	}
}
