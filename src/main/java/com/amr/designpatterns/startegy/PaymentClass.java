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
public class PaymentClass {
    
    // opject to represent the payment way in run time
    PaymentStartegy  paymentStartegy;
    
    public void setPaymentStrategy(PaymentStartegy pStrategy ){
    
        paymentStartegy = pStrategy;
    }
         
    // method to perform payment
    public void doPayment(){
    paymentStartegy.doPaiment();
    }
}
