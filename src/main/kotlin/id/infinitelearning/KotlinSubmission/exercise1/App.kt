package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */

fun myProfile() {
    val namaDepan: String = "Desy"
    val namaBelakang: String = "Chu"
    val umur: Int = 20
    val single: Boolean = false

    println("Nama depan saya $namaDepan")
    println("Nama belakang saya $namaBelakang")
    println("Nama lengkap saya $namaDepan $namaBelakang")
    println("Umur saya saat ini adalah $umur tahun")
    println("Status saya saat ini single: $single ")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println ("saya dari kelompok $groupId")
    println ("adapun anggota kelompok saya terdiri dari $groupMember")
    println ("sesi $session")

    return arrayOf(groupId, groupMember, session)
}


//Belum mencetak hasil atau dari setiap parameter tersebut


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val anggotaGrup = listOf("Lizzam", "Desy",  "Eunike", "Ari", "Rizki", "Johan", "Anjayani", "Tasya", "Eva", "Anisa")
    val namaKu = anggotaGrup[1]
    return namaKu
}


//Belum dicetak hasilnya


/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5

    return mentor.size + countOfGroup

    fun main() {

        myProfile()

        val myGroup = myGroup()
        println("My Group is: $myGroup")

        val totalMember = totalMember()
        println("Total Member group + Mentor: $totalMember")

        /**
         *  Latihan 5
         *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
         *
         */
        groupDetail(4, listOf("Lizzam", "Desy", "Eunike", "Ari", "Rizki"), "Afternoon")
    }
}