/**
 * 
 */
package Tanda1;

/**
 * 
 * 1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 *
 *  t = Tiempo(1, 20, 30)
 *  
 *  donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 *    
 *  Crea métodos para:
 *    
 *  Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
 *  Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
 *  Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 *  Realiza un programa de prueba para comprobar que la clase funciona bien.
 * 
 * 
 * 
 * @author xulog
 *
 */
public class Tiempo {

  // Atributos
  
  private int horas;
  private int minutos;
  private int segundos;
  
  
  //comportamiento
  
  /**
   * @param horas
   * @param minutos
   * @param segundos
   */
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
    this.comprobar();
  }

  //getters, setters y toString()
  
  /**
   * @return the horas
   */
  public int getHoras() {
    return horas;
  }


  /**
   * @param horas the horas to set
   */
  public void setHoras(int horas) {
    this.horas = horas;
  }


  /**
   * @return the minutos
   */
  public int getMinutos() {
    return minutos;
  }


  /**
   * @param minutos the minutos to set
   */
  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }


  /**
   * @return the segundos
   */
  public int getSegundos() {
    return segundos;
  }


  /**
   * @param segundos the segundos to set
   */
  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
  
  public void comprobar() {
    int tiempo = horas*3600+minutos*60+segundos;
    this.horas = tiempo/3600;
    this.minutos = (tiempo/60)%60;
    this.segundos = (tiempo%60);
  }

  @Override
  public String toString() {
    return this.horas+"H "+this.minutos+"M "+this.segundos+"S";
  }
  
  
  public Tiempo restarObjeto(Tiempo t){
    return new Tiempo(this.horas-t.horas, this.minutos-t.minutos, this.segundos-t.segundos);
  }
  public Tiempo sumarObjeto(Tiempo t){
    return new Tiempo(this.horas+t.horas, this.minutos+t.minutos, this.segundos+t.segundos);
  }
    
  public void sumarTiempo(int num) {
    this.segundos += num;
    this.comprobar();
  }
  
  public void restarTiempo(int num) {
    this.segundos -= num;
    this.comprobar();
  }
  
  
}
