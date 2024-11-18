import java.util.Scanner;

public class tugas5_hitung_deret {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int nilai_N, nilai_total, i;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                  Selamat Datang di HITUNG DERET \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Masukkan nilai N :");
        nilai_N = scan.nextInt();

        //Operator
        nilai_total = 0;
        for (i = 1; i <= nilai_N; i++){
            nilai_total += i;
        }

        //Output User
        System.out.println("Jumlah deret bilangan = " + nilai_total);
    }
}
//Tugas Milik Kinantan