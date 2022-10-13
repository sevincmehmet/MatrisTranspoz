import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int sayac = 0;

        int[][] matris = {
                {2, 3, 4} ,
                {6, 5, 4}
        };

        int[][] transpoz = new int[3][2];

        for (int n = 0; n < matris.length; n++) {
            for (int m = 0;m < transpoz.length ; m++) {
                    transpoz[m][n] = matris[n][m];
            }
        }
        System.out.println("Matris :");
        for (int i = 0; i < matris.length ; i++) {

            for (int j = 0; j < transpoz.length ; j++) {
                if (i==0){
                    System.out.print(matris[i][j] + " ");
                }
            }
            if (i==1){
                System.out.println();
                for (int j = 0; j < transpoz.length; j++) {

                    System.out.print(matris[i][j] + " ");
                }
            }

        }

        System.out.println("\nTranspoz : ");
        for (int i = 0; i < transpoz.length ; i++) {

            for (int j = 0; j < matris.length ; j++) {
                if (i==0){
                    System.out.print(transpoz[i][j] + " ");
                }
            }
            if (i==1){
                System.out.println();
                for (int j = 0; j < matris.length; j++) {

                    System.out.print(transpoz[i][j] + " ");
                }
            }
            if (i == 2){
                System.out.println();
                for (int j = 0; j < matris.length; j++) {

                    System.out.print(transpoz[i][j] + " ");
                }
            }

        }
    }
}
