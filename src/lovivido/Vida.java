package lovivido;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene los metodos y parametros necesarios para llevar a cabo el programa.
 * @author femio23
 * 
 */
public class Vida {
    String n;
    String e;
    int m;
    int d;
    int h;
    int a;
/**
 *
 * @return Asigna mediante los JOptionPane los valores de nombre y edad,devolviendo el valor de edad como Integer.
 */
    public int asignar() {
        n = JOptionPane.showInputDialog("Escriba su nombre: ");
        e = JOptionPane.showInputDialog("Escriba su edad: ");

        a = Integer.parseInt(e);
        return a;
    }
/**
 * 
 * @param a Se recive la edad como Integer para realizar los calculos y se imprime el resultado de los mismos. 
 */
    public void calculos(int a) {
        m = (a * 12);
        d = (a * 365);
        h = (d * 24);
        
    }
    /**
     * Imprime mediante JOptionPane el resultado de los calculos.
     */
    
    public void resultados(){
        JOptionPane.showMessageDialog(null, "Meses: " + m, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + d, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + h, "Numero de horas vividas de " + n, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
