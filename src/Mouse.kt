class Mouse {
    var tipo:String? = null

    constructor(){
        tipo = "usb"
    }

    constructor(tipo:String){
        this.tipo=tipo
    }
}