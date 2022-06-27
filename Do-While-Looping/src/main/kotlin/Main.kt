/**
    - Sama seperti While, do-while adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan, namun
      pada do-while mengeksekusi pernyataan terlebih dahulu kemudian memeriksa suatu kondisi yang telah ditetapkan.
      sedangkan pada while memeriksa suatu kondisi terlebih dahulu setelah itu pernyataan akan dieksekusi bila
      kondisi terpenuhi / bernilai benar.
    - Pada While jika kondisi tidak ada yang benar maka tidak akan pernah di eksekusi perintah pada blok while, namun pada
      do-while jika kondisi tidak ada yang benar maka tetap akan dieksekusi sekali.
 */
fun main() {
    // Contoh Do-While Loop.
    var i = 1
    do {
        println("While Loop Ke-$i")
        i++
    }while(i <= 10)
}