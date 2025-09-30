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
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		frame.add(this);
		frame.pack();
	}
	
	public void paint(Graphics g) {
		
		setBackground(Color.WHITE);
		
		Graphics2D g2D = (Graphics2D) g;
		Shape.drawLine(
		0, 		0, 
		x1, 	500, 
		g2D, 	1);
		
		Shape.drawLine(
		500, 	0, 
		0, 		500, 
		g2D, 	1);
		
		//g2D.drawOval(0, 0, 500, 500);
		
		System.out.println("Reprinting");
		try {
			
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			
		}
		x1--;
		repaint();
		
	}
	
	
}
