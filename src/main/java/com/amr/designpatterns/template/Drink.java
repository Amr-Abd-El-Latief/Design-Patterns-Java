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
public abstract class Drink {
    
    public void prepare(){
    boilWater();
    putIngredient();
    addSugar();
    }
    
    void boilWater(){
        System.out.println("water boiled");
    }
    

 abstract void putIngredient();
 
 void addSugar(){
     System.out.println("Sugar added");
 }
}
