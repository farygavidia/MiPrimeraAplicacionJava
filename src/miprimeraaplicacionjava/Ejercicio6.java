
package miprimeraaplicacionjava;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 6-. Un estudiante de del ITCA tiene 5 evaluaciones en cada ciclo de estudio. La primera evaluación
  tiene una ponderación del 25% de la nota final, la segunda evaluación tiene un 15% de la nota
  final, la tercera evaluación tiene un 15% de la nota final, la cuarta evaluación tiene un 20% 
  del valor de la nota final y la quinta evaluación tiene un 25% del valor de la nota final. 
Si el estudiante obtuvo las siguientes calificaciones:
Parcial 1: 8.0 Parcial 2: 7.5 Parcial 3: 9.0 Parcial 4: 8.0 Parcial 5: 9.0
¿Cuál sería el promedio final del estudiante al final del ciclo
 */
public class Ejercicio6 {
     public static void main(String[] args) {
         NumberFormat formato; formato = new DecimalFormat ("#0.00");
         
         double parcial1, parcial2, parcial3, parcial4, parcial5, promediofinal;
        
        parcial1 = 8.0;
        parcial2 = 7.5;
        parcial3 = 9.0;
        parcial4 = 8.0;
        parcial5 = 9.0;
        
        promediofinal = (parcial1 * 0.25) + (parcial2 * 0.15 )+ (parcial3 * 0.15 )+ (parcial4 * 0.20) + (parcial5 * 0.25); 
     System.out.println("El promedio final del ciclo del estudiante es :" + formato.format(promediofinal));
     }
}
