import java.util.Scanner;

public class tugas6_hitung_fpb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int a, b, sisa;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                   Selamat Datang di HITUNG FPB \

                        ==================================================\
                        
                        """
        );

        // Input bilangan
        System.out.print("Masukkan bilangan ke-1 : ");
        a = scan.nextInt();

        System.out.print("Masukkan bilangan ke-2 : ");
        b = scan.nextInt();

        // Hitung FPB langsung di dalam main
        while (b != 0) {
            sisa = a % b;
            a = b;
            b = sisa;
        }

        System.out.println("FPB adalah --> " + a);
    }
}
//Tugas Milik Kinantan