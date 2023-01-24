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
public class Soy extends Condiment {
    
    Beverage beverage;
    float cost = 10;
        
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+" Porción de Leche de Soya,";
    }

    @Override
    public float getCost() {
        return cost + beverage.getCost();
    }  
}
