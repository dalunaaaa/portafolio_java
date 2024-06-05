package conversor;

import java.util.Scanner;

public class conversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Convertidor de Temperatura");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Convertir de Fahrenheit a Celsius");
        System.out.println("2. Convertir de Celsius a Fahrenheit");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("La temperatura en Celsius es: " + celsius);
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }

        scanner.close();
    }
}
