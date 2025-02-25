import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Metodos {

    public int[][] solicitarDimension() {
        
        Scanner sc = new Scanner (System.in);// Crear un objeto Scanner para leer la entrada

        System.out.println("Ingrese el Número de Filas de la Matriz: ");// Solicitar el Número de Filas
        int i = sc.nextInt(); // Lee el Número de las filas

        System.out.println("Ingrese el Número de las Solumnas de la Matriz: ");// Solicitar el Número de las Columnas 
        int j = sc.nextInt(); // Lee el Número de las Columnas

        int [][] matriz = new int [i][j];// Crear la Matriz

        sc.close();

        return matriz;// Retornar la Matriz
    }
    public void llenarMatriz (int[][] matriz) {
        Random rand = new Random();// Crear objeto Random para Llenar Valores Aleatorios

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = rand.nextInt(201) - 100;// Generar Números Aleatorios entre -100 a 100
            }
        }
    }
    public void mostrarMatriz (int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");// Imprimir cada Elemento con Tabulación para alinear
            }
            System.out.println();// Nueva línea después de cada fila
        }
    }
    public void contarElementos (int[][] matriz) {
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    ceros++;
                } else if (matriz[i][j] > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }
        }
    System.out.println("Cantidad de ceros: " + ceros);
    System.out.println("Cantidad de números positivos: " + positivos);
    System.out.println("Cantidad de números negativos: " + negativos);
    }
    
}