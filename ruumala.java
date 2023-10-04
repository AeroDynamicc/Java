public class ruumala {

	public static double ristahuka(String a, String h, String l) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h); //kasutatud float komaarvude jaoks
        float laius = Float.parseFloat(l);
        double s = alus * korgus * laius; //aluse, kõrguse, laiuse korrutamine, vajadusel komaarvudena
        return s; //tagastab s-i
    } 

    public static double parallelepipedi(String a, String l, String h) {
        float alus = Float.parseFloat(a);
        float laius = Float.parseFloat(l); // kasutatud float komaarvude jaoks
        float korgus = Float.parseFloat(h);
        double s = alus * korgus * laius; // aluse, kõrguse ja laiuse korrutamine, vajadusel komaarvudena
        return s; //tagastab s-i
    }

    public static double Ristkülik(String a, String l, String h) {
        float alus = Float.parseFloat(a);
        float laius = Float.parseFloat(l); // kasutatud float komaarvude jaoks
        float korgus = Float.parseFloat(h);        
        double s = laius * korgus * alus; //laius, kõrgus, alus korrutamine, vajadusel komaarvudena
        return s; // tagastab ülemise s-i
    }
    
}