/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Menghapus_Duplikat_Array {
    
     public static void main(String[] args) {
        // Data array yang mengandung angka duplikat
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;

        // Array baru untuk menyimpan hasil akhir tanpa duplikat
        int[] hasil = new int[n];
        int indeks = 0; // Menunjukkan posisi kosong di array hasil

        // Mengecek setiap angka dalam array asli
        for (int i = 0; i < n; i++) {
            boolean duplikat = false; // Menandai apakah angka sudah pernah dimasukkan ke hasil

            // Periksa apakah angka ini sudah ada di array hasil
            for (int j = 0; j < indeks; j++) {
                if (array[i] == hasil[j]) {
                    duplikat = true; // Kalau sudah ada, tandai sebagai duplikat
                    break;
                }
            }

            // Kalau belum ada, masukkan ke array hasil
            if (!duplikat) {
                hasil[indeks] = array[i];
                indeks++; // Naikkan indeks untuk posisi selanjutnya
            }
        }

        // Cetak isi array tanpa duplikat
        System.out.print("Array tanpa duplikat: [");
        for (int i = 0; i < indeks; i++) {
            System.out.print(hasil[i]);
            if (i < indeks - 1) System.out.print(", "); // Tambahkan koma jika bukan elemen terakhir
        }
        System.out.println("]");
    }
}
