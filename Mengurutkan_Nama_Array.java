/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_2455201019;

/**
 *
 * @author WINDOWS 10
 */
public class Mengurutkan_Nama_Array {
    
  public static void main(String[] args) {

        // Daftar nama yang akan diurutkan
        String[] names = {"fikar", "adel", "seira", "satanas", "electra"};

        // Membuat salinan array untuk diurutkan dengan Insertion Sort
        String[] insertionSorted = names.clone();
        insertionSort(insertionSorted);
        System.out.println("Pengurutan Nama Menggunakan Algoritma Insertion Sort:");
        cetakArray(insertionSorted);

        // Membuat salinan array untuk diurutkan dengan Selection Sort
        String[] selectionSorted = names.clone();
        selectionSort(selectionSorted);
        System.out.println("Pengurutan Nama Menggunakan Algoritma Selection Sort:");
        cetakArray(selectionSorted);

        // Membuat salinan array untuk diurutkan dengan Bubble Sort
        String[] bubbleSorted = names.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Pengurutan Nama Menggunakan Algoritma Bubble Sort:");
        cetakArray(bubbleSorted);
    }

    // Metode untuk mengurutkan array dengan Insertion Sort
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i]; // Simpan nama yang akan dipindahkan
            int j = i - 1;

            // Geser nama yang lebih besar ke kanan untuk memberi tempat
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Tempatkan nama pada posisi yang tepat
            arr[j + 1] = key;
        }
    }

    // Metode untuk mengurutkan array dengan Selection Sort
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indeksTerkecil = i; // Anggap posisi i adalah yang terkecil

            // Cari nama terkecil di bagian yang belum diurutkan
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[indeksTerkecil]) < 0) {
                    indeksTerkecil = j; // Update indeks nama terkecil
                }
            }

            // Tukar nama terkecil dengan nama di posisi i
            String temp = arr[indeksTerkecil];
            arr[indeksTerkecil] = arr[i];
            arr[i] = temp;
        }
    }

    // Metode untuk mengurutkan array dengan Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;

        // Lakukan perulangan sebanyak n-1 kali
        for (int i = 0; i < n - 1; i++) {
            // Bandingkan setiap pasangan nama bersebelahan
            for (int j = 0; j < n - 1 - i; j++) {
                // Jika nama di kiri lebih besar, tukar posisi
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Fungsi untuk menampilkan isi array ke layar
    public static void cetakArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println(); // Pindah baris setelah menampilkan semua nama
    }
}