/*
WAP to convert every word first character to small and remaining characters to capital.
*/
import java.util.Scanner;
public class FirstCharacterSmall{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String in Upper Case  : ");
    String st = sc.nextLine();
    char ch[] = st.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
        //if((i==0&&st.charAt(i)!=' ')||(st.charAt(i)!=' '&&st.charAt(i-1)==' '))
        {
        if(ch[i]>='A'&&ch[i]<='Z')

        {
          ch[i] = (char)(ch[i]+32);
        }
        else if(ch[i]>='a'&&ch[i]<='z')
        {
          ch[i] = (char)(ch[i]-32);
        }
      }
    }
    String res = new String(ch);
    System.out.println("The Resultant String is : "+res);
  }
}
