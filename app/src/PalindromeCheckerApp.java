import java.util.*;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 10: Case Insensitive and space ignorant

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     @author Pushkar Rathi
     @version 10.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 10.0");
        System.out.println("System initialised successfully.");
        System.out.println("--------------------------------------------");
        System.out.println("Enter string to check if palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String changed = s.toLowerCase();
        int start = 0;
        int end = changed.length()-1;
        if(checkPalindrome(changed,start,end))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
    public static boolean checkPalindrome(String changed, int start, int end){
        while (start < end){
            if (changed.charAt(start) == ' ') start++;
            if (changed.charAt(end) == ' ') end--;
            if (changed.charAt(start) == changed.charAt(end)) {
                start++;
                end--;
                checkPalindrome(changed,start,end);
            }
            else
                return false;
        }
        return true;
    }
}