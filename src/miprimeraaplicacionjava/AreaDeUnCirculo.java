/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacionjava;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author HP
 */
public class AreaDeUnCirculo {
    public static void main(String[] args) {
    
         NumberFormat formato = new DecimalFormat("#0.00");
        double area, radio;
        final double pi = 3.1416;
        area = 145;
        
        radio = Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format(radio) + " cm");
    }
    
}
