
package matrox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author pizzi.gabriele
 */
public class Matrox {


    public static void main(String[] args) throws FileNotFoundException {
                Scanner input = new Scanner(new File("C:\\Users\\pizzi.gabriele\\Documents\\NetBeansProjects\\Matrix\\matrix.txt"));
// pre-read in the number of rows/columns
        int rows = 0;
        int columns = 1;
        
        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        input = new Scanner(new File("C:\\Users\\pizzi.gabriele\\Documents\\NetBeansProjects\\Matrix\\matrix.txt"));

        for (int i = columns-1; i >=0; i--) {
            for (int j = rows-1; j >=0; j--) {
                
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
