/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author bryan
 */
public abstract class Beverage {
  
  String descripcion = "";
  
  public String getDescription()
  {
      return descripcion;
  }
  
  public abstract float getCost();  
}
