package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

@Composable
fun ScreenPunctuation(points: Int, navigateToScreenMenu: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(" Puntuació:", fontSize = 2.em)
        Spacer(modifier = Modifier.size(50.dp))
        Text("$points", fontSize = 3.em)
        Spacer(modifier = Modifier.size(75.dp))
        Button(onClick = { navigateToScreenMenu() }) {
            Text("Retornar al menú")
        }
    }
}