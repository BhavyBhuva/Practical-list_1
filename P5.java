// Bhavy Bhuva
// 220130318038
// Write a Java program that takes two integer inputs (a and b) and performs the following operations addition, subtraction, multiplication, division and modulo.
import java.util.Scanner;
public class P5 {
    public static void main(String[] args)
    {
        int a,b;

        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number :: ");
        a = get.nextInt();

        System.out.print("Enter the second number :: ");
        b = get.nextInt();

        get.close();

        System.out.println("First number :: " + a);
        System.out.println("Second number :: " + b);

        System.out.println("Addition of number :: " + (a+b));
        System.out.println("Subtraction of number :: " + (a-b));
        System.out.println("Multiplication of number :: " + (a*b));
        System.out.println("Division of number :: " + (a/b));
        System.out.println("Modulo of number :: " + (a%b));
    }
}
