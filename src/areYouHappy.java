import javax.swing.JOptionPane;

public class areYouHappy {

	public static void main(String[] args) {
		
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}
		if(answer.equals("no")){
			String happyAnswer = JOptionPane.showInputDialog("Do you want to be happy?");
		
		if (happyAnswer.equals("yes")){
			JOptionPane.showInputDialog("Then change something.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		}
	}
}
