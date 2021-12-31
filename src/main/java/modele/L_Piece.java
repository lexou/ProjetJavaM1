package modele;

public class L_Piece extends Piece {
	
	//constructeur
	public L_Piece (int i,int j,int orientation) {
		super(i,j,orientation);
		if(orientation==0) {
			haut=true;
			droite=true;
			unicode="╰";
			linksImage=getClass().getResource("/images/Piece50.png");
		}
		else if (orientation==1) {
			bas=true; 
			droite=true;
			unicode="╭";
			linksImage=getClass().getResource("/images/Piece51.png");
		}
		else if (orientation==2) {
			gauche=true; 
			bas=true;
			unicode="╮";
			linksImage=getClass().getResource("/images/Piece52.png");
		}
		else {
			haut=true;
			gauche=true;
			unicode="╯";
			linksImage=getClass().getResource("/images/Piece53.png");
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
		if(orientation==0) {unicode="╰";linksImage=getClass().getResource("/images/Piece50.png");}
		else if (orientation==1) {unicode="╭";linksImage=getClass().getResource("/images/Piece51.png");}
		else if (orientation==2) {unicode="╮";linksImage=getClass().getResource("/images/Piece52.png");}
		else {unicode="╯";linksImage=getClass().getResource("/images/Piece53.png");}
	}
}
