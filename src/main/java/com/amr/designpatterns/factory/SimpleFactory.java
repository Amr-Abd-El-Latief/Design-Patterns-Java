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
public class SimpleFactory {
    public Cofee prepareCofee(String cofeeType){
    Cofee cofee = null;
    if(cofeeType =="nescafee"){
        cofee = new Nescafee();
    }else if(cofeeType =="nespresso"){
     cofee = new Nespresso();
    }
 return cofee;
    }
}
