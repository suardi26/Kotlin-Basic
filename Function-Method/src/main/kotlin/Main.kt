/**
   - Function adalah sebuah blok kode yang dibuat dalam program supaya dapat digunakan berulang-ulang.
   - Cara membuat function pada Kotlin sangat sederhana, hanya dengan menggunakan keyword 'fun' kemudian diikuti dengan
     nama function-nya dan blok kode isi function-nya.
   - Setelah membuat function, kita dapat mengeksekusi function tersebut dengan memanggil nama function-nya.
   - Function yang sering dibuat adalah function main atau fungsi utama yang wajib dibuat sehingga program Kotlin dapat berjalan.
   - Biasanya penulisan nama function dilakukan dengan cara camelCase (kata pertama diawali dengan huruf kecil dan kata
     selanjutnya diawali dengan huruf besar dst tanpa spasi) mis : (valueOfNumber, listProducts, dll).

   Function Parameter
   - Pada saat membuat function, mungkin kita membutuhkan data yang dikirim dari luar function-nya, atau biasa disebut parameter.
   - Parameter pada function tidaklah wajib. jadi kita dapat membuat function tanpa paramter.
   - Pada Kotlin, kita dapat menambahkan parameter di function dan parameter tersebut bisa lebih dari satu.
   - Pada saat menambahkan parameter di function, maka ketika memanggil function tersebut, kita harus memasukan data/argument
     pada function tersebut.
   - By Default parameter pada function memiliki jenis tipe data Immutable(val) sehingga data tidak dapat dimodifikasi/diubah
     pada functionnya.

   Function Default Argument
   - Pada Kotlin, function parameter wajib diisi ketika memanggil function, akan tetapi kita juga dapat memasukan nilai default
     pada parameter, dengan demikian saat memanggil function tersebut, kita tidak wajib memasukan argument/data pada parameternya.
   - Jadi Default argument memungkinkan untuk dapat mengisi secara otomatis parameter yang tidak diisi pada saat pemanggilan
     function, namun jika mengisi paramter dengan argument pada saat pemanggilan method maka Default argument tidak berlaku.
   - Default argument ini cocok pada jenis parameter yang tidak wajib untuk diisi.
   - Keterangan : nama function meskipun berbeda file ataupun berbeda package tidak boleh sama.

   Function Named Argument
   - Biasanya function memiliki banyak parameter, Hal ini dapat menyulitkan saat memanggil function tersebut, karena harus
     mengetahui urutan parameter pada function tersebut.
   - Untuk mengatasi masalah tersebut Kotlin mempunyai fitur Named Argument.
   - Named Argument adalah fitur dimana kita bisa menyebutkan nama paramter saat memanggil function, dengan begitu kita tidak
     wajib tahu posisi tiap parameter pada function.
   - Dan ketika kita menggunakan Named Argument pada pemanggilan function, maka seluruh argument pada pemanggilan function harus
     menggunakan Named Argument artinya tidak boleh sebagian dari argument menggunakan Named Argument, dan argument lainnya
     tidak menggunakan Named Argument. contoh :
               customer(firstName = "Daud",
                       "Ezquiel",
                       "De")                  // ERROR !!!
*/
fun main() {
   //  Memanggil Function dengan Function Named Argument.
   //  Dengan menggunakan Function Named Argument maka pengisian argument tidak harus berurutan sesuai dengan parameter
   //  pada function 'customer', contoh dibawah ini pengisian argument 'lastName' diisi duluan dari pada 'middleName',
   //  hal ini sebenarnya tidak sesuai dengan urutan paramter function 'customer' namun dapat dilakukan dengan bantuan Named
   //  Argument tanpa menukar nilai dari argument 'lastName' dan juga 'middleName'.
   customer(firstName = "Daud",
            lastName = "Ezquiel",
            middleName = "De")


   println("Cars : ")
   println("Pajero")
   println("Avanza")
   println("Brio")

   // memanggil method choose (dengan parameter).
   choose("Daud", "Pajero", null)

   // Memanggil Function dengan Function Default Argument.
   // ket : ketika tidak menambahkan argument maka argument defaultnya adalah "Cash".
   paymentMethod()
   println("OR")
   paymentMethod("Kredit")

   // memanggil method footer (tanpa parameter).
   footerOfProgram()
}

// membuat method footer (tanpa parameter)
fun footerOfProgram(){
   println("==================")
}

// membuat method choose (dengan parameter)
fun choose(name: String, choose: String, price: Int?){ // "price: Int" => boleh null.
   if (price == null){
      println("Anda telah Membeli Mobil $choose.")
      println("Terima Kasih Banyak $name, Semoga harimu menyenangkan.")
   }else{
      println("Anda telah Membeli Mobil $choose, dengan harga $price.")
      println("Terima Kasih Banyak $name, Semoga harimu menyenangkan.")
   }
}

// Membuat Function dengan Function Default Argument.
fun paymentMethod(payment: String? = "Cash"){ // "payment: String?" => boleh null.
   println("Metode Pembayaran : $payment")
}

// Membuat Function dengan Function Named Argument.
fun customer(firstName: String, middleName: String? = null, lastName: String? = null){
   println("Customer : $firstName $middleName $lastName.")
}