//WAP in java to check sub string is present or not.
import java.util.Scanner;
public class WordPresentInStringOrNot{
public static boolean isSubString(String s1, String s2)
  {
    char c1[] = s1.toCharArray();
    char c2[] = s2.toCharArray();
    for(int i=0;i<c1.length;i++)
    {
      int j=0,k=i;
      while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
      {
        k++;
        j++;
      }
      if(j==c2.length)
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s1 = sc.nextLine();
    System.out.println("Enter the Words You want to find : ");
    String s2 = sc.nextLine();
    boolean string = isSubString(s1,s2);
    if(string==true)
    {
      System.out.println("Sub String is Present in the String");
    }
    else
    {
      System.out.println("Sub String is not present in the String.");
    }
  }
}
