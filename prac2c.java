import java.util.*;
class prac1c{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the your score  (1 - 10) : ");
int a = sc.nextInt();
switch(a) {
case 10: 
System.out.print("Exellent");
break;

case 9: 
System.out.print("Outstanding");
break;

case 8: 
System.out.print("Very Very Good");
break;

case 7: 
System.out.print(" V Good");
break;

case 6: 
System.out.print("Good");
break;

case 5: 
System.out.print("Average");
break;

default: 
System.out.print("Enterned Wrong Value / Failed");
break;




}// switch

}//main
}// class

