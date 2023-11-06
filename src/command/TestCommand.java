package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.BLACK);
		Point p3 = new Point(30, 30, Color.RED);
		Point p4 = new Point(40, 40, Color.BLACK);
		
		DrawingModel model = new DrawingModel();
		
		// Testiranje dodavanja tacke
		AddPointCmd addPointCmd = new AddPointCmd(p1, model);
		
		addPointCmd.execute();
		System.out.println(model.getShapes().size()); // ---> 1
		
		addPointCmd.unexecute(); 
		System.out.println(model.getShapes().size()); // ---> 0
		
		addPointCmd.execute();
		System.out.println(model.getShapes().size()); // ---> 1
		
		
		// Testiranja brisanja tacke
		RemovePointCmd removePointCmd = new RemovePointCmd(p1, model);
		
		removePointCmd.execute();
		System.out.println(model.getShapes().size()); // ---> 0
		
		removePointCmd.unexecute();
		System.out.println(model.getShapes().size()); // ---> 1
		
		
		// Testiranje izmene tacke
		UpdatePointCmd updatePointcmd = new UpdatePointCmd(p1, p2);
		
		updatePointcmd.execute();
		System.out.println(p1); // ---> 20, 20
		
		updatePointcmd.unexecute();
		System.out.println(p1); // ---> 20, 20
		
		// Testiranje linije
		Line line1 = new Line(p1, p2, Color.RED);
		Line line2 = new Line(p3, p4, Color.RED);
		AddLineCmd addLineCmd = new AddLineCmd(line1, model);
		
		addLineCmd.execute();
		System.out.println(model.getShapes().size()); // ---> 2

		addLineCmd.unexecute();
		System.out.println(model.getShapes().size()); // ---> 1
		
		UpdateLineCmd updateLineCmd = new UpdateLineCmd(line1, line2);
		
		updateLineCmd.execute();
		System.out.println(line1); // ---> 30,30 - 40,40
		p3.setX(100);
		System.out.println(line1); // ---> 30,30 - 40,40 | pre izmene: 100,30 - 40,40
		

	}

}
