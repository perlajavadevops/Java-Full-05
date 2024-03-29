import java.util.*;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("drawing Triangle");
	}
}

public class WildCardGenericDemo {

	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());

		drawShapes(list1);
		drawShapes(list2);
		
		List<Triangle> triList = new ArrayList<Triangle>();
		triList.add(new Triangle());
		
		drawShapes(triList);
		
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(232);
		
		//drawShapes(list4);


	}

}
