/**
    - Closure adalah kemampuan sebuah function, lambda atau anonymous function saling berinteraksi dengan data-data disekitarnya
      dalam scope yang sama.
    - Misalnya kita membuat function 'main' dan didalamnya terdapat data-data variable dan juga function, lambda atau
      anonymous class maka function, lambda, anonymous class yang di dalamnya dapat mengakses data-data variable tersebut.
    - Harap gunakan fitur Closure ini dengan bijak saat membuat aplikasi dikarenakan fitur ini dapat mengubah data milik orang lain.
 */
fun main() {
    var counter: Int = 0

    //  Contoh Function lambda expression mengakses data dari luar blok code lambda, namun dalam satu function 'main'.
        val lambdaIncrement: () -> Unit ={
            println("Lambda Increment $counter")

            // contoh Closure => dapat mengakses data dari luar function 'lambdaIncrement'
            counter++

        }
        lambdaIncrement()
        lambdaIncrement()
        println("= = = = = = = =")

    //  Contoh Anonymous Function mengakses data dari luar blok code Anonymous Function, namun dalam satu function 'main'.
        val anonymousIncrement = fun (): Unit{
            println("Anonymous Function $counter")

            // contoh Closure => dapat mengakses data dari luar function 'anonymousIncrement'
            counter++
        }
        anonymousIncrement()
        anonymousIncrement()
        println("= = = = = = = =")

    //  Contoh Function Biasa mengakses data dari luar blok code Function Biasa, namun dalam satu function 'main'.
        fun functionIncrement(): Unit{
            println("Function $counter")

            // contoh Closure => dapat mengakses data dari luar function 'functionIncrement'
            counter++
        }
        functionIncrement()
        functionIncrement()

}