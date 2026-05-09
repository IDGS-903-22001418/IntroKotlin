fun main() {
    print("Ingrese la coordenada x del punto 1: ")
    val x1 = readln().toDouble()
    print("Ingrese la coordenada y del punto 1: ")
    val y1 = readln().toDouble()
    print("Ingrese la coordenada x del punto 2: ")
    val x2 = readln().toDouble()
    print("Ingrese la coordenada y del punto 2: ")
    val y2 = readln().toDouble()
    
    val distancia = kotlin.math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    println("La distancia entre los puntos es: $distancia")
}

main()
