import javax.swing.JFrame;
public class Driver {
	public static void main(String[] args){
		Map game = new Map(450,600);
		JFrame map = new JFrame();
		
		map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		map.setVisible(true);
		map.setContentPane(game);
		map.setResizable(false);
		map.pack();
	}
}
