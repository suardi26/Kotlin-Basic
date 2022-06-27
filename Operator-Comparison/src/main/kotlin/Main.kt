/**
    - Operator Comparasion/Perbandingan adalah operator yang digunakan untuk membandingkan 2 buah nilai,
      apakah nilai tersebut sama besar '==', tidak sama besar '!=', lebih kecil '<', lebih besar '>',
      lebih kecil sama dengan '<=' serta lebih besar sama dengan '>=', dan hasil dari operator Perbandingan ini
      adalah boolean True atau False.
    - Operator Comparasion/Perbandingan :
        Operator            Keterangan
        >                   Lebih Dari
        <                   Kurang Dari
        >=                  Lebih Dari Sama Dengan
        <=                  Kurang Dari Sama Dengan
        ==                  Sama Dengan
        !=                  Tidak Sama Dengan


 */
fun main() {

    var i = 0
    var o = 0
    var value = true

    // Operator Equal atau sama Dengan.
        println("=========== Sama Dengan (==) ===========")
        i = 50
        o = 50
        value = i == o
        println("(==) Apakah $i sama dengan $o  => $value")

        i = 10
        o = 5
        value = i == o
        println("(==) Apakah $i sama dengan $o => $value")

    // Operator Equal atau sama Dengan.
    println("=========== Tidak Sama Dengan (!=) ===========")
        i = 30
        o = 50
        value = i != o
        println("(!=) Apakah $i tidak sama dengan $o => $value")

        i = 50
        o = 50
        value = i != o
        println("(!=) Apakah $i tidak sama dengan $o => $value")

    println("=========== Lebih Besar Dari (>) ===========")
        i = 40
        o = 30
        value = i > o
        println("(>) Apakah $i lebih besar dari $o => $value")

        i = 20
        o = 30
        value = i > o
        println("(>) Apakah $i lebih besar dari $o => $value")

    println("=========== Lebih Kecil Dari (<) ===========")
        i = 10
        o = 20
        value = i < o
        println("(<) Apakah $i lebih kecil dari $o => $value")

        i = 10
        o = 5
        value = i < o
        println("(<) Apakah $i lebih kecil dari $o => $value")

    println("=========== Lebih Besar Atau Sama Dengan (>=) ===========")
        i = 10
        o = 10
        value = i >= o
        println("(>=) Apakah $i lebih besar atau sama dengan $o => $value")

        i = 10
        o = 20
        value = i >= o
        println("(>=) Apakah $i lebih besar atau sama dengan $o => $value")

    println("=========== Lebih Kecil Atau Sama Dengan (<=) ===========")
        i = 10
        o = 30
        value = i <= o
        println("(<=) Apakah $i lebih kecil atau sama dengan $o => $value")

        i = 30
        o = 10
        value = i <= o
        println("(<=) Apakah $i lebih kecil atau sama dengan $o => $value")

    println("=========== Operasi Perbandingan character ===========")
        val a = 'a'
        val b = 'b'
        value = a < b // Perbandingan character huruf sesuai urutan yaitu a,b,c,..., jadi seharusnya a lebih kecil dari b.
        println("(<) Apakah $a lebih kecil dari $b => $value")

        val t = 't'
        val c = 'c'
        value = t > c // dan karena urutan huruf 't' lebih besar dari huruf 'c'.
        println("(<) Apakah $t lebih besar dari $c => $value")

}