import java.util.Scanner;

public class tugas4_def_persamaan_kuadrat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Deklarasi Variable\
        double a, b , c, diskriminan, akar1, akar2;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                              Selamat Datang di CEK PERSAMAAN KUADRAT \

                        ==================================================\
                        
                        
                        Silahkan masukkan data"""
        );

        //Input User
        System.out.print("Value a : ");
        a = scanner.nextDouble();
        System.out.print("Value b : ");
        b = scanner.nextDouble();
        System.out.print("Value c : ");
        c = scanner.nextDouble();

        //Operator Diskriminan
        diskriminan = b * b - 4 * a * c;

        //Operator Jenis Akar
        if (diskriminan > 0) {
            System.out.println("Memiliki dua akar yang berbeda dan nyata");
        } else if (diskriminan == 0) {
            System.out.println("Memiliki satu akar yang sama dan nyata");
        } else {
            System.out.println("Memiliki akar khayal");
        }

        //Operator Nilai Akar
        if (diskriminan >= 0) {
            akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            if (diskriminan == 0) {
                System.out.println("Nilai akar = " + akar1);
            } else {
                System.out.println("Nilai akar pertama = " + akar1);
                System.out.println("Nilai akar kedua = " + akar2);
            }
        } else {
            //Operator Definit
            if (a > 0) {
                System.out.println("Persamaan definit positif");
            } else if (a < 0) {
                System.out.println("Persamaan definit negatif");
            }
        }
    }
}
//Tugas Milik Kinantan