import java.util.Scanner;

public class tugas4_mainan_suit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi Variable
        String user, komputer = "";
        int random;

        //MOTD
        System.out.println(
                """
                        ==================================================\
                        
                                  Selamat Datang di SUIT JAWA \

                        ==================================================\
                        
                        """
        );

        //Input User
        System.out.println("Pilih char (semut, orang, atau gajah) : ");
        user = scan.nextLine().toLowerCase();

        //Validator
        if (!user.equals("semut") && !user.equals("orang") && !user.equals("gajah")) {
            System.out.println("Pilihan tidak valid. Silakan pilih 'semut', 'orang', atau 'gajah'.");
            return;
        }

        //Operator (Random)
        random = (int)(Math.random() * 3);
        switch (random) {
            case 0:
                komputer = "orang";
                break;
            case 1:
                komputer = "semut";
                break;
            case 2:
                komputer = "gajah";
                break;
            default:
                break;
        }

        //Output Character
        System.out.println("USER : " + user);
        System.out.println("BOT  : " + komputer);

        //Output Hasil Randomizer
        if (user.equals(komputer)) {
            System.out.println("Seri");
        } else if ((user.equals("semut") && komputer.equals("orang")) || (user.equals("orang") && komputer.equals("gajah")) || (user.equals("gajah") && komputer.equals("semut"))) {
            System.out.println("Kalah");
        }else {
            System.out.println("Menang");
        }
    }
}
//Tugas Milik Kinantan