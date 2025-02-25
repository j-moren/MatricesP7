// Realice un algoritmo que llene una matriz de 5 * 6 y que imprima cuantos de los números almacenados son ceros, cuántos son positivos y cuantos son negativos

public class MatricesP7 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        int [][] matriz = metodos.solicitarDimension();

        metodos.llenarMatriz(matriz);

        metodos.mostrarMatriz(matriz);

        metodos.contarElementos(matriz); // Llamada al Método para contar Ceros, Positivos y Negativos

    }
}