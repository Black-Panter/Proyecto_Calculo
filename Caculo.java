
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculo;

import java.io.*;

/**
 *
 * @author FRANK
 */
public class Caculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader (a);
        
        long potencia, coeficiente, resultado ;
        
        System.out.println("Ingrese el coeficiente");
        coeficiente=Long.parseLong(entrada.readLine()); 
        System.out.println("Ingrese la potencia");
        potencia=Long.parseLong(entrada.readLine()); 
        resultado= (potencia*coeficiente);
        
        long recurcion;
        recurcion=potencia-1;
        
        int contador;
        contador=0;
                
        while (contador<1) {
           contador++;   
           if(recurcion>=1){
                
               System.out.println(resultado+"X"+"^"+recurcion); 
             
           }else{
                System.out.println(recurcion); 
            } 
        }
            
        entrada.close();
    }
    
    

    
}
