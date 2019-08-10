//WAP in java to check how many times a word Present in the given String.
import java.util.Scanner;
public class CountWordPresentInString{
  public static int countSubString(String s1, String s2)
  {
    char c1[] = s1.toCharArray();
    char c2[] = s2.toCharArray();
    int count=0;
    for(int i=0;i<c1.length;i++)
    {
      int j=0,k=i;
      while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
      {
        k++;
        j++;
      }
      if(j==c2.length)
      {
        count++;
        i=k-1;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s1 = sc.nextLine();
    System.out.println("Enter the Words You want to find : ");
    String s2 = sc.nextLine();
    int c = countSubString(s1,s2);
    System.out.println("Your Words Present "+c+" times in the String.");
  }
}
