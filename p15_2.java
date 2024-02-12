// Bhavy Bhuva
// 220130318038
public class p15_2 {
    public static void main(String[] args)
    {
        int i,j,k;
        for (i=0; i<6; i++)
        {
            for (j=1; j<=6-i; j++)
            {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
