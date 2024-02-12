// Bhavy Bhuva
// 220130318038
// Write a Java program that declares three integer variables (a, b, c) and compute their sum and average
import java.util.Scanner;
public class p1 {
        public static void main(String args[]) {

            Scanner get = new Scanner(System.in);

            System.out.print("Enter the first number:");
            double a = get.nextInt();

            System.out.print("Enter the second number:");
            double b = get.nextInt();

            System.out.print("Enter the third number:");
            double c = get.nextInt();

            get.close();

            System.out.println("Value is ::"+ a +", "+ b +", "+ c);
            System.out.println("Sum of the number :: "+ (a+b+c));
            System.out.println("Average of the number :: "+((a+b+c)/3));
        }    
}