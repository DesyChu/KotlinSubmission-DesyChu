package id.infinitelearning.KotlinSubmission.exercise4



    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */




    class ValidationException(massage: String) : Throwable(massage) {

    }
fun Sapaan(nama:String) {
    if (nama.isBlank()) {
        throw ValidationException("Namanya belum diisi")
    } else {
        println("Hallo $nama")
    }
}


fun main() {
    try {
        Sapaan("Desy")
        Sapaan("")

    } catch(error:ValidationException) {
        println("wahh terjadi error ${error:Sapaan}")
    }finally {
        println("Program selesai dijalankan")
    }
}


