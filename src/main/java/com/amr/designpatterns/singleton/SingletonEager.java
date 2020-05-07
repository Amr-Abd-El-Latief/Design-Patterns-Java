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
public class SingletonEager {
    private static SingletonEager SingletonInstance = new SingletonEager();
    private SingletonEager(){
    }
    
    public static SingletonEager getSingletonSimple(){
  
    return SingletonInstance;

    }
    
    
}
