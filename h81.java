public class h81 {
    public static double roopkylikS(String a, String h) { //Rööpküliku valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus; //das valem
    return s;
    }
    
    public static double ristkylikS(String a, String h) { //Ristküliku pindala valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus; //Korrutab valemi ühe aluse kõrgusega.
    return s;
    }
    
    public static double kolmnurkS(String a, String h) { //Kolmnurga pindala valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus/2; //das valem ka
    return s;
    }  
}






    