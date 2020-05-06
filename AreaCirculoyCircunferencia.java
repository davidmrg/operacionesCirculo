/*
El programa recibe como dato el radio de un circulo.
Debe imprimir el área, el diámetro y la Long de circunferencia

Area = Pi * r^2
LongCircunferencia = 2 * Pi * r
diametro = 2r

 */
package areacirculoycircunferencia;

import java.util.Scanner;

/**
 *
 * @author David Ramirez
 */
public class AreaCirculoyCircunferencia {

    
    public static void main(String[] args) {
        
        //Implementamos clase Scanner, la inicializamos con el objeto sc.
        Scanner sc = new Scanner(System.in);
        
        double r, a, l, d;
        System.out.println("Ingrese el radio del circulo: ");
        r = sc.nextDouble();
        
        a = Math.PI * Math.pow(r, 2);
        l = 2 * Math.PI * r;
        d = 2 * r;
        
        System.out.println("El área del círculo es: " + a + ". La longitud de circunferencia es: " + l + ". El diametro es: " + d);
        
    }
    
}
