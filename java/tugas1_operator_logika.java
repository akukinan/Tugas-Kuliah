public class tugas1_operator_logika {
    public static void main(String[] args) {

        //Buat Variable
        int x,y,z;
        boolean check;
        x=10; y=15; z=20;

        //operator logika
        check= (x <y)&(x>z); System.out.println("status :" +check);
        check= (x <y)&&(x<z); System.out.println("status :" +check);
        check= (x <y)|(x<z); System.out.println("status :" +check);
        check= (x <y)|| (x<z); System.out.println("status :" +check);
        check= !(x<z); System.out.println("status :" +check);
    }
}
//Tugas Milik Kinantan