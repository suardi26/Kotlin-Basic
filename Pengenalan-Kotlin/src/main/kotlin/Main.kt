/**
    - Bahasa pemrograman kotlin dikenalkan oleh Perusahaan asal Rusia yaitu JetBrains pada tahun 2011.
    - Kotlin adalah bahasa pemrograman yang berjalan diatas JVM (Java Virtual Machine) dan Kotlin dapat terintegrasi
      dengan bahasa pemrograman Java dan teknologi Java.
    - Tahun 2019, Google mengumumkan bahwa Kotlin adalah bahasa pemrograman utama yang direkomendasikan untuk pengembangan
      aplikasi Android. Sebelumnya adalah Java.
    - Bahasa pemrograman Kotlin lebih sederhana dibanding Java.
    - Dikarenakan Kotlin terintegrasi langsung dengan java maka sangat menarik untuk belajar Kotlin,
      Ibarat Kotlin bahasa pemrograman yang kekinian namun dapat menggunakan teknologi yang stabil seperti Java.
      Misalnya tekonologi teknologi yang popular di Java dapat digunakan di Kotlin seperti Spring yang merupakan
      framework backend Java, dapat mendukung Kotlin.

    SDK (Software Development Kit)
    - SDK adalah perangkat lunak yang digunakan untuk proses development.
    - SDK digunakan untuk melakukan proses kompilasi kode program Kotlin dan menjalankan kode program Kotlin.
    - SDK Untuk Kotlin adalah dengan menginstall JDK (Java Development Kit) minimal versi 8 keatas.

    Proses Development Program Kotlin
    Membutuhkan JDK (Java Development Kit) untuk melakukan compile File.kt (untuk source code Kotlin) menjadi Java
    Binary File.class (file Binary) setelah selesai di compile maka akan di package menjadi satu package  File.jar (Java Archive)
    setelah selesai di package menjadi single file.jar maka akan di running oleh JRE (Java Runtime Environment).

    IDE (Integrated Development Environment)
    - IDE adalah Software yang memiliki beberapa fasilitas yang dapat digunakan untuk membangun perangkat lunak dengan
      bahasa pemrograman tertentu.
    - IDE  dapat juga digunakan untuk melakukan otomatisasi proses kompilasi kode program dan otomatisasi  proses menjalankan
      sebuah program.
    - IDE yang dapat digunakan untuk bahasa pemrograman Kotlin adalah Jetbrains Intellij IDEA.

    Ketika membuat method/function di java harus membutuhkan class sebagai wadah dari function tersebut, berbeda pada Kotlin
    pada saat ingin membuat function tidak wajib membuat class.

 */

// Pada java method/function dapat ditulis dengan menggunakan keyword 'void/Nama variabel untuk return value' sedangkan pada
// Kotlin menggunakan keyword 'fun'.
fun main() {

    // pada java harus menggunakan ';' pada akhir baris code sedangkan pada Kotlin boleh menambahkan ';', boleh tidak.
    println("Test Kotlin")
    println("Test Kotlin");

    print("Test ")
    print("Kotlin")
}