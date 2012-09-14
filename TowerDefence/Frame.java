package TowerDefence;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
	//Variables
	public static String title = "SuperTowerStroll InvDev 1.0"; 
	public static Dimension size = new Dimension(550,750);
	
	//Constructor
	public void Frame(){
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//Applet Importation Compatibility
	public void init(){
		
	}
	//Main Method
	public static void main(String[] args){
		Frame frame = new Frame();
	}

}
