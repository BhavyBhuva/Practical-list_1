// Bhavy Bhuva
// 220130318038
// Write a Java program that takes a temperature input in Celsius and converts it to Fahrenheit. 
import java.util.Scanner;
public class p6 {
    public static void main(String[] args)
    {
        double cels,fahren;
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the temperature in celsius :: ");
        cels = get.nextDouble();
        get.close();

        fahren = 32 + (cels*9/5);
        System.out.println("Temperature in fahrenheit :: " + fahren);
    }
}
