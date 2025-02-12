package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PantallaTrivial(navigateToPantallaPuntuacio : (Int) -> Unit) {
    val viewModel = viewModel{TrivialAppViewModel()}
    val pregunta = viewModel.preguntes[viewModel.numeroPregunta.value]

    PantallaTrivial(
        pregunta.enunciat,
        viewModel.seguentPregunta(Int),
        pregunta.opcio1,
        pregunta.opcio2,
        pregunta.opcio3,
        pregunta.opcio4,
    )
}


@Composable
fun PantallaTrivial(enunciat : String, nextQuestion: (Int) -> Unit, opcio1 : String, opcio2 : String, opcio3 : String, opcio4 : String) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(enunciat)
        Spacer(modifier = Modifier.size(50.dp))
        Row {
            OutlinedButton(onClick = {nextQuestion(1)}) {
                Text(opcio1)
            }
            OutlinedButton(onClick = {nextQuestion(2)}) {
                Text(opcio2)
            }
        }
        Row {
            OutlinedButton(onClick = {nextQuestion(3)}) {
                Text(opcio3)
            }
            OutlinedButton(onClick = {nextQuestion(4)}) {
                Text(opcio4)
            }
        }
    }
}

//@Composable
//fun PantallaTrivial() {
//    val trivialAppVM = viewModel {TrivialAppViewModel()}
//    val preguntaActual = trivialAppVM.preguntes[trivialAppVM.numeroPregunta.value]
//
//    Column(modifier = Modifier.fillMaxSize()) {
//        Text(preguntaActual.enunciat, fontSize = 4.em, modifier = Modifier.align(Alignment.CenterHorizontally))
//        Spacer(modifier = Modifier.size(50.dp))
//        Row {
//            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(1)}) {
//                Text(preguntaActual.opcio1, fontSize = 2.em)
//            }
//            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(2)}) {
//                Text(preguntaActual.opcio2, fontSize = 2.em)
//            }
//        }
//        Row {
//            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(3)}) {
//                Text(preguntaActual.opcio3, fontSize = 2.em)
//            }
//            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(4)}) {
//                Text(preguntaActual.opcio4, fontSize = 2.em)
//            }
//        }
//    }
//}