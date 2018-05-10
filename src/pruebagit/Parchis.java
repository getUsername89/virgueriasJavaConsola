/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author DAM 6J
 */
public class Parchis {
    public static void main(String[] args) {
        int tamaño = 50;
        /*cuadrado(50);
        cuadrado(50);
        cuadrado(50);
        cuadrado(50);*/
        
        //Linea de Arriba
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < (tamaño/2)+3; j++) {
                System.out.print("||||");
            }
            System.out.println("");
        }
        
        //Arriba
        for (int i = 0; i < (tamaño/2-5); i++) {
            System.out.print("||||");
            for (int j = 0; j < tamaño-2; j++) {
                System.out.print(" ");
            }
            
            if (i%1.5==0)
                System.out.print("     ||||     ");
            else
                System.out.print("-----||||-----");
            
            for (int j = 0; j < tamaño-2; j++) {
                System.out.print(" ");
            }
            System.out.print("||||");
            System.out.println("");
        }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("|||| ");
            for (int j = 0; j < tamaño; j++) {
                if (j%5==0)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.print("| ||||");
            System.out.print(" | ");
            for (int j = 0; j < tamaño; j++) {
                if (j%5==0)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.print("||||");
            System.out.println("");
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        
        //Linea del medio
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < (tamaño/2)+3; j++) {
                System.out.print("||||");
            }
            System.out.println("");
        }
        
        //Abajo
        for (int i = 0; i < tamaño/2; i++) {
            System.out.print("||||");
            for (int j = 0; j < tamaño-2; j++) {
                System.out.print(" ");
            }
            
            if (i%1.5==0)
                System.out.print("     ||||     ");
            else
                System.out.print("-----||||-----");
            
            for (int j = 0; j < tamaño-2; j++) {
                System.out.print(" ");
            }
            System.out.print("||||");
            System.out.println("");
        }
        
        //Linea de Abajo
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < (tamaño/2)+3; j++) {
                System.out.print("||||");
            }
            System.out.println("");
        }
    }
    
    
    
    /*private static void cuadrado(int n) {
        for (int j = 0; j < n/8; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < (n/4)*2; i++) {
            for (int j = 0; j < n/6; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j <= n/6; j++) {
                System.out.print(" ");
            }
            
            if (i>=((n/4)*2)/4 && i<=((n/4)*2)-(((n/4)*2)/4)) {
                for (int j = 0; j <= (n/6)*2; j++) {
                    System.out.print("*");
                }
            } else
                for (int j = 0; j <= ((n/6)*2); j++) {
                    System.out.print(" ");
                }
            
            
            
            for (int j = 0; j < n/6; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < n/6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int j = 0; j < n/8; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/
}
