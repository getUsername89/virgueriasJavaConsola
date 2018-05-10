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
public class EstaFuncionando {
    public static void main(String[] args) {
        int modificador = (int)(Math.random()*Math.random()*1000);
        
        /*for (int i = 0; i < modificador/2; i++) {
            System.out.println("*");
            for (int j = modificador/2; j > i; j--) {
                System.out.print(" ");
            }
                System.out.print("*");
        }*/
        
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

            i = n;
            //i -= 4;
            i += 1;
            //TRASPASO
            for (int j = 0; j < i*2; j++) {
                if (j <= 1)
                    System.out.print("*");
                else if (j == i*2-3) {
                    System.out.print("  ");
                } else if (j > i*2-2) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
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

            /*i += 2;
            i /= 2;*/
            //i = n;
            //i -= 4;
            //TRASPASO
            /*for (int j = 0; j < i*2; j++) {
                if (j != i-1)
                    System.out.print("* ");
                else
                    System.out.print("");*/
                /*if (i%2 == 0) {
                    System.out.print(" ");
                    i++;
                }*/
            //}
            
            for (int j = 0; j < i+2; j++) {
                System.out.print("* ");
            }
            
            //System.out.print("*");
            System.out.println("");
        } while (false);
    }
}
