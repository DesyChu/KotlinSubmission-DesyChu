package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    class Hero {
        private var name: String = ""
        private var age: Int = 0
        private var height: Double = 0.0
        //member variables


        /**
         * Latihan 2
         * Set data profile dengan memanggil fungsi setProfile() dibawah ini
         * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
         *
         */
        fun setProfile(name: String, age: Int, height: Double) {
            this.name = name
            this.age = age
            this.height = height
        }
//membuat  secondary constructor


        /**
         * Latihan 3
         * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
         *
         */
        fun profile() {
            println("Name: $name")
            println("Age: $age")
            println("Height: $height")
        }
//menampilkan profil


        /**
        Challenge:
        Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
        Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
        Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
        Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
        Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
        Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
         **/

        /**
         * Latihan 4
         * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
         *
         */
        fun jalan() {
            println("$name sedang berjalan.")
        }

        fun lari() {
            println("$name sedang berlari.")
        }

        fun makan() {
            println("$name sedang makan.")
        }

        fun minum() {
            println("$name sedang minum.")
        }

        fun lompat() {
            println("$name sedang lompat.")
        }

        fun duduk() {
            println("$name sedang duduk.")
        }

        fun main() {
            val hero = Hero()
            hero.setProfile("Hero", 20, 158.2)

            val activities = arrayOf("jalan", "lari", "makan", "minum", "lompat", "duduk")
            val groupEmpat = arrayOf(5, 4, 4, 4, 3, 2)
            val groupNumber = 4

            println("Aktivitas Group : $groupNumber")
            for (i in activities.indices) {
                val activity = activities[i]
                val count = groupEmpat[i]

                for (j in 1..count) {
                    when (activity) {
                        "jalan" -> hero.jalan()
                        "lari" -> hero.lari()
                        "makan" -> hero.makan()
                        "minum" -> hero.minum()
                        "lompat" -> hero.lompat()
                        "duduk" -> hero.duduk()
                    }
                }
            }


            /**
             * Latihan 5
             * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
             *
             */

            hero.profile()
        }
    }
}