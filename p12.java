// Bhavy Bhuva
// 220130318038
/*Write a Java program that uses a while loop to iterate over an integer array and computes product of all its elements */
import java.util.Scanner;
public class p12 {
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        
        int size, i, product;
        int[] numbers = new int[100];

        System.out.print("Enter the size of array :: ");
        size = get.nextInt();
        
        i=0;
        while (i<size)
        {
            System.out.print("Enter the " + (i+1) + " elements :: ");
            numbers[i] = get.nextInt();
            i++;
        }
        
        product = 1;
        i=0;
        while (i < size)
        {
            product *= numbers[i];
            i++;
        }
        
        System.out.println("Product of all elements :: " + product);
        
        get.close();
    }
}
