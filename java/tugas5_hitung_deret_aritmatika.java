import java.util.Scanner;

public class tugas5_hitung_deret_aritmatika {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int a, b, n, Un, total, i;
        total = 0;

        /*
        --> Note <--
        a  = suku pertama
        b  = beda tiap suku
        n  = jumlah suku
        Un = jumlah deret aritmatika

         */

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                            Selamat Datang di HITUNG DERET ARITMATIKA \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.print("Masukkan suku pertama : ");
        a = scan.nextInt();
        System.out.print("Masukkan beda tiap suku : ");
        b = scan.nextInt();
        System.out.print("Masukkan jumlah suku : ");
        n = scan.nextInt();

        //Operator Deret
        for (i = 1; i <= n; i++) {
            Un = a + (i - 1) * b;
            total += Un;
        }

        //Output
        System.out.println("Jumlah deret aritmatika : " + total);
    }
}
//Tugas Milik Kinantan