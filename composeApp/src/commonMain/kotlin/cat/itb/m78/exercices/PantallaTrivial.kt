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
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PantallaTrivial(navigateToPantallaPuntuacio : (Int) -> Unit) {
    val trivialAppVM = viewModel {TrivialAppViewModel()}
    val preguntaActual = trivialAppVM.preguntes[trivialAppVM.numeroPregunta.value]

    Column(modifier = Modifier.fillMaxSize()) {
        Text(preguntaActual.enunciat, fontSize = 4.em, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.size(50.dp))
        Row {
            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(1)}) {
                Text(preguntaActual.opcio1, fontSize = 2.em)
            }
            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(2)}) {
                Text(preguntaActual.opcio2, fontSize = 2.em)
            }
        }
        Row {
            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(3)}) {
                Text(preguntaActual.opcio3, fontSize = 2.em)
            }
            OutlinedButton(onClick = {trivialAppVM.seguentPregunta(4)}) {
                Text(preguntaActual.opcio4, fontSize = 2.em)
            }
        }
    }
}