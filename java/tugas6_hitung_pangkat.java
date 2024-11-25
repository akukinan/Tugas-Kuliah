import java.util.Scanner;

public class tugas6_hitung_pangkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        double bilangan, pangkat, hasil = 1, i;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                 Selamat Datang di HITUNG PANGKAT \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Masukkan bilangan : ");
        bilangan = scan.nextInt();
        System.out.println("Masukkan pangkat : ");
        pangkat = scan.nextInt();

        //Operator
        for (i = 0; i < pangkat; i++){
            hasil *= bilangan;
        }

        //Output
        System.out.println("Hasilnya adalah --> " + hasil);
    }
}
//Tugas Milik Kinantan