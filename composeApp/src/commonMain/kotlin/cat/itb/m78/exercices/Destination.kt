package cat.itb.m78.exercices

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

object Destination {
    @Serializable
    data object PantallaMenu
    @Serializable
    data object PantallaTrivial
    @Serializable
    data object PantallaPuntuacio
}

@Composable
fun LibNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.PantallaMenu) {
        composable<Destination.PantallaMenu> {
            PanatallaMenu(navigateToPantallaTrivial = {navController.navigate(Destination.PantallaTrivial)})
        }
        composable<Destination.PantallaTrivial> {
        PantallaTrivial(navigateToPantallaPuntuacio = {navController.navigate(Destination.PantallaPuntuacio(it))})
        }
        composable<Destination.PantallaPuntuacio> { backStack ->
            val punts = backStack.toRoute<Destination.PantallaPuntuacio>().punts
            PantallaPuntuacio(navigateToPantallaMenu = {navController.navigate(Destination.PantallaMenu)}, punts = punts)
        }
    }
}