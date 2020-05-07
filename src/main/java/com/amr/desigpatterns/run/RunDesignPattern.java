/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.desigpatterns.run;

import com.amr.designpatterns.abstractfactory.AbstractFactory;
import com.amr.designpatterns.abstractfactory.Color;
import com.amr.designpatterns.abstractfactory.FactoryProducer;
import com.amr.designpatterns.abstractfactory.Shape;
import com.amr.designpatterns.decorator.BeefSandwich;
import com.amr.designpatterns.decorator.Cheese;
import com.amr.designpatterns.decorator.ChikenSandwich;
import com.amr.designpatterns.decorator.Sandwich;
import com.amr.designpatterns.startegy.PaymentClass;
import com.amr.designpatterns.template.Nescafee;
import com.amr.designpatterns.template.TeaDrink;

/**
 *
 * @author amr
 */
public class RunDesignPattern {
    
    public static void main(String[] args) {
//        PaymentClass paymentClass = new PaymentClass();
//        
//        
//        
//        // Decorator 
//        
//        Sandwich sandwich = new ChikenSandwich(); 
//        System.out.print (sandwich.getDescription());
//        System.out.println (sandwich.cost()+ "LE");
//        Sandwich sandwich2 = new BeefSandwich();
//        sandwich2 = new Cheese ( sandwich2 );
//        System.out.println ( sandwich2.getDescription() );
//        System.out.print ( sandwich2.cost()+ "LE" );

// for Template

        Nescafee nescafee = new Nescafee();
        nescafee.prepare();
        
        TeaDrink teaDrink = new TeaDrink();
        teaDrink.prepare();
        
        
        
        // Abstract Factory
        
           //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

      //get an object of Shape Circle
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Shape Circle
      shape1.draw();

      //get an object of Shape Rectangle
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Shape Rectangle
      shape2.draw();
      
 
      //get color factory
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = colorFactory.getColor("RED");

      //call fill method of Red
      color1.fill();

      //get an object of Color Green
      Color color2 = colorFactory.getColor("Green");

      //call fill method of Green
      color2.fill();

    
        
        
    }
}
