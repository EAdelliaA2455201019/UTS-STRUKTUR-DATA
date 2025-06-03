/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Transposisi_Matriks {
    
      public static void main(String[] args) {

        // Matriks 3x3 awal
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matriks hasil transposisi dengan ukuran yang sama
        int[][] transposisi = new int[3][3];

        // Melakukan transposisi: menukar baris menjadi kolom
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposisi[j][i] = matriks[i][j];
            }
        }

        // Menampilkan matriks hasil transposisi
        System.out.println("Matriks Hasil Transposisi:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposisi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
