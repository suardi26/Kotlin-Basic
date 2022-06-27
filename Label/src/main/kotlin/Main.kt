/**
    - Label adalah penanda.
    - Semua expression pada Kotlin dapat ditandai dengan label.
    - Untuk membuat label pada Kotlin, cukup dengan menggunakan nama label lalu diikuti dengan karakter '@'.

    Kegunaan Label :
    - Salah satu kegunaan label adalah dapat diintegrasikan dengan break, continue, dan return (Control Flow).
    - Biasanya keyword 'break', 'continue' dan 'return' dapat menghentikan proses pada block code entah itu perulangan (looping)
      atau function tersebut. akan tetapi dengan menggunakan label, kita dapat menentukan code  yang akan berhenti, sesuai dengan
      label yang ditentukan.

 */

// Contoh function (kasus return (Control Flow).
fun print(name: String, say: (String) -> Unit): Unit = say(name)

fun main() {
    // Contoh 1 : Menambahkan label pada source code.
        loopI@ for (i in 1..10){
            loopJ@ for (j in 1..10){
                println("$i x $j = ${i * j}")
            }
        }
        println("= = = = = = = = = = = = = =")

    // Contoh 2 : Menambahkan label pada source code.
        loopA@ for (i in 1..10){
            loopB@ for (j in 1..10){
                print("$j x $i = ${i * j}\t\t")
            }
            println()
        }
        println("= = = = = = = = = = = = = =")

    // Contoh 3 : penggunaan label dapat diintegrasikan dengan break (Control Flow).
        loopA@ for (i in 1..10) {
            loopB@ for (j in 1..10) {
                if (i == 6){
                    // Ketika menggunakan keyword 'break' saja maka blok code yang berhenti adalah loopB@ saja, namun
                    // ketika break di kombinasikan dengan label '@loopA' maka block code yang berhenti adalah perulangan
                    // dengan label '@loopA'
                    break@loopA
                }
                print("$j x $i = ${i * j}\t\t")
            }
            println()
        }
        println("= = = = = = = = = = = = = =")

    // Contoh 4 : penggunaan label dapat diintegrasikan dengan continue (Control Flow).
        loopA@ for (i in 1..10) {
            loopB@ for (j in 1..10) {
                if (i == 6){
                    // Ketika menggunakan keyword 'continue' saja maka blok code yang skip 1 kali perulangan adalah 'loopB@' saja,
                    // namun ketika 'continue' di kombinasikan dengan label '@loopA' maka block code yang di skip 1 kali perulangan
                    // adalah perulangan dengan label '@loopA'.
                    continue@loopA
                }
                print("$j x $i = ${i * j}\t\t")
            }
            println()
        }
        println("= = = = = = = = = = = = = =")

    // Contoh 5 : penggunaan label dapat diintegrasikan dengan return (Control Flow).
        print("Daud") printLabel@{
            if(it.isBlank()){
                // dapat menghentikan lambda dengan memanggil label lambda tersebut dikombinasikan dengan return.
                return@printLabel
            }else {
                println(it)
            }
        }
        println("= = = = = = = = = = = = = =")
}