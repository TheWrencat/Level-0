import javax.swing.JOptionPane;

public class chooseYourOwnAdventure {
	public static void main(String[] args) {
		
		String choiceA = JOptionPane.showInputDialog("You woke up and checked the clock, it was about two hours before when you normall wake up. \nDo you get up or do you go back to sleep?");
		if(choiceA.equals("get up")){
			JOptionPane.showInputDialog("You get out of bed and go to the kitchen to get some breakfast. \nDo you decide to eat toast of make bacon?");
		}
		if(choiceA.equals("go back to sleep")){
			JOptionPane.showMessageDialog(null, "You decide to fall back to sleep...");
		}
	}
	
}
