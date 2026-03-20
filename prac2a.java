import java.util.*;
// Find the greatest number between 3
class prac2a{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number 1 : ");
int a = sc.nextInt();

System.out.print("Enter number 2 : ");
int b = sc.nextInt();

System.out.print("Enter number 3 : ");
int c = sc.nextInt();

if(a >= b && a >= c){
System.out.println(a +" is the Greatest Number ");
} else if (b >= a && b >= c){
System.out.println(b +" is the Greatest Number ");
} else {
System.out.println(c +" is the Greatest Number ");

}


}//main
}// class

