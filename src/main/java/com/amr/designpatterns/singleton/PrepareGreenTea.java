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
public class PrepareGreenTea {
    
   public void prepare(){
    boilWater();
    putGreenTea();
    addSugar();
    }
    
    void boilWater(){
        System.out.println("water boiled");
    }
    

  void putGreenTea(){
  System.out.println("putGreenTea put");
 };
 
 void addSugar(){
     System.out.println("Sugar added");
 }
    
}
    
    
    
//    public void doAlgorithm(){
//    if(algorithm.type=="Algorithm 1"){
//    
//    perform algorithm_1;
//    }else if (algorithm.type=="Algorithm 2"){
//    
//    perform algorithm_1;
//    }else if(algorithm.type="Algorithm 3"){
//    perform algorithm 3;
//    }
//    
    
  //  }
    
    
    
    
//}
