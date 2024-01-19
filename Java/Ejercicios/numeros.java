import java.util.*;

public class numeros{
    public static void main(String[] args) {
        
        int n1,n2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número");
            n1 = sc.nextInt();
            System.out.println("Ingrese un segúndo número");
            n2 = sc.nextInt();
        }
        System.out.println("Los números introducidos son: " + n1 +" y "+ n2);
    }
}