import java.util.Scanner;

public class Metodos {

    public int[][] solicitarDimension() {
        
        Scanner sc = new Scanner (System.in);// Crear un objeto Scanner para leer la entrada

        System.out.println("Ingrese el Número de Filas de la Matriz: ");// Solicitar el Número de Filas
        int i = sc.nextInt(); // Lee el Número de las filas

        System.out.println("Ingrese el Número de las Solumnas de la Matriz: ");// Solicitar el Número de las Columnas 
        int j = sc.nextInt(); // Lee el Número de las Columnas

        int [][] matriz = new int [i][j];

        sc.close();

        return matriz;
    }
}