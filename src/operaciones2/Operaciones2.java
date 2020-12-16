package operaciones2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operaciones2 {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    //////////Metodo Multiplicación
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public int ifactorial() {
        int factorial = 1;
        int numero;
        numero = Integer.valueOf(JOptionPane.showInputDialog("Ingrese un numero"));
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
        
    }

    public int raiz(int numero) {
        int resultado = (int) (float) Math.sqrt(numero);
        return numero;
    }

    public double division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
<<<<<<< .merge_file_a09028

=======
}
>>>>>>> .merge_file_a07300
