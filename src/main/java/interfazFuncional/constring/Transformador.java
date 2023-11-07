package interfazFuncional.constring;

import java.util.List;

@FunctionalInterface
public interface Transformador {
    List<String> transformar(List<String> lista);
}
