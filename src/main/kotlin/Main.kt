import kotlin.system.exitProcess

fun posicion(uno:IntArray, dos:IntArray){ //Empieza la funcion para cambiar las posiciones
    val pri: IntArray = intArrayOf(5,7,9,11,13) //Se crea una distinta array con diferente variables para
    val seg: IntArray = intArrayOf(4,6,8,10) // que no se cambia las variables en la misma funcion
    val conjunto: Array<IntArray> = arrayOf(pri, seg) //Y asi podremos cambiar las variables de manera eficaz
    for (i in 0..uno.size-1){
        val valor = uno[i] //Se mete el valor del array uno dependiendo de la i
        println("¿en que posicion quieres ponerlo?")
        val res = readLine()!!.toInt() //Escribes por teclado el numero, si el numero es mas grande que el tamano
        if (res < uno.size){ //entonces te saca del programa
            conjunto[0][res]=valor
            println("Cambiado correctamente")
        }else{
            println("Elije un numero valido!!")
            exitProcess(-1)
        }
    }
    println("Cambiamos de array")
    for (i in 0..dos.size-1){
        val valia = dos[i]
        println("¿en que posicion quieres ponerlo?")
        val res = readLine()!!.toInt()
        if (res < dos.size){
            conjunto[1][res]=dos[i]
        }else{
            println("Elije un numero valido!!")
            exitProcess(-1)
        }
    } //Se hace lo mismo con la segunda array y despues se visualiza
    println(" ")
    print(conjunto[0][0])
    print(" ")
    print(conjunto[0][1])
    print(" ")
    print(conjunto[0][2])
    print(" ")
    print(conjunto[0][3])
    print(" ")
    print(conjunto[0][4])
    println(" ")
    print(conjunto[1][0])
    print(" ")
    print(conjunto[1][1])
    print(" ")
    print(conjunto[1][2])
    print(" ")
    print(conjunto[1][3])

}



fun main(args: Array<String>) {
    val uno: IntArray = intArrayOf(5,7,9,11,13) //Se declara el primer array
    val dos: IntArray = intArrayOf(4,6,8,10) //Se declara el segundo array
    for (a in uno) {
        print(" $a") //Para visualizar el primer array
    }
    println("")
    for (a in dos) {
        print(" $a") //Para visualizar el segundo array
    }
    println("")
    posicion(uno,dos)

}