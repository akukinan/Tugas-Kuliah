/*
    1. INPUT panjang dan alas
    2. PROSES keliling segitiga
    3. PROSES tinggi segitiga menggunakan phytagoras
    4. PROSES luas segitiga
    5. OUTPUT hasil segitiga ke user
*/

import java.util.Scanner;

public class hitung_segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input user (panjang dan alas)
        System.out.println("Panjang sisi : ");
        double sisi = input.nextDouble();
        System.out.println("Panjang alas : ");
        double alas = input.nextDouble();

        // Operator keliling
        double keliling = 2 * sisi + alas;
        System.out.println("Keliling segitiga sama kaki : " + keliling);

        // Operator luas
        double tinggi = Math.sqrt(sisi * sisi - (alas / 2) * (alas / 2));
        double luas = (alas * tinggi) / 2;
        System.out.println("Luas segitiga sama kaki : " + luas);
        input.close();
    }
}