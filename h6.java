//Daniil Meijel

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class h6 {

    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta taisarvud: "); //siin on vaja sisestada täisarvu/arve

        while (true) {
            String sisend = scanner.nextLine();

            if (sisend.isEmpty()) {                 //Kui miskit siia ei kirjutata, siis lõpetab see töö
                break;
            }

            if (onTaikeTaisarv(sisend)) {                   
                try {
                    int arv = Integer.parseInt(sisend);         //Kui sisend on võrdne teatud täisarvuga või on väiksem, proovib see selle sisendi täisarvuks teisendada.
                    arvud.add(arv);
                } catch (NumberFormatException e) {
                    System.err.println("Viga sisestamisel!");
                }
            } else {
                System.err.println("Viga sisestamisel! Sisestage ainult täisarvud: "); //Kui täisarvu ei sisestata, tuleb ette error.
            }
        }

        scanner.close();

        int summa = arvudeSumma(arvud);
        double keskmine = arvudeKeskmine(arvud);

        System.out.println("Sisestatud arvude summa: " + summa);
        System.out.println("Sisestatud arvude keskmine: " + keskmine);

        
        try {
            salvestaAndmedFaili("arvud.txt", arvud, summa, keskmine);
            System.out.println("Andmed on salvestatud faili 'arvud.txt'.");     //see salvestab faili kus on arvud "arvud.txt" faili
        } catch (IOException e) {
            System.err.println("Viga faili salvestamisel: " + e.getMessage());  //Error tuleb juhul, kui paned üksikuid arve (1,3,5) täisarvude asemel (2,4,6), sel juhul ei saa faili salvestada.
        }
    }

    public static boolean onTaikeTaisarv(String sisend) {
        return sisend.matches("\\d+");
    }
    public static int arvudeSumma(ArrayList<Integer> arvud) { 
        int summa = 0;
        for (int arv : arvud) {                                 //Arvutab kokku täisarvude summa ja tagastab selle tulemuse.
            summa += arv;
        }
        return summa;
    }

    public static double arvudeKeskmine(ArrayList<Integer> arvud) {
        if (arvud.isEmpty()) {
            return 0.0;                                         //Kui arvude keskmist ei leidu, siis lõpetab see töö ära.
        }

        int summa = arvudeSumma(arvud);
        return (double) summa / arvud.size();
    }

    public static void salvestaAndmedFaili(String failinimi, ArrayList<Integer> arvud, int summa, double keskmine) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(failinimi))) {
            for (int arv : arvud) {
                writer.write(Integer.toString(arv));  //Kirjutab antud täisarvude listi faili "arvud", mille nimeks on failinimi.
            }
        }
    }
}