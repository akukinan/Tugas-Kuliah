import java.util.Scanner;

public class tugas5_hitung_mean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        int i, n;
        double nilai_n, total, mean;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                Selamat Datang di HITUNG RATA RATA \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Input banyak data : ");
        n = scan.nextInt();
        total = 0;

        //Operator
        i = 1;
        while (i <= n){
            System.out.println("Input nilai ke " + i + " :");
            nilai_n = scan.nextDouble();
            total = total + nilai_n;
            i++;
        }
        mean = total / n;
        System.out.println("Jumlah Bilangan --> " + total);
        System.out.println("Rata-rata bilangan --> " + mean);
    }
}
//Tugas Milik Kinantan