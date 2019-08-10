import java.util.Scanner;
public class LowerUpperCase1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Lower Case String : ");
    String st = sc.nextLine();
    char ch[] = st.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>=65&&ch[i]<=90)
      {
        ch[i] = (char)(ch[i]+32);
      }
      else if(ch[i]>=97&&ch[i]<=122)
      {
        ch[i] = (char)(ch[i]-32);
      }
    }
    String res = new String(ch);
    System.out.println("The Converted String is : "+res);
  }
}
