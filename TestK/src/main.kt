/* fun main(args: Array<String>){
    println("Hello World")
    println (addition(1,nb2 = 3))
}

fun addition(nb1: Int, nb2: Int): Int {
    return nb1 + nb2
} */


fun main(args: Array<String>) {
    print("Entrer un nombre ici: ")

    val enteredString = readLine()
    println(" Nombre entre: $enteredString")

    var enteredString1 : String = "0"
    var trynumber : Int = 1


    while (enteredString != enteredString1) {
        print("Entrer un nombre ici: ")

        var enteredString1  = readLine()
        println(" Nombre entre: $enteredString1")


        if (enteredString == enteredString1) {
            println("Bravo vous avez gagnez")
            println("Nombre de tentative total = $trynumber")
            break
        }

        else if (enteredString!!.toInt() < enteredString1!!.toInt())
        {
            println("moins")
            trynumber ++
            println("Essai : $trynumber")
        }

        else
        {
            println("plus")
            trynumber  ++
            println("Essai : $trynumber")
        }

        when (enteredString1!!.toInt()) {

            in enteredString!!.toInt()..enteredString!!.toInt() + 5 -> {
                println("Vous etes VRAIMENT proche")
            }

            in enteredString!!.toInt() - 5 ..enteredString!!.toInt() -> {
                println("Vous etes VRAIMENT très proche")
            }

            in enteredString!!.toInt() - 10 ..enteredString!!.toInt() -> {
                println("Vous etes trés proche")
            }


            in enteredString!!.toInt()..enteredString!!.toInt() + 10 -> {
                println("Vous etes trés proche")
            }
        }

       // else if (enteredString!!.toInt() - 10 < enteredString1!!.toInt()  && enteredString!!.toInt() + 10 > enteredString1!!.toInt())
         // {
            //    println("Vous etes proche")

         // }


        }
    }
