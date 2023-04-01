/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*crear un array con elementos incluidos (15), crear otro array de la misma longitud incluyendo pares y mayores que 25, mostrar
        ambos arrays*/
        
        int[] serie1=new int[15];
        int[] serie2=new int[15];
        int contador=0;
        Scanner lector=new Scanner (System.in);
        
        
        for(int i=0; i<serie1.length; i++){
            
            System.out.println("ingrese un numero");
            serie1[i]=lector.nextInt();
            if(serie1[i]%2==0 && serie1[i]>25){
               serie2[contador]=serie1[i];
               contador++;
            }            
        }
        
        for(int i=0; i<serie1.length; i++){
            System.out.println("la serie original es: "+serie1[i]);
        
        }
                
        if(contador==0){
            System.out.println("nunca se introduce un valor par y mayor a 25");
        }else{
           for(int i=0; i<contador; i++){
             System.out.println("la serie con pares y mayores a 24 es: "+serie2[i]);
           } 
        }
        
        
        
    }
    
}
