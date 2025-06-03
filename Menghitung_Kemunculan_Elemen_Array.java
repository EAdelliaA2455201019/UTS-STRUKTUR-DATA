/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Menghitung_Kemunculan_Elemen_Array {
    
     public static void main(String[] args) {
        // Data array yang akan dihitung kemunculan tiap angkanya
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Perulangan untuk mengecek setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            boolean sudahDihitung = false; // Menandai apakah angka ini sudah pernah dihitung

            // Mengecek apakah angka ini sudah muncul sebelumnya
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true; // Kalau sudah, tidak perlu dihitung lagi
                    break;
                }
            }

            // Kalau belum dihitung, lanjut hitung jumlah kemunculannya
            if (!sudahDihitung) {
                int jumlah = 1; // Awalnya dihitung satu kali

                // Cek sisa array untuk mencari angka yang sama
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i] == array[k]) {
                        jumlah++; // Tambahkan jika ditemukan angka yang sama
                    }
                }

                // Cetak hasil jumlah kemunculan angka
                System.out.println("Angka " + array[i] + " muncul sebanyak " + jumlah + " kali.");
            }
        }
    }
}