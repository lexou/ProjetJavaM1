package modele;

import java.net.URL;

public class Piece {
	private int i; //coordonnée i de la piece
	private int j; //coordonnée j de la piece
	protected int orientation; //orientation de la piece
	protected boolean haut=false;
	protected boolean bas=false;
	protected boolean droite=false;
	protected boolean gauche=false;
	protected String unicode;
	protected URL linksImage;
	
	
	//constructeur
	public Piece(int i, int j, int orientation) {
		this.i=i;
		this.j=j;
		this.orientation=orientation;
	}

	//Getter
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
	public String getUnicode() {
		return unicode;
	}


	public int getOrientation() {
		return orientation;
	}
	
	public boolean isHaut() {
		return haut;
	}

	public boolean isBas() {
		return bas;
	}

	public boolean isDroite() {
		return droite;
	}

	public boolean isGauche() {
		return gauche;
	}
	
	public URL getLinksImage() {
		return linksImage;
	}

	//Setter
	public void setI(int i) {
		this.i=i;
	}

	public void setJ(int j) {
		this.j=j;
	}

	public void setOrientation(int orientation) {
		this.orientation=orientation;
	}
	
	//Methodes
	public void rotation(){ //tourne la piece de 90° dans le sens des aiguilles
		boolean tmp=haut;
		haut=gauche;
		gauche=bas;
		bas=droite;
		droite=tmp;
	}
	
	
	
}
