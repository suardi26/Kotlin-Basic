/**
    - Function Ada 2 jenis :
        - function yang tidak mengembalikan nilai.
        - function yang mengembalikan nilai.
    - Function yang tidak mengembalikan nilai, sebenarnya mengembalikan tipe data "Unit", dimana tipe data Unit adalah tanda
      bahwa function tersebut tidak mengembalikan apa-apa.
    - Penulisan Unit pada function yang tidak mengembalikan data tidak wajib, namun jika menulis tipe data pengembalian sebuah
      function-nya maka dapat menggunakan Tipe data Unit.
    - Menambahkan tipe data Unit ataupun tidak menambahkannya pada function, tipe datanya akan tetap Unit.
    - "Unit" di Kotlin mirip seperti "void" di Java yang merepresentasikan method/function yang tidak mengembalikan nilai
      data.
 */
fun main() {
    sayHello("David")
}

// Membuat function dengan return value Unit(tidak mengembalikan nilai).
// Menambahkan tipe data "Unit" ataupun tidak menambahkannya pada function, tipe datanya akan tetap Unit.
// Tidak wajib menambahkan tipe data "Unit" karena Secara default method tanpa return value akan tetap memiliki
// tipe data "Unit" (tanda bahwa function tersebut tidak mengembalikan apa-apa)
fun sayHello(name: String): Unit{ // Secara default => 'fun sayHello(name: String){}'
    println("Hello $name")
}