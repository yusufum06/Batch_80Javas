package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1= 10;
        int sayi2= sayi1 +1;
        sayi2 +=5;
        int sayi3= sayi2++;
        System.out.println("Sayi3: " +sayi3);
        System.out.println("Sayi2: " +sayi2);

        int sayi4= ++sayi1;
        System.out.println("Sayi4: " +sayi4);
        System.out.println("Sayi1: " +sayi1);


    }
}
