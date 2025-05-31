package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");

        // Donat dengan lubang (Torus)
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble(); // input 7
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble(); // input 3.5

        Torus donatBerlubang = new Torus(R, r);
        System.out.println("=============================================");
        donatBerlubang.printInfo();
        System.out.println("=============================================");

        // Donat tanpa lubang (Sphere)
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double r2 = sc.nextDouble(); // input 21

        Sphere donatTanpaLubang = new Sphere(r2);
        System.out.println("=============================================");
        donatTanpaLubang.printInfo();
        System.out.println("=============================================");

        sc.close();
    }
}
