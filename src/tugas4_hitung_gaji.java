import java.util.Scanner;

public class tugas4_hitung_gaji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int gol1, gol2, gol3, golongan, tunjangan_keluarga, tunjangan_anak, jumlah_anak, gaji_awal;
        double total_gaji, konstanta_pajak;
        String validasi_keluarga;
        gol1 = 1000000;
        gol2 = 2000000;
        gol3 = 3000000;
        gaji_awal = 0;
        tunjangan_keluarga = 300000;
        tunjangan_anak = 100000;
        konstanta_pajak = 0.98;
        String reject_msg = "Data yang anda input tidak valid!!!";

        //MOTD
        System.out.println(
                """
                        ===================================================\
                        
                                   Selamat Datang di HITUNG GAJI \

                        ===================================================\
                        
                        
                        Silahkan input data yang diperlukan"""
        );

        //Input User
        System.out.println("Golongan anda (1/2/3) : ");
        golongan = scan.nextInt();
        System.out.println("Apakah anda memiliki keluarga? (y/n) : ");
        validasi_keluarga = scan.next().trim().toLowerCase();


        //Operator Golongan
        if (golongan == 1) {
            total_gaji = gaji_awal + gol1;
        } else if (golongan == 2) {
            total_gaji = gaji_awal + gol2;
        } else if (golongan == 3) {
            total_gaji = gaji_awal + gol3;
        } else {                                //Validator Golongan
            System.out.println(reject_msg);
            return;
        }

        //Operator Tunjangan Keluarga
        if (validasi_keluarga.equals("y")) {
            total_gaji += tunjangan_keluarga;

            //Input User Jumlah Anak
            System.out.println("Jumlah anak yang anda miliki : ");
            jumlah_anak = scan.nextInt();

            //Operator Tunjangan Anak
            if (0 < jumlah_anak && jumlah_anak < 4) {
                total_gaji += (tunjangan_anak * jumlah_anak);
            } else if (jumlah_anak > 3) {
                total_gaji += (tunjangan_anak * 3);
            } else if (jumlah_anak == 0) {
                total_gaji += 0;
            } else {
                System.out.println(reject_msg);
            }

        } else if (validasi_keluarga.equals("n")) {
            total_gaji += 0;
        } else {
            System.out.println(reject_msg);
            return;
        }

        //Cek Pajak
        if (total_gaji >= 3000000) {
            total_gaji *= konstanta_pajak;
        } else if (total_gaji < 3000000) {
            total_gaji += 0;
        }

        //Output
        System.out.println("Total gaji anda adalah " + total_gaji);

    }
}
//Tugas Milik Kinantan