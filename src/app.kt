fun main() {
    /*
    Creo un nuevo repositorio en github llamado ExamenCOD2
    Utilizo la terminal en el lugar donde se encuetra el documento
    utilizo git init para inicializar un repositorio localmente
    añado el repositorio usando git add src
    hago distintos commits de cada clase con git commit -m "ejemplo"
    subo todos los commits con git push -u src master
    para crear las releases utilizo --tag
    para dar permisos entro dentro del repositorio de github/ configuracion collaborators u escribo el nombre de usuario de lreceptor

     */
    println("Esto es una app")
    var mouseA = CPU()
    println(mouseA.tipo)
    var mouseB = CPU("Inalambrico")
    println(mouseB.tipo)
    mouseA.tipo="bluetooth"
    println(mouseA.tipo)
    var mipantalla = Computer()
    println(mipantalla.marca)

}