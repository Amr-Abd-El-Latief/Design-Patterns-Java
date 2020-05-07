/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author amr
 */
public class EnumerationToIteratorAdapter implements Iterator {

    Enumeration enumeration;
    
    public EnumerationToIteratorAdapter(Enumeration e){
    enumeration = e;
    }
    @Override
    public boolean hasNext() {
           return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
   return enumeration.nextElement();
    }
    
    @Override 
    public void remove(){
  throw new UnsupportedOperationException();     
    }
    
}
