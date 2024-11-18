import java.util.Scanner;

public class tugas5_print_karakter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        char input_user;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                 Selamat Datang di PRINT KARAKTER \

                        ==================================================\
                        
                        """
        );

        //Input User
        do {
            System.out.print("Masukkan karakter : ");
            input_user = scan.next().charAt(0);

            if (input_user != 'x' && input_user != 'X'){
                System.out.println("Char --> " + input_user);
                System.out.println("gunakan (x) untuk keluar");
            }
        } while (input_user != 'x' && input_user != 'X'); //Break
    }
}
//Tugas Milik Kinantan