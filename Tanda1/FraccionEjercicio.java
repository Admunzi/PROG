/**
 * 
 */
package Tanda1;


/**
 * 
 * 2. Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 * 
 * Contruir un objeto Fraccion pasándole el numerador y el denominador.
 * Obtener la fracción como cadena de caracteres.
 * Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * Obtener resultado de la fracción (número real).
 * Multiplicar la fracción por un número entero (el resultado es otro objeto fracción).
 * Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
 * Simplificar la fracción (cambia el objeto actual).
 * @author xulog
 *
 */
public class FraccionEjercicio {
  
  // Atributos
  
  private int numerador;
  private int denominador;
  
  //comportamiento
  
  /**
   * @param numerador
   * @param denominador
   */
  public FraccionEjercicio(int numerador, int denominador) {
    this.numerador = numerador;
    this.setDenominador(denominador);
  }
  
  //getters, setters y toString()
  
  /**
   * @return the numerador
   */
  public int getNumerador() {
    return numerador;
  }

  /**
   * @param numerador the numerador to set
   */
  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  /**
   * @return the denominador
   */
  public int getDenominador() {
    return denominador;
  }

  /**
   * @param denominador the denominador to set
   */
  public void setDenominador(int denominador) {
    this.denominador = denominador;
    
    // si es 0 salta un aviso
    
    if(denominador == 0) {
      System.out.println("Que sepas que no puedes dividir entre 0");
    }
  }

  @Override
  public String toString() {
    return this.numerador + "/" + this.denominador;
  }

  public double resultado(){
    return (double) this.numerador / this.denominador;
  }
  
  // Multiplicamos por entero
  public FraccionEjercicio multiplicar(int n) {
    return new FraccionEjercicio(this.numerador * n, this.denominador);
  }
  
  // Multiplicamos,restamos y sumamos por fracciones
  public FraccionEjercicio multiplicar(FraccionEjercicio f) {
    return new FraccionEjercicio(this.numerador*f.getNumerador(), this.numerador*f.getDenominador());
  }
  
  public FraccionEjercicio sumar(FraccionEjercicio f) {
    return new FraccionEjercicio(this.numerador*f.getDenominador() + this.denominador*f.getNumerador(),this.denominador*f.getDenominador());
  }
  
  public FraccionEjercicio restar(FraccionEjercicio f) {
    return this.sumar(f.multiplicar(-1));
  }
  
  // Simplificamos
  public void simplificar() {
    int mcd = FraccionEjercicio.maximoComunDivisor(this.numerador, this.denominador);
    this.numerador /= mcd;
    this.denominador /= mcd;
  }
  
  public static int maximoComunDivisor(int a, int b) {

    // Calcular el mcd
    a = Math.abs(a);
    b = Math.abs(b);
    
    while (b > 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  
}
