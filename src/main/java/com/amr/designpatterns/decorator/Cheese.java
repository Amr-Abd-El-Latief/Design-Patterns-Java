/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.decorator;

/**
 *
 * @author amr
 */
public class Cheese extends AdditionDecorator{

    Sandwich sandwich;
    
    public Cheese(Sandwich sandwich){
    this.sandwich = sandwich;
    }
    
    @Override
    public String getDescription() {        
     return this.sandwich.getDescription()+" with cheese";
    }

    @Override
    public float cost() {
        return this.sandwich.cost()+2;
    }
    

}
