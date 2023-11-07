package interfazFuncional.constring;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = List.of("Pedro", "Mariana", "Gustavo", "Luisina");

        System.out.println("Impresión de lista:");
        System.out.println(lista);
        System.out.println("");

        ClaseTransformadora claseTransformadora = new ClaseTransformadora();

        System.out.println("Lista ordenada alfabéticamente y en mayúsculas:");
        System.out.println(claseTransformadora.transformarLista(lista));


    }

}
