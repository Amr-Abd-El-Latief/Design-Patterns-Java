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
public abstract class Sandwich {
    String description = "Unkown";
    public String getDescription(){
        return description;
    }
    public abstract float cost();
}
