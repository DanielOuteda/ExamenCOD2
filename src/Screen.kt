class Screen {
    val marca:String
    val pulgadas:Float

    constructor(){
        marca = "LG"
        pulgadas = 17F
    }

    constructor(marca:String, pulgadas:Float){
        this.marca=marca
        this.pulgadas=pulgadas
    }
}