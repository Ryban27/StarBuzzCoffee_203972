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
public class Decaf extends Beverage {
  
    public Decaf(){
        descripcion = "Café Descafeinado";
    }
    
    @Override
    public float getCost() {
        return 30;
    }
  
}
