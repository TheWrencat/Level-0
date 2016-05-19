import javax.swing.JOptionPane;

public class Change_Calculator {
	public static void main(String[] args) {

		String pennys = JOptionPane.showInputDialog("How many pennys do you have?");
		int realPennys = Integer.parseInt(pennys);
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int realNickels = Integer.parseInt(nickels);
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int realDimes = Integer.parseInt(dimes);
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int realQuarters = Integer.parseInt(quarters);
		double Pennys = realPennys * 0.01;
		double Nickels = realNickels * 0.05;
		double Dimes = realDimes * 0.1;
		double Quarters = realQuarters * 0.25;
		double total = Pennys + Nickels + Dimes + Quarters;
		JOptionPane.showMessageDialog(null, "You have $" + total + "change.");
	}
}
