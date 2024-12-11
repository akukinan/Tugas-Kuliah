import java.util.Scanner;

public class tugas7_boarding_pass {
    //Array Database
    static String[][] tiket = new String[10][5]; // [10 tiket][5 data per tiket]
    static int countTiket = 0;

    //User Interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            //Menu Interface
            System.out.println("\n=== Generator Boarding Pass ===");
            System.out.println("1. Beli Tiket");
            System.out.println("2. Cetak Boarding Pass");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // validator line baru :)

            //Operator Menu (percabangan)
            switch (menu) {
                case 1:
                    beliTiket(scanner);
                    break;
                case 2:
                    cetakBoardingPass();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    break;
                default:
                    System.out.println("Input tidak valid!!!");
            }
        } while (menu != 3); // untuk looping :D

        scanner.close();
    }

    //Generator Boarding Pass
    public static void beliTiket(Scanner scanner) { //Operator Beli Boarding Pass
        if (countTiket >= tiket.length) {
            System.out.println("Maksimal membeli 10 tiket!!"); //Validator Max Tiket
            return;
        }

        System.out.print("Masukkan nama penumpang : ");
        String namaPenumpang = scanner.nextLine();

        System.out.print("Masukkan nomor kursi : ");
        String nomorKursi = scanner.nextLine();

        System.out.print("Masukkan asal keberangkatan : ");
        String keberangkatan = scanner.nextLine();

        System.out.print("Masukkan tujuan: ");
        String tujuan = scanner.nextLine();

        //Array Data
        tiket[countTiket][0] = namaPenumpang;
        tiket[countTiket][1] = nomorKursi;
        tiket[countTiket][2] = keberangkatan;
        tiket[countTiket][3] = tujuan;

        countTiket++;
        System.out.println("Tiket berhasil dibeli!");
    }

    public static void cetakBoardingPass() { //Operator Cetak Boarding Pass
        if (countTiket == 0) { //Validator Jumlah Tiket
            System.out.println("Belum ada tiket yang dibeli!!!");
            return;
        }

        System.out.println("\n=== Boarding Pass ===");
        for (int i = 0; i < countTiket; i++) {
            System.out.println("--------------------------");
            System.out.println("Nama Penumpang : " + tiket[i][0]);
            System.out.println("Nomor Kursi : " + tiket[i][1]);
            System.out.println("Keberangkatan : " + tiket[i][2]);
            System.out.println("Tujuan : " + tiket[i][3]);
            System.out.println("--------------------------\n");
        }
    }
}
//Tugas Milik Kinantan

/* Note
    1. Maksimal beli 10 tiket
    2. Belum ada user interface untuk layout tempat duduk, waktu keberangkatan, list keberangkatan, dan list tujuan
    3. Bug saat pilih menu sudah diperbaiki
    4. Belum ada validator ketersediaan kursi
 */
