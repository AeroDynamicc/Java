public class h2 {
 
    public static void main(String[] args) {
    float tollid = 10.0f;                                 
    float meetrid = tollid * 0.0254f;                   //Tolli valem
    System.out.println(meetrid + " meetrit");  
    System.out.println(ellipsS(9f, 4f));
    double s1 = sportlasekiirus(50, 876431);    //võtab esimese sportlase kiiruse
    double s2 = sportlasekiirus(2000, 90);      //võtab teise sportlase kiiruse
    double vahe = s1 - s2;
    System.out.println("Sportlaste kiirusevahe oli: " + Math.abs(vahe)  );
}
    static double sportlasekiirus(int dis, int aeg){
        double kiirus = dis / aeg;                      //võtab sportlase kiiruse ja jagab selle distantsiga
        return kiirus;
    }
    static double ellipsS(float a,float b){
    double PI = 3.14f;
    double S = PI * a * b;                              //PI valem
    double vastus = Math.round(S*100.0)/100.0;          //korrutab 100 pindalaga ja jagab selle 100ga
    return vastus;
}
    static void tunnid(float minutid){                  //võtab sportlaste tunnid ja komaarvudega minutid
    int tund = 25;                                      //võtab tunnid
    float minut =  minutid / tund;                      //võtab komaarvudena minuteid ning jagab minutid tundidega
    System.out.println("tunnid =" + minut);             //väljastab kogu teksti
}
}