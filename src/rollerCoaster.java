import javax.swing.JOptionPane;

public class rollerCoaster {
	public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?");
	int heightNum = Integer.parseInt(height);
	if (heightNum > 4){
		JOptionPane.showMessageDialog(null, "Feel free to ride the roller coaster!");
	}
	else{
	JOptionPane.showMessageDialog(null, "Sorry, your not tall enough yet.");
	}
	
}
}
