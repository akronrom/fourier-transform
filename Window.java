import java.awt.*;
import javax.swing.*;

public class Window extends JPanel {
	
	JFrame frame;
	
	static final int WIDTH 	= 500;
	static final int HEIGHT = 500;
	
	public int x1 = 500;
	
	Window(){
		
		frame = new JFrame();
		
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		//frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(this);
		frame.pack();
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		
		g2D.drawOval((WIDTH-x1)/2, (HEIGHT-x1)/2, x1, x1);
		
		System.out.println("Reprinting");
		try {
			
			Thread.sleep(16);
			
			
		} catch (Exception e) {
			
		}
		x1--;
		
		
		frame.repaint();
		
	}
	
}
