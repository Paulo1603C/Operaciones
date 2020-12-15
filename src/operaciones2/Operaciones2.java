
package operaciones2;

import java.util.Scanner;


public class Operaciones2 {
    public int suma(int num1, int num2){
        return num1+num2;
    }
    
    public int resta(int num1, int num2 ){
        return num1-num2;
    }
    //////////Metodo Multiplicación
  public int multiplicacion(int num1, int num2 ){
        return num1*num2;
    }
    
    
    public void ifactorial(){
        int factorial = 1;
        int numero;
        Scanner teclado = new Scanner(System.in);
        numero = Integer.valueOf(teclado.nextLine());
        while ( numero!=0) {
        factorial=factorial*numero;
        numero--;
        }
    }
    
    public int raiz(int numero){
        int resultado = (int) (float) Math.sqrt(numero);
        return numero;
    }
    
}
