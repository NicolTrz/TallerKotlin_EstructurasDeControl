// Condicionales Simples y Dobles

fun main(){
    println("Ingrese su edad: ")
    var edad = readLine()!!.toInt()

    if(edad <= 18){
        println("Es menor de edad")
    }else{
        println("Es mayor de edad")
    }
}

// Condicionales anidadas

fun main(){
    println("Ingrese su nombre: ")
    var nombre = readLine()!!
    println("Ingrese la materia: ")
    var materia = readLine()!!
    println("Ingrese la nota 1: ")
    var nota1 = readLine()!!.toInt()
    println("Ingrese la nota 2: ")
    var nota2 = readLine()!!.toInt()
    println("Ingrese la nota 3: ")
    var nota3 = readLine()!!.toInt()

    var promedio = (nota1 + nota2 + nota3)/3

    if(promedio >= 3.5){
        println("EL estudiante $nombre GANO la materia $materia")
    }else{
        println("El estudiante $nombre PERDIO la materia $materia")
        if(promedio >= 2.5){
            println("Pero tiene la opcion de recuperar")
        }
    }
}

// Condicionales con when

fun main(){
    var numero = 3

    when(numero){
        0 -> println("EL valor es 0")
        1,2,3 -> println("EL valor esta entre 1 y 3")
        in 4..10 -> println("EL numero esta entre 4 y 10")
        else -> println("El numero es mayor que 10")   
    }
}

// Expresion when

fun main() {
    var menu = """
    MENU DE OPCIONES 
    1.Saludar
    2.Pedir nombre de una Persona
    3.Suma de dos numeros
    Ingrese una opcion: 
    """

    println(menu)
    var opcion = readLine()!!.toInt()

    when(opcion){
        1 -> println("Holaaa")
        2 ->{
            println("Ingrese su nombre: ")
            var nombre = readLine()!!

            println("Su nombre es $nombre")
        }
        3 -> {
            println("Ingrese el numero 1: ")
            var numero1 = readLine()!!.toInt()
            println("Ingrese el numero 2: ")
            var numero2 = readLine()!!.toInt()

            var suma = (numero1 + numero2)

            println("La suma de los dos numero es $suma")
        }
        else -> println("La opcion Ingresada no es correcta")
    }
}

//Ciclo do While

fun main(){
    println("Ingrese la cantidad de personas a saludar")
    var cant = readLine()!!.toInt()

    var contador = 1

    do{
        println("Ingrese el nombre de la persona $contador")
        var nombre = readLine()!!

        println("Hola $nombre, Bienvenido a nuestro algoritmo")
        contador++
    }while(contador <= cant)
} 

// Ciclo While

fun main(){

    var numero: Int
    var continuar = "si"

    while(continuar.uppercase()=="SI"){

        println("Ingrese un numero")
        numero = readLine()!!.toInt()

        if(numero < 0){
            numero = numero * -1
        }

        println("El numero positivo es $numero")
        println("¿Desea continuar? si/no: ")
        continuar = readLine()!!

    }
} 

// Ciclo for

fun main() {
    println("La cantidad de veces que se desee repetir: ")
    var cant = readLine()!!.toInt()

    for (i in 0 until cant) {
        println("Ingrese numero 1: ")
        var numero1 = readLine()!!.toInt()
        println("Ingrese numero 2: ")
        var numero2 = readLine()!!.toInt()

        var suma = (numero1+numero2)
        println("La suma es $suma")

        when{
            suma >= 10 ->println("La suma arroja un numero positivo y es mayor o igual a dos digitos")
            suma <= 0 -> {
                println("La suma arrojo un numero negativo")

                if(suma <= -10){
                    println("La suma arroja un numero negativo y es mayor o igual a dos digitos")
                }else{
                    println("La suma arroja un numero negativo de un digito")
                }
            }else -> println("La suma arroja un numero positivo de un digito")
        }
    }
}





