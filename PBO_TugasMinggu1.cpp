#include <iostream>
#include <string>
using namespace std;

// Deklarasi struktur Siswa
struct Siswa {
  string nama;
  int nilai[3]; // Array untuk nilai UH, UTS, dan UAS
  int rata;
};

// Fungsi untuk menampilkan siswa terbaik
void tampilkanSiswaTerbaik(Siswa siswa[], int n) {
  int terbesar = 0;
  
  // Mencari siswa dengan nilai rata-rata tertinggi
  for (int i = 1; i < n; i++) {
    if (siswa[i].rata > siswa[terbesar].rata) {
      terbesar = i;
    }
  }

  // Menampilkan data siswa terbaik
  cout << "\nRangking 1 Adalah" << endl;
  cout << "==============================================" << endl;
  cout << "Nama Siswa : " << siswa[terbesar].nama << endl;
  cout << "==============================================" << endl;
  cout << "Nilai UH       : " << siswa[terbesar].nilai[0] << endl;
  cout << "Nilai UTS      : " << siswa[terbesar].nilai[1] << endl;
  cout << "Nilai UAS      : " << siswa[terbesar].nilai[2] << endl;
  cout << "==============================================" << endl;
  cout << "Nilai Akhir    : " << siswa[terbesar].rata << endl;
  cout << "==============================================" << endl;
}

int main() {
  // Jumlah siswa yang akan diinput
  int jumlahSiswa = 3;
  Siswa siswa[jumlahSiswa];

  // Input data siswa
  int i = 0;
  cout << "isi data siswa(klik enter)" ;
  do {
    cin.ignore();
    cout << "\nNama        : ";
    getline(cin, siswa[i].nama);
    cout << "Nilai UH    : ";
    cin >> siswa[i].nilai[0];
    cout << "Nilai UTS   : ";
    cin >> siswa[i].nilai[1];
    cout << "Nilai UAS   : ";
    cin >> siswa[i].nilai[2];
    
    // Menghitung nilai rata-rata
    siswa[i].rata = (siswa[i].nilai[0] + siswa[i].nilai[1] + siswa[i].nilai[2]) / 3;
    
    // Menampilkan status lulus atau tidak lulus
    if (siswa[i].rata >= 60) {
      cout << "Lulus";
    } else {
      cout << "Tidak lulus";
    }
    cout << endl;
    i++;
  } while (i < jumlahSiswa);
  cout<<endl;

  // Perulangan while untuk menampilkan data siswa
  int j = 0;
  while (j < jumlahSiswa) {
    cout << "Data Siswa " << j + 1 << ": " << siswa[j].nama << ", Nilai Akhir: " << siswa[j].rata << endl;
    j++;
  }
  
  // Menampilkan data siswa terbaik
  tampilkanSiswaTerbaik(siswa, jumlahSiswa);

  // Array multidimensi 
  int baris = 3;
  int kolom = 3;
  int matriks[baris][kolom] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

  // Menampilkan isi array multidimensi
  cout << "\nIsi Array Multidimensi:" << endl;
  for (int row = 0; row < baris; row++) {
    for (int col = 0; col < kolom; col++) {
      cout << matriks[row][col] << " ";
    }
    cout << endl;
  }

  return 0;
}
