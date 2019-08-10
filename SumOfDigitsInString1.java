/*
WAP to calculate the sum of digits in the string. E.g. Fs8g6hu   o/p should be 14
*/
import java.util.Scanner;
public class SumOfDigitsInString1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String st = sc.nextLine();
    int sum = 0;
    for(int i=0;i<st.length();i++)
    {
      char ch = st.charAt(i);
      if(ch>='0'&&ch<='9')
      {
        sum=sum+ch-48;
      }
    }
    System.out.println("The Sum of String is : "+sum);
  }
}
