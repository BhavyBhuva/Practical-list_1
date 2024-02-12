// Bhavy Bhuva
// 220130318038
/*Write a Java program that take an integer input (n) and check given number is prime or not */
import java.util.Scanner;
public class p8 {
    public static void main(String[] args) 
    {
        int num, i;
        boolean isPrime = true;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        num = get.nextInt();
        get.close();
        for(i=2; i<num/2; ++i)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num + " is prime number"); 
        }
        else
        {
            System.out.println(num + " is not prime number"); 
        }  
    }
}