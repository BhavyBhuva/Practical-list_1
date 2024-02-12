// Bhavy Bhuva
// 220130318038
/*Write a Java program that uses a do-while loop to iterate over an integer array and compute the maximum value */
import java.util.Scanner;

public class p13 {
    public static void main(String[] args)
    {
        int size, i=0, max, j;
        int[] numbers = new int[100];

        Scanner get1 = new Scanner(System.in);

        System.out.print("Enter the size of elements of array :: ");
        size = get1.nextInt();
   
        do
        {
            System.out.print("Enter the " + (i+1) + "elements :: ");
            numbers[i] = get1.nextInt();
            i++;
        } while (i < size);
        
        max = numbers[0];
        for (j=1; j<size; j++)
        {
            if (numbers[j] > max)
            {
                max = numbers[j];
            }
        }
        
        System.out.println("Maximum value is :: " + max);

    }
}