package day09_TernaryOperator;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {
        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse  sayinin karesini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        //sayi>0 ? "Sayi pozitif":(sayi*sayi);
        System.out.println( sayi>0 ? "Sayi pozitif":(sayi*sayi));
    }
}
