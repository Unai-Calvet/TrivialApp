package cat.itb.m78.exercices

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class TrivialAppViewModel : ViewModel() {

    data class Question(
        val statement: String,
        val options: List<String>,
        val correctAnswer: String
    )

    val questions: List<Question> = listOf(
        Question(
            "Quin és el riu més llarg del món?",
            listOf("El Nil", "L'Amazones", "El Mississipi", "El Iang-Tsé"),
            "L'Amazones"
        ),
        Question(
            "Quina és la capital d'Austràlia?",
            listOf("Sydney", "Melbourne", "Canberra", "Perth"),
            "Canberra"
        ),
        Question(
            "Quin és el planeta més gran del nostre sistema solar?",
            listOf("Mart", "Júpiter", "Venus", "Saturn"),
            "Júpiter"
        ),
        Question(
            "Qui va pintar la Mona Lisa?",
            listOf("Miguel Ángel", "Leonardo da Vinci", "Rafael", "Donatello"),
            "Leonardo da Vinci"
        ),
        Question(
            "En quin any va començar la Segona Guerra Mundial?",
            listOf("1914", "1939", "1945", "1929"),
            "1939"
        ),
        Question(
            "Quin és l'element químic més abundant a l'univers?",
            listOf("Hidrogen", "Heli", "Oxigen", "Carboni"),
            "Hidrogen"
        ),
        Question("Quants ossos té el cos humà?", listOf("206", "213", "220", "230"), "206"),
        Question(
            "Quin és l'animal terrestre més gran del món?",
            listOf("Elefant africà", "Rinoceront blanc", "Hipopòtam", "Girafa"),
            "Elefant africà"
        ),
        Question(
            "Quin és el país més poblat del món?",
            listOf("Índia", "Xina", "Estats Units", "Indonèsia"),
            "Xina"
        ),
        Question(
            "Qui va escriure 'El Quixot'?",
            listOf(
                "Miguel de Cervantes",
                "Lope de Vega",
                "Calderón de la Barca",
                "Federico García Lorca"
            ),
            "Miguel de Cervantes"
        ),
        Question("Quin és el símbol químic de l'or?", listOf("Ag", "Fe", "Au", "Hg"), "Au"),
        Question(
            "Quina és la muntanya més alta del món?",
            listOf("K2", "Kangchenjunga", "Everest", "Lhotse"),
            "Everest"
        ),
        Question(
            "Quin és el continent més petit del món?",
            listOf("Àfrica", "Amèrica del Sud", "Europa", "Austràlia"),
            "Austràlia"
        ),
        Question(
            "Quin és el segon idioma més parlat del món?",
            listOf("Anglès", "Xinès mandarí", "Espanyol", "Hindi"),
            "Espanyol"
        ),
        Question(
            "Qui va ser el primer president dels Estats Units?",
            listOf("George Washington", "John Adams", "Thomas Jefferson", "Abraham Lincoln"),
            "George Washington"
        ),
        Question(
            "Quin és el nom del déu grec del mar?",
            listOf("Zeus", "Hades", "Poseidó", "Apol·lo"),
            "Poseidó"
        ),
        Question(
            "Quina és la capital de França?",
            listOf("Marsella", "Lyon", "París", "Toulouse"),
            "París"
        ),
        Question("Quin és el símbol químic del ferro?", listOf("Ir", "Fe", "Cu", "Pb"), "Fe"),
        Question(
            "Quin és el riu que travessa Londres?",
            listOf("Támesis", "Sena", "Rin", "Danubi"),
            "Támesis"
        ),
        Question(
            "Quin és el nom del famós detectiu creat per Arthur Conan Doyle?",
            listOf("Sherlock Holmes", "Hercule Poirot", "Miss Marple", "Philip Marlowe"),
            "Sherlock Holmes"
        ),
        Question(
            "Quin és el planeta més gran del nostre sistema solar?",
            listOf("Mart", "Júpiter", "Venus", "Terra"),
            "Júpiter"
        ),
        Question(
            "Quina és la galàxia més propera a la Via Làctia?",
            listOf("Andròmeda", "Triangulum", "Centaurus A", "M87"),
            "Andròmeda"
        ),
        Question("Quantes llunes té el planeta Mart?", listOf("0", "1", "2", "4"), "2"),
        Question(
            "Quin és el nom del nostre satèl·lit natural?",
            listOf("Lluna", "Fobos", "Deimos", "Tità"),
            "Lluna"
        ),
        Question(
            "Què és un any llum?",
            listOf(
                "Una mesura de temps",
                "Una mesura de distància",
                "Una mesura de massa",
                "Una mesura de temperatura"
            ),
            "Una mesura de distància"
        ),
        Question(
            "Quin és el nom del fenomen que es produeix quan la Lluna passa entre el Sol i la Terra?",
            listOf("Eclipsi lunar", "Eclipsi solar", "Solstici d'estiu", "Equinocci de primavera"),
            "Eclipsi solar"
        ),
        Question(
            "Quin és el planeta més proper al Sol?",
            listOf("Mart", "Venus", "Mercuri", "Terra"),
            "Mercuri"
        ),
        Question(
            "Què és un forat negre?",
            listOf(
                "Una estrella molt calenta",
                "Un planeta fosc",
                "Una regió de l'espai amb una gravetat molt intensa",
                "Un tipus de galàxia"
            ),
            "Una regió de l'espai amb una gravetat molt intensa"
        ),
        Question(
            "Quin és el nom del telescopi espacial més famós?",
            listOf("Hubble", "Kepler", "Spitzer", "Chandra"),
            "Hubble"
        ),
        Question(
            "Quants planetes hi ha al nostre sistema solar?",
            listOf("7", "8", "9", "10"),
            "8"
        ),
        Question(
            "Quin és el nom de la constel·lació més famosa?",
            listOf("Orió", "Ossa Major", "Ossa Menor", "Cassièopea"),
            "Orió"
        ),
        Question(
            "Què és una estrella fugaç?",
            listOf("Un planeta", "Un satèl·lit", "Un meteor", "Un cometa"),
            "Un meteor"
        ),
        Question(
            "Quin és el nom del planeta nan més gran del nostre sistema solar?",
            listOf("Ceres", "Plutó", "Eris", "Makemake"),
            "Plutó"
        ),
        Question(
            "Què és la Via Làctia?",
            listOf("Un planeta", "Una estrella", "Una galàxia", "Un cúmul d'estrelles"),
            "Una galàxia"
        ),
        Question(
            "Quin és el nom del segon planeta més gran del nostre sistema solar?",
            listOf("Mart", "Saturn", "Urà", "Neptú"),
            "Saturn"
        ),
        Question(
            "Què és un cometa?",
            listOf(
                "Un planeta",
                "Una estrella",
                "Un cos celeste petit i gelat",
                "Un tipus de galàxia"
            ),
            "Un cos celeste petit i gelat"
        ),
        Question(
            "Quin és el nom del satèl·lit natural més gran de Saturn?",
            listOf("Tità", "Ganímedes", "Cal·listo", "Europa"),
            "Tità"
        ),
        Question(
            "Què és un púlsar?",
            listOf(
                "Un planeta",
                "Una estrella de neutrons que emet radiació",
                "Un forat negre",
                "Un tipus de galàxia"
            ),
            "Una estrella de neutrons que emet radiació"
        ),
        Question(
            "Quin és el nom del primer home que va trepitjar la Lluna?",
            listOf("Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Yuri Gagarin"),
            "Neil Armstrong"
        ),
        Question(
            "Quin és el nom del programa espacial dels Estats Units que va portar els primers homes a la Lluna?",
            listOf("Apollo", "Gemini", "Mercury", "Skylab"),
            "Apollo"
        )
    ).shuffled()
    val questionNumber = mutableStateOf(0)
    private val points = mutableStateOf(0)

    fun nextQuestion(chosenOption: String, navigateToScreenPunctuation: (Int) -> Unit) {
        if (chosenOption == questions[questionNumber.value].correctAnswer) {
            points.value++
        }
        if (questionNumber.value == questions.lastIndex) {
            navigateToScreenPunctuation(points.value)
        } else {
            questionNumber.value++
        }
    }
}