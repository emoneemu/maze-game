package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Man {
	
	private int x,y;
	private String imagePath;
	
	
	
	public Man(int x, int y, String imagePath) {
		
		this.x = x;
		this.y = y;
		this.imagePath = imagePath;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
    public void draw(Graphics g){
    	ImageIcon icon = new ImageIcon(imagePath);
    	Image pack = icon.getImage();
    	g.drawImage(pack,x,y,null);
    }
	

}
