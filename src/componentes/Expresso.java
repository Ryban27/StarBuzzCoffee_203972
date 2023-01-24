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
public class Expresso extends Beverage {
    
    public Expresso(){
        descripcion = "Café Expresso";
    }
    
    @Override
    public float getCost() {
        return 36;
    }
    
}
