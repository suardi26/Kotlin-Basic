/**
    - Function Lambda expression akan menganggap baris terakhir di blok lambda sebagai return value.
    - Kadang kia butuh membuat lambda yang flexible seperti function, dimana kita dapat mengembalikan hasil
      dimanapun.
    - Mengenai hal diatas dapat diatasi dengan menggunakan Anonymous Function
    - Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit berbeda, masih menggunakan
      keyword 'fun'.
    - Perbedaan lambda expression dengan anonymous function adalah pada lambda biasanya diimplementasikan kasus-kasus
      sederhana sedangkan untuk anonymous function biasanya diimplementasikan kasus-kasus yang lebih kompleks.
 */

// Membuat Anonymous Function sebagai parameter suatu method (2 parameter).
// parameter 'toUp' dapat memuat  Anonymous Function dengan inputan data bertipe String dan menghasilkan return value String.
fun sayHello(name: String, toUp: (String) -> String):String {
    return "Hai ${toUp(name)}"
}
fun main() {
    // Contoh Anonymous Function
    val anonymousFunction = fun(name: String): String{
        if (name.isBlank()){
            return "Maaf Silahkan masukan Nama"
        }else{
            return name.uppercase()
        }
    }

    // Memanggil Anonymous Function
    val result = sayHello("Suardi Daud Manda", anonymousFunction)
    println(result)
    println(sayHello("", fun(name: String): String{
        if (name.isBlank()){
            return "Maaf Silahkan masukan Nama"
        }else{
            return name.uppercase()
        }
    }))
}