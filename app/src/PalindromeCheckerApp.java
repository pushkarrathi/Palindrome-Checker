import java.util.*;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 9: Recursive comparison

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     @author Pushkar Rathi
     @version 9.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 9.0");
        System.out.println("System initialised successfully.");
        System.out.println("--------------------------------------------");
        System.out.println("Enter string to check if palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0;
        int end = s.length();
        if(checkPalindrome(s,start,end))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
    public static boolean checkPalindrome(String s, int start, int end){
        while (start < end){
            if (s.charAt(start) == s.charAt(end-1)) {
                start++;
                end--;
                checkPalindrome(s,start,end);
            }
            else
                return false;
        }
        return true;
    }
}