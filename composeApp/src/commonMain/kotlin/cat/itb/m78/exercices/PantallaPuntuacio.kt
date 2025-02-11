package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PantallaPuntuacio(punts : Int, navigateToPantallaMenu : () -> Unit) {
    Column {
        Text("Puntuació: ")
        Text("$punts")
        Button(onClick = {navigateToPantallaMenu()}) {
            Text("Retornar al menú")
        }
    }
}