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
public class Milk extends Condiment {
 
    Beverage beverage;
    float cost = 3;
    
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Porción de Leche,";
    }

    @Override
    public float getCost() {
        return cost + beverage.getCost();
    }    
}
