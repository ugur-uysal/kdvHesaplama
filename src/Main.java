import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvliTutar, kdvTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        tutar = inp.nextDouble();

        if(tutar > 1000) kdvOran = 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı : " + kdvliTutar);
    }
}