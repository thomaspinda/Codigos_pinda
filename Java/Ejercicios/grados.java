import java.util.*;
public class grados {
    public static void main(String[] args) {
        int deg,far;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor en grados celsius");
        deg = scanner.nextInt();
        far = 32+(9*deg/5);
        System.out.println("Los grados en farenheit son: "+far);
        scanner.close();
    }
}

