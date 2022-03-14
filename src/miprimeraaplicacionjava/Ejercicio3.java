
package miprimeraaplicacionjava;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 3-Un docente universitario gana $8.00 la hora de clase y ha impartido 36 horas en un mes de clases. Debemos de 
  calcular el salario del docente sabiendo que le van a descontar el 10% de la renta.
 ¿Cuánto ganara el docente al final de un mes de clases menos el descuento de la renta
 */
public class Ejercicio3 {
     public static void main(String[] args) {
           NumberFormat formato; formato = new DecimalFormat ("#0.00");
         double Preciohora, Horasmes,salarioNeto,salario, renta,Procesorenta;
         
         Preciohora= 8;
         Horasmes=36;
         renta= 0.10;
         
         salarioNeto= Preciohora * Horasmes ;
          Procesorenta= salarioNeto * renta;
          salario= salarioNeto- Procesorenta;
                  
         System.out.println("El salario del profesor es de :" + formato.format(salario));
         
     }
    
}
