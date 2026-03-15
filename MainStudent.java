import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] siswa = new Student[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("\nData siswa ke-" + (i+1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Umur: ");
            int umur = input.nextInt();

            System.out.print("Nilai Math: ");
            double math = input.nextDouble();

            System.out.print("Nilai English: ");
            double english = input.nextDouble();

            System.out.print("Nilai Science: ");
            double science = input.nextDouble();
            input.nextLine();

            siswa[i] = new Student(nama, alamat, umur, math, english, science);
        }
        Student.jumlahObjek();

        Student s = new Student();

        System.out.println("Pengurangan : " + s.kurang(10,5));
        System.out.println("Perkalian : " + s.kali(10,5));
        System.out.println("Pembagian : " + s.bagi(10,5));

        Student rafi = new Student("Rafi","Wonogiri",20,85,90,88);

        System.out.println("\n===== DATA SISWA =====");

        for(int i = 0; i < jumlah; i++){
            siswa[i].displayMessage();
            System.out.println("--------------------");
        }
        

        System.out.println("Rata-rata >= 80 : " + rafi.lebihBesarSama(80));
        System.out.println("Rata-rata <= 90 : " + rafi.lebihKecilSama(90));
        System.out.println("Rata-rata < 70 : " + rafi.lebihKecil(70));

        input.close();
    }
}