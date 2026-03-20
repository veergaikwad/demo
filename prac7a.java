import java.util.Scanner;

interface Area {
    void calculateArea();
}
class Circle implements Area {
    	double radius, area;
    	public void calculateArea() {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the radius of the circle: ");
        	radius = sc.nextDouble();
        	area = MATH.PI * radius * radius;
        	System.out.println("Area of the Circle = " + area);
    	}
}
public class prac7a {
    	public static void main(String[] args) {
        	Circle c = new Circle();
        	c.calculateArea();
    	}
}