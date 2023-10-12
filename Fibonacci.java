/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.Scanner;

/**
 *
 * @author gabohrnz04
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int y = 0, x = 1, p, k; 
        
        System.out.println("Ingrese una cantidad por favor");
        k = teclado.nextInt();
            for (int i = 0; i < k; i++) {
                
                System.out.println(y);
                p = y + x;
                y = x;
                x = p;
            }
    }
    
}
