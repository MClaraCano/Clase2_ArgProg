package interfazFuncional.constring;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClaseTransformadora {

    Transformador transformador = (listaString) -> listaString.stream().sorted(Comparator.naturalOrder()).map((String nombre) -> nombre.toUpperCase()).collect(Collectors.toList());

    public List<String> transformarLista(List<String> lista){
        return transformador.transformar(lista);
    }
}
