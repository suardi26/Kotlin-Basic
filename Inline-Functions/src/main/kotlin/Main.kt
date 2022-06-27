/**
    - Menggunakan Higher-Order Function adalah salah satu fitur yang sangat berguna. Akan tetapi penggunaan Higher-Order-Function
      akan berdampak terhadap performa saat aplikasi berjalan, karena harus membuat object lambda berulang-ulang. jika
      penggunaannya tidak terlalu banyak mungkin tidak akan terasa, tapi jika banyak sekali maka akan terasa impact-nya.
    - Inline Functions adalah kemampuan pada Kotlin yang mengubah Higher-Order Function menjadi Inline Function.
    - Dimana dengan Inline Function, code di dalam Higher-Order Function akan di duplicate agar pada saat runtime, aplikasi
      tidak perlu membuat object lambda berulang-ulang.
    - Jadi ketika di compile maka code lambda akan berubah menjadi function biasa yang telah diduplikasi sesuai dengan keinginan
      kita, sehingga tidak membuat object lambda berulang-ulang seperti Higher-Order Function.
    - Untuk melihat perbedaan Higher-Order Function dengan Inline function terletak pada Bytecode.
    - Untuk melihat secara detail bytecode Kotlin pada Intellij IDEA dapat masuk ke menu Tools kemudian pilih Kotlin dan pilih
      Show Kotlin Bytecode.
    - Jadi menggunakan inline-function sesuai kebutuhan dikarenakan ketika menggunakan inline-function bytecode-nya akan
      sangat besar karena code function-nya di duplikat namun ketika terjadi looping berkali-kali maka dapat menggunakan
      inline-function.
    Noinline
    - Pada saat menandai bahwa function adalah inline, maka secara otomatis semua parameter akan menjadi inline.
    - Ketika kita ingin tidak semua parameter pada function menjadi inline dan tetap membuat object maka kita dapat
      menandai parameter tersebut dengan keyword 'noinline'.
 */
// Membuat Higher-Order Function menjadi inline function dengan menambahkan keyword 'inline' pada
// function yang menjadikan lambda sebagai parameter.
inline fun sayHello (name: () -> String): String{
    return "Hello ${name()}"
}

// Membuat Higher-Order Function menjadi inline function dengan menambahkan keyword 'inline' pada
// function yang menjadikan lambda sebagai parameter dan menambahkan juga keyword 'noinline' pada salah satu parameter
// function, sehingga terdapat satu parameter yang inline dan juga satu parameter yang tidak inline.
inline fun sayHelloFullname (name: () -> String,
                            noinline lastName: () -> String): String{
    return "Hello ${name()} ${lastName()}"
}

// Membuat Higher-Order Function.
// inline fun sayHello1 (name: () -> String): String{
//    return "Hello ${name()}"
//}

fun main() {
    // Memanggil inline function
    println(sayHello({"Suardi"}))
    println(sayHello() {"Daud"}) // Trailing Lambda
    println(sayHello {"Manda"}) // Trailing Lambda

    // Memanggil inline function dengan 1 parameter inline dan 1 parameter 'noinline'
    println(sayHelloFullname({"Suardi"},{"Daud"}))

}