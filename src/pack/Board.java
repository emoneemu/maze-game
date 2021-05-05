package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board extends JPanel {
	
	public static final int WIDTH = 500, HEIGHT = 500;
		
	
	Man man;
	public Board(){
		super();
		man = new Man(0,0,"images//pack");
		
	}
	
	
	public void paint(Graphics g){
		
		ImageIcon icon = new ImageIcon("images//back.png");
		Image background  = icon.getImage();
		g.drawImage(background,0,0,null);
		man.draw();
		
		
		
	}
	public void moveUP(){
		if ((y-1)>0)
			y--;
		else
			y = Board.HEIGHT - 1;
	}
	public void moveDown(){
		if ((y+1)<Board.HEIGHT)
			y++;
		else
			y = 0;
	}
	public void moveRIGHT(){
		if ((x-1)>0)
			x--;
		else
			x = Board.WIDTH - 1;
	}
	public void moveLEFT(){
		if ((x+1)<Board.WIDTH)
			x++;
		else
			x = 0;
	}

}
