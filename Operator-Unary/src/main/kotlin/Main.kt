/**
    - Operator Unary adalah operator yang digunakan untuk memanipulasi satu variabel.
    - Operator                      Keterangan
      ++                            Increment '++' (nilai variabel ditambah 1).
      --                            Decrement '--' (nilai variabel dikurang 1).
      -                             negatif (Menandahkan Suatu Bilangan Bernilai Negatif).
      +                             positif (Menandahkan Suatu Bilangan Bernilai Positif).
      !                             Invert/Negasi (membalikan suatu nilai tipe data boolean).

    - Increment prefix.
      contoh : var numberA = 10;
      print(++numberA);
      // Ket : Pada Increment prefix hasilnya 11 dikarenakan nilai variabel "numberA" dijumlahkan terlebih dahulu baru di tampilkan.

    - Increment postfix.
      var numberB = 10;
      print(numberB++);
      // Ket : Pada Increment postfix hasilnya 10 dikarenakan nilai variabel "numberB" di tampilkan terlebih dahulu baru dijumlahkan.
 */
fun main() {

    // Contoh Operator Unary
        // Unary Negatif '-'
            val value = -25
            println("Nilai Negatif : $value")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")
        // Unary Positif '+'
            val number = +27 // secara default 27
            println("Nilai Positif : $number")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")
        // Unary Increment '++'
            var number1 = 25
            println("Nilai : $number1")
            number1++; // Increment '++' Artinya Ditambah 1.
            println("Setelah ditambah 1 (Increment '++') = $number1")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")

        // Unary Decrement '--'
            var number2 = 121;
            println("Nilai : $number2")
            number2--; // Decrement '--' Artinya Dikurangi 1.
            println("Setelah dikurangi 1 (Decrement '--') = $number2")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")

        // Increment Prefix
            var numberA = 10
            println("Variabel 'numberA' = $numberA, dan setelah dilakukan operasi Unary Increment Prefix " +
                    "maka hasilnya berubah menjadi = ${++numberA}")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")

        // Increment Postfix
            var numberB = 10
            println("Variabel 'numberB' = $numberB, dan setelah dilakukan operasi Unary Increment Postfix " +
                    "maka hasilnya berubah menjadi = ${numberB++}")
            println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =")
            /*
                Pada Increment prefix hasilnya berubah dari 10 menjadi 11 dikarenakan "++numberA" artinya nilai variabel "numberA"
                ditambahkan dulu baru di tampilkan, sedangkan pada Increment postfix tidak berubah di tampilan outputnya yaitu 10
                menjadi 10 dikarenakan "numberB++" artinya nilai variabel "numberB" ditampilkan dulu baru di tambahkan.
            */

        // Unary Boolean ! untuk Negasi atau kebalikan suatu nilai boolean
            var choice = true
            println("variabel 'choice' = $choice dan setelah dilakukan operasi Unary Invert/Negasi maka hasilnya " +
                    "berubah menjadi = ${!choice}")

}