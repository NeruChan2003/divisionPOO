
import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = input.nextInt();

        // Crear una instancia de la clase division
        Division division = new Division();

        // Establecer los valores de a y b en la instancia de division
        division.setA(a);
        division.setB(b);

        // Realizar la division usando el método division de la instancia de division
        division.dividir();

        // Obtener el resultado de la instancia de division
        int r = division.getR();

        System.out.println("El resultado es: " + r);

        // Mostrar la representación de la instancia de division
        System.out.println(division.toString());
    }
}