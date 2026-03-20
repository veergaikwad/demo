import java.util.*; 
// wirte a program to find the sum and average of 3 with the usign super keyword
class Number{
    int a, b, c;
    void getNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();
    }

}
class calculate extends Number{
    int sum;
    float average;
    void calculate(){
        super.getNumbers();
        sum = a + b + c;
        average = sum / 3.0f;
        System.out.println("The sum of the three numbers is: " + sum);
        System.out.println("The average of the three numbers is: " + average);
    }
}

public class prac7b {
    public static void main(String[] args) {
        calculate calc = new calculate();
        calc.calculate();
    }
}