package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pack extends JFrame {
	Board board;
	
	public Pack(){
		
		board= new Board();		
	}
	public void makeWindow(){
		super.setSize(500,500);
		super.setLocation(350,100);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
		
	}

}
