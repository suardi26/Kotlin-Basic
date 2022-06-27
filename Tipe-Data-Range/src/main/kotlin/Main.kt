/**
    Tipe Data Range
    - Pada saat ingin membuat array yang berisi data angka yang berurutan dan data tersebut misalnya banyak seperti 1 hingga 5000,
      akan sangat ribet.
    - Namun pada Kotlin terdapat tipe data 'Range' yang dapat membuat sekumpulan data angka yang terurut.
    - Cara membuat Range pada Kotlin sangat mudah cukkup menggunakan tanda '..' (titik 2 kali), contoh :
      - 0..100 = Membuat data angka dari 0 sampai 100 dengan tipe data Range.
      - 50..1000 = Mebuat data angka dari 0 sampai 1000 dengan tipe data Range.
    - Range Juga dapat dibuat dengan nilai terbalik seperti contoh : 'val range = 100 downTo 0'.
    - Range tidak seperti dengan Array dimana pada Range kita tidak dapat mengakses data-datanya.
    - Range biasanya tidak digunakan untuk menampung data, namun biasanya digunakan untuk melakukan perulangan.
    - Method yang dapat digunakan untuk operasi tipe data Range, seperti :
        Operasi                    Keterangan
         count()            =>     Digunakan untuk mendapatkan total data pada range.
         contains(value)    =>     Digunakan untuk melakukan pengecekan apakah terdapat value tersebut.
         first              =>     Digunakan untuk mendapatkan nilai pertama.
         last               =>     Digunakan untuk mendapatkan nilai akhir.
         step               =>     Digunakan untuk mendapatkan nilai kenaikan.
    - Tipe data Range juga dapat membuat sekumpulan data angka yang terurut dan kenaikan dari angka sebelumnya dapat ditentukan
      seperti : 10,20,30,40,50 dimana kenaikannya memiliki pola yaitu 10.
        contoh codenya : 'val range = 1..100 step 10'
                       : 'val reverse = 50 downTo 1'
 */
fun main() {

    // Implementasi Tipe Data Range.
    val range = 1..50
    println(range)


    // Contoh Operasi-Operasi pada Range 1-50
    println(range.count())
    println(range.contains(29))
    println(range.first)
    println(range.last)
    println(range.step)
    println("= = = = = = = = = ")



    // Contoh Operasi-Operasi pada Range 100-1 (downTo)
    val reverse = 100 downTo 1
    println(reverse)
    println(reverse.count())
    println(reverse.contains(29))
    println(reverse.first)
    println(reverse.last)
    println(reverse.step)
    println("= = = = = = = = = ")

    // Contoh membuat data Range dengan kenaikan pola yang sama
    val pattern1 = 0..100 step 5
    println(pattern1)
    println(pattern1.count())
    println(pattern1.contains(29))
    println(pattern1.first)
    println(pattern1.last)
    println(pattern1.step)
    println("= = = = = = = = = ")

    val pattern2 = 50 downTo 1 step 5
    println(pattern2)
    println(pattern2.count())
    println(pattern2.contains(29))
    println(pattern2.first)
    println(pattern2.last)
    println(pattern2.step)
}