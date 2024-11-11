import java.util.Scanner;

public class tugas2_menukar_data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variabel
        String nama_depan, nama_tengah, nama_belakang, sementara;

        //Input Userr
        System.out.println("Nama depan : ");
        nama_depan = scan.nextLine();
        System.out.println("Nama tengah : ");
        nama_tengah = scan.nextLine();
        System.out.println("Nama belakang : ");
        nama_belakang = scan.nextLine();

        //Nama Asli
        System.out.println(" Haiii " + nama_depan + " " + nama_tengah + " " + nama_belakang);

        //Nama setelah ditukar
        sementara = nama_depan;
        nama_depan = nama_belakang;
        nama_belakang = sementara;
        System.out.println(" Nama kamu aku balik yaa, jadi " + nama_depan + " " + nama_tengah + " " + nama_belakang);


    }
}
//Tugas Milik Kinantan