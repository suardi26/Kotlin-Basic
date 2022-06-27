/**
    - if-else statement / percabangan adalah teknik pemrograman yang digunakan untuk menentukan alur eksekusi
      program. misalnya : ketika kondisi bernilai benar maka yang akan dieksekusi "kode program A" namun ketika
      kondisi bernilai salah maka yang akan dieksekusi "kode program B".
    - if-else if statement / percabangan sama saja dengan if-else statement yang merupakan teknik pemrograman yang
      digunakan untuk menentukan alur eksekusi program namun bedanya kondisi pada if-else if  bisa lebih dari satu.
    - if else nested / if else bersarang adalah teknik pemrograman yang digunakan untuk menentukan alur eksekusi
      program, namun pada if else nested terdapat percabangan di dalam percabangan. Sehingga pada saat suatu kondisi terpenuhi
      masih ada percabangan lain yang menentukan suatu kondisi bernilai benar atau tidak.
 */
fun main() {
    val value = 98

    // if-else statement
        println("= = = = = = = = if-else statement = = = = = = = =")
        if (value >= 75){
            // jika kondisi diatas bernilai true maka isi blok if akan dieksekusi.
            println("Selamat Anda Lulus !!!")
        } else {
            // Jika Kondisi pada statement if bernilai false maka isi blok else akan dieksekusi.
            println("Maaf Anda Belum Lulus !!!")
        }

    // if-else if statement
        println("= = = = = = = = if-else if statement = = = = = = = =")
        if (value >= 75){
            // jika kondisi diatas bernilai true maka isi blok if akan dieksekusi.
            println("Sangat Baik")
        } else if (value >= 65){
            // jika kondisi diatas bernilai true maka isi blok else if di atas akan dieksekusi.
            println("Baik")
        } else if (value >= 45){
            // jika kondisi diatas bernilai true maka isi blok else if di atas akan dieksekusi.
            println("Kurang Baik")
        }else{
            // Jika semua kondisi diatas salah/false maka isi blok else if di atas akan dieksekusi.
            println("Coba Lagi Tahun Depan !!!")
        }

    // if else nested / if else bersarang
        println("= = = = = = = = if else nested / if else bersarang = = = = = = = =")
        val documentCheck = true
        if (value >= 75){
            // jika kondisi diatas bernilai true maka isi blok if akan dieksekusi.
            if (documentCheck){
                // jika kondisi diatas bernilai true maka isi blok if akan dieksekusi.
                println("Selamat Anda Lulus !!!")
            }else{
                // Jika Kondisi pada statement if bernilai false maka isi blok else akan dieksekusi.
                println("Maaf dokumentasi anda tidak valid !!!")
            }
        } else {
            // Jika Kondisi pada statement if bernilai false maka isi blok else akan dieksekusi.
            println("Maaf Anda Belum Lulus !!!")
        }
}