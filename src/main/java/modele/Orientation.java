package modele;

public enum Orientation {
	NORTH(0),  //==0
	EAST(1),   //==1
	SOUTH(2),   //==2
	WEST(3),
	EMPTY(4);   //==3
	
	private int nbr;
	
	private Orientation(int nbr) {
		this.setNbr(nbr);
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	static Orientation getOrifromValue(int orientationValue) {
		for (Orientation tmp : Orientation.values()) {
			if(orientationValue==tmp.getNbr()) {
				return tmp;
			}
		}
		return null;
	}

	Orientation turn90() {
		if(this.getNbr()==Orientation.NORTH.nbr) {
			System.out.println("je suis ici");
			return Orientation.EAST;
		}
		else if(this.getNbr()==Orientation.EAST.nbr) {
			System.out.println("je suis ici 2");
			return Orientation.SOUTH;
		}
		else if(this.getNbr()==Orientation.SOUTH.nbr) {
			System.out.println("je suis ici 3");
			return Orientation.WEST;
		}
		else {
			System.out.println("je suis ici 4");
			return Orientation.NORTH;
		}
	}

	int[] getOpposedPieceCoordinates(Piece p) {
		
		return null;
	}
	
}
