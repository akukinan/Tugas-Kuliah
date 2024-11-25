import java.util.Scanner;

public class tugas6_hitung_faktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int n, i, hasil = 1;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                Selamat Datang di HITUNG FAKTORIAL \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Silahkan masukkan angka yang hendak dihitung : ");
        n = scan.nextInt();

        //Operator
        for (i = 1; i <= n; i++) {
            hasil *= i;
        }

        //Output
        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
    }
}
//Tugas Milik Kinantan