/**
    - Tipe Data pada Kotlin sama dengan Tipe Data pada Java.
    - Tipe Data Pada Kotlin :
      Byte,Short,Integer,Long,Float,Double,Boolean,Char.
    - Untuk Tipe data Number terbagi menjadi 2 yaitu :

       - Integer Number(Bilangan Bulat).
            - Byte = memiliki kapasitas 8 bit, dan intervalnya dimulai dari -128 s.d 127.
            - Short = memiliki kapasitas 16 bit, dan intervalnya dimulai dari -32768 s.d 32767.
            - Integer = memiliki kapasitas 32 bit, dan intervlanya dimulai dari -2147483648 s.d 2147483647.
            - Long = memiliki kapasitas 64 bit, dan intervalnya dimulai -9223372036854775808 dari s.d 9223372036854775807.

       - Floating Point Number (Bilangan Pecahan).
            - Float = memiliki kapasitas 32 bit, dan intervalnya dimulai dari 1.4E-45 s.d 3.4028235E38.
            - Double = memiliki kapasitas 64 bit, dan intervalnya dimulai dari 4.9E-324 s.d 1.7976931348623157E308.

    - Tipe Data Character (char).
        - Untuk tipe data char adalah tipe data yang termasuk dalam kelompok karakter dan hanya dapat menampung 1 karakter
          (huruf, angka, Simbol-Simbol lainnya).
        - Dan pada Kotlin, kita dapat menggunakan '' untuk membuat data Char.

    - Tipe Data Boolean (logic).
        - Untuk tipe data boolean adalah tipe data yang termasuk dalam kelompok logika dan memiliki nilai true atau false.
        - Tipe data boolean pada Kotlin direpresentasikan dengan keyword 'Boolean'.
        - Nilai Benar direpresentasikan dengan keyword true.
        - Nilai Salah direpresentasikan dengan keyword false.

    - Literals
      - Secara Default membuat value dari number adalah bilangan desimal, namun bisa juga diganti menjadi value dari
        Hexa Decimal ataupun binary.
            - Untuk Literal decimal penulisan seperti biasa karena secara default value yang dimasukan adalah literal decimal.
                contoh : "var decimalLiteral: Int = 96".
            - Untuk Literal Hexadecimal penulisan value diawali dengan '0x' dan diikuti value hexadecimal.
                contoh : "var hexadecimalLiteral: Int = 0x2F".
            - Untuk Literal Binary penulisan value diawali dengan '0b' dan diikuti value Binary.
                contoh : "var binaryLiteral: Int = 0b101".

    - Pada assignment variabel dapat menggunakan underscore '_' untuk menambahkan separator pada angka sehingga dapat dengan mudah
      dibaca, misalnya : 'var valueOfLong: Long = 1_000_000_000L'. penggunaan separator pada value tidak akan merubah isi valuenya.

    - Conversion variabel number.
      - Untuk mengkonversi tipe data number dapat menggunakan method dari masing-masing tipe data.
        misalnya  "var valueOfByte: Byte = 10" maka dapat menggunakan method method dari class 'Byte' untuk mengkonversi value ke
        tipe data number lainnya :
                 var valueOfByte : Byte = 10
                 var valueOfShort : Short = valueOfByte.toShort()
                 var valueOfInt : Int = valueOfByte.toInt()
                 var valueOfLong : Long = valueOfByte.toLong()
                 var valueOfFloat : Float = valueOfByte.toFloat()
                 var valueOfDouble : Double = valueOfByte.toDouble()
     - Dan Misalnya ketika nilai Long yaitu 10.000.000.000.000 dan dikonversi menjadi nilai int maka hasilnya akan tidak menentu
       karena batas range dari value integer yaitu -2.147.483.648 s.d 2.147.483.647 sehinnga mengakibatkan
       number overflow/integer overflow dimana ketika mengkonversi value dari Long yang bernilai 10M ke Int yang batasnya
       maksimal bernilai 2M lebih maka ketika value Int mencapai batas valuenya yaitu 2M lebih maka akan direset kembali ke
       -2M lebih dan akan naik lagi hingga 2M lebih dan akan turun lagi menjadi -2M lebih akan begitu terus hingga perulangannya
       berhenti pada saat mencapai 10M. Hal ini mengakibatkan hasil konversi tidak menentu dan tidak sesuai dengan value dari
       tipe data yang sebelumnya, untuk itu perlu diperhatikan interval dari value yang dapat ditampung oleh sebuah tipe data
       number.

    - Variable
        - Variabel berfungsi menampung data sesuai dengan tipe data yang ditentukan.
        - Nama variabel yang tidak dapat digunakan yaitu keyword pada java seperti class,var,dll.
        - Ada 2 jenis variabel pada Kotlin yaitu : Mutable (datanya dapat diubah) dan Immutable (datanya tidak dapat diubah).
          Mutable artinya datanya boleh diubah namun tipe datanya tidak dapat diubah.
            - Variabel Mutable dapat menggunakan kata kunci 'var'.
            - Variable Immutable dapat  menggunakan keyword 'val'.
        - Deklarasi variable : 'keyword(var/val) namaVariable: TipeData = data'.
        - Baik variabel Immutable ataupun Mutable dapat digunakan dengan bijak artinya pada saat membuat data yang tidak akan
          berubah-ubah maka gunakan variable Immutable sedangkan jika ingin membuat data yang dapat berubah-ubah nantinya maka
          gunakan variable Mutable.
        - Deklarasi Tipe data pada sebuah variable adalah Optional artinya dapat ditambahkan atau tidak, dikarenakan Kotlin
          dapat mengenali secara otomatis tipe data dari variabel dengan mengenali isi datanya seperti :
            "var data1 = "Data Tanpa Deklarasi Tipe data (Mutable)."
            "val data2 = "Data Tanpa Deklarasi Tipe data (Immutable)."
        - Dan Ketika Deklarasi tipe data tidak dilakukan dan datanya number maka akan di set secara default menjadi 'Int', ketika
          ingin tipe datanya 'Long' tanpa harus deklarasi tipe datanya maka dapat menambahkan 'L' setelah datanya, namun untuk
          deklarasi variabel dengan tipe data Byte dan Short harus dilakukan secara eksplisit (mendeklarasikan secara langsung
          tipe datanya). Dan untuk data Floating Point Number jika dideklarasikan tanpa tipe data maka secara default
          tipe datanya menjadi 'Double' dan ketika ingin tipe datanya 'Float' tanpa harus deklarasi tipe datanya maka dapat
          menambahkan 'F' setelah datanya.

    - Nullable
        - Secara Standar, variable di Kotlin harus dideklarasikan / diinisialisasikan nilainya jika tidak mendeklarasikan
          tipe datanya untuk menghindari error, seperti :  "var product".
        - Akan tetapi mendeklarasikan variabel dengan menambahkan tipe datanya tanpa mengisi datanya bisa dilakukan,
          seperti 'var number: Float' dan datanya dapat diisi nanti, namun hal ini tidak di rekomendasikan oleh Kotlin
          dan menyarankan bahwa menggabungkan deklarasi variabel dan pengisian data pada variabel tersebut (Assignment).
        - Kotlin Juga mendukung variable yang boleh null (tidak bernilai).
        - Ini dikarenakan Kotlin bisa mengakses Java, dan kebanyakan di Java, semua variable dapat bernilai null.
        - Untuk membuat variable bisa bernilai null, di Kotlin dapat menggunakan '?' setelah tipe datanya.
        - Penggunaan fitur ini tidak direkomendasikan untuk di lakukan di Kotlin, hanya sebagai jalan akhir misalnya mengakses
          kode Java.

    - Variable Constant
        - variable Constant mirip dengan variable Immutable yang menggunakan keyword 'val'.
        - variable Constant wajib 'val' dan menggunakan keyword 'const' sebelum 'val'.
        - Constant adalah Immutable data, yang biasanya diakses untuk keperluan secara global.
        - Global maksudnya dapat diakses dimanapun.
        - Variable Constant biasanya disebut variable Global.
        - Untuk menandai bahwa variable tersebut adalah constant, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable
          constant.
        - Modifier 'const' tidak dapat digunakan pada local variable, artinya pembuatan variabel const harus berada diluar
          function untuk digunakan secara global.
 */

