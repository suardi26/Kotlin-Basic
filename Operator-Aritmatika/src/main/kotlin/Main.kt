/**
    Operasi Aritmatika
    Operator        Keterangan
    +               Penjumlahan
    -               Pengurangan
    *               Perkalian
    /               Pembagian
    %               Sisa Pembagian (modulus)
 */
fun main() {
  // Contoh Operasi Aritmatika pada Kotlin

    // Penjumlahan
    val result1 = 5 + 5
    println("5 + 5 = $result1")
    println("=============")

    // Pengurangan
    val result2 = 15 - 2
    println("15 - 2 = $result2")
    println("=============")

    // Perkalian
    val result3 = 20 * 5
    println("20 * 5 = $result3")
    println("=============")

    // Pembagian
    val result4 = 20 / 2
    println("20 / 2 = $result4")
    println("=============")

    // Modulus
    val result5 = 10 % 3
    println("10 % 3 = $result5")
    println("=============")

    // Campuran
    val result6 = 10 - 4/2
    println("10 - 4 / 2 = $result6")
    val result7 = 10 + 20 * 2
    println("10 + 20 * 2 = $result7")
}