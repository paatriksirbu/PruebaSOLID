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


}
