import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();//takes stuff from gamepanel for example and fits it nicely and snuggly into the window/jframe
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
