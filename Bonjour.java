package tp;

public class Bonjour {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom + " ! Bienvenue en Java :)");
        scanner.close();
    }
}
