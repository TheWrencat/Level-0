 import java.util.Random;

import javax.swing.JOptionPane;

public class highLow {
	public static void main(String[] args) {
		int random = new Random().nextInt(100);
		//System.out.println(random);
		
		for (int i = 0;i<10; i++){
			String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100!");
			int guessNumber = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (random == guessNumber) {
				JOptionPane.showMessageDialog(null, "You Win!");
				System.exit(0);
			} else {
				if(random < guessNumber){
					JOptionPane.showMessageDialog(null, "Too high, keep trying.");
				}
				if(random > guessNumber){
					JOptionPane.showMessageDialog(null, "Too low, keep trying.");
				
				}
			}
		}
			JOptionPane.showMessageDialog(null, "You lose");
	}
}