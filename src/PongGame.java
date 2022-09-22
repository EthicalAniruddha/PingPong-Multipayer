import javax.swing.JOptionPane;
public class PongGame {

	public static void main(String[] args) {

		GameFrame frame = new GameFrame();

		JOptionPane.showMessageDialog(null, "'W' for Upward and 'S' for Downward for Left Paddle, 'Up' and 'Down' for Right Paddle", "Rule", JOptionPane.INFORMATION_MESSAGE);
	}
}