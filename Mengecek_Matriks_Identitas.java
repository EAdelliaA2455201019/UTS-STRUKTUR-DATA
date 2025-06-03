/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Mengecek_Matriks_Identitas {
    
     public static void main(String[] args) {

        // Matriks 3x3 yang akan dicek
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean adalahIdentitas = true; // Asumsi awal matriks adalah matriks identitas

        // Memeriksa setiap elemen matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    // Elemen diagonal harus 1
                    if (matriks[i][j] != 1) {
                        adalahIdentitas = false;
                        break;
                    }
                } else {
                    // Elemen bukan diagonal harus 0
                    if (matriks[i][j] != 0) {
                        adalahIdentitas = false;
                        break;
                    }
                }
            }
            if (!adalahIdentitas) {
                break;
            }
        }

        // Menampilkan hasil pengecekan
        if (adalahIdentitas) {
            System.out.println("Matriks tersebut adalah matriks identitas.");
        } else {
            System.out.println("Matriks tersebut bukan matriks identitas.");
        }
    }
}
