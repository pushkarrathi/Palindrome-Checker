import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 2: Reverse Palindrome Validation

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     This use case introduces fundamental comparison logic
     before using advanced data structures.

     @author Pushkar Rathi
     @version 3.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 3.0");
        System.out.println("System initialised successfully.");
        System.out.println("--------------------------------------------");
        System.out.println("Enter string to check if palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(checkPalindrome(s))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
    public static boolean checkPalindrome(String s){
        Queue<Character> que = new LinkedList<>();
        Stack<Character> stc = new Stack<>();
        for (char c: s.toCharArray()) {
            stc.push(c);
            que.add(c);
        }
        for (char c: s.toCharArray()){
            if (que.remove() == stc.pop())
                continue;
            else
                return false;
        }
        return true;
    }
}