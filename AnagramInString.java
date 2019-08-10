//WAP to check the both String is anagram or not.
import java.util.*;
public class AnagramInString{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first String : ");
    String a = sc.nextLine();
    System.out.println("Enter the Second String : ");
    String b = sc.nextLine();
    boolean anagram = anagramInString(a,b);
    if(anagram==true)
    {
      System.out.println("String is Anagram");
    }
    else
    System.out.println("String is not Anagram");
  }
  public static boolean anagramInString(String a, String b)
  {
    if(a == null || b==null || a.length()!=b.length())
    {
      return false;
    }
    a = a.toLowerCase();
    b = b.toLowerCase();
    char[] c = a.toCharArray();
    char[] d = b.toCharArray();
    Arrays.sort(c);
    Arrays.sort(d);
    String A = new String(c);
    String B = new String(d);
    if(A.equals(B))
    {
      return true;
    }
    return false;
  }
}
