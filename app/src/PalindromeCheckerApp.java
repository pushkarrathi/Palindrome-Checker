import java.util.*;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 8: LinkedList based traversal

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     @author Pushkar Rathi
     @version 8.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 8.0");
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
        LinkedList<Character> list = new LinkedList<>();
        for (char c: s.toCharArray()) {
            list.add(c);
        }
        while (list.size() > 1){
            if (list.removeFirst() == list.removeLast())
                continue;
            else
                return false;
        }
        return true;
    }
}