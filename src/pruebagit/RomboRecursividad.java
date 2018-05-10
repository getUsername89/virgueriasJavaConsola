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
public class RomboRecursividad {
    static final byte distancia = 1;
    public static void main(String[] args) {
        int tamaño = /*20*/(int)(Math.random()*Math.random()*1000);
        rombo(tamaño, tamaño);
    }
    
    private static void SupIzq(int m, int n) {
        System.out.print("*");
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.print("*");
        for (int i = 0; i < m-n; i++) {
            System.out.print(" ");
        }
    }
    
    private static void SupDer(int m, int n) {
        for (int i = 0; i < m-n; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.print("*");
    }
    
    private static void Arriba(int m, int n) {
        SupIzq(m, n);
        SupDer(m, n);
        System.out.println("");
        if (n>0) {
            Arriba(m, n-distancia);
        }
    }
    
    private static void InfIzq(int m, int n) {
        System.out.print("*");
        for (int i = 0; i < m; i++) {
            System.out.print("-");
        }
        System.out.print("*");
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
    
    private static void InfDer(int m, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < m; i++) {
            System.out.print("-");
        }
        System.out.print("*");
    }
    
    private static void Abajo(int m, int n) {
        InfIzq(m, n);
        InfDer(m, n);
        System.out.println("");
        if (n>0) {
            Abajo(m+distancia, n-distancia);
        }
    }
    
    private static void rombo(int m, int n) {
        for (int i = 0; i < (m+n)+4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        Arriba(m, n);
        
        System.out.print("*");
        for (int i = 0; i < (m+n)+2; i++) {
            System.out.print(" ");
        }
        System.out.print("*\n");
        
        m = 0;
        Abajo(m, n);
        
        for (int i = 0; i < (n+n)+4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
