fun main() {
    print("Ingrese el primer valor: ")
    val a = readln().toInt()
    print("Ingrese el segundo valor: ")
    val b = readln().toInt()
    
    var resultado = 0
    for (i in 1..kotlin.math.abs(b)) {
        resultado += a
    }
    if (b < 0) resultado = -resultado
    println("El resultado de la multiplicación es: $resultado")
}

main()
