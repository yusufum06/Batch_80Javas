package day10_stringManipulation;

public class C03_equqls {
    public static void main(String[] args) {
        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3= "Ali Can"+"";
        String str4= "Ali Can";
        String str5= new String("Ali Can");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

    }
}
