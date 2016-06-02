

	// Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipies".
	 */
	public class Xgeeks {
	public static void main(String[] args) {

			// 1. Save the superpower for each person in a variable.
String Wren = "Shapeshifting";
String June = "Writing recipies";
String Mychel = "Mind compelling";
String Drew = "Excuses that work";
String Maria = "Eating a lot";

			// 2. Ask the user to enter a name. Store their answer in a variable.
String superHero = JOptionPane.showInputDialog("What's your name?");
			// 3. Show the superpower in a pop-up, depending on the name entered. 
if (superHero.equals("Wren")){
	JOptionPane.showMessageDialog(null, "Wren's superpower is "+Wren+".");
}
if (superHero.equals("June")){
	JOptionPane.showMessageDialog(null, "June's superpower is "+June+".");
}
if (superHero.equals("Mychel")){
	JOptionPane.showMessageDialog(null, "Mychel's superpower is "+Mychel+".");
}
if (superHero.equals("Drew")){
	JOptionPane.showMessageDialog(null, "Drew's superpower is "+Drew+".");
}
if (superHero.equals("Maria")){
	JOptionPane.showMessageDialog(null, "Maria's superpower is "+Maria+".");
}
		}
	}
