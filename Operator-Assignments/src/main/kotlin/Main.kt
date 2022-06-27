/**
    - Operator Assignment adalah Operator yang digunakan untuk memanipulasi serta menginisialisasi nilai pada sebuah variabel.
    - Operator Assignment identik dengan simbol '=' dan dapat digabungkan dengan simbol operator aritmatika.
      contohnya : '+=','-=','*=','/=','%/'.
    - Perbandingan Operator Assignments dengan Operator Aritmatika :
        Operator Aritmatika                 Operator Assignments
        a = a + 10                              a += 10
        a = a - 10                              a -= 10
        a = a * 10                              a *= 10
        a = a / 10                              a /= 10
        a = a % 10                              a %= 10
 */
fun main() {
    //Operator Assignment Penjumlahan.
    var A = 20
    A += 30 // A = A + 30
    println("Nilai Variable 'A' = $A")

    //Operator Assignment Pengurangan.
    var B = 50
    B -= 20
    println("Nilai Variable 'B' = $B")

    //Operator Assigment Perkalian.
    var C = 20
    C *= 3
    println("Nilai Variable 'C' = $C")

    //Operator Assigment Pembagian.
    var D = 20
    D /= 4
    println("Nilai Variable 'D' = $D")

    //Operator Assignment Modulus.
    var E = 22
    E %= 4
    println("Nilai Variable 'E' = $E")
}