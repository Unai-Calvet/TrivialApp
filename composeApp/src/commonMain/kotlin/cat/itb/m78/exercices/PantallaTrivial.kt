package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.lifecycle.viewmodel.compose.viewModel
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.background
import org.jetbrains.compose.resources.painterResource
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
    Image(
        painter = painterResource(Res.drawable.background),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(25.dp))
        Text(question.statement, fontSize = 2.em)
        Spacer(modifier = Modifier.size(10.dp))
        Box(
            modifier = Modifier.size(width = 350.dp, height = 400.dp)
                .background(color = Color.LightGray)
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(2))
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                question.options.shuffled().forEach { option ->
                    Row(modifier = Modifier.fillMaxWidth().padding(15.dp, 0.dp, 0.dp, 0.dp)) {

                        Button(
                            onClick = {
                                nextQuestion(
                                    option,
                                    navigateToScreenPunctuation
                                )
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                            modifier = Modifier.size(75.dp).padding(10.dp)
                        ) {}
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(option, modifier = Modifier.align(Alignment.CenterVertically))
                    }
                    Spacer(modifier = Modifier.size(25.dp))
                }
            }
        }
    }
}