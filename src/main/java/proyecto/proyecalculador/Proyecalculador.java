/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyecto.proyecalculador;

/**
 *
 * @author User
 */
public class Proyecalculador {

    public static void main(String[] args) {
        Calculator calculator = new  Calculator(15,10);
        System.out.println("la suma es ...."+calculator.add());
         System.out.println("la resta es ...."+calculator.resta());
          System.out.println("la producto es ...."+calculator.producto());
       if (calculator.y==0)
           System.out.println("No se puede dividir por cero");
       else
          System.out.println("la division es ...."+calculator.division());
    }
}
