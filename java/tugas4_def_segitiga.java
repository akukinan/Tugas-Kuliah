import java.util.Scanner;

public class tugas4_def_segitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        double sisiA, sisiB, sisiC;
        String MOTD_hasil = "Setelah di-cek, segitiga yang anda input merupakan segitiga ";

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                  Selamat Datang di CEK SEGITIGA \

                        ==================================================\
                        
                        
                        Silahkan masukkan panjang sisi-sisi segitiga"""
        );

        //Input User
        System.out.println("Panjang sisi A : ");
        sisiA = scan.nextDouble();
        System.out.println("Panjang sisi B : ");
        sisiB = scan.nextDouble();
        System.out.println("Panjang sisi C : ");
        sisiC = scan.nextDouble();

        //Validator Segitiga
        if (sisiA + sisiB > sisiC && sisiA + sisiC > sisiB && sisiB + sisiC > sisiA) {
            //Operator Validasi Jenis Segitiga
            if (sisiA == sisiB && sisiB == sisiC) {
                System.out.println(MOTD_hasil + "SAMA SISI");
            } else if (sisiA == sisiB || sisiA == sisiC || sisiB == sisiC) {
                System.out.println(MOTD_hasil + "SAMA KAKI");
            } else if (sisiA * sisiA + sisiB * sisiB == sisiC * sisiC || sisiA * sisiA + sisiC * sisiC == sisiB * sisiB || sisiB * sisiB + sisiC * sisiC == sisiA * sisiA) {
                System.out.println(MOTD_hasil + "SIKU-SIKU");
            } else {
                System.out.println(MOTD_hasil + "SEMBARANG");
            }
        } else {
            System.out.println("Bukan Segitiga!!!");
        }

   }
}
//Tugas Milik Kinantan