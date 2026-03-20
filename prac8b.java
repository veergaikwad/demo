import java.util.*;

// Write a program in Java to demonstrate exception handling in case of variable/constant divided by zero.

 class DivideByZero {
    int a, b, result;
    void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        a = sc.nextInt();
        System.out.print("Enter the denominator: ");
        b = sc.nextInt();
        try {
            result = a / b;
            System.out.println("The result of " + a + " divided by " + b + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Please provide a non-zero denominator.");
        }
    }
    
}

public class prac8b {
    public static void main(String args[]){
        DivideByZero d = new DivideByZero();
        d.divide();

    }
    
}
