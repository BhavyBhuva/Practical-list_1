// Bhavy Bhuva
// 220130318038
// Write a Java program that take an integer input (n) and prints out the first n terms of the Fibonacci sequence.
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) 
    {
        Scanner get = new Scanner(System.in);

        int a=0, b=1, i, sum, num;

        System.out.print("Enter the number :: ");
        num = get.nextInt();
        get.close();
        System.out.print(a + " " + b); 
        for(i=2; i<num; i++)
        {
            sum = a+b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
