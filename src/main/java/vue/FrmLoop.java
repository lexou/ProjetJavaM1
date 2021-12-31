package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import modele.Game;
import modele.Piece;

public class FrmLoop extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private Game game; 
	private int h;
	private int w;
	private int imageSize;
	private JButton[][] b;
	
	
	public FrmLoop(Game game) {
		super();
		this.game = game;
		this.h = game.getH();
		this.w = game.getW();
		this.b=new JButton[h][w];
		this.imageSize= 1000/Math.max(h,w);
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(1000,1000);
		this.setTitle("INFINITY LOOP GAME");
	    JPanel panel=new JPanel();
		this.setContentPane(panel);
		panel.setLayout(new GridLayout(h,w));
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		drawGrid();
	}
	
	public void drawGrid() {
		Piece[][] board = game.getBoard();
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				ImageIcon icon = (new ImageIcon (new ImageIcon(board[i][j].getLinksImage()).getImage().getScaledInstance(imageSize, imageSize, java.awt.Image.SCALE_SMOOTH)));
				this.b[i][j]=new JButton(icon);
				this.b[i][j].addActionListener(this);
				add(this.b[i][j]);
				}
		}
		//addColor();
		if(game.isResolu()) System.out.println("Bon");
	}
	
	public void addColor() { //en cours de reflexion -> le isConnected ne fonctionne peut etre pas correctement
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if (game.isConnected(game.board[i][j])) {
					this.b[i][j].setBorder(BorderFactory.createLineBorder(Color.GREEN,1));
				}
				else {
					this.b[i][j].setBorder(BorderFactory.createLineBorder(Color.RED,1));
				}
			}
		}
	}
	
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		Piece[][] board = this.game.getBoard();
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(b[i][j]==source) {
					board[i][j].rotation();
					b[i][j].setIcon((new ImageIcon (new ImageIcon(board[i][j].getLinksImage()).getImage().getScaledInstance(imageSize, imageSize, java.awt.Image.SCALE_SMOOTH))));
					break;
				}
			}
		}
		//addColor();
		if(game.isResolu()) System.out.println("Bon");
	}
}
