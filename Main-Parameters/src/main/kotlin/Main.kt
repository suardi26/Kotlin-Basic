/**
    - Saat menjalankan Program, mungkin kita butuh input parameter dari luar.
    - Bisa untuk konfigurasi program, ataupun yang lainnya.
    - Kotlin mendukung paramter untuk main function.
    - Tipe data dari main parameter adalah Array of String 'Array<String>'.
 */
fun main(args: Array<String>) {
    for (data in args){
        println(data)
    }
}