/*
 * Lambda Expression Assignment
 * Author: Ethan Holmes
 * Last Modified Date: 11/20/2019
 */
package com.ech.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import com.ech.lambda.Widget;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
/**
 *
 * @author ethan holmes
 */
public class LambdaAssignment {
    public static void main(String[] args) {
        System.out.println("Program starting...");
        
        ArrayList<Widget> widgets = new ArrayList<>();
        ArrayList<Widget> validWidgets = new ArrayList<>();

            Supplier<Widget> randomWidget;
                randomWidget = () -> new Widget(Widget.GetRandVal(),Widget.GetRandName());
            
            Predicate<Widget> validWidget = x ->(x.getValue()>=0);
            
            UnaryOperator<String> nameToLower = (nameLower) -> nameLower.toLowerCase();
                    
            //boolean valid = validWidget.test(Widget);
            
            for (int i = 0; i < 20; i++){
                Widget addWidget = randomWidget.get();
                widgets.add(addWidget);
                //System.out.println(addWidget.toString());
            }
            
            //check random widgets for valid values
            widgets.forEach((widget) -> {
                boolean valid = validWidget.test(widget);

                if (valid) {
                    //widget.name.toLowerCase();
                    String newName = widget.getName();
                    newName = nameToLower.apply(widget.getName());
                    widget.setName(newName);
                    validWidgets.add(widget);
                }
            }); //end foreach
            
            Consumer<Widget> widgetPrinter = (Widget n) -> System.out.println("[ value: " + n.getValue() + "\t name:\t" + n.getName() + "]");
            validWidgets.forEach(widgetPrinter);
            
            System.out.println("Complete..");
    }
 
}
