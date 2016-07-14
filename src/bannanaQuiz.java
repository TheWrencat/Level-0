
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bannanaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banannas = JOptionPane.showInputDialog("Do you like banannas?");
		// 2. if they say no,
		if (banannas.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy!");
		} else {
			if (banannas.equals("yes")) {
				String hobby = JOptionPane.showInputDialog("What's you favorite hobby?");
				JOptionPane.showMessageDialog(null, hobby + " is much better with banannas!");
			} else {
				JOptionPane.showMessageDialog(null, "You are banannas!");
			}
		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
