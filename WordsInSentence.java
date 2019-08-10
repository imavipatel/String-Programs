// WAP to count how many words in your sentence.

 import java.util.Scanner;
 public class WordsInSentence{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : ");
     String st = sc.nextLine();
     char ch[] = st.toCharArray();
     int wc = 0;
     for(int i=0;i<ch.length;i++)
     {
       if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
       wc++;
     }
     System.out.println("Number of words in your sentence : "+wc);
   }
 }
