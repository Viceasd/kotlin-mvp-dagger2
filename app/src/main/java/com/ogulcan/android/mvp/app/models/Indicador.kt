package com.ogulcan.android.mvp.app.models

data class Dolar(val fecha: String = "",
                 val codigo: String = "",
                 val unidadMedida: String = "",
                 val valor: Double = 0.0,
                 val nombre: String = "")


data class Ivp(val fecha: String = "",
               val codigo: String = "",
               val unidadMedida: String = "",
               val valor: Double = 0.0,
               val nombre: String = "")


data class Bitcoin(val fecha: String = "",
                   val codigo: String = "",
                   val unidadMedida: String = "",
                   val valor: Double = 0.0,
                   val nombre: String = "")


data class Euro(val fecha: String = "",
                val codigo: String = "",
                val unidadMedida: String = "",
                val valor: Double = 0.0,
                val nombre: String = "")


data class Utm(val fecha: String = "",
               val codigo: String = "",
               val unidadMedida: String = "",
               val valor: Int = 0,
               val nombre: String = "")


data class Tpm(val fecha: String = "",
               val codigo: String = "",
               val unidadMedida: String = "",
               val valor: Double = 0.0,
               val nombre: String = "")


data class DolarIntercambio(val fecha: String = "",
                            val codigo: String = "",
                            val unidadMedida: String = "",
                            val valor: Double = 0.0,
                            val nombre: String = "")


data class Uf(val fecha: String = "",
              val codigo: String = "",
              val unidadMedida: String = "",
              val valor: Double = 0.0,
              val nombre: String = "")


data class LibraCobre(val fecha: String = "",
                      val codigo: String = "",
                      val unidadMedida: String = "",
                      val valor: Double = 0.0,
                      val nombre: String = "")


data class TasaDesempleo(val fecha: String = "",
                         val codigo: String = "",
                         val unidadMedida: String = "",
                         val valor: Double = 0.0,
                         val nombre: String = "")


data class Imacec(val fecha: String = "",
                  val codigo: String = "",
                  val unidadMedida: String = "",
                  val valor: Double = 0.0,
                  val nombre: String = "")


data class Ipc(val fecha: String = "",
               val codigo: String = "",
               val unidadMedida: String = "",
               val valor: Double = 0.0,
               val nombre: String = "")


data class Indicador(val ivp: Ivp,
                     val euro: Euro,
                     val dolarIntercambio: DolarIntercambio,
                     val dolar: Dolar,
                     val version: String = "",
                     val libraCobre: LibraCobre,
                     val autor: String = "",
                     val utm: Utm,
                     val tpm: Tpm,
                     val fecha: String = "",
                     val uf: Uf,
                     val tasaDesempleo: TasaDesempleo,
                     val ipc: Ipc,
                     val imacec: Imacec,
                     val bitcoin: Bitcoin)


