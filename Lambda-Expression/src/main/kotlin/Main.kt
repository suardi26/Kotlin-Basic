/**
    Lambda Expression
    - Function di kotlin adalah first-class citizens, artinya dapat berdiri sendiri tanpa bantuan sebuah class.
    - Function dapat disimpan pada variable, array, dan juga dapat dikirim ke paramter function itu sendiri.
    - Dan pada Kotlin, function juga dapat di jadikan sebuah lambda expression.
    - Lambda berasal dari lambda calculus, yang mengacu pada anonymous function ( function tanpa nama ).
    - Lambda expression secara sederhana adalah function yang tidak memiliki nama.
    - Biasanya saat kita membuat function, kita akan selalu membuat menggunakan keyword 'fun' dan mendeklarasikan nama function-nya.
    - Akan tetapi dengan lambda expression, kita dapat membuat function tanpa harus mendeskripsikan functionnya.
    - Pada saat membuat function lambda expression tidak lagi membutuhkan keyword return pada function yang memiliki return value,
      secara default baris terkahir pada function lambda expression dianggap return value-nya.

    Keyword 'it'
    - Pada saat membuat lambda dan hanya memiliki satu parameter, maka bisa tidak menambahkan variable parameter dengan
      menggunakan keyword 'it' pada function lambda expression. secara default jika hanya terdapat satu parameter pada
      function lambda expression maka kita dapat mengakses variable parameter tersebut pada block kode function lambda expression
      dengan menggunakan keyword 'it'.
    - Keyword 'it' mengacu pada parameter yang pertama, dan 'it' hanya berfungsi ketika parameter pada function lambda expression
      cuma 1.

    Method Reference
     - Method Reference adalah Membuat function lambda expression dari referensi function yang sudah ada.

 */
// Contoh referensi method yang akan digunakan untuk membuat function lambda expression (Bagian Method Reference)
fun upper(word: String): String = word.uppercase()

fun main (){
    // Membuat function lambda expression dan disimpan pada variable
        // ket : '(String)' adalah tipe data dari parameternya, boleh lebih dari satu parameter dengan pemisah ','.
        //     : '-> String' adalah tipe data dari return value function-nya.
        //     : 'word: String -> word.uppercase()' adalah deklarasi function lambda expression.
        //     : 'word: String' adalah parameter function lambda expression, boleh lebih dari satu parameter dengan pemisah ','.
        //     : 'word.upperCase()' adalah body dari function lambda expression.
        val lambdaVar1: (String) -> String = { word: String ->
            word.uppercase()
        }

        // Membuat function lambda expression (2 variable) dan disimpan pada variable
        val lambdaVar2: (String,String) -> String = { word: String, name: String ->
            val result = "$word $name"
            result
        }
        // mengeksekusi lambda
        val name = lambdaVar1("Suardi")
        println("Membuat function lambda expression (1 variable) dan disimpan pada variable => $name")
        println("= = = = = = = = = = = = = =")
        val hello = lambdaVar2("Hello", "Suardi")
        println("Membuat function lambda expression (2 variable) dan disimpan pada variable => $hello")
        println("= = = = = = = = = = = = = =")

    // Membuat function lambda expression dan disimpan pada variable (menggunakan keyword 'it')
        val lambdaVar3: (String) -> String = {
            val numberOfChar = it.length
            "Nama : $it, Memiliki $numberOfChar Character."
        }
        // mengeksekusi lambda
        val name1 = lambdaVar3("Daud")
        println("Membuat function lambda expression (1 variable) dan disimpan pada variable => $name1")
        println("= = = = = = = = = = = = = =")

    // Membuat function lambda expression dari referensi function yang sudah ada (Method Reference).
        // Membuat function lambda dari method referensi 'upper' diatas
        // ket : '(String)' adalah tipe data dari parameternya, boleh lebih dari satu parameter dengan pemisah ','.
        //     : '-> String' adalah tipe data dari return value function-nya.
        //     : ':: upper' adalah memanggil method 'upper' yang digunakan sebagai referensi untuk membuat function lambda.
        val lambdaVar4: (String) -> String = :: upper

        // Mengeksekusi lambda
        val name2 = lambdaVar4("Suardi")
        println("Membuat function lambda dari method referensi 'upper' : $name2")
        println("= = = = = = = = = = = = = =")


}