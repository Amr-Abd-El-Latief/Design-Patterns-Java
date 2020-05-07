/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.factory;

/**
 *
 * @author amr
 */
public  abstract  class Cofee {
   public void putSugar(){
       System.out.println("sugar added.");
   }
   
   public abstract void  putCofee(); 
    
     public void boil(){
       System.out.println("water boiled.");
   }
   
}
