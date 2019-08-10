//WAP to check string is palindrome or not.
import java.util.Scanner;
public class StringIsPalindromeOrNot{
  public static boolean isPalindrome(String st){
    int i=0;
    while(i<=st.length()/2)
    {
      if(st.charAt(i)!=st.charAt(st.length()-1-i))
      return false;
      i++;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String to check it is Palindrome or not.");
    String st = sc.nextLine();
    boolean palindrome = isPalindrome(st);
    if(palindrome==true)
    {
      System.out.println("Is is a Palindrome String.");
    }
    else
    {
      System.out.println("It is not a Palindrome String.");
    }
  }
}
