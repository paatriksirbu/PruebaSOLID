package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    @org.junit.jupiter.api.Test
    void imprimir() {
        Matriz m = new Matriz(new int[][]{{1,2},{3, 4}});
        m.imprimir();
    }


    @org.junit.jupiter.api.Test
    void transpuesta() {
        Matriz m = new Matriz(new int[][]{{1,2},{3, 4}});
        Matriz t = m.transpuesta();
        t.imprimir();
    }



}