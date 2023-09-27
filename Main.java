import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad");
        int cantidadUno=leer.nextInt();
        if (cantidadUno % 2 == 0){
        System.out.println("la cantidad ingresada " + cantidadUno +" es un numero par");
        }else{
            System.out.println("la cantidad ingresada " + cantidadUno + " es un número impar");
        }
        
    }
}