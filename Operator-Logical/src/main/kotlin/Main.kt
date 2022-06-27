/**
    -  Logika adalah operator yang dipakai pada 2 kondisi atau lebih sehingga menghasilkan nilai boolean true atau false.
       Ada beberapa jenis operator logika pada Kotlin yaitu OR (||), AND (&&), NOT (!), XOR (^).

        - Operasi AND (&&)
            AND (&&) => false && false => false.
            AND (&&) => false && true  => false.
            AND (&&) => true  && false => false.
            AND (&&) => true  && true  => true.

        - Operasi OR (||)
            OR (||) => false || false => false.
            OR (||) => false || true  => true.
            OR (||) => true  || false => true.
            OR (||) => true  || true  => true.

        - Operasi NOT (!)
            NOT (!) => true != false
            NOT (!) => false != true
 */
fun main() {
    var x = true
    var y = false
    var value = true
    println("(###############-Operator Logika OR (||)-###############)")
        x = false
        y = false
        value = x || y
        println("OR (||) => $x || $y => $value.")
        x = false
        y = true
        value = x || y
        println("OR (||) => $x || $y => $value.")
        x = true
        y = false
        value = x || y
        println("OR (||) => $x || $y => $value.")
        x = true
        y = true
        value = x || y
        println("OR (||) => $x || $y => $value.")

    println("(###############-Operator Logika AND (&&)-###############)");
        x = false
        y = false
        value = x && y
        println("AND (&&) => $x && $y => $value.")
        x = false
        y = true
        value = x && y
        println("AND (&&) => $x && $y => $value.")
        x = true
        y = false
        value = x && y
        println("AND (&&) => $x && $y => $value.")
        x = true
        y = true
        value = x && y
        println("AND (&&) => $x && $y => $value.")

    println("(###############-Operator Logika NOT (!)-###############)");
        x = true
        y = !x
        println("NOT (!) => $x (!) = $y")
        x = false
        y = !x
        println("NOT (!) => $x (!) = $y")

    println("(###############-Operator Logika 3 Nilai-###############)");
        x = true
        y = false
        var z = true
        value = ((x && y) && z)
        println("AND (&&) => ($x && $y) && $z) => $value.")

        value = ((x || y) || z)
        println("OR (||) => ($x || $y) || $z) => $value.")

}