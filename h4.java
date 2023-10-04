import java.util.Scanner;

public class h4{
    public static void main(String[] args) {

        String[] nimi = {"Daniil Meijel"};
        int[] vanus = {17};
        
        for (int i = 0; i < vanus.length; i++) {
        System.out.printf("%-20s %d%n",nimi[i], vanus[i]);                      //Prindib teksti, kus %s tähistab stringi ja %d tähistab täisarvu.
    
    Scanner scanner = new Scanner (System.in);

    System.out.print("Sisesta suvaline tekst: "); 

    String nimed = scanner.nextLine();                                          //Loeb kasutaja poolt sisestatud teksti ning salvestab selle muutujasse.

    System.out.println(nimed);
    System.out.print("Sisesta tekst vaikeste tahtedega (tekst laheb automaatselt suurteks tahtedeks): ");

    String tekst = scanner.nextLine();
    String suurtähedTekst = tekst.toUpperCase();                                //Teeb tähed suurteks tähtedeks

    System.out.println("Suurtahtedega tekst: " + suurtähedTekst);               //prindib küsimusena välja jutumärkide vahel oleva teksti ning lisab juurde muutuja (üleval on näha), mis muudab tulevase teksti suurteks tähtedeks
    System.out.println("Markide arv: ");                                        
    System.out.println(tekst.length());

    String[] sõnad = tekst.split("\\s+");
        int sõnadeArv = sõnad.length;
        System.out.println("Tekstis olevate sonade arv: " + sõnadeArv);         //prindib välja teksti arvu (kui mitu sõna oled kirjutanud).

    String esimeneSõna = sõnad[0];
        System.out.printf("Teie esimene sona on: %s%n", esimeneSõna);           //prindib välja esimese sõna.

        scanner.close();
        }
        }
       }
 
        