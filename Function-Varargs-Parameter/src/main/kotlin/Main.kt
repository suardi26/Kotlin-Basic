/**
    Function Varargs(variable argument) Parameter
    - Membuat Parameter menjadi sebuah (varargs) variable argument, biasanya di posisi akhir parameter jika
      terdapat lebih dari satu parameter. Namun jika memiliki hanya 1 parameter saja maka parameter pertamanya dapat
      dibuat menjadi sebuah varargs.
    - Membuat Parameter menjadi sebuah (varargs) variable argument, diposisi depan parameter ketika memiliki lebih dari
      satu parameter dapat dilakukan dengan bantuan Function Named Argument ketika memanggil function-nya.
    - variable arguments (varargs) artinya datanya bisa menerima lebih dari satu input, atau anggap saja seperti Array.
    - Untuk membuat parameter menjadi sebuah varargs dapat menggunakan keyword 'vararg' contoh :
            'fun totalProduct(supervisor: String, vararg products: String){}'
    - Ketika Membuat parameter menjadi sebuah varargs, meskipun tipe datanya diset menjadi String akan tetapi di dalam
      blok code function-nya, varargs berubah menjadi array of String, maka dari itu kita dapat mengambil datanya
      menggunakan perulangan 'for' dan juga operator 'in'.
    - Apa bedanya dengan parameter biasa dengan Array ?
        - Jika parameter tipe Array, maka wajib membuat array terlebih dahulu sebelum mengirimkan ke function.
        - Jika parameter menggunakan varargs, kita dapat langsung mengirim data-nya, jika lebih dari satu, cukup gunakan
          ',' (tanda koma).
 */
fun main() {
    // Memanggil Function dengan Varargs(variable argument) Parameter (diposisi Belakang)
        totalProduct(supervisor = "Tony", "Biore", "Dettol", "Pepsodent", "Rinso")
        println("= = = = = = = = = =")
        totalProduct(supervisor = "Gina")
        println("= = = = = = = = = =")

    // Memanggil Function dengan paramter Array
        // Membuat data array terlebih dahulu
        val dataProduct = arrayOf("Tango", "Beng-Beng", "Taro")
        val totalProduct = totalProductWithArray(supervisor = "Daniel", dataProduct)
        println("Total Product : $totalProduct")
        println("= = = = = = = = = =")

    // Memanggil Function dengan Varargs(variable argument) Parameter (diposisi depan) dengan bantuan
    // Function Named Argument ketika memanggil function-nya.
    total("Sprite","Aqua", "Fanta","Buavita","Cleo", supervisor = "Hagin")
}

// Function dengan Varargs(variable argument) Parameter (diposisi akhir)
fun totalProduct(supervisor: String, vararg products: String){
    var totalProduct = 0
    for (product in products){
        println(product)
        totalProduct++
    }
    println("Total Product : $totalProduct")
    println("Pengawas : $supervisor.")
}

// Function dengan paramter Array
fun totalProductWithArray (supervisor: String, products: Array<String>): Int{
    println("Pengawas : $supervisor.")
    var totalProduct = 0
    for(product in products){
        println(product)
        totalProduct++
    }
    return totalProduct
}

// Function dengan Varargs(variable argument) Parameter (diposisi depan).
fun total(vararg products: String, supervisor: String){

    var totalProduct = 0
    for(product in products){
        println(product)
        totalProduct++
    }
    println("Total Product : $totalProduct")
    println("Pengawas : $supervisor.")
}