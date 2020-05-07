/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.observer;

/**
 *
 * @author amr
 */
public class TempratureTodayDisplay implements Observer{
private float temprature;
private Subject weatherStatus;
public  TempratureTodayDisplay(Subject weatherStatus){
this.weatherStatus = weatherStatus;
weatherStatus.registerObserver(this);

}

    @Override
    public void update(float temp, float pressure, float humidity) {
this.temprature = temprature;
        System.out.println("Current Condition : "+ this.temprature + " C degrees.");
    }
    
}
