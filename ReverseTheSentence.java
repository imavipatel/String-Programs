//WAP to reverse the sentence.
import java.util.Scanner;
public class ReverseTheSentence{
  public static String reverseTheSentence(String st){
    char ch[] = st.toCharArray();
    String rs = "";
    for(int i=ch.length-1;i>=0;i--)
    {
      int k = i;
      while(i>=0&&ch[i]!=' ')
      {
        i--;
      }
      int j = i+1;
      while(j<=k)
      {
        rs = rs+ch[j];
        j++;
      }
      if(i>=0)
      rs=rs+ch[i];
    }
    return rs;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A String : ");
    String st = sc.nextLine();
    String rs = reverseTheSentence(st);
    System.out.println("After reversing your sentence is : "+rs);
  }
}
