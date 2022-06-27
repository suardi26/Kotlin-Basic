/**
    - While adalah salah satu jenis perulangan lain yang ada di Kotlin.
    - Berbeda dengan 'for', perulangan 'while' sangat fleksibel.
    - While Loop adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai suatu kondisi
      tidak terpenuhi, sehingga kode program dapat dieksekusi berulang kali sesuai dengan kondisi yang ditentukan.
*/
fun main() {
    // Contoh While Loop.
    println("START")
    var start = 0
    while (start < 10){
        println("While Loop ke-${start+1}")
        start++
    }
    println("END")
}