/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacionjava;


public class MiPrimeraAplicacionJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
         String nombreCompleto, direccion, estadoCivil;
       int edad;
       double gastosDiarios;
       char genero;
       boolean poseeVehiculo;
       
       nombreCompleto = "camila Esperanza Rosales";
       direccion = "Calle de la amargura desvio de la tristeza";
       estadoCivil = "Soltera";
       edad = 30;
       gastosDiarios = 34.45;
       genero = 'F';
       poseeVehiculo=false;
   
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Direcciòn      : " + direccion);
        System.out.println("Estado Civil   : " + estadoCivil);
        System.out.println("Edad           : " + edad);
        System.out.println("Gastos diarios : " + gastosDiarios);
        System.out.println("Genero         : " + genero);
        System.out.println("Posee Vehiculo : " + poseeVehiculo);
    }
    
}
