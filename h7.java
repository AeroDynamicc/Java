import java.util.InputMismatchException;
import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean onViga = true;

        do {
            try {
                System.out.print("Sisesta esimene arv: ");
                double arv1 = scanner.nextDouble();

                System.out.print("Sisesta teine arv: ");
                double arv2 = scanner.nextDouble();

                double tulemus = arv1 + arv2;
                System.out.println("Tulemus: " + tulemus); //Liidab sisestatud arvud kokku ning annab nende tulemuse.

                onViga = false;
            } catch (InputMismatchException e) {
                System.out.println("Viga!: Palun sisesta korrektsed arvud!"); //Kui kirjutad arvude asemel teksti, siis tuleb error.
                scanner.nextLine();
            }
        } while (onViga);

        scanner.close();
    }
}











