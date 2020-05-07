/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amr.designpatterns.adapter;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author amr
 */
public class HTMLIteratorToSimpleIterator extends HTMLDocument.Iterator implements SimpleHTMLIterator  {

    @Override
    public AttributeSet getAttributes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStartOffset() {

        System.out.println(" get start offset");
        return 0;
    }

    @Override
    public int getEndOffset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void next() {
 System.out.println(" get start offset");
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HTML.Tag getTag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getNextElement() {
    
next();

    }

    @Override
    public void getStartElement() {
        
        getStartOffset();
    }
    
}
