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
public class CofeeMachine {
SimpleFactory simpleFactory;
public CofeeMachine(SimpleFactory factory){
this.simpleFactory = factory;
}

public void requestCofee(String cofeeType){
    simpleFactory.prepareCofee(cofeeType);
}
    
}
