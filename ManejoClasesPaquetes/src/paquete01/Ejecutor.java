/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);
       
       String nombreHospital;
       int camasHospital;
       double presupuestoHospital;
       
       
      System.out.println("Ingresar nombre hospital");
      nombreHospital = entrada.nextLine();
      System.out.println("Ingresar numero de camas");
      camasHospital = entrada.nextInt();
      System.out.println("Ingresar presupuesto");
      presupuestoHospital = entrada.nextInt();
       
       
       entrada.nextLine(); // limpiar el buffer
        Hospital h1 = new Hospital();
        h1.establecerNumeroCamas(camasHospital);
        h1.establecernombreHospital(nombreHospital);
        h1.establecerPresupuesto(presupuestoHospital);
        
        
        System.out.println("Ingresar nombre hospital(2)");
      nombreHospital = entrada.nextLine();
      System.out.println("Ingresar numero de camas(2)");
      camasHospital = entrada.nextInt();
      System.out.println("Ingresar presupuesto(2)");
      presupuestoHospital = entrada.nextInt();
      
       Hospital h2 = new Hospital();
        h2.establecerNumeroCamas(camasHospital);
        h2.establecernombreHospital(nombreHospital);
        h2.establecerPresupuesto(presupuestoHospital);
                
        
     
        
                        
        System.out.printf("%s \n", "Hola desde el main");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        
    }
}
