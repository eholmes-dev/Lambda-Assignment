/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ech.lambda;

import java.util.Random;

/**
 * A simple Widget for demonstrating lambda expressions.
 *
 * @author of Widget Class: Bob Trapp
 * @updated by: Ethan Holmes
 */
public class Widget implements Comparable<Widget>{
     /**
     * A numeric value.
     */
    private int value;

    /**
     * The name of the Widget.
     */
    String name;

    /**
     * The full constructor.
     *
     * @param value a numeric value
     * @param name the name of the Widget
     */
    public Widget(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    /**
     * Gets a random integer value
     * @return 
     */
    public static int GetRandVal() {
        Random r = new Random();
            int randVal = r.nextInt(90-(-10)) + -10; //random value
            return randVal;
    }
    
    public static String GetRandName(){
        
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        int n = 19;
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n);
        String randName = null;
        for (int i = 0; i < 8; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
            randName = sb.toString();
            
        }
            return randName;
        }
    /*Widget(char[] chars) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /**
     * An override of toString()
     *
     * @return a String representation of the Widget
     */
    @Override
    public String toString() {
        return "Widget{" + "value=" + value + ", name=" + name + '}';
    }



    /**
     * A numeric value.
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * A numeric value.
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * The name of the Widget.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the Widget.
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An implementation of Comparable to help sort Widget objects by value.
     *
     * @param otherWidget
     * @return
     */
    @Override
    public int compareTo(Widget otherWidget) {
        return this.value - otherWidget.getValue();
    }
}
