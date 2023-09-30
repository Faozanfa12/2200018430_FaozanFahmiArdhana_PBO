import java.util.Scanner;

// Deklarasi kelas Siswa
class Siswa {
    String nama;
    int[] nilai = new int[3]; // Array untuk nilai UH, UTS, dan UAS
    int rata;
}

public class Main {
    // Fungsi untuk menampilkan siswa terbaik
    static void tampilkanSiswaTerbaik(Siswa[] siswa, int n) {
        int terbesar = 0;

        // Mencari siswa dengan nilai rata-rata tertinggi
        for (int i = 1; i < n; i++) {
            if (siswa[i].rata > siswa[terbesar].rata) {
                terbesar = i;
            }
        }

        // Menampilkan data siswa terbaik
        System.out.println("\nRangking 1 Adalah");
        System.out.println("=============================================");
        System.out.println("Nama Siswa : " + siswa[terbesar].nama);
        System.out.println("=============================================");
        System.out.println("Nilai UH       : " + siswa[terbesar].nilai[0]);
        System.out.println("Nilai UTS      : " + siswa[terbesar].nilai[1]);
        System.out.println("Nilai UAS      : " + siswa[terbesar].nilai[2]);
        System.out.println("=============================================");
        System.out.println("Nilai Akhir    : " + siswa[terbesar].rata);
        System.out.println("=============================================");
    }

    public static void main(String[] args) {
        // Jumlah siswa yang akan diinput
        int jumlahSiswa = 3;
        Siswa[] siswa = new Siswa[jumlahSiswa];
        Scanner input = new Scanner(System.in);

        // Input data siswa
        int i = 0;
        System.out.print("isi data siswa(klik enter)");
        do {
            input.nextLine();
            System.out.print("\nNama        : ");
            siswa[i] = new Siswa();
            siswa[i].nama = input.nextLine();
            System.out.print("Nilai UH    : ");
            siswa[i].nilai[0] = input.nextInt();
            System.out.print("Nilai UTS   : ");
            siswa[i].nilai[1] = input.nextInt();
            System.out.print("Nilai UAS   : ");
            siswa[i].nilai[2] = input.nextInt();

            // Menghitung nilai rata-rata
            siswa[i].rata = (siswa[i].nilai[0] + siswa[i].nilai[1] + siswa[i].nilai[2]) / 3;

            // Menampilkan status lulus atau tidak lulus
            if (siswa[i].rata >= 60) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak lulus");
            }
            i++;
        } while (i < jumlahSiswa);
        System.out.println();

        // Perulangan while untuk menampilkan data siswa
        int j = 0;
        while (j < jumlahSiswa) {
            System.out.println("Data Siswa " + (j + 1) + ": " + siswa[j].nama + ", Nilai Akhir: " + siswa[j].rata);
            j++;
        }

        // Menampilkan data siswa terbaik
        tampilkanSiswaTerbaik(siswa, jumlahSiswa);

        // Array dua dimensi
        int baris = 3;
        int kolom = 3;
        int[][] matriks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Menampilkan isi array dua dimensi
        System.out.println("\nIsi Array Dua Dimensi:");
        for (int row = 0; row < baris; row++) {
            for (int col = 0; col < kolom; col++) {
                System.out.print(matriks[row][col] + " ");
            }
            System.out.println();
        }
    }
}