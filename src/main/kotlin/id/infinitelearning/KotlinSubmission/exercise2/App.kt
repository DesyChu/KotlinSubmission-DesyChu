package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
//cara 1
fun main() {
     for (i in 2..100 step 2) {
       if (i == 1) continue
            println(i)
        }
    }

//cara 2
fun main() {
    for (i in 1..100) {
        if (i > 50) break
            println(i*2)
        }
}

// cara 3
fun main() {
    println("Bilangan Genap")
    for (i:Int in 1..100)
        if (i % 2 == 0) {
            println("$i")
        }
}

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini


    fun main() {

        val monthNow = "June"
        val birthMonth = "September"
        val birthday = "It's {$monthNow}, i was born in {$birthMonth}"
        val namaBulan= mapOf(
            "Jan" to "January",
            "Feb" to "February",
            "Mar" to "March",
            "Apr" to "April",
            "May" to "May",
            "Jun" to "June",
            "Jul" to "July",
            "Aug" to "August",
            "Sep" to "September",
            "Oct" to "October",
            "Nov" to "November",
            "Dec" to "December"
        )
        namaBulan.forEach { (key, value) ->
            println("$key -> $value")
        }
        println(birthday)
    }