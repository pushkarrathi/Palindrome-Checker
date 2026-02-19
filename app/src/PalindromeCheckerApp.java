import java.util.Scanner;

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
        char[] arr;
        arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            if (arr[start] == arr[end]) {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}