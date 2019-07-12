package com.ogulcan.android.mvp.app


import org.junit.Test

import org.junit.Assert.*
import org.json.simple.JSONValue
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.ogulcan.android.mvp.app.models.Indicador
import com.ogulcan.android.mvp.app.ui.list.ListFragment


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun obtenerJson() {
        var json: String = "{\"version\":\"1.5.0\",\"autor\":\"mindicador.cl\",\"fecha\":\"2019-07-11T20:00:00.000Z\",\"uf\":{\"codigo\":\"uf\",\"nombre\":\"Unidad de fomento (UF)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":27953.42},\"ivp\":{\"codigo\":\"ivp\",\"nombre\":\"Indice de valor promedio (IVP)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":28985.17},\"dolar\":{\"codigo\":\"dolar\",\"nombre\":\"Dólar observado\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":685.4},\"dolar_intercambio\":{\"codigo\":\"dolar_intercambio\",\"nombre\":\"Dólar acuerdo\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2014-11-13T05:00:00.000Z\",\"valor\":758.87},\"euro\":{\"codigo\":\"euro\",\"nombre\":\"Euro\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":771.24},\"ipc\":{\"codigo\":\"ipc\",\"nombre\":\"Indice de Precios al Consumidor (IPC)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":0.6},\"utm\":{\"codigo\":\"utm\",\"nombre\":\"Unidad Tributaria Mensual (UTM)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-01T04:00:00.000Z\",\"valor\":49033},\"imacec\":{\"codigo\":\"imacec\",\"nombre\":\"Imacec\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":2.3},\"tpm\":{\"codigo\":\"tpm\",\"nombre\":\"Tasa Política Monetaria (TPM)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.5},\"libra_cobre\":{\"codigo\":\"libra_cobre\",\"nombre\":\"Libra de Cobre\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.63},\"tasa_desempleo\":{\"codigo\":\"tasa_desempleo\",\"nombre\":\"Tasa de desempleo\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":7.09},\"bitcoin\":{\"codigo\":\"bitcoin\",\"nombre\":\"Bitcoin\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-09T04:00:00.000Z\",\"valor\":11616.936025641025}}"
        val obj = JSONValue.parse(json)
        val jsonObject = obj as org.json.simple.JSONObject

        val name = jsonObject.get("name") as String
    }

    @Test
    fun obtenerJson2(){
        val gson = Gson()
        var json: String = "{\"version\":\"1.5.0\",\"autor\":\"mindicador.cl\",\"fecha\":\"2019-07-11T20:00:00.000Z\",\"uf\":{\"codigo\":\"uf\",\"nombre\":\"Unidad de fomento (UF)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":27953.42},\"ivp\":{\"codigo\":\"ivp\",\"nombre\":\"Indice de valor promedio (IVP)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":28985.17},\"dolar\":{\"codigo\":\"dolar\",\"nombre\":\"Dólar observado\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":685.4},\"dolar_intercambio\":{\"codigo\":\"dolar_intercambio\",\"nombre\":\"Dólar acuerdo\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2014-11-13T05:00:00.000Z\",\"valor\":758.87},\"euro\":{\"codigo\":\"euro\",\"nombre\":\"Euro\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":771.24},\"ipc\":{\"codigo\":\"ipc\",\"nombre\":\"Indice de Precios al Consumidor (IPC)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":0.6},\"utm\":{\"codigo\":\"utm\",\"nombre\":\"Unidad Tributaria Mensual (UTM)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-01T04:00:00.000Z\",\"valor\":49033},\"imacec\":{\"codigo\":\"imacec\",\"nombre\":\"Imacec\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":2.3},\"tpm\":{\"codigo\":\"tpm\",\"nombre\":\"Tasa Política Monetaria (TPM)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.5},\"libra_cobre\":{\"codigo\":\"libra_cobre\",\"nombre\":\"Libra de Cobre\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.63},\"tasa_desempleo\":{\"codigo\":\"tasa_desempleo\",\"nombre\":\"Tasa de desempleo\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":7.09},\"bitcoin\":{\"codigo\":\"bitcoin\",\"nombre\":\"Bitcoin\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-09T04:00:00.000Z\",\"valor\":11616.936025641025}}"
        val gsonContent = gson.fromJson(json, JsonObject::class.java)
        gsonContent.get("dolar")
    }
    @Test
    fun paseoJson(){
        val gson = Gson()
        var json1: String = "{\"version\":\"1.5.0\",\"autor\":\"mindicador.cl\",\"fecha\":\"2019-07-11T20:00:00.000Z\",\"uf\":{\"codigo\":\"uf\",\"nombre\":\"Unidad de fomento (UF)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":27953.42},\"ivp\":{\"codigo\":\"ivp\",\"nombre\":\"Indice de valor promedio (IVP)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":28985.17},\"dolar\":{\"codigo\":\"dolar\",\"nombre\":\"Dólar observado\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":685.4},\"dolar_intercambio\":{\"codigo\":\"dolar_intercambio\",\"nombre\":\"Dólar acuerdo\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2014-11-13T05:00:00.000Z\",\"valor\":758.87},\"euro\":{\"codigo\":\"euro\",\"nombre\":\"Euro\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":771.24},\"ipc\":{\"codigo\":\"ipc\",\"nombre\":\"Indice de Precios al Consumidor (IPC)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":0.6},\"utm\":{\"codigo\":\"utm\",\"nombre\":\"Unidad Tributaria Mensual (UTM)\",\"unidad_medida\":\"Pesos\",\"fecha\":\"2019-07-01T04:00:00.000Z\",\"valor\":49033},\"imacec\":{\"codigo\":\"imacec\",\"nombre\":\"Imacec\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":2.3},\"tpm\":{\"codigo\":\"tpm\",\"nombre\":\"Tasa Política Monetaria (TPM)\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.5},\"libra_cobre\":{\"codigo\":\"libra_cobre\",\"nombre\":\"Libra de Cobre\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-11T04:00:00.000Z\",\"valor\":2.63},\"tasa_desempleo\":{\"codigo\":\"tasa_desempleo\",\"nombre\":\"Tasa de desempleo\",\"unidad_medida\":\"Porcentaje\",\"fecha\":\"2019-05-01T04:00:00.000Z\",\"valor\":7.09},\"bitcoin\":{\"codigo\":\"bitcoin\",\"nombre\":\"Bitcoin\",\"unidad_medida\":\"Dólar\",\"fecha\":\"2019-07-09T04:00:00.000Z\",\"valor\":11616.936025641025}}"
        var gsonContent : Indicador = gson.fromJson(json1, Indicador::class.java)
        var listFragment : ListFragment = ListFragment()
        listFragment.prepareListIndicador(gsonContent)
    }
}
