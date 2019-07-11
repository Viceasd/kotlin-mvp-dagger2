package com.ogulcan.android.mvp.app.models

data class Dolar (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Ivp (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Bitcoin (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Euro (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Utm (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Int
)

data class Tpm (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Dolar_intercambio (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Uf (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Libra_cobre (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Tasa_desempleo (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Imacec (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Ipc (

        val codigo : String,
        val nombre : String,
        val unidad_medida : String,
        val fecha : String,
        val valor : Double
)

data class Indicador (

        val version : String,
        val autor : String,
        val fecha : String,
        val uf : Uf,
        val ivp : Ivp,
        val dolar : Dolar,
        val dolar_intercambio : Dolar_intercambio,
        val euro : Euro,
        val ipc : Ipc,
        val utm : Utm,
        val imacec : Imacec,
        val tpm : Tpm,
        val libra_cobre : Libra_cobre,
        val tasa_desempleo : Tasa_desempleo,
        val bitcoin : Bitcoin
)