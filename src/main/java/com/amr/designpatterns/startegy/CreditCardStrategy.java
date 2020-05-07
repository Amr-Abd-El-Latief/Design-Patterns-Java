/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.startegy;

/**
 *
 * @author amr
 */
public class CreditCardStrategy implements PaymentStartegy {

    // methode for payment in Credit Card
    @Override
    public void doPaiment() {
        System.out.println("Payed in Credit Card..!");
    }
    
}
