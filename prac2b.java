import java.util.*;
// Find the greatest number usign Ternary operator 
class prac2b{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a : ");
int a = sc.nextInt();
System.out.print("Enter the value of b : ");
int b = sc.nextInt();

int max = (a > b) ? a : b; // ternary operator 

System.out.print("The greatest value is : " + max);
}//main
}// class

