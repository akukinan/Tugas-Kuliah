import java.util.Scanner;

public class tugas4_konversi_umur {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int hariLahir, bulanLahir, tahunLahir, hariSekarang, bulanSekarang, tahunSekarang; //Variable Bebas
        int hitungHari, hitungBulan, hitungTahun; //Operator
        String MOTD_Reject = "Data yang anda input tidak valid!!!"; //MOTD jika validator = false

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                    Selamat Datang di CEK UMUR \

                        ==================================================\
                        
                        
                        Silahkan masukkan panjang data yang diperlukan"""
        );

        //Input Tanggal Lahir
        System.out.print("Hari lahir (dd) : ");
        hariLahir = scan.nextInt();
        System.out.print("Bulan lahir (mm): ");
        bulanLahir = scan.nextInt();
        System.out.print("Masukkan tahun lahir (yyyy): ");
        tahunLahir = scan.nextInt();

        //Input Tanggal Sekarang
        System.out.print("Masukkan tanggal sekarang (dd): ");
        hariSekarang = scan.nextInt();
        System.out.print("Masukkan bulan sekarang (mm): ");
        bulanSekarang = scan.nextInt();
        System.out.print("Masukkan tahun sekarang (yyyy): ");
        tahunSekarang = scan.nextInt();

        //Validator Tanggal
        if (hariLahir < 1 || bulanLahir < 1 || tahunLahir < 1 || hariSekarang < 1 || bulanSekarang < 1 || tahunSekarang < 1) {
            System.out.println(MOTD_Reject);
            return;
        }
        if (hariLahir > 31 || bulanLahir > 12 || hariSekarang > 31 || bulanSekarang > 12) {
            System.out.println(MOTD_Reject);
            return;
        }
        if (tahunLahir > tahunSekarang) {
            System.out.println(MOTD_Reject);
            return;
        }

        //Operator
        hitungHari = hariSekarang - hariLahir;
        hitungBulan = bulanSekarang - bulanLahir;
        hitungTahun = tahunSekarang - tahunLahir;

        //Balancer
        if (hitungHari < 0) {
            hitungHari += 30;
            hitungBulan -= 1;
        }
        if (hitungBulan < 0) {
            hitungBulan += 12;
            hitungTahun -= 1;
        }

        //Output
        System.out.println(" Anda memiliki umur: " + hitungTahun + " tahun, " + hitungBulan + " bulan, " + hitungHari + " hari.");

        scan.close();
    }
}
//Tugas Milik Kinantan