
package com.mycompany.ejemplolistii;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Hector
 */
public class EjemploListII {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar número a la lista");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Calcular la suma de los números");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingresa un número: ");
                    int number = scanner.nextInt();
                    numbers.add(number);
                    System.out.println("Número agregado.");
                    break;
                case 2:
                    System.out.println("Contenido de la lista:");
                    for (int num : numbers) {
                        System.out.println(num);
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int num : numbers) {
                        sum += num;
                    }
                    System.out.println("La suma de los números es: " + sum);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    }
    
}
