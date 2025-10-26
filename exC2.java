package tp1;
import java.util.Scanner;

public class exC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("donner le premier nombre");
        int a = input.nextInt();
        System.out.println("donner le deuxieme nombre");
        int b = input.nextInt();
        System.out.println("donner le troisieme nombre");
        int c = input.nextInt();
        int d = a + b + c;
        int p = a * b * b;
        int m = p / d;
        System.out.println("la valeur de d=" + d);
        System.out.println("la valeur de m=" + m);
        input.nextLine();
        System.out.println("donner votre nom");
        String n = input.nextLine();
        System.out.println("Bonjour" + n + " la somme est d=" + d);
    }
}
