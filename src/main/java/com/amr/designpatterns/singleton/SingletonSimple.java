/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.singleton;

/**
 *
 * @author amr
 */
public class SingletonSimple {
    private static SingletonSimple SingletonInstance;
    private SingletonSimple(){
    }
    
    public static SingletonSimple getSingletonSimple(){
    if(SingletonInstance == null){
        SingletonInstance = new SingletonSimple();
    }
    return SingletonInstance;

    }
    
    
}
