/**
 * tiket2
 */
public class tiket2 {

    public static void main(String[] args) {
        
        int data[][] = { { 0, 800, 1100, 1300 }, { 800, 0, 500, 700 }, { 1000, 0 , 0, 500 }, { 1200, 600, 400, 0 } };

        for (int i = 0; i < data.length; i++) { //nested repetition
            for (int j = 0; j < data[0].length; j++) {
                if (i == j)
                     continue; 
                
                else if (data[i][j] == 0)
                    continue;

                else
                    System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}