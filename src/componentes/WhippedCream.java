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
public class WhippedCream extends Condiment {
    
    Beverage beverage;
    float cost = 5;
    
    public WhippedCream(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+" porción de Crema batida,";
    }

    @Override
    public float getCost() {
        return cost + beverage.getCost();
    }
    
}
