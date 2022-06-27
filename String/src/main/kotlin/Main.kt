/**
    - String adalah Tipe data yang dapat menampung kumpulan karakter misalnya kata atau kalimat.
    - Mirip dengan Java, tipe data String di Kotlin direpresentasikan dengan keyword String.
    - Untuk membuat string pada Kotlin, kita dapat menggunakan :
        - Tanda petik 2 ("valueOfString") -> untuk teks satu baris.
        - Tanda petik 2 sebanyak 3 kali ("""
                                             Kotlin,
                                             Java,
                                             Dart
                                         """) -> untuk teks yang lebih dari satu baris.
    - Penggabungan String dapat dilakukan dengan cara menggunakan operator '+'.

    - String Template
        - String Template adalah kemampuan String di kotlin yang mendukung ekspresi template.
        - Dengan String Template, secara otomatis kita dapat mengakses data dari luar di dalam String-nya.
        - $ adalah tanda yang digunakan untuk template ekspresi sederhana, seperti mengakses variable lain.
            contoh :   var firstName: String = "Suardi"
                       var lastName: String = "Daud"
                       var fullName: String = "$firstName $lastName"
        - ${isi ekspresi} adalah tanda yang digunakan untuk template ekspresi yang kompleks.
            contoh :   var info: String = "$fullName , total char = ${fullName.length}"

        - Pada saat melakukan operasi beberapa String direkomendasikan untuk menggunakan String Template dan tidak lagi
          menggunakan tanda '+'.
 */
fun main() {
    // Assignment Tipe Data String satu baris.
        var name: String = "Suardi"
        println("Value Of String (One Line) = \n"+name)
        println("= = = = = = = = =")

    // Assignment Tipe Data String dua baris.
    // Menggunakan Method "trimIndent()" yang digunakan untuk menghapus spasi (value blank) pada awal baris dan akhir baris
    // di setiap linenya.
        var address1: String = """
            North Toraja, 
            South Sulawesi, 
            Indonesian.
        """.trimIndent()
        println("Value Of String (Multi Line) = \n"+address1)
        println("= = = = = = = = =")

    // Menggunakan Method "trimMargin()" yang digunakan untuk menghapus spasi (value blank) pada awal baris dan
    // akhir baris sebelum character yang ditentukan pada baris-baris tertentu sesuai dengan penambahan dari character.
    // secara default "trimMargin()" akan mencari character '|' untuk menghapus semua value sebelum character tersebut.
    // atau bisa menggunakan chracter lain seperti '+'.
        var address2: String = """
                Makassar, 
                |South Sulawesi, 
                |Indonesian.
            """.trimMargin()
        println("Value Of String (Multi Line) = \n"+address2)
        println("= = = = = = = = =")

        var address3: String = """
                +Gowa, 
                +South Sulawesi, 
                Indonesian.
            """.trimMargin("+")
        println("Value Of String (Multi Line) = \n"+address3)
        println("= = = = = = = = =")

    // Contoh Penggabungan String.
        var word1: String = "Saya"
        var word2: String = "Suka"
        var word3: String = "Coding"
        var sentence: String = word1+" "+word2+" "+word3+"."
        println(sentence)
        println("= = = = = = = = =")

    // Contoh String Template.
       // template ekspresi sederhana $namaVariabel.
       var firstName: String = "Suardi"
       var lastName: String = "Daud"
       var fullName: String = "$firstName $lastName"

       // template ekspresi yang kompleks ${isi ekspresi}.
       var info: String = "$fullName , total char = ${fullName.length}"
       println("Name : $fullName")
       println("Info : $info")
}