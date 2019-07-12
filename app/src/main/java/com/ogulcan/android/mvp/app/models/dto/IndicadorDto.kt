package com.ogulcan.android.mvp.app.models.dto

class IndicadorDto {
    var nombre: String = ""
    var valor: String = ""
    var id: String = ""

    constructor() {}

    constructor(nombre: String, valor: String, id : String) {
        this.nombre = nombre
        this.valor = valor
        this.id = id
    }
}