/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.*;
public class Operacioness {
    public static void main(String[] args) {
        Suma suma = new Suma ();
        Multiplicacion multiplicacion = new Multiplicacion() ;
        Resta resta = new Resta ();
      Scanner entrada = new Scanner (System.in);
      
        System.out.println("Ingrese el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 =entrada.nextInt();
        System.out.println("La suma de los dos numeros es: " + suma.operacion(num1, num2));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 =entrada.nextInt();
        System.out.println("La multiplicacion de los dos numero es: "+ multiplicacion.operacion(num1, num2));
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 =entrada.nextInt();
        System.out.println("La resta de los dos numero es: " +resta.operacion(num1, num2) );
        
    }
     
       
        
}
