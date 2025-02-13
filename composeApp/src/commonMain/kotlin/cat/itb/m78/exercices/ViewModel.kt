package cat.itb.m78.exercices

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class TrivialAppViewModel : ViewModel() {

    data class Question(
        val statement: String,
        val options: List<String>,
        val correctAnswer: String
    )

    val questions: List<Question> = listOf(
        Question(
            "Enunciat d'exemple",
            listOf(
                "Opció 1 d'exemple",
                "Opció 2 (la correcta)",
                "Opció 3 d'exemple",
                "Opció 4 d'exemple"
            ),
            "Opció 2 (la correcta)"
        ),
        Question(
            "Enunciat 2",
            listOf("Opció 1", "Opció 2", "Opció 3 (correcta)", "Opció 4"),
            "Opció 3 (correcta)"
        )
    )
    val questionNumber = mutableStateOf(0)
    private val points = mutableStateOf(0)

    fun nextQuestion(chosenOption: String, navigateToScreenPunctuation: (Int) -> Unit) {
        if (chosenOption == questions[questionNumber.value].correctAnswer) {
            points.value++
        }
        if (questionNumber.value == questions.lastIndex) {
            navigateToScreenPunctuation(points.value)
        } else {
            questionNumber.value++
        }
    }
}