package day07_ifStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char harf=scan.next().charAt(0);
        if (harf>='a'&& harf<='z' || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karekterler bir harf");
        } else {
            System.out.println("Girilen karekter bir harf degildir");}

    }
}
