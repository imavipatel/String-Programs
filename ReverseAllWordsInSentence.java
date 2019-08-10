//WAP to reverse all words in a senetence.
import java.util.Scanner;
public class ReverseAllWordsInSentence{
  public static String reverseAllWordsInSentence(String st){
    char ch[] = st.toCharArray();
    String rs = "";
    for(int i=0;i<ch.length;i++)
    {
      int k = i;
      while(i<ch.length&&ch[i]!=' ')
      {
        i++;
      }
      int j = i-1;
      while(j>=k)
      {
        rs = rs+ch[j];
        j--;
      }
      if(i<ch.length)
      rs=rs+ch[i];
    }
    return rs;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A String : ");
    String st = sc.nextLine();
    String rs = reverseAllWordsInSentence(st);
    System.out.println("After reversing all words in your sentence is : "+rs);
  }
}
