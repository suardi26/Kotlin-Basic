/**
    - Function scope adalah ruang lingkup dimana sebuah function dapat diakses.
    - Pada saat membuat function di dalam file Kotlin, maka secara otomatis function tersebut dapat diakses dari file Kotlin
      manapun.
    - Jika ingin membatasi pengaksesan sebuah function misalnya = sebuah function hanya dapat diakses dalam function tertentu,
      maka kita dapat membuat function di dalam function, istilahnya Inner-Function.
    - Membuat function di dalam function dapat membatasi suatu akses dari function tersebut sehingga tidak mengalami Error nama
      function yang sama meskipun berbeda file.
    - Berbeda dengan Java yang membutuhkan sebuah class untuk menampung function, pada Kotlin tidak wajib membuat class
      terlebih dahulu ketika ingin membuat function.

 */

fun main(){
    // Membuat function didalam function.
    // Didalam function 'main' dapat mengakses function 'sayHello' namun diluar function main tidak dapat mengakses
    // function 'sayHello'.
    fun sayHello(name: String):Unit{
        println("Hello $name, How are You ? ")
    }
    sayHello("Suardi")
}

fun printWord(){
    // sayHello("Daud") // ERROR !!!!, tidak dapat mengakses function 'sayHello' yang berada pada function 'main'.
}
