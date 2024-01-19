import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
    String n;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese su nombre");
        n = sc.nextLine();
        System.out.println("Buenos dias "+n);
    }
    }
}
