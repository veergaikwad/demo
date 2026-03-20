import java.util.*;
//a + b * c % d
class prac1c{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a : ");
float a = sc.nextFloat();
System.out.print("Enter the value of b : ");
float b = sc.nextFloat();
System.out.print("Enter the value of c : ");
float c = sc.nextFloat();
System.out.print("Enter the value of d : ");
float d = sc.nextFloat();

float ans = a + b * c % d ;

System.out.println("Answer of the a + b * c  % d is " + ans);
System.out.println("Answer of the a + b * c  % d is " + (a + b * c % d));


}//main
}// class

