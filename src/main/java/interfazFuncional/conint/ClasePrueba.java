package interfazFuncional.conint;

public class ClasePrueba {

    //no implementamos interfaz Operacion,
    // si no que creamos un objeto de tipo interfaz

    Operacion sumar = (x, y) -> x + y;
    Operacion restar = (x,y) -> x-y;

    public int sumarConInt(int unNumero, int otroNumero){
        return sumar.operar(unNumero, otroNumero);
    }

    public int restarConInt(int unNumero, int otroNumero){
        return restar.operar(unNumero, otroNumero);
    }
}
