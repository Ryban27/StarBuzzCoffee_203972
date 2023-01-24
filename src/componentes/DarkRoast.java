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
public class DarkRoast extends Beverage {

    public DarkRoast(){
        descripcion = "Café Dark Roast";
    }
    
    @Override
    public float getCost() {
        return 45;
    }
    
}
