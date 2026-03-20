import java.util.*;
//Write a program in Java to find the volume of a box using constructor overloading

class Box{
 double length, width, height, volume;
 // default constructor
    Box(){
        length= 0;
        width = 0;
        height=0;
    }
// parameterized constructor with one 
    Box(double side){
        length= width= height=side;
    }
// parameterized constructor with three parameters
    Box(double l, double w, double h){
        length= l;
        width = w;
        height = h;
    }
    void calculateVolume(){
        volume = length * width * height;
        System.out.println("The volume of the box is: " + volume);
    }
}
public class prac8a {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int l, w, h;
        System.out.print("Enter the length of the box: ");
        l = sc.nextInt();
        System.out.print("Enter the width of the box: ");
        w = sc.nextInt();
        System.out.print("Enter the height of the box: ");
        h = sc.nextInt();
        Box box1 = new Box(l, w, h);
        box1.calculateVolume();

        System.out.print("Enter the side of the cube: ");
        double side = sc.nextDouble();
        Box box2 = new Box(side);
        box2.calculateVolume();
    
        System.out.println("Using default constructor:");
        Box box3 = new Box();
        box3.calculateVolume();



    }
}

