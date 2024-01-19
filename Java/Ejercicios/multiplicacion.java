import java.util.*;
public class multiplicacion {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n = scanner.nextInt();
        System.out.println("El número ingresado es: "+n);
        System.out.println("El doble del número es: "+ n*2);
        System.out.println("El triple del número es: "+ n*3);
        scanner.close();
    }
}
