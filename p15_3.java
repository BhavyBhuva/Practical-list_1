// Bhavy Bhuva
// 220130318038
public class p15_3 {
    public static void main(String[] args){
        int i,j,k;
		for (i = 0; i < 6; i++){
            for (j = 6; j > i; j--){
                System.out.print(" ");
            }
            for (k = 1; k <= i + 1; k++) {
                System.out.print(" *");
            }
        System.out.print("\n");
        }
	}
}
