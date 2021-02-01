/**
 * 
 */
package Tanda1;

/**
 * @author xulog
 *
 */
public class PruebaFecha {
  public static void main(String[] args) {
    Fecha f1 = new Fecha(20, 10, 2020);
    Fecha f2 = new Fecha(15, 5, 1980);
    
    System.out.println("----COMPROBAMOS FECHA----");
    System.out.println("Fecha 1 " + f1.esCorrecto());
    
    System.out.println("----SUMAMOS DIAS A FECHA----");
    f1.sumarDia(4);
    System.out.println("Fecha 1 " + f1);
    
    System.out.println("----RESTAR DIAS A FECHA----");
    f1.restarDia(4);
    System.out.println("Fecha 1 " + f1);
    
    /*
    System.out.println("----COMPARAMOS FECHAS----");
    f1.restarDia(4);
    System.out.println("Fecha 1 con Fecha 2" + f1.compareTo(f2));
    */
  }
}
