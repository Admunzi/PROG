/**
 * 
 */
package Tanda1;

/**
 * @author xulog
 *
 */
public class TestTiempo {
  public static void main(String[] args) {
    Tiempo t1=new Tiempo(2,10,6);
    Tiempo t2=new Tiempo(1,40,50);
    System.out.println("Tiempo 1: "+t1);
    System.out.println("Tiempo 2: "+t2);
    
    System.out.println("--Sumar y restar otro objeto de la clase Tiempo--");
    System.out.println("Suma: " + t1.sumarObjeto(t2));
    System.out.println("Resta: " + t1.restarObjeto(t2));
    
    System.out.println("--Sumar y restar, se cambia el objeto--");
    int num = 20;
    
    t1.sumarTiempo(num);
    System.out.println("Suma: " + t1);
    t1.restarTiempo(num);
    System.out.println("Resta: " + t1);

  }
}
