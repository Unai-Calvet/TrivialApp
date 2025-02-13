package cat.itb.m78.exercices

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

object Destination {
    @Serializable
    data object ScreenMenu

    @Serializable
    data object ScreenTrivial

    @Serializable
    data class ScreenPunctuation(val points: Int)
}

@Composable
fun LibNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.ScreenMenu) {
        composable<Destination.ScreenMenu> {
            ScreenMenu(navigateToScreenTrivial = { navController.navigate(Destination.ScreenTrivial) })
        }
        composable<Destination.ScreenTrivial> {
            ScreenTrivial(navigateToScreenPunctuation = {
                navController.navigate(
                    Destination.ScreenPunctuation(
                        it
                    )
                )
            })
        }
        composable<Destination.ScreenPunctuation> {
            val points = it.toRoute<Destination.ScreenPunctuation>().points
            ScreenPunctuation(
                points = points,
                navigateToScreenMenu = { navController.navigate(Destination.ScreenMenu) })
        }
    }
}