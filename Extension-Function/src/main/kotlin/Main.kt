/**
    - Extention function adalah Kemampuan untuk menambahkan function pada tipe data yang sudah ada. misal: String, Double, dll.
    - Dan pada dasarnya tipe data yang disediakan oleh Kotlin tidak dapat diubah-ubah lagi seperti : String, Double, dll.
      namun kita dapat menambahkan extention function pada tipe data tersebut.
    - Extention function dapat juga digunakan ketika kita ingin menambahkan function dari library/file-file Kotlin orang lain
      yang tidak dapat diubah lagi.
    - Extention function adalah salah satu fitur yang sangat powerfull, namun harap bijak dalam membuat Extention function,
      karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti.
    - Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function-nya,lalu diikuti dengan tanda '.'(titik).
        Contoh : 'fun String.sayHello(): String{ return "Hello $this" }'
    - Untuk mengakses data dari tipe data yang digunakan pada extension function, Maka dapat menggunakan keyword 'this'.
    - Keyword 'this' digunakan untuk mengakses data dari tipe data yang digunakan.
 */
fun main() {
    // Memanggil Extention function dari tipe data String.
    val name: String = "Suardi"
    val sayHello = name.sayHello()
    println(sayHello)
    println("Daud".sayHello())

    val name1: String = "Manda"
    name1.printOut()
    "Manda".printOut()

}

// Contoh membuat Extention function dari tipe data String.
fun String.sayHello(): String{
    return "Hello $this"
}
fun String.printOut(): Unit{
    println("Hello $this, How Are You ?")
}