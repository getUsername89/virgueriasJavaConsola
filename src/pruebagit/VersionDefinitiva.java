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
public class VersionDefinitiva {
    public static void main(String[] args) {
        int modificador = 450;
        
        //PRIMERA PARTE (ARRIBA)
        
        do {
            int i, n = modificador/2;
            System.out.println(" ");
            //System.out.print("*");
            for (int j = 0; j < n+1; j++) {
                System.out.print("* ");
            }
            System.out.print("*\n");

            for (i = n; i > 0; i--) {
                //PARTE IZQUIERDA
                System.out.print("*");
                for (int j = 0; j < i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
                
                for (int j = 0; j < (n)*2; j++) {
                    System.out.print(" ");
                }
                
                //PARTE DERECHA
                System.out.print("*");
                for (int j = 0; j < i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");

                System.out.println("");
            }

            i += 2;
            i /= 2;
            for (int j = 0; j < n*2; j++) {
                if (j != i-1)
                    System.out.print("* ");
                else
                    System.out.print("*");
                /*if (i%2 == 0) {
                    System.out.print(" ");
                    i++;
                }*/
            }
            System.out.print("*");
            System.out.println("");
        } while (false);
        
        //SEGUNDA PARTE (ABAJO)
        
        do {
            int i, n = modificador/2;
            System.out.print("*");
            for (int j = 0; j < n*2+2; j++) {
                System.out.print(" ");
            }
            System.out.print("*\n");

            for (i = 0; i < n; i++) {
                //PARTE IZQUIERDA
                System.out.print("*");
                for (int j = 0; j < i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");

                for (int j = 0; j < (n-i)*2; j++) {
                    System.out.print(" ");
                }
                
                //PARTE DERECHA
                System.out.print("*");
                for (int j = 0; j < i; j++) {
                    System.out.print("-");
                }
                System.out.print("*");

                System.out.println("");
            }

            i += 2;
            i /= 2;
            for (int j = 0; j < i*2; j++) {
                if (j != i-1)
                    System.out.print("* ");
                else
                    System.out.print("");
                /*if (i%2 == 0) {
                    System.out.print(" ");
                    i++;
                }*/
            }
            //System.out.print("*");
            System.out.println("");
        } while (false);
    }
}
