import java.util.Scanner;

public class tugas6_hitung_deret_geometri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int a, r, n , total = 0, i, Un;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                              Selamat Datang di HITUNG DERET GEOMETRI \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Masukkan suku pertama : ");
        a = scan.nextInt();
        System.out.println("Masukkan rasio : ");
        r = scan.nextInt();
        System.out.println("Masukkan jumlah suku : ");
        n = scan.nextInt();

        //Operator
        int sekarang = a;
        for (i = 0; i < n; i++){
            total += sekarang;
            sekarang *= r;
        }

        //Output
        System.out.println("Hasil --> " + total);
    }
}
//Tugas Milik Kinantan