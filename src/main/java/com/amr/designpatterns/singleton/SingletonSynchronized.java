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
public class SingletonSynchronized {
    private static SingletonSynchronized SingletonInstance;
    private SingletonSynchronized(){
    }
    
    public static synchronized SingletonSynchronized getSingletonSimple(){
    if(SingletonInstance == null){
        SingletonInstance = new SingletonSynchronized();
    }
    return SingletonInstance;
    
    }
    
    
}
