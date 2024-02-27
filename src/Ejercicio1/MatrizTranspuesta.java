package Ejercicio1;

public class MatrizTranspuesta {

    private int [][] datos;
    public MatrizTranspuesta(int[][] datos) {
        this.datos = datos;
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
