fun main() {
    println("Esto es una app")
    var mouseA = Mouse()
    println(mouseA.tipo)
    var mouseB = Mouse("Inalambrico")
    println(mouseB.tipo)
    mouseA.tipo="bluetooth"
    println(mouseA.tipo)
    var mipantalla = Screen()
    println(mipantalla.marca)

}