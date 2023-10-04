public class h82 {
    private String nimi; 
    private int vanus;      //siin on kasutatud private muutujat, et teha juurdepääs atribuutide, meetodite ja konstruktorite jaoks.
    private String värv;

    public h82(String nimi, int vanus, String värv) {
        this.nimi = nimi;
        this.vanus = vanus;     // "this" muutuja on siin kasutusel viitamiseks meetodi või konstruktori praegusele objektile.
        this.värv = värv;
    }
    public void tutvustus() {
        System.out.println("Helo, mina olen "+ nimi +"Olen sõbralik kutsa. /Mina olen "+ vanus + "auh,auh..."); //prindib välja tutvustuse teksti
    }
    public void hoolepidamine() {
        System.out.println("Mind pestakse igapäev peale jalutuskäiku, olen ilus " + värv + "Peale pesemist küsin ma süüa, auh.."); //prindib välja hoolepidamise teksti
    }
    public void hobid() {
        System.out.println("Mulle meeldib väga mängida nii kodus, kui ka ilusa ilma korral õues " + nimi + "Liputab saba.."); //prindib välja hobide teksti
    }

}