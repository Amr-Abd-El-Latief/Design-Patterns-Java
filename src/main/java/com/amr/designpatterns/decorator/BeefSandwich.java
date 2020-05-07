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
public class BeefSandwich extends Sandwich {
    public BeefSandwich(){
    description = "Beef Sandwich";
    }

    @Override
    public float cost() {
return 10;
    }
    
}
