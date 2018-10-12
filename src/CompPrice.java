public class CompPrice {

    public static void main(String[] args) {

        int cProc = 700; //cena procesora
        int cPly = 500; // cena płyty głównej
        int cPam = 300; // ram
        int cDysk = 400;
        int cInn = 500;

        final double VAT = 1.22; // podatek vat 22%

        //Liczymy cenę komputera bez monitora

        double cKomp = (cProc + cPly + cPam + cDysk + cInn) * VAT;

        System.out.println("Cena komputera bez monitora wynosi: " + cKomp);

        int cMon = 1100;
        cKomp = cKomp + cMon * VAT;

        System.out.println("Cena komputera z minitorem wynosi: " + cKomp);

    }
}
