/**
    - Pada Pemrograman lain seperti java ada namanya Switch-Case, namun pada pemrograman Kotlin namanya adalah When-Expression.
    - Selain if expression, untuk melakukan percabangan pada Kotlin, kita dapat juga menggunakan When Expression.
    - Biasanya when expression digunakan untuk melakukan pengecekan  ke kondisi dalam satu variable.
 */
fun main() {
val value = 'A'

    // When Expression One Option
        println("= = = = = = = = When Expression One Option = = = = = = = =")
        when(value){
            'A' -> println("Sangat Baik")
            'B' -> println("Baik")
            'C' -> println("Cukup")

                // Bisa juga jika lebih dari satu baris menggunakan cara seperti berikut :
            'D' -> {
                println("Buruk")
            }
            'E' -> {
                println("Coba Lagi Tahun Depan")
            }
            else -> {
                println("Masukan huruf predikat yang sesuai A,B,C,D,E !")
            }

        }

    // When Expression Multiple Option
        println("= = = = = = = = When Expression Multiple Option = = = = = = = =")
        when (value) {
            'A', 'B', 'C' -> {
                println("Selamat Anda Lulus !!!")
            }
            else -> println("Mohon Maaf Anda Belum Lulus !!!")
        }

    // When Expression Multiple Option with operator 'in' dan '!in'
    // Operator 'in' digunakan untuk memeriksa apakah suatu data/object merupakan bagian dari sekumpulan data misalnya data array.
    // misalnya '10 in numberArray' jadi di baca => apakah angka sepuluh ada di data numberArray ? bisa true/false.
        println("= = = = = = = = When Expression Multiple Option with operator 'in' dan '!in' = = = = = = = =")
        val passValues: Array<Char> = arrayOf('A','B','C')
        when (value) {
            in passValues -> {
                println("Selamat Anda Lulus !!!")
            }
            !in passValues -> {
                println("Mohon Maaf Anda Belum Lulus !!!")
            }
        }

    // When Expression Multiple Option with operator 'is' dan '!is'
    // Operator 'is' digunakan untuk memeriksa tipe data dari suatu data/object dalam variable.
        println("= = = = = = = = When Expression Multiple Option with operator 'is' dan '!is' = = = = = = = =")
        val name = "Suardi"
        when (name) {
            is  String -> {
                println("Data tersebut bertipe String")
            }
            !is String -> {
                println("Data tersebut tidak bertipe String")
            }
        }

    // Selain pengecekan terhadap variable , When juga dapat digunakan sebagai pengganti if-else, dan untuk mengganti if-else
    // dengan when, kita tidak perlu menggunakan variable dalam when, dengan begitu kita dapat bebas menambahkan
    // ekspresi apapun.
        println("= = = = = = = = When Expression dengan menambahkan expresi/statement apapun = = = = = = = =")
        val number = 98
        when {
            number >= 75 -> println("Sangat Baik")
            number >= 65 -> println("Baik")
            number >= 55 -> {
                println("Cukup")
            }
            else -> {
                println("Coba lagi Tahun Depan")
            }
        }
}