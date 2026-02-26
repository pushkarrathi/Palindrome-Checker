import java.util.*;

public class PalindromeCheckerApp {
    /**
     MAIN CLASS: UseCase1PalindromeApp

     Use Case 13: Time Implementation

     Description:
     This class demonstrates basic palindrome validation
     using a hardcoded string value.
     At this stage, the application:
     -Stores a predefined string
     -Compares characters from both ends
     -Determines whether the string is a palindrome
     -Displays the result on the console

     @author Pushkar Rathi
     @version 13.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 13.0");
        System.out.println("System initialised successfully.");
        System.out.println("--------------------------------------------");
        System.out.println("Enter string to check if palindrome: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String changed = s.toLowerCase();
        PalindromeStrategy strategy = new StackStrategy();
        PalindromeStrategy strategy1 = new Hardcoded();
        PalindromeStrategy strategy2 = new Reverse();
        PalindromeStrategy strategy3 = new QueueStack();
        int start = 0;
        int end = changed.length() - 1;
        //Stack Time
        long time;
        boolean stack;
        long stacktime;
        {
            time = System.nanoTime();
            stack = strategy.checkPalindrome(changed, start, end);
            stacktime = System.nanoTime() - time;
        }
        //Hardcode Time
        long hardcodetime;
        {
            time = System.nanoTime();
            boolean hardcode = strategy1.checkPalindrome(changed);
            hardcodetime = System.nanoTime() - time;
        }
        //Reverse Time
        long reversetime;
        {
            time = System.nanoTime();
            boolean reverse = strategy2.checkPalindrome(changed);
            reversetime = System.nanoTime() - time;
        }
        //Queue Stack Time
        long queueStackTime;
        {
            time  = System.nanoTime();
            boolean queueStack = strategy3.checkPalindrome(changed);
            queueStackTime = System.nanoTime() - time;
        }
        if (stack)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
        System.out.println("Time taken by hardcoded algorithm: " + hardcodetime);
        System.out.println("Time taken by stack algorithm: " + stacktime);
        System.out.println("Time taken by reversing algorithm: " + reversetime);
        System.out.println("Time taken by Queue Stack algorithm: " + queueStackTime);

    }
}

interface PalindromeStrategy{
    boolean checkPalindrome(String changed, int start, int end);
    boolean checkPalindrome(String s);
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

    @Override
    public boolean checkPalindrome(String s) {
        return false;
    }
}
class Hardcoded implements PalindromeStrategy{
    @Override
    public boolean checkPalindrome(String changed, int start, int end) {
        return false;
    }

    @Override
    public boolean checkPalindrome(String s){
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            if (arr[i] == arr[s.length()-i-1])
                continue;
            else
                return false;
        }
        return true;
    }
}
class Reverse implements PalindromeStrategy{
    @Override
    public boolean checkPalindrome(String changed, int start, int end) {
        return false;
    }

    public boolean checkPalindrome(String s){
        char[] arr;
        arr = s.toCharArray();
        char[] rev = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rev[i] = arr[s.length()-i-1];
        }
        for (int i = 0; i < s.length()/2; i++) {
            if (arr[i] == rev[i])
                continue;
            else
                return false;
        }
        return true;
    }
}
class QueueStack implements PalindromeStrategy{
    @Override
    public boolean checkPalindrome(String changed, int start, int end) {
        return false;
    }

    public boolean checkPalindrome(String s){
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
