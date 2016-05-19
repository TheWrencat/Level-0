import javax.swing.JOptionPane;

public class unBirthday {
	public static void main(String[] args) {
		String today = "5/18";
		String birthday = JOptionPane.showInputDialog("When is your Birthday?");
		if (today.equals (birthday)) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
			else {
				JOptionPane.showMessageDialog(null, "Happy Un-Birthday!");
			}
		}
	}
