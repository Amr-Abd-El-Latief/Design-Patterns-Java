/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.observer;

import java.util.ArrayList;

/**
 *
 * @author amr
 */
public class WeatherStatus implements Subject{
private ArrayList observers;
private float temperature;
private float humidity;
private float pressure;

public void weatherStatus(){
observers = new ArrayList();
}

    
    @Override
    public void registerObserver(Observer observer) {
observers.add(observer);
        }

    @Override
    public void removeObserver(Observer observer) {
observers.remove(observer);  
        
        }

    @Override
    public void notifyObservers() {
for(int i = 0;i<observers.size();i++)  
{
    Observer observer1 = (Observer) observers.get(i);
    observer1.update(temperature, pressure, humidity);
   
    }
    }
public void measurementChanged(){
    
    notifyObservers();
}

}
    

