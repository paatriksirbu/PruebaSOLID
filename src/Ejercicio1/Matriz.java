package Ejercicio1;

public class Matriz {

    private int [][] datos;


    public Matriz(int[][] datos) {
        this.datos = datos;
    }

    public void imprimir(){
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public Matriz transpuesta(){
        int filas = datos.length;
        int columnas = datos.length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = datos[i][j];
            }
        }
        return new Matriz(transpuesta);
    }
}
