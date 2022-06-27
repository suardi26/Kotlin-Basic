
/**
    - Array adalah sebuah tipe data yang dapat menyimpan beberapa data dengan satu tipe data dalam sebuah variabel.
      Array menggunakan indeks untuk memudahkan akses terhadap data yang disimpanya. Indeks array selalu
      dimulai dari 0 sampai data ke-n, misalnya mencari data dengan indeks kurang dari 0 misalnya -2,-3, dll maka
      akan error.
            val student: Array<String> = arrayOf(2,4,6,8);
                                                 | | | |
                                         index = 0 1 2 3
    - Tipe Data di Kotlin direpresentasikan dengan keyword 'Array'.
        Contoh :
            val student: Array<String> = arrayOf("Suardi", "Edward", "Steven")
            val numbers: Array<Int> = arrayOf(1,2,3,4,5)
    - Ukuran data pada Array itu fix, artinya pada saat Assignment data Array maka jumlah datanya tidak dapat bertambah
      atau berkurang (Static) misalnya data yang dimasukan adalah 5 maka tidak bisa lagi ditambah menjadi 6,7 dst ataupun datanya
      tidak bisa lagi dihapus.
    - Ada beberapa function/operasi yang dapat digunakan untuk Operasi Array.
            Operasi         Keterangan
          - size              ->  untuk mendapatkan informasi panjang/jumlah data array.
          - get(index)        ->  untuk mendapatkan data di posisi index yang ditentukan.
          - [index]           ->  untuk mendapatkan data di posisi index yang ditentukan.
          - set(index, value) ->  untuk mengubah data di posisi index yang ditentukan.
          - [index] = value   ->  untuk mengubah data di posisi index yang ditentukan.

    - Pada saat membuat Array dan menggunakan keyword 'val' yang berarti Immutable maka kita tidak dapat membuat Array baru pada
      variable tersebut, namun dapat mengganti data dari setiap indeksnya.
        contoh :  val numbers: Array<Int> = arrayOf(1,2,3,4,5)
                  numbers = arrayOf(2,6,10) //maka akan error !!!!
    - Array Nullable
      - Secara standard data Array pada Kotlin tidak boleh null.
      - Pada saat ingin membuat Array yang datanya boleh null, kita dapat menggunakan ? (tanda tanya).
 */

fun main() {
    // Contoh Assignment data Array.
        val students: Array<String> = arrayOf("Suardi", "Edward", "Steven")
        val numbers: Array<Int> = arrayOf(1,2,3,4,5)

        // Print Address Memory data Array.
        println(students)
        println(numbers)
        println("= = = = = = = = = =")

    // Contoh beberapa function/operasi Array.
        val student2 = students[1]
        val student3 = students.get(2)
        println("Nama Siswa ke 2 $student2")
        println("Nama Siswa ke 3 $student3")
        println("= = = = = = = = Mengganti nama Siswa ke2 dan ke3")
        students.set(1, "Jamie")
        students[2] = "Robert"
        println("Nama Siswa ke 2 ${students.get(1)}")
        println("Nama Siswa ke 3 ${students[2]}")
        println("= = = = = = = = = =")
    // Contoh Array dengan tak bernilai (null)
        val products: Array<String?> = arrayOfNulls(5)
        products[0] = "Beng-Beng"
        products[1] = null
        products.set(2, "Relaxa")
        products.set(3, null)
        println("Array Nullable : ${products[0]}, ${products[1]}, ${products[2]}, ${products[3]}")
}