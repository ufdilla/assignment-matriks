
/**
 * tiket3
 */
public class tiket3 
{

    public static void main(String[] args) 
    {
        int[][] data = { { 0, 800, 1100, 1300 }, { 800, 0, 500, 700 }, { 1000, 400, 0, 0 }, { 1200, 600, 400, 0 } };

        label2 :
        for (int i = 0; i < data.length; i++) //nested repetition
        { 
            label1:
            for (int j = 0; j < data[0].length; j++) 
            {
                if (i == j)
                continue level1;
                
                
                else if (data[i][j] == 0)
                continue level2;

                else
                System.out.print(data[i][j] + " ");
            
            }
            System.out.println();
        }
    }   
}