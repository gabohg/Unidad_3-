
import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a su Cajero Automático.");
        System.out.println("¿Qué operación realizara?");
        System.out.println("1. Consulte su saldo");
        System.out.println("2. Desea hacer un depósito");
        System.out.println("3. Desea hacer un retiro");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad poe depositar:");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado. Su nuevo saldo es: $" + saldo);
                break;
            case 3:
                System.out.println("Ingrese la cantidad por retirar:");
                double retiro = scanner.nextDouble();
                if (retiro > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= retiro;
                    System.out.println("Retiro realizado. Su nuevo saldo es: $" + saldo);
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
}