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
public class ChikenSandwich extends Sandwich {
    public ChikenSandwich(){
    description = "Chiken Sandwich";
    }

    @Override
    public float cost() {
return 5;
    }
    
}
