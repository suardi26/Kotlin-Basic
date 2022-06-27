/**
    - Keyword Break & continue dapat digunakan dalam semua perulangan (for, while, do-while) pada Kotlin
    - Keyword break adalah perintah yang digunakan untuk mengatur alur perulangan program
      yang memaksa sebuah proses perulangan berhenti.
    - Sama seperti Keyword break, Keyword continue adalah perintah yang digunakan untuk mengatur alur
      perulangan program dimana Keyword continue adalah perintah yang melewati 1 kali proses iterasi
      dan melanjutkan ke iterasi berikutnya dalam perulangan.
    - Keyword return adalah perintah yang digunakan untuk keluar dari method atau fungsi dalam sebuah program.

 */
fun main() {

    // Contoh keyword Break
        val products = arrayOf("Dettol", "Enzim", "Pepsodent", "Dove", "Biore")

        for (i in 0..(products.size-1)){

            println("product ke-${i + 1} : ${products[i]}")
            if (i == 2){
                break
                /*
                   Perintah Break diatas memaksa program untuk keluar dari perulangan ketika i = 2 meskipun
                   jumlah perulangan yang dimasukan sesuai data array yaitu 5.
                */
            }

        }
        println("= = = = = = = = = =")

    // Contoh keyword Continue
        for (i in 0..(products.size-1)){
            if (i == 2){
                continue
                /*
                   Perintah continue diatas melewati  iterasi perulangan  ketika i = 2 dan melanjutkan
                   ke iterasi selanjutnya.
               */
            }
            println("product ke-${i + 1} : ${products[i]}")

        }
        println("= = = = = = = = = =")

    // Contoh keyword return
        var u = 0
        while (u < products.size){
            println("product ke-${u + 1} : ${products[u]}")
            if (u == 2){
                return
                /*
                   Program akan melakukan perulangan sebanyak 3 kali (0,1,2) dan setelah itu perintah return diatas akan
                   mengakhiri fungsi utama pada sebuah program, menutup perulangan ini bahkan perintah selanjutnya
                   yang mencetak 'Terima Kasih' tidak akan diproses dikarenakan fungsi return mengakhiri secara
                   keseluruhan perintah yang ada pada fungsi utama.
                */
            }
            u++
        }
        println("Terima Kasih")

}