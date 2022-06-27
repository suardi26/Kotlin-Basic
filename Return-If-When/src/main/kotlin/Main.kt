/**
    - Pada Saat membuat function, kita sering menggunakan if expression atau when expression, lalu didalam blok-nya kita
      mengembalikan nilai untuk sebuah function.
    - Kotlin mendukung return value sebelum kondisi if atau when, dimana fitur ini bisa mempermudah kita ketika ingin
      mengembalikan nilai dalam if atau when.
 */
fun main() {
    // Membuat function dengan keyword return sebelum dari expression if atau when.
    fun sayHello(name: String = ""): String{
        return if (name == ""){
            "Hello there" // tidak lagi menambahkan keyword return satu per satu tiap kondisinya contoh : 'return "Hello there" '
        }else{
            "Hello $name"
        }
    }
    fun printNumber(numberA: Int): String{
        return when (numberA){
            1 -> "1 = Satu" // tidak lagi menambahkan keyword return satu per satu tiap kondisinya contoh : 'return "1 = Satu" '
            2 -> "2 = Dua"
            3 -> "3 = Tiga"
            4 -> "4 = Empat"
            5 -> "5 = Lima"
            else -> "Mohon Maaf Silahkan Masukan Angka yang valid (1-5)"
        }

    }

    // Memanggil function dengan keyword return sebelum dari expression if atau when.
    val name = sayHello("Daud")
    println(name)
    println(sayHello())
    println("= = = = = = = = = = = =")
    val numberToString = printNumber(3)
    println(numberToString)
    print(printNumber(7))

}