/**
    - Fungsi Rekursif adalah fungsi yang memanggil dirinya sendiri.
    - Fungsi rekursif diimplementasikan dalam sebuah fungsi yang memanggil dirinya sendiri, sehingga terjadilah
      perulangan didalam fungsi tersebut tanpa menggunkan for, while atau do-while dan dapat diakhiri dengan sebuah kondisi.
    - Dalam beberapa kasus, kita dapat menyelesaikan sebuah masalah menggunakan recursive function dengan lebih mudah
      dibandingkan tidak menggunakan recursive function misalnya factorial.
 */
fun main() {

    // Contoh membuat recursive function dengan kasus factorial.
    fun factorial(value: Int): Int{
       return when (value){
           1 -> value
           else -> value * (factorial(value - 1))
       }
    }

    // Contoh membuat For Looping dengan kasus factorial.
    fun factorialFor(value: Int): Int{
        var result = 1;
        for (i in value downTo 1){
            result *= i
        }
        print("Faktorial : $value! adalah => ")
        return result
    }

    // Memanggil recursive function dengan kasus factorial.
    var value1 = factorial(5)
    println("Faktorial : 5! adalah => $value1")

    // Memanggil function For Looping dengan kasus factorial.
    var value2 = factorialFor(10)
    println(value2)

}