/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipoamarillo.pp2.p.pkg5;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class SPPEquipoAmarilloPP2P5 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
        int [][] matriz = {
            {1,2,3,4},
            {8,7,6,5},
            {9,10,11,12},
            {16,15,14,13}
        };
        
        promedio(matriz);
        max(matriz);
        min(matriz);
        sumaDiag(matriz);
        sumaArribaDiag(matriz);
        sumaAbajoDiag(matriz);
        
    }
    
    public static int [][] promedio (int [][] matriz){
        int suma = 0, cant = 0;
        double promedio;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                suma = suma + matriz [i][j]; cant++;
            }
        }
        promedio = suma/cant;
        System.out.println("El promedio es: " + promedio);
        System.out.println(suma + " " + cant);
        return matriz;
    }
    
    public static int [][] max (int [][] matriz){
        int template = 0;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                if (matriz[i][j] > template){
                    template = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es: " + template);
        return matriz;
    }
    
    public static int [][] min (int [][] matriz){
        int template = 0;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                if (matriz[i][j] < template){
                    template = matriz[i][j];
                }
            }
        }
        System.out.println("El numero menor es: " + template);
        return matriz;
    }
    
    public static int [][] sumaDiag(int [][] matriz){
        int suma = 0;
        for (int i = 0; i<matriz.length; i++){
            suma = suma + matriz[i][i];
        }
        System.out.println("La suma de la diagonal es: " + suma);
        return matriz;
    }
    
    public static int [][] sumaAbajoDiag(int [][] matriz){
        int suma = 0;
        for (int i = 1; i<matriz.length; i++){
            for(int j = 0; j < i; j++){
                suma =suma+matriz[i][j];
            }
            
        }System.out.println("La suma por debajo de la diagonal: " + suma);
        return matriz;
    }
    
    public static int [][] sumaArribaDiag(int [][] matriz){
        int suma = 0;
        for(int j = 0; j <matriz.length; j++){
            for(int i = j-1; i >= 0; i--){
                suma=suma+matriz[i][j];
            }
        }
        System.out.println("La suma por encima de la diagonal: "+suma);
        return matriz;
    }
}