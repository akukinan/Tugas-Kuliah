public class operator_logika {
    public static void main(String[] args) {

        //buat variable
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
//tugas milik Kinantan