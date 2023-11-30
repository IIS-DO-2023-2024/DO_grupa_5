package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		//--- Testiranje shallow copy izrade prototipa (1. način) ----
		LineShallow l1 = new LineShallow(p1, p2, Color.BLACK);
		LineShallow l2 = l1.clone();
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.getStartPoint().setX(1000);
		System.out.println(l1); //---> 1000, 10 | 20, 20
		System.out.println(l2); //---> 1000, 10 | 20, 20
		
		
		//--- Testiranje deep copy izrade prototipa (2. način) ----
		Point p3 = new Point(40, 40, Color.BLACK);
		Point p4 = new Point(50, 50, Color.BLACK);
		
		LineDeep l3 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep l4 = l3.clone();
		
		System.out.println("---------------");
		l3.getStartPoint().setX(1000);
		
		System.out.println(l3); //---> 1000, 40 | 50, 50
		System.out.println(l4); //---> 40, 40 | 50, 50

	}

}
