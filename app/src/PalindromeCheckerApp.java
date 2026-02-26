import java.util.*;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 12: Interface Strategy

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     @author Pushkar Rathi
     @version 12.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 12.0");
        System.out.println("System initialised successfully.");
        System.out.println("--------------------------------------------");
        System.out.println("Enter string to check if palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String changed = s.toLowerCase();
        PalindromeStrategy strategy = new StackStrategy();
        int start = 0;
        int end = changed.length()-1;
        if(strategy.checkPalindrome(changed,start,end))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is not a palindrome");
    }
}

interface PalindromeStrategy{
    boolean checkPalindrome(String changed, int start, int end);
}

class StackStrategy implements PalindromeStrategy{
    @Override
    public boolean checkPalindrome(String changed, int start, int end){
        Stack<Character> stc = new Stack<>();
        for (char c:changed.toCharArray()) stc.push(c);
        while (start < end){
            if (changed.charAt(start) == stc.pop()) {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}