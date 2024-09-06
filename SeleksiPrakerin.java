import java.util.Scanner;

public class SeleksiPrakerin {
    public static void main(String[] args) {
        String  kelas, nama, perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Nama: ");
        nama = s.nextLine();
        System.out.println("Kelas: (X/XI/XII)");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.println("Perilaku Baik Siswa: (Baik/Cukup) ");
            perilaku = s.next();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Nilai Siswa: ");
                nilai = s.nextInt();
                if(nilai >=85){
                    System.out.println(nama + "Anda Bisa Mengikuti Prakerin");
                }else{
                    System.out.println("Anda Gagal Karena Nilai");
                }
            }else{  
                System.out.println("Anda Gagal Karena Perilaku"); 
            }
        }else{
            System.out.println("Anda Bukan Kelas XII");
        }


    }
}
