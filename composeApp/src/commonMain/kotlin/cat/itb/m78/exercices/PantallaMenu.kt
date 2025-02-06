package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PanatallaMenu() {
    Spacer(modifier = Modifier.size(50.dp))
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {}) {
            Text("Nova Partida")
        }
    }
}