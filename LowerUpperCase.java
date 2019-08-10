import java.util.Scanner;
public class LowerUpperCase{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String st = sc.nextLine();
    String res = "";
    for(int i=0;i<st.length();i++)
    {
      char ch = st.charAt(i);
      if(ch>='A'&&ch<='Z')
      ch = (char)(ch+32);
      else if(ch>='a'&&ch<='z')
      ch = (char)(ch-32);
      res = res+ch;
    }
    System.out.println("The Converted String is : "+res);
  }
}
