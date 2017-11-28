# assignment-matriks

public class tiket {
    public static void main(String[] args) {
    
        int data[][] = 
        {
            {0, 800, 1100, 1300}, {800, 0, 500, 700}, {1000, 400, 0, 500}, {1200, 600, 400, 0}
        };

        int search = 0;
    
        // String[] dataStr1 = {"Medan", "Jakarta", "Semarang", "Denpasar"};
        // String jeda = " ";
        // String.join(jeda, dataStr1);
        // String[][] dataStr2 =
        // {
        //     {"Medan"},{"Jakarta"}, {"Semarang"}, {"Denpasar"}
        // };

        // String[][] data = 
        // {
        //     // { "\t", "Medan", "Jakarta", "Semarang", "Denpasar" },
        //     { "Medan", "\t", "800", "1100", "1300" }, 
        //     { "Jakarta", "800", "\t", "500", "700" }, 
        //     {"Semarang", "1000", "400", "\t", "500" }, 
        //     {"Denpasar", "1200", "600", "400", "\t" }
        // };

        // Arrays.stream(dataStr1).forEach(System.out::println);
            // System.out.println(Arrays.toString(dataStr1));

        for (int i = 0; i < data.length; i++) { //nested repetition
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == search){
                   repl = String.valueOf(search);
                }
                else
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
