

    // INICIO DEL CODIGO
    import java.util.Scanner;
    public class reto2 {
        public static void main(String[] args) throws Exception {
            //Definicion de Variables:
            String n_string;
            int columna = 0, cont_excel = 0, cont_math = 0, cont_info = 0, cont_fisica = 0, mayor_prom = 0;
            float suma = 0, sum_math = 0, sum_info = 0, sum_fisica = 0, mejor = 0, alumno = 0;
            float prom_general = 0, prom_excelentes = 0, prom_math = 0, prom_info = 0, prom_fisica = 0, prom_peor = 100;
            float[][] matriz_datos = new float[100][100];
            Scanner ingreso = new Scanner(System.in);
            n_string = ingreso.nextLine();
            float n_datos = Float.parseFloat(n_string);
            //Vector Objetos:
            Persona[] filas_objetos = new Persona[100];
            //Ingreso Datos: Genera Matriz de Datos a partir de las lineas ingresadas por teclado.
            for (int i = 0; i < n_datos; i++){
                String linea = ingreso.nextLine();
                String[] fila = linea.split(" ");
                float nomb = Float.parseFloat(fila[0]);
                float gener = Float.parseFloat(fila[1]);
                float mater = Float.parseFloat(fila[2]);
                float calific = Float.parseFloat(fila[3]);
                filas_objetos[i] = new Persona(nomb, gener, mater, calific);
                int col = fila.length;
                columna = col;
                for (int j = 0; j < columna; j++){
                    matriz_datos[i][j] = Float.parseFloat(fila[j]);     //Matriz de Datos
                }
                suma += matriz_datos[i][3];     // Acumulador para calculo del promedio general
            }
            
            prom_general = suma / n_datos;      //Calculo promedio general
            // Calculo de cuantas calificaciones están por encima del promedio general, 
            // cuantas calificaciones son excelentes, las sumas para calcular promedios 
            // por materias, y mejor estudiante en matematicas.
            for (int i = 0; i < n_datos; i++){
                if (matriz_datos[i][3] > prom_general) {            // Mayores al Promedio General
                    mayor_prom += 1;
                }
                filas_objetos[i].contarExcelentes();                // Cuantas son Excelentes
                    if (filas_objetos[i].getcont_excelentes() ==1) {
                        cont_excel += 1;
                    }
                
                if (matriz_datos[i][2] == 1){                       // Calculo suma para promedio matematicas
                    sum_math += matriz_datos[i][3];
                    cont_math += 1;
                }
                if (matriz_datos[i][2] == 2){                       // Calculo suma para promedio informatica
                    sum_info += matriz_datos[i][3];
                    cont_info += 1;
                }
                if (matriz_datos[i][2] == 3){                       // Calculo suma para promedio fisica
                    sum_fisica += matriz_datos[i][3];
                    cont_fisica += 1;
                }
                if (matriz_datos[i][2] == 1) {                       // Mejor estudiante en Matematica
                    if (mejor < matriz_datos[i][3]) {
                        mejor = matriz_datos[i][3];
                        alumno = matriz_datos[i][0];
                    }
                }
            }
            prom_excelentes = cont_excel / n_datos;                       // Calculo del porcentaje de promedios excelentes
            // Calculo de los promedios por materias: Se usan las sumas por materias calculadas anteriormente.
            if (cont_math == 0) {
                prom_math = 0;
            } else {
                prom_math = sum_math / cont_math;
            }
            if (cont_info == 0) {
                prom_info = 0;
            } else {
                prom_info = sum_info / cont_info;
            }
            if (cont_fisica == 0) {
                prom_fisica = 0;
            } else {
                prom_fisica = sum_fisica / cont_fisica;
            }
            
            // Imprime en pantalla la cantidad de calificaciones mayores al promedio general.
            System.out.println(mayor_prom);
            // Imprime en pantalla el porcentaje de las calificaciones excelentes, con formato de dos decimales.
            System.out.printf("%.2f\n", prom_excelentes);
            
            // Calculo materia con Peor desempeño: Comparación promedios por materia para determinar el menor.
            if (prom_peor > prom_math){
                prom_peor = prom_math;
            }
            if (prom_peor > prom_info){
                prom_peor = prom_info;
            }
            if (prom_peor > prom_fisica) {
                prom_peor = prom_fisica;
            }
            
            // Imprime en pantalla la materia correspondiente al codigo de materia con peor desempeño.
            if (prom_peor == prom_math){
                System.out.println("matematicas");
            } else if (prom_peor == prom_info){
                System.out.println("informatica");
            } else if (prom_peor == prom_fisica){
                System.out.println("fisica");
            }
            // Imprime en pantalla el nombre del estudiante con Mejor desempeño en matematicas.
            if (alumno == 1) {
                System.out.println("armando");
            }
            if (alumno == 2) {
                System.out.println("nicolas");
            }
            if (alumno == 3) {
                System.out.println("daniel");
            }
            if (alumno == 4) {
                System.out.println("maria");
            }
            if (alumno == 5) {
                System.out.println("marcela");
            }
            if (alumno == 6) {
                System.out.println("alexandra");
            }
            //FASE 2 - Nuevas lineas RETO 2:
            ingreso.close();
            // FIN......  ALELUYA!!!! Mi Señor me ayudó a entender este lenguaje!!!!
        }  
    }

