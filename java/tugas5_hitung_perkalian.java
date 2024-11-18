import java.util.Scanner;

public class tugas5_hitung_perkalian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int n, hasil, i, bilangan;
        hasil = 1;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                Selamat Datang di HITUNG PERKALIAN \

                        ==================================================\
                        
                        """
        );

        //Input User (jumlah bilangan)
        System.out.print("Jumlah bilangan yang hendak dikalikan : ");
        n = scan.nextInt();

        //Validator Input User (jumlah bilangan)
        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0!!!");
            return;
        }

        //Input User (nilai bilangan)
        for (i = 1; i <= n; i++) {
            System.out.print("Bilangan ke " + i + ": ");
            bilangan = scan.nextInt();
            hasil *= bilangan; // Mengalikan setiap bilangan dengan hasil sebelumnya
        }

        //Output
        System.out.println("Hasil perkalian dari " + n + " bilangan adalah --> " + hasil);
    }
}
//Tugas Milik Kinantan