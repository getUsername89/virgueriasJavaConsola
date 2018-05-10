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
public class Backgammon {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        final byte distancia = 4;
        String color, color1 = ANSI_WHITE, color2 = ANSI_RED, colorBarra = ANSI_YELLOW;
        byte l;
        int espacios = 0, asteriscos = 20, m = asteriscos%2==0 ? asteriscos++ : asteriscos, n = 12;
        int auxEspacios = asteriscos%2==0 ? asteriscos++ : asteriscos, auxAsteriscos = 1, auxM = m, auxN = n;
        //m /= 2;
        
        if (asteriscos%2==0)
            asteriscos++;
        
        //System.out.print(color+"\u001B[32m");
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < ((n-9)*m)+5+1; i++) {
                System.out.print(colorBarra+"||||");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < m-9; i++) {
            l = 0;
            //System.out.print(colorBarra+"||");
            do {
                System.out.print(colorBarra+"||||");
                for (int k = 0; k < n; k++) {
                    if (k%2==0) {
                        color = color1;
                    } else {
                        color = color2;
                    }
                    for (int j = 0; j < espacios/2; j++) {
                        System.out.print(color+" ");
                    }
                    for (int j = 0; j < asteriscos; j++) {
                        System.out.print(color+"*");
                    }
                    for (int j = 0; j < espacios/2; j++) {
                        System.out.print(color+" ");
                    }
                    if (k==(n/2)-1)
                        System.out.print(colorBarra+"||||");
                }
                System.out.print(colorBarra+"||||");
                System.out.println("");
                l++;
            } while (l < distancia);
            //System.out.print(colorBarra+"||");
            asteriscos-=2;
            espacios+=2;
        }
        
        //ABAJO
        
        for (int i = 0; i < auxM-9; i++) {
            l = 0;
            //System.out.print(colorBarra+"||");
            do {
                System.out.print(colorBarra+"||||");
                for (int k = 0; k < auxN; k++) {
                    if (k%2==0) {
                        color = color1;
                    } else {
                        color = color2;
                    }
                    for (int j = 0; j < auxEspacios/2; j++) {
                        System.out.print(color+" ");
                    }
                    for (int j = 0; j < auxAsteriscos; j++) {
                        System.out.print(color+"*");
                    }
                    //if ()
                    for (int j = 0; j < auxEspacios/2; j++) {
                        System.out.print(color+" ");
                    }
                    if (k==(n/2)-1)
                        System.out.print(colorBarra+"||||");
                }
                System.out.print(colorBarra+"||||");
                System.out.println("");
                l++;
            } while (l < distancia);
            //System.out.print(colorBarra+"||");
            auxAsteriscos+=2;
            auxEspacios-=2;
        }
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < ((n-9)*m)+5+1; i++) {
                System.out.print(colorBarra+"||||");
            }
            System.out.println("");
        }
        
        /*//PRIMERO
        for (int a = 0; a < 10; a++) {
            for (int i = 0; i < n; i++) {
                //espacios = asteriscos/2;
                for (int j = 0; j < espacios/2; j++) {
                    System.out.print(color+" ");
                }
                for (int j = 0; j < asteriscos; j++) {
                    System.out.print(color+"*");
                }
                for (int j = 0; j < espacios/2; j++) {
                    System.out.print(color+" ");
                }
                System.out.println("");
                for (int j = 0; j < espacios/2; j++) {
                    System.out.print(color+" ");
                }
                for (int j = 0; j < asteriscos; j++) {
                    System.out.print(color+"*");
                }
                for (int j = 0; j < espacios/2; j++) {
                    System.out.print(color+" ");
                }
            }
            System.out.println("");
            asteriscos-=2;
            espacios+=2;
        }*/
    }
}
