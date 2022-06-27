/**
    - Untuk Membuat function yang mengembalikan nilai (return value), kita dapat menambahkan tipe data dari value yang
      dikembalikan oleh sebuah function dengan return value, setelah itu didalam function tersebut harus mengembalikan
      data (return value).
    - Misalnya ketika value yang dikembalikan oleh sebuah function dengan return value bernilai String maka tipe data
      yang ditambahkan pada function tersebut adalah String. Contoh : 'fun areaOfTriangle(alas: Double, tinggi: Double): Double{}'.
    - Sama seperti di Java, Untuk mengembalikan data dari function dapat menggunakan keyword 'return', diikuti dengan data/valuenya.
 */
fun main() {
    val result: Double = areaOfTriangle(alas = 5.0, tinggi = 6.0)
    println("Luas Segitiga : $result")
    println("= = = = = = = = ")

    val result1: Double = division(numberA = 20.0, numberB = 10.0)
    println("Hasil Pembagian : $result1")

    val result2: Double = division(numberA = 10.0, numberB =0.0)
    println("Hasil Pembagian : $result2")
}

fun areaOfTriangle(alas: Double, tinggi: Double): Double{
    println("Alas   : $alas")
    println("Tinggi : $tinggi")
    return ((alas * tinggi) / 2)
}

fun division(numberA: Double, numberB: Double): Double{
    println("Number A : $numberA")
    println("Number B : $numberB")
    if (numberB == 0.0){
        return 0.0
    }else{
        return numberA/numberB
    }
}