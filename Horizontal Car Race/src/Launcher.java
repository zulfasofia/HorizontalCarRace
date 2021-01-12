import javax.swing.*;
public class Launcher {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fun Race");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720, 690);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(new Road());
		frame.setVisible(true);

	}

}
