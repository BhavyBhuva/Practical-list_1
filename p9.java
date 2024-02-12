// Bhavy Bhuva
// 220130318038
/*Write a Java program that take an integer/string input and check given input is palindrome or not. */
import java.util.Scanner;
public class p9 {
    public static void main(String[] args)
    {
        int num, rev=0, rem=0,temp;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        num = get.nextInt();
        get.close();
        temp = num;
        while (temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(num == rev)
        {
            System.out.println( num + " is palindrome");
        }
        else
        {
            System.out.println( num + " is not palindrome");
        }
    }
    
}