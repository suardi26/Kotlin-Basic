/**
    - Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function.
    - Penggunaan Higher-Order-Function Kadang berguna ketika kita ingin membuat function yang general dan ingin mendapatkan
      input yang flexible berupa lambda, yang bisa dideklarasikan ketika memanggil function tersebut.
    - Higher-Order Function adalah function lambda expression yang digunakan sebagai parameter suatu function.
    - Dengan memasukan function lambda expression pada parameter suatu function maka function tersebut dapat menggunakan
      function lambda expression pada block kode function-tersebut.

    Trailing Lambda
    - Pada saat membuat parameter lambda di bagian terakhir pada subuah function maka dapat menggunakan fitur Trailing Lambda
      untuk memanggil function dengan paramter lambda di bagian akhir paramter sebuah function.
 */

// Membuat function lambda expression sebagai parameter suatu method (1 parameter).
// ket : 'printSimple' adalah parameter yang menampung function lambda expression.
//     : '(Int)' adalah tipe data inputannya.
//     : 'String' adalah tipe data return value dari function lambda expression, yang dapat masuk dan digunakan dalam
//       function ini melalui parameter function ini.
fun printNumber(printSimple: (Int) -> String): String {
    val numberToString = printSimple(2)
    return numberToString
}

// Membuat function lambda expression sebagai parameter suatu method (2 parameter).
// parameter 'toUp' dapat memuat functional lambda expression dengan inputan data bertipe String dan menghasilkan return value String.
fun sayHello(name: String, toUp: (String) -> String):String {
    return "Hai ${toUp(name)}"
}

fun main(){
    // deklarasi function lambda expression '{word: String -> word.uppercase()}'.
    val upper: (String) -> String = {word: String -> word.uppercase()}
    val numberToString: (Int) -> String = {number: Int ->
        when(number){
            1 -> "1 = Satu"
            2 -> "2 = Dua"
            3 -> "3 = Tiga"
            else -> "Masukan angka yang valid = 1,2,3 !!!!!"
        }

    }

    // Memanggil function yang paramternya adalah function lambda expression (1 parameter).
    println(printNumber(numberToString))

    // Memanggil function yang paramternya adalah function lambda expression (2 parameter).
    println(sayHello("Suardi Daud Manda", upper))
    println(sayHello("Donatello", {word: String -> word.uppercase()}))

    // Memanggil function yang paramternya adalah function lambda expression (2 parameter) menggunakan fitur Trailing Lambda.
    // dengan syarat parameter function lambda expression di tambahkan pada bagian terakhir sebuah fucntion.
    val helloWord = sayHello("Daud"){word: String ->
        word.uppercase()
    }
    println(helloWord)

}