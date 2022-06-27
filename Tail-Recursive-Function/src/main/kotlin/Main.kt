/**
    - Kekurangan function rekursif adalah memungkinkan terjadinya overflow pada stack ( stack tak lagi mampu menangani
      permintaan pemanggilan sub rutin karena kehabisan memori ) dan untuk proses membutuhkan waktu yang lebih
      lama karena pemanggilan fungsi yang berulang-ulang.
    - Jadi proses pemanggilan function rekursif dari pemanggilan function rekursif yang pertama sampai seterusnya harus menunggu
      dari awal pemanggilan function yang pertama sampai pemanggilan function yang terakhir, dan jika pemanggilan
      function terakhir belum selesai maka function pertama tidak akan berhenti. jadi misalnya kita memanggil ratusan juta kali
      kedalaman function rekursif maka proses pemanggilan rekursif function dari ratusan juta akan berjalan terus sampai selesai
      hal ini yang dapat mengakibatkan terjadinya overflow pada stack.

    Tail Recursive Function
    - Kekurangan function rekursif ini di bahasa pemrograman Java tidak bisa ditangani jadi pada java ketika membuat
      function rekursif maka jangan terlalu panjang.
    - Namun pada Kotlin, Kekurangan function rekursif ini ada solusinya, yaitu dengan menggunakan tail recursive function.
    - Tail recursive function adalah teknik mengubah recursive function yang dibuat, menjadi looping biasa ketika
      dijalankan/dicompile.
    - Tidak semua recursive function dapat secara otomatis dibuat menjadi tail recursive function, ada syarat-syaratnya.
    - Syarat Tail Recursive Function
        - Tambahkan keyword 'tailrec' pada functionnya.
        - Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa operasi
          dengan data lain. contoh :  " display(number -1)"
 */
fun main() {

    // Contoh 1 : tail recursive function
    // Pada saat di compile nanti, Kotlin mengubah tail recursive function menjadi looping biasa.
    tailrec fun display(number: Int){
        println("tail recursive ke-$number")
       if (number > 1){
          display(number -1)
       }
    }

    // Contoh 1 : tail recursive function (faktorial)
    tailrec fun factorial (number: Int, total: Int = 1): Int {
        println("tail recursive ke-$number")
        return when (number) {
            1 -> total
            // else -> number * (factorial(number - 1))
            // akan muncul warning ketika menggunakan code diatas karena function ini ditandai dengan
            // keyword 'tailrec' namun sebenarnya function ini bukan tail recursive karena memanggil function dirinya sendiri,
            // dan juga operasi dengan data lain 'number *'. Untuk menjadikan function ini tail recursive maka dapat
            // diganti dengan code dibawah ini.
            else -> factorial(number - 1, total * number)
        }
    }

    // Pemanggilan tail recursive function. Contoh 1
    println("++++++++++++ Contoh 1 : tail recursive function ++++++++++++")
    display(5)

    // Pemanggilan tail recursive function. Contoh 2
    println("++++++++++++ Contoh 2 : tail recursive function ++++++++++++")
    println("factorial 5! => ${factorial(5)}")
}