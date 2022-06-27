/**
    - Pada Saat kita ingin membuat function yang sangat sederhana, misalnya function yang hanya berisikan kode blok sederhana,
      misalnya hanya 1 baris maka kita dapat mengubah function menjadi single expression function.
    - Single expression function adalah deklarasi function hanya dengan 1 baris code.
    - Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan) setelah deklarasi nama function
      dan tipe data dari value yang dikembalikan oleh sebuah function dengan return value.
      contoh : 'fun areaOfTriangle(alas: Double, tinggi: Double): Double = (alas * tinggi)/2'
    - Kita tidak membutuhkan keyword "return" ketika membuat Single expression function dengan return value, dikarenakan
      code setelah tanda '=' (sama dengan) merupakan sebuah ekspresi dan akan dijadikan sebagai return value.
    - Dan untuk Single expression function tanpa return value, isi dari function dapat diisi setelah tanda '=' (sama dengan).
 */
fun main() {
    sayHello("donatello")

    val alas = 30.0
    val tinggi = 20.0
    val result = areaOfTriangle(alas = alas, tinggi = tinggi)
    println("Alas Segitiga : $alas, Tinggi Segitiga : $tinggi, Maka Luas Segitiga adalah : $result")
}

// Berikut Contoh Single Expression Function.
fun areaOfTriangle(alas: Double, tinggi: Double): Double = (alas * tinggi)/2
fun sayHello(name: String): Unit = println("Hello $name")