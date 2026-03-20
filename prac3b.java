import java.util.*;
// Area and perimerter using the and object	
class Circle{
double area, perimeter, radius;

public void area(){
area = Math.PI * radius * radius;
System.out.println("Area = " + area); 
}
public void perimeter(){
perimeter = 2 * Math.PI * radius;
System.out.println("Perimeter  = " + perimeter); 
}

//public void display(){
//perimeter();
//area();
//}


}


class prac3b{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the radius of the circle : ");

Circle c = new Circle();
c.radius = sc.nextDouble();
//c.display();
c.area();
c.perimeter();




}//main
}// class

