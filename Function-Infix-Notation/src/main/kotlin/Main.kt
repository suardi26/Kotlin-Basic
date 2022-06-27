/**
    - Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap 2 data.
    - Hampir semua operasi matematika adalah infix notation, misalnya = '+','-',dll, dimana dapat digunakan ketika
      ada 2 buah data yang dioprasikan.
    - Pada Kotlin kita dapat membuat function infix notation.
    - Untuk Membuat Function Infix Notation  dapat menggunakan keyword 'infix' sebelum keyword 'fun' :
        contoh : 'infix fun String.addString(name: String): String{  return "Hello $name" }'
    - Dan untuk menggunakan function infix notation, tidak wajib menggunakan tanda '.' (titik).
    - Dan Function infix yang sering dipake adalah 'downTo' contoh =>  "var number = 100 downTo 1".

    Syarat Function Infix Notation.
    - Harus Sebagai function member (function sebuah class) atau function extension
    - Harus Memiliki 1 paraneter, tidok boleh kosong atau pun lebih dari 1 parameter
      karena Nilai dari data/Objectnya akan ditambahkan dengan sebuah parameter.
    - Parameter tidak boleh varargs dan tidak boleh memiliki nilai default.
 */

fun main() {

    // Memanggil Function Infix Notation
    val name: String = "Suardi"
    // val value = name.addString("Hello") // tidak wajib menggunakan tanda '.' (titik)
    val value = name addString "Hello"
    println(value)
    println("Suardi" addString "How are you")

    val number1 = 10
    // val result = 10.sum(20) // tidak wajib menggunakan tanda '.' (titik)
    val result = 10 sum 20 // Mirip dengan Infix Notation penjumlahan "val result = 10 + 20"
    println("10 + 20 = $result")
    println("10 + 20 = ${10 sum 20}")
}

// Contoh Membuat Function Infix Notation
infix fun String.addString(word: String): String{
    return "$word $this"
}

infix fun Int.sum(number: Int): Int{
    return this + number
}
