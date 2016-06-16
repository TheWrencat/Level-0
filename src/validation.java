	import java.util.Random;

	import javax.swing.JOptionPane;

	public class validation {
		public static void main(String[] args) {

			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			for(int i = 0; i < 10; i++){
				int randomNumber = new Random().nextInt(5);
				System.out.println(randomNumber);
	
				if (randomNumber == 0){
				JOptionPane.showMessageDialog(null, "I like your shoes.");
				}
				if (randomNumber == 1){
					JOptionPane.showMessageDialog(null, "Nice to meet you.");
				}
				if (randomNumber == 2){
					JOptionPane.showMessageDialog(null, "Your awesome!");
				}
				if (randomNumber == 3){
					JOptionPane.showMessageDialog(null, "Hello");
				}
				if (randomNumber == 4){
					JOptionPane.showMessageDialog(null, "Good job!");
				}
			}
		}
	}

