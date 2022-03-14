
package miprimeraaplicacionjava;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 4-. Si un trabajador de la empresa privada está afiliado a las AFP y los porcentajes que se paga
  a las AFP es de 6% por parte del trabajador y 6.5% por parte del empleador, si el empleado
  gana $500 al mes, ¿Cuánto está pagando a la AFP el trabajador en 
concepto de empleado y de empleador
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    NumberFormat formato; formato = new DecimalFormat ("#0.00");
        double AFPtrabajador,AFPempleador,salario,AFPtra,AFPemp ;
        AFPtrabajador=0.06;
        AFPempleador=0.065;
        salario=500;
        
        AFPtra= salario * AFPtrabajador;
        AFPemp= salario * AFPempleador;
        
         System.out.println("el trabajador paga en concepto de trabajador en la AFP  :" + formato.format(AFPtra) );
         System.out.println("el trabajador paga en concepto de empleador en la AFP  :" + formato.format(AFPemp) );
        
    }
}
