/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Membalikkan_Array {
    
    public static void main(String[] args) {
        // Membuat array yang berisi bilangan bulat dari 1 hingga 5
        int[] array = {1, 2, 3, 4, 5};

        // Menampilkan elemen-elemen array sebelum dibalik
        System.out.print("Input Elemen Sebelum dibalik: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Menampilkan elemen-elemen array setelah dibalik
        System.out.print("\nOutput Elemen Setelah dibalik: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    
}
