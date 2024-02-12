// Bhavy Bhuva
// 220130318038
// Write a Java program that declares two double variables (radius, area) and compute the area of a circle.
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        double radius;
        double area;
        System.out.println("Enter the radius of circle :: ");
        radius = get.nextInt();
        get.close();

        area = Math.PI * radius * radius;

        System.out.println("The area of the circle ::" + area);
    }    
}