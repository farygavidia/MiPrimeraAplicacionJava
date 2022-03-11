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
public class Ejercicio1 {
    public static void main(String[] args) {
         NumberFormat formato; formato = new DecimalFormat ("#0.00");
         
        double R1, R2, R3,R4, sudeno, Req;
        R1=5.1;
        R2 = 68;
        R3=75;
        R4=82;
        
        sudeno= ((1/R1)+(1/R2)+ (1/R3)+(1/R4));
        
        Req =1/ sudeno;
        System.out.println("la resistenci equivalente es :" + formato.format(Req));
    }
    
}
