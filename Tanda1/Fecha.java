/**
 * 
 */
package Tanda1;

/**
 * 
 * 3. Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo y 
 * se crean de la forma:

 * Fecha f = Fecha(1, 10, 2020);

 * donde los par�metros que se le pasan al constructor son el d�a, el mes y el a�o 
 * respectivamente. Si la fecha creada es incorrecta mostraremos un mensaje de error 
 * en la salida est�ndar de errores (lo ideal ser�a lanzar una excepci�n, ya lo 
 * haremos cuando se vea en clase).

 * Crea m�todos para:

 * Saber si la fecha almacenada es correcta.
 * Sumar y restar d�as a la fecha. 
 * Comparar la fecha almacenada con otra, el m�todo devolver� un valor negativo si la fecha almacenada es ANTERIOR a la otra, 0 si son IGUALES y un valor positivo si es POSTERIOR.
 * Saber si el a�o de la fecha almacenada es bisiesto.
 * El m�todo toString() devuelve una cadena con el formato "<d�a del mes> de <nombre 
 * del mes> de <a�o>".
 * Las opciones a partir de la segunda, solo se realizar�n si la fecha almacenada es 
 * correcta, en caso de no serlo, se dar� un aviso, por la salida est�ndar de errores, 
 * de que la operaci�n no se puede realizar.
 * @author xulog
 *
 */
public class Fecha {

  // Atributos
  private int dia;
  private int mes;
  private int anio;

  // Dias segun el mes
  private static final int[] diasDelMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  // comportamiento

  /**
   * @param dia
   * @param mes
   * @param anio
   */
  public Fecha(int dia, int mes, int anio) {
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
  }

  // getters, setters y toString()

  /**
   * @return the dia
   */
  public int getDia() {
    return dia;
  }


  /**
   * @param dia the dia to set
   */
  public void setDia(int dia) {
    this.dia = dia;
  }


  /**
   * @return the mes
   */
  public int getMes() {
    return mes;
  }


  /**
   * @param mes the mes to set
   */
  public void setMes(int mes) {
    this.mes = mes;
  }


  /**
   * @return the anio
   */
  public int getAnio() {
    return anio;
  }


  /**
   * @param anio the anio to set
   */
  public void setAnio(int anio) {
    this.anio = anio;
  }

  @Override
  public String toString() {
    return "Fecha: " + this.dia + " de " + this.mes + " de " + this.anio;
  }

  // Comprobamos que es correcto la fecha
  public boolean esCorrecto() {
    if (this.mes < 1 || this.mes > 12) {
      return false;
    }
    if (this.dia >= 1 && this.dia <= diasDelMes[this.mes]) {
      return true;
    } else {
      return false;
    }
  }

  // Sumamos la fecha
  public Fecha sumarDia(int n) {
    if ((this.dia + n) > diasDelMes[this.mes]) {
      // Compruevo si el dia es mas grande que el mes
      this.setDia((this.dia + n) - diasDelMes[this.mes]);
      // Sumamos al mes uno y comprobamos si el mes es mayor que 13 para ponerlo enero y sumar uno
      // el a�o

      this.setMes(getMes() + 1);
      if (this.mes >= 13) {
        this.setMes(1);
        this.setAnio(getAnio() + 1);
      }
      return new Fecha(this.dia, this.mes, this.anio);
    } else {
      this.setDia(this.dia + n);
      return new Fecha(this.dia, this.mes, this.anio);
    }
  }

  // Restamos la fecha
  public Fecha restarDia(int n) {
    // Comprobamos si es menor que 1
    if ((this.dia - n) < 1) {
      // restamos al mes 1 y comprobamos si el mes va a menos que enero y si es as� retrocedemos el
      // a�o y ponemos diciembre
      this.setDia(diasDelMes[this.mes] - (this.dia - n));
      this.setMes(this.getMes() - 1);
      if (this.mes < 1) {
        this.setMes(12);
        this.setAnio(this.getAnio() - 1);
      }
      return new Fecha(this.dia, this.mes, this.anio);
    } else {
      // Si no es menor restamos los dias y sacamos
      this.setDia(this.dia - n);
      return new Fecha(this.dia, this.mes, this.anio);
    }
  }

  /*
  // Comparamos fechas
  public int compareTo(Fecha another) {
    if (this.compareTo(another) > 0) {
      System.out.println("mayor");
      return 1;
    } else if (this.compareTo(another) < 0) {
      System.out.println("menor");
      return -1;
    } else {
      System.out.println("igual");
      return 0;
    }
  }*/
  
  public boolean esBisiesto() {
    if (this.anio % 100 == 0 && this.anio % 400 == 0) {
      diasDelMes [1] = 29;  
      return true;
      }else {
        return false;
      }
  }
}
