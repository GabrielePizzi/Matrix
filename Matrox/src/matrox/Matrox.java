
package matrox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author pizzi.gabriele
 */
public class Matrox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
                Scanner input = new Scanner(new File("matrix.txt"));
// pre-read in the number of rows/columns
        int rows = 0;
        int columns = 1;
        
        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        input = new Scanner(new File("matrix.txt"));

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                
                if (input.hasNextInt()) {
                    a[i][j] = input.nextInt();
                }
            }
        }
        for (int i = rows-1; i >=0; i--) {
            for (int j = columns-1; j >=0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
    //}
    
//}
