/*
WAP to calculate the sum of digits in the string. E.g. Fs8g6hu   o/p should be 14
*/
import java.util.Scanner;
public class SumOfDigitInString{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String st = sc.nextLine();
    char ch[] = st.toCharArray();
    int sum = 0;
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>='1'&&ch[i]<='9')
      {
        sum=sum+ch[i]-48;
      }
    }
    System.out.println("The Sum of String is : "+sum);
  }
}
