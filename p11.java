// Bhavy Bhuva
// 220130318038
/*Write a Java program that uses a for loop to iterate over an integer array and computes the sum of all its elements. */
import java.util.Scanner;
public class p11 {
    public static void main(String[] args) 
    {
        int[] num = new int[10];
        int sum = 0, i, size;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size of array :: ");
        size = get.nextInt();
        // get.close();
        
        for(i=0; i<size; i++)
        {
            System.out.print("Enter the " + (i+1) + " element :: ");
            num[i] = get.nextInt();
        }
        for (i=0; i<size; i++) 
        {
            sum += num[i];
        }
        System.out.println("The sum of the elements in the array is :: " + sum);
        get.close();
    }   
}