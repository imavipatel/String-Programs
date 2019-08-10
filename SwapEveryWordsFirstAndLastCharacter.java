//WAP to swap every word first and last character in a sentence.
import java.util.Scanner;
public class SwapEveryWordsFirstAndLastCharacter{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A String : ");
    String st = sc.nextLine();
    char ch[] = st.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
      {
        int k=i;
        while(i<ch.length&&ch[i]!=' ')
        {
          i++;
        }
        char t = ch[k];
        ch[k] = ch[i-1];
        ch[i-1]=t;
      }
    }
    String swap = new String(ch);
    System.out.println("After Swaping Every Words First And Last Character is : "+swap);
  }
}
