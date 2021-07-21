public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String matrix [][] = new String[18][4];

        for (int i = 0; i < 18; i++) {
            String datos = "dato1 dato2 dato3 dato4";
            String vector[] = datos.split(" ");
            // [dato1, dato2, dato3, dato4]

            for (int j = 0; j < vector.length; j++) {
             matrix[i][j]  = vector[j];
            }
        }


        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matrix[i][j]);
                
            }
            System.out.println(" ");
        }


    }
}
