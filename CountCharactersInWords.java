// WAP to display how many characters in each words
import java.util.Scanner;
public class CountCharactersInWords{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String st = sc.nextLine();
    int wc = 0, c=0, lc=0;
    for(int i=0;i<st.length();i++)
    {
      /*if(st.charAt(i)==' '||i==st.length()-1)
      {
        System.out.println(wc+" words is "+lc+" character");
        wc++;
        lc=0;
      }
      else
      {
        lc++;
      }
      */
      c=0;
      while(i<st.length()&&st.charAt(i)!=' ')
      {
        c++;
        i++;
      }
      if(c>0)
      {
        wc++;
        System.out.println("The Number of character in your words is : "+wc+"------>"+c);
      }
    }
  }
}
