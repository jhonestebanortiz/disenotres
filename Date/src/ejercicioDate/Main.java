package ejercicioDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año, solo puedes desde ingrear del primer rango hasta el segundo indicado (1000-9999): ");
        int year = scanner.nextInt();

        System.out.print("Ingrese el mes, recuerda que solo puedes colocar estos rangos de meses (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Ingrese el día, solo es valido este rango de dias (1-31): ");
        int day = scanner.nextInt();

        Date date = new Date(year, month, day);

        System.out.println("La fecha ingresada es: " + date.toString());

        scanner.close();
    }
}
 