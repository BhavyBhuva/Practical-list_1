// Bhavy Bhuva
// 220130318038
/*Write a Java program that take an integer input (n) and check given input is Armstrong or not */
import java.util.Scanner;
public class p10 {
    public static void main(String[] args)
    {
        int num, rem, temp,arm=0;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of three digit :: ");
        num = get.nextInt();
        get.close();
        temp = num;
        while(temp>0)
        {
            rem = temp % 10;
            arm = arm + (rem * rem * rem);
            temp = temp / 10;
        }
        if(num == arm)
        {
            System.out.println(num + " is armstrong number");
        }
        else
        {
            System.out.println(num + " is not armstrong number");
        }
    }
    
}