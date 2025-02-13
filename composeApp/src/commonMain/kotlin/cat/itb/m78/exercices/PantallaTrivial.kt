package cat.itb.m78.exercices

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlin.reflect.KFunction2

@Composable
fun ScreenTrivial(navigateToScreenPunctuation: (Int) -> Unit) {
    val viewModel = viewModel { TrivialAppViewModel() }
    val question = viewModel.questions[viewModel.questionNumber.value]

    ScreenTrivial(
        question,
        viewModel::nextQuestion,
        navigateToScreenPunctuation
    )
}


@Composable
fun ScreenTrivial(
    question: TrivialAppViewModel.Question,
    nextQuestion: KFunction2<String, (Int) -> Unit, Unit>,
    navigateToScreenPunctuation: (Int) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(50.dp))
        Text(question.statement, fontSize = 3.em)
        Spacer(modifier = Modifier.size(75.dp))

        Column {
            question.options.shuffled().forEachIndexed { i, option ->
                Row {
                    Box(modifier = Modifier.clickable {
                        nextQuestion(
                            option,
                            navigateToScreenPunctuation
                        )
                    }.size(50.dp).border(1.dp, color = Color.Black).padding(10.dp)) {
                        Text((i + 1).toString(), modifier = Modifier.align(Alignment.Center))
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(option, modifier = Modifier.align(Alignment.CenterVertically))
                }
                Spacer(modifier = Modifier.size(25.dp))
            }
        }

    }
}