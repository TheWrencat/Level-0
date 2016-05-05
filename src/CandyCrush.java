//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String M = JOptionPane.showInputDialog("Who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+M+"!");
		// 3. Ask the user for the name of their best friend
String F = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, F+"is as sweet as candy.");
	} 
}


