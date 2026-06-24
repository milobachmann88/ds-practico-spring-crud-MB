package etec.crud.service

import etec.crud.model.Instrumento

class InstrumentoServicio {
    val instrumentos= mutableListOf<Instrumento>()
    fun guardar(instrumento: Instrumento): Instrumento {
        instrumentos.add(instrumento)
        return instrumento
    }
    fun listarTodos():List<Instrumento>{
        return instrumentos
    }

    fun buscarPorId(idInstrumento: Int): Instrumento?{
        val encontrar = instrumentos.find { it.id == idInstrumento }
        return encontrar
    }

    fun actualizar(idInstrumento: Int, instrumentoAct: Instrumento): Instrumento?{
        val indice= instrumentos.indexOfFirst {it.id == idInstrumento}
        if (indice >= 0) {
            instrumentos[indice] = instrumentoAct
            return instrumentoAct
        }
        else
            return null
    }

    fun eliminar(idInstrumento: Int): Boolean{
        val indice = instrumentos.indexOfFirst { it.id == idInstrumento }
        if (indice >= 0){
            instrumentos.removeAt(indice)
            return true
        }
        else
        {
            return false
        }
    }
}
