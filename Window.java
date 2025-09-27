import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
	
	Panel mainPanel;
	
	Window(){
		
		mainPanel = new Panel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(mainPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("Fourier Transform");
		
	}
	
}