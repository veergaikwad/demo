import java.util.*;
// pallendrome using /10 and %10
class Palindrome{
    String str;
    void gS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();

    }
    void checkPalinDrome(){
        gS();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        
    }


}


public class prac9b {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.checkPalinDrome();
    }
    
}
