/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import componentes.Beverage;
import componentes.Condiment;
import componentes.Decaf;
import componentes.Milk;
import componentes.Soy;

/**
 *
 * @author bryan
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos una bebida que en este caso es cafe descafeinado
        Beverage bebida1 = new Decaf();// cuesta $30
        //Y la información que contiene sera la siguiente:
        System.out.println("Descripción: "+bebida1.getDescription());
        System.out.println("Costo: $"+bebida1.getCost());
        //Luego le agregamos un condimento y sera leche
        Condiment condimento1 = new Milk(bebida1);// cuesta $6
        //Entonces el precio de la bebida se le agregara la del condimento y la
        //descrpción sera distinta
        System.out.println("Descripción: "+condimento1.getDescription());
        System.out.println("Costo: $"+condimento1.getCost());
        //Igual se agregaria otro condimento en este caso leche de soya y se
        //aplicaria el mismo comportamiento
        Condiment condimento2 = new Soy(condimento1);
        System.out.println("Descripción: "+condimento2.getDescription());
        System.out.println("Costo: $"+condimento2.getCost());
        //Si se requiere de otra porción de Leche se haria de nuevo lo mismo como
        //si fuera otro condimento.
        Condiment condimento3 = new Milk(condimento2);
        System.out.println("Descripción: "+condimento3.getDescription());
        System.out.println("Costo: $"+condimento3.getCost());
    }
    
}
