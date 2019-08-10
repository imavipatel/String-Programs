//WAP in java to check a word is Present in the given string or not if yes then return true.
import java.util.Scanner;
public class WordsPresentInStringOrNot{
public static boolean isWord(String s1, String s2)
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
      {
        if((k==c1.length||c1[k]==' ')&&(i==0||c1[i-1]==' '));
        return true;
      }
  }
  return false;
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s1 = sc.nextLine();
    System.out.println("Enter the Words You want to find : ");
    String s2 = sc.nextLine();
    boolean word = isWord(s1,s2);
    if(word==true)
    {
      System.out.println("Word Present in the given String.");
    }
    else
    {
      System.out.println("Word not present in the given String.");
    }
  }
}
