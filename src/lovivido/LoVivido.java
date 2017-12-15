/*
 * Examen Refactorizacion
 * 
 */
package lovivido;
/**
 * Clase principal.
 * @author femio23
 */

public class LoVivido {
    /**
     * El main principalmente se encarga de ejecutar los metodos incluidos en la clase Vida.
     * @param args 
     */

    public static void main(String[] args) {
        Vida v1 = new Vida();
        int v = v1.asignar();
        v1.calculos(v);
        v1.resultados();
    }

}