// Contoh variabel Constant.
const val OS = "Windows"
const val VERSION = "11"

fun main() {

    // Contoh Assignment variabel tipe data number (bilangan bulat) :
    // Pada value dari Tipe data Long harus ditambahkan pada akhir value huruf 'L' Sehingga tidak dianggap value dari Int,
    // ketika value tersebut masih masuk dari range Int.
        var valueOfByte: Byte = 10
        var valueOfShort: Short = 26_000
        var valueOfInt: Int = 960_000
        var valueOfLong: Long = 1_000_000_000L

        println(valueOfByte)
        println(valueOfShort)
        println(valueOfInt)
        println(valueOfLong)
        println("= = = = = = = = = = ")

    // Contoh Assignment variabel tipe data number (bilangan pecahan) :
    // Pada value dari Tipe data Float harus ditambahkan pada akhir value huruf 'F' Sehingga tidak dianggap value dari Double.
        var valueOfFloat: Float = 100.45F
        var valueOfDouble: Double
        valueOfDouble = 2347056.961

        println(valueOfFloat)
        println(valueOfDouble)
        println("= = = = = = = = = = ")

    //Literals
        // Literal decimal (default)
        var decimalLiteral: Int = 96

        // Literal Hexadecimal (Value Diawali dengan '0x').
        var hexadecimalLiteral: Int = 0x2F

        // Literal Binary (Value Diawali dengan '0b').
        var binaryLiteral: Int = 0b101

        println(decimalLiteral)
        println(hexadecimalLiteral)
        println(binaryLiteral)
        println("= = = = = = = = = = ")

    //Conversion variabel number.
        var number: Byte = 10
        println("value of Byte : " +number)

        var short : Short = number.toShort()
        println("value of Short : " +short)

        var int : Int = number.toInt()
        println("value of Int : " +int)

        var long : Long = number.toLong()
        println("value of Long : " +long)

        var float : Float = number.toFloat()
        println("value of Float : " +float)

        var double : Double = number.toDouble()
        println("value of Double : " +double)

        var double1 : Double = binaryLiteral.toDouble()
        println("value of Double : " +double1)
        println("= = = = = = = = = = ")

    // Contoh Assignment tipe data char.
        var charA : Char = 'A'
        println("value of Char : " +charA)

        var char6 : Char = '6'
        println("value of Char : " +char6)

        var chartu : Char = '&'
        println("value of Char : " +chartu)
        println("= = = = = = = = = = ")

    // Contoh Assignment tipe data Boolean.
        var benar : Boolean = true;
        var salah : Boolean = false;

        println("Nilai Benar adalah "+benar)
        println("Nilai Salah adalah "+salah)
        println("= = = = = = = = = = ")

    // Contoh Deklarasi variable Mutable : 'var namaVariable: TipeData = data'.
        var product: String = "Dettol"
        product = "Pepsodent"
        println("Product 1 : $product")
        println("= = = = = = = = = = ")

    // Contoh Deklarasi variable Immutable : 'val namaVariable: TipeData = data'.
        val car: String = "Toyota"
        // car = "Mercedez Benz" // Error !!! karena keyword 'val' adalah untuk variabel Immutable artinya tidak dapat diubah-ubah.
        println("Car 1 : $car")
        println("= = = = = = = = = = ")

    // Deklarasi variabel tanpa menambahkan tipe data.
        var data1 = "Data Tanpa Deklarasi Tipe data (Mutable)." // Secara otomtis tipe datanya di set 'String'.
        val data2 = "Data Tanpa Deklarasi Tipe data (Immutable)."// Secara otomtis tipe datanya di set 'String'.
        println(data1)
        println(data2)
        println("= = = = = = = = = = ")

    // Contoh Value variabel Nullable
        var book: String?
        book = null

        // println(book.length) // Akan error karena 'book' bisa saja tak bernilai (null)

        // cara mengakses variable yang dapat bernilai null.
        println(book)
        println(book?.length)
        println("= = = = = = = = = = ")

    // Contoh Akses variable Global
        println("OS : $OS, dan Version OS : $VERSION")
}