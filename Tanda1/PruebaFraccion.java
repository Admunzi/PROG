/**
 * 
 */
package Tanda1;
import java.util.Scanner;
/**
 * @author xulog
 *
 */
public class PruebaFraccion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    FraccionEjercicio f1=new FraccionEjercicio(20,45);
    FraccionEjercicio f2=new FraccionEjercicio(30,50);
    System.out.println("Fraccion 1: " + f1);
    System.out.println("Fraccion 2: " + f2);
    
    System.out.println("--Modificamos un objeto Fraccion 1--");
    System.out.print("Numerador: ");
    int numerador = s.nextInt();
    f1.setNumerador(numerador);
    System.out.print("Denominador: ");
    int denominador = s.nextInt();
    f1.setDenominador(denominador);
    System.out.println("Fraccion 1: " + f1);
    
    System.out.println("--Resultado de la fraccion--");
    System.out.println("Fraccion 1: " + f1.resultado());
    System.out.println("Fraccion 2: " + f2.resultado());
    
    System.out.println("--Multiplicacion con numero entero--");
    System.out.println("Fraccion 1: " + f1.multiplicar(2));
    
    System.out.println("--Multiplicacion con fraccion--");
    System.out.println("Fraccion 1: " + f1.multiplicar(f2));
    
    System.out.println("--Sumar con fraccion--");
    System.out.println("Fraccion 1: " + f1.sumar(f2));
    
    System.out.println("--Restar con fraccion--");
    System.out.println("Fraccion 1: " + f1.restar(f2));
    
    System.out.println("--Simplificar--");
    f1.simplificar();
    System.out.println("Fraccion 1: " + f1);
    
  }
}
