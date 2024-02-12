// Bhavy Bhuva
// 220130318038
/*rite a Java program that take an integer input (n) and find reverse number of given number. */
import java.util.Scanner;

public class p4 {
    public static void main(String[] args)
    {
        int num,rev=0,r;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        num = get.nextInt();

        while (num != 0)
        {
            r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        get.close();
        System.out.println("Reverse of the number :: " + rev);
    }
}