package modele;

public class T_Piece extends Piece{
	
	//constructeur
	public T_Piece(int i,int j,int orientation) {
		super(i,j,orientation);
		if(orientation==0) {
			haut=true; 
			gauche=true; 
			droite=true;
			unicode="┴";
			linksImage=getClass().getResource("/images/Piece30.png");
		}
		else if (orientation==1) {
			haut=true; 
			bas=true; 
			droite=true;
			unicode="├";
			linksImage=getClass().getResource("/images/Piece31.png");
		}
		else if (orientation==2) {
			gauche=true; 
			bas=true; 
			droite=true;
			unicode="┬";
			linksImage=getClass().getResource("/images/Piece32.png");
		}
		else {
			haut=true; 
			bas=true; 
			gauche=true;
			unicode="┤";
			linksImage=getClass().getResource("/images/Piece33.png");
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
		if(this.orientation==0) {unicode="┴";linksImage=getClass().getResource("/images/Piece30.png");}
		else if (this.orientation==1) {unicode="├";linksImage=getClass().getResource("/images/Piece31.png");}
		else if (this.orientation==2) {unicode="┬";linksImage=getClass().getResource("/images/Piece32.png");}
		else {unicode="┤";linksImage=getClass().getResource("/images/Piece33.png");}
	}
}
