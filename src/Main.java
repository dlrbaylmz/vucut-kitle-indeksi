import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        double size, kg ,index;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen boyunuzu (merte cinsinden) giriniz: ");
        size = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();
        index = kg/(size*size) ;
        System.out.println("Vücut kitle indeksiniz: " + index );

    }
}
