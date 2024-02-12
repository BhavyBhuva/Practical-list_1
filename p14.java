// Bhavy Bhuva
// 220130318038
// Write a Java program that uses a switch statement to determine the day of the week based on a given integer input.
import java.util.Scanner;
public class p14 {
    public static void main(String[] args)
    {

        int daynumber;
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the week number between 1 TO 7:: ");
        daynumber = get.nextInt();
        get.close();
        String dayname;
        switch (daynumber)
        {
            case 1:
                dayname = "Sunday";
                break;
            case 2:
                dayname = "Monday";
                break;
            case 3:
                dayname = "Tuesday";
                break;
            case 4:
                dayname = "Wednesday";
                break;
            case 5:
                dayname = "Thursday";
                break;
            case 6:
                dayname = "Friday";
                break;
            case 7:
                dayname = "Saturday";
                break;
            default:
                dayname = "Invalid day number";
                break;
        }
        System.out.println("The day of the week is " + dayname);
    }
}