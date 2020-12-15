
package operaciones2;

import java.util.Scanner;


public class Operaciones2 {
    public static void main(String[] args) {
        System.out.println(suma());
        
    }

    public int suma(int num1, int num2){
        return num1+num2;
    }
    
    public int resta(int num1, int num2 ){
        return num1-num2;
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
    
}
