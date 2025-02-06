package cat.itb.m78.exercices

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class TrivialAppViewModel : ViewModel() {

    data class Pregunta(val enunciat: String, val opcio1: String, val opcio2: String, val opcio3: String, val opcio4: String, val respostaCorrecta: Int)

    val preguntes: List<Pregunta> = listOf(
        Pregunta("Enunciat d'exemple", "Opció 1 d'exemple", "Opció 2 (la correcta)", "Opció 3 d'exemple", "Opció 4 d'exemple", 2),
        Pregunta("Enunciat 2",  "Opció 1", "Opció 2", "Opció 3 (correcta)", "Opció 4", 3)
    )

    var numeroPregunta = mutableStateOf(0)
}