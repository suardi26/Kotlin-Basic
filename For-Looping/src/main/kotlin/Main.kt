/**
    - For Looping adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan.
    - 'For' digunakan untuk melakukan perulangan iterasi dari data iterator.
    - Data iterator (Array, Range, dll).
 */
fun main() {

    // Contoh For Looping (Array).
        val products = arrayOf("Dettol","Pepsodent","Enzim")
        for (name in products){
            println(name)
        }
        println("= = = = = = = = = = = = = = = =")

    // Contoh For Looping (Range).
        for (number in 1..10){
            println(number)
        }

        val numbers = 9 downTo 1 step 3
        for (number in numbers){
            println(number)
        }
        println("= = = = = = = = = = = = = = = =")

    // Contoh Kombinasi dari data (Range) dan data Array
        for (i in 0..(products.size-1)){
            println("Data Array ke-$i : ${products[i]}")
        }
}