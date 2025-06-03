/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Menggabungkan_Dua_Array {

    public static void main(String[] args) {
        // Membuat array pertama yang isinya angka 1 sampai 5
        int[] array1 = {1, 2, 3, 4, 5};

        // Membuat array kedua yang isinya angka 6 sampai 10
        int[] array2 = {6, 7, 8, 9, 10};

        // Membuat array baru untuk menampung gabungan dari array1 dan array2
        // Ukurannya adalah jumlah dari panjang array1 dan array2
        int[] arrayGabungan = new int[array1.length + array2.length];

        // Memasukkan semua isi array1 ke arrayGabungan mulai dari indeks 0
        for (int i = 0; i < array1.length; i++) {
            arrayGabungan[i] = array1[i];
        }

        // Memasukkan semua isi array2 ke arrayGabungan, dimulai setelah elemen array1
        for (int i = 0; i < array2.length; i++) {
            arrayGabungan[array1.length + i] = array2[i];
        }

        // Menampilkan hasil dari array yang sudah digabung ke layar
        System.out.print("Hasil Dua Array Setelah digabung yaitu ");
        for (int i = 0; i < arrayGabungan.length; i++) {
            System.out.print(arrayGabungan[i] + " ");
        }
    }    
}
