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


class trivialAppViewModel : ViewModel() {
    data class Pregunta(val enunciat: String, val opcio1: String, val opcio2: String, val opcio3: String, val opcio4: String, val resposta: Int)
    val preguntes: List<Pregunta> = listOf()
}

@Composable
fun pantallaPregunta(pregunta: trivialAppViewModel.Pregunta) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Enunciat", fontSize = 4.em, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.size(50.dp))
        Row {
            OutlinedButton(onClick = {}) {
                Text(pre)
            }
        }
    }
}

@Composable
fun trivialApp() {

}