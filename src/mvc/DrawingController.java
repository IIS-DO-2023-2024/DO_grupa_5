package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;

public class DrawingController {
	
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		/* MVC materijal
		 * 
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		model.add(p);
		frame.repaint();
		//System.out.println(System.currentTimeMillis());
		 * 
		 */
		
		// Composite materijal
		SremBanatBacka vojvodina = new SremBanatBacka();
		
		Point srem = new Point(20, 20, Color.RED);
		Point backa = new Point(30, 20, Color.RED);
		Point banat = new Point(25,12, Color.RED);
		
		vojvodina.add(srem);
		vojvodina.add(backa);
		vojvodina.add(banat);
		
		model.add(vojvodina);
		
		frame.repaint();
	}

}