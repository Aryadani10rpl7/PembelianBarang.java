import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        String platNomor;
        int jumlahJam;
        double Harga;

        Scanner s = new Scanner(System.in);
        System.out.print("Massukkan Nomor Plat: ");
        platNomor = s.nextLine();
        System.out.print("Jumlah Jam: ");
        jumlahJam = s.nextInt();

        if(jumlahJam > 0 && jumlahJam <=1){
            Harga = 3000;
        } else if(jumlahJam >1 && jumlahJam <=4){
            Harga = 7000;
        } else if (jumlahJam >4){
            Harga = 10000;
        } else {
            Harga = 0;
            System.out.print("System Error: ");
        }

        System.out.println(platNomor);
        System.out.println(" Tarif Parkir: "+Harga);
    }
}
