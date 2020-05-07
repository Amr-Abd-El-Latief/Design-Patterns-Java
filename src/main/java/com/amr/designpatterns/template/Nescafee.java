/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.template;

/**
 *
 * @author amr
 */
public class Nescafee  extends Drink{
@Override
void boilWater(){
        System.out.println("water boiled for nescafee");
    }
    
    @Override
    void putIngredient() {
        System.out.println("Nescafee Added");  
    
    }
    
    
}
