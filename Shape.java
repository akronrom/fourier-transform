import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BasicStroke;
import javax.swing.JPanel;

public class Shape {

	public static void drawLine(
		int x1, int y1, 
		int x2, int y2,
		Graphics2D g2D,
		int lineStroke) {
		
		g2D.drawLine(x1, y1, x2, y2);
		g2D.setStroke(new BasicStroke(lineStroke));
		
	}
	
	public static void drawRect(
		int x1, int y1,
		int w1, int h1,
		Graphics2D g2D,
		boolean fillRect) {
			
			if (fillRect) {
				
				g2D.fillRect(
				x1, y1, 
				w1, h1);
				
				return;
				
			}
			
			g2D.drawRect(
			x1, y1, 
			w1, h1);
			
		}


}