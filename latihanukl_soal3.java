
import java.util.Scanner;
public class latihanukl_soal3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        //SOAL 1 DI SOAL SULIT
        System.out.print("Masukan Jumlah siswa : ");
        int jumsis = input.nextInt();

        if (jumsis <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            input.close();
            return;
        }

        double totnilai = 0;

        for(int i = 1; i <= jumsis; i++ ) {
            System.out.print("Masukan nilai siswa ke- "+ i +" : ");
            double nilai = input.nextDouble();
            totnilai += nilai; // akumulasi benar
        }
        double rata2 = totnilai / jumsis;
        System.out.println("Rata-rata nilai siswa adalah : " + rata2);



        //SOAL 2 DI SOAL SULIT
        System.out.println("=== PROGRAM PENJUMLAHAN DUA MATRIKS ===");

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();
        System.out.println("\nMasukkan elemen-elemen Matriks A:");
        int[][] matriksA = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }
        // Siapkan matriks B dan matriks hasil
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Proses penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("\n=== HASIL PENJUMLAHAN MATRIKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }


        input.close();
    
    }
}
