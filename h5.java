//Daniil Meijel
import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);

        System.out.print("Sisesta esimene arv: ");      //siin on vaja et sisestaksid esimese arvu.
        double arv1 = sisestus.nextDouble();            //siin tuleb esimese arvu sisestus vajadusel komaarvuga

        System.out.print("Sisesta teine arv: ");        //siin on vaja et sisestaksid teise arvu.
        double arv2 = sisestus.nextDouble();            //siin tuleb teise arvu sisestus vajadusel komaarvuga
        
        if (arv2 != 0) {
            double tulemus = arv1 / arv2;
            System.out.println("Jagamistulemus: " + tulemus);           //jagab tulemusi
        } else {
            System.out.println("VIGA!: Nulliga ei saa jagada!");        //Siin väljastab errori, kui paned nulli mingisuguse jagamistehte ette, nt 123 (0123).
        }

        sisestus.close();
    }
}
