package com.company.project.util

import com.company.project.database.sayHello

/**
    Package
    - Sama seperti pada java, package juga ada di kotlin.
    - package adalah tempat yang dapat digunakan untuk mengelompokan kode program yang dibuat pada Kotlin.
    - Dengan menggunakan package, kita dapat merapikan kode program Kotlin yang kita buat.
    - Nama package di Kotlin biasanya menggunakan huruf kecil semua, dan ketika ingin membuat sub package dapat menggunakan
      tanda '.' (titik), contoh : 'aplikasi.data', jadi ketika ingin membuat sub package sama dengan membuat package didalam package.
    - Jadi package merupakan sebuah folder yang mengelompokan kode program kotlin sesuai fungsinya, sehingga tidak berantakan
      dan sulit dimengerti.

    Import
    - Secara Standar, file Kotlin hanya dapat mengakses file Kotlin lainnya yang berada dalam package yang sama.
    - Jika kita ingin mengakses file Kotlin yang berada diluar package, maka kita dapat menggunakan keyword 'import'.
    - Saat melakukan import, kita dapat meng-import bagian tertentu atau semua file dengan menggunakan tanda '*', contoh :
        - 'import com.company.project.database.sayHello' => mengimpor function sayHello pada package 'com.company.project.database'.
        - 'import com.company.project.database.*' => mengimpor semua function yang ada pada package 'com.company.project.database'.
 */

fun main() {
    sayHello("Daud")

    // Ketika tidak ingin menggunakan 'import' untuk mengakses function yang berbeda package maka dapat langsung
    // menyebutkan nama package-nya diikuti dengan tanda '.' dan nama functionnya :
    com.company.project.database.footer("Daud")

}
