import java.util.*

// Deux variables pour indiquer les dimensions du plateau de jeu (rectangulaire)
const val NB_LIGNES = 10
const val NB_COLONNES = 10

// Une variable pour stocker la date de début du jeu
val dateDebut = Date()

// Variable pour compter le nombre de tours à la fin du jeu
var nbTours = 0

// Partie 2 - manipuler les tableaux

// Créer un tableau de monstres avec une taille de 5
// Remplir ce tableau avec 10 monstres nommés "MONSTREX" avec X = 1..5
val monstres = arrayOf("MONSTRE1", "MONSTRE2", "MONSTRE3", "MONSTRE4", "MONSTRE5")


// Créer un tableau de chasseurs avec une taille de 5
// Remplir ce tableau avec 5 chasseurs nommés "CHASSEURX" avec X = 1..5
val chasseurs = arrayOf("CHASSEUR1", "CHASSEUR2", "CHASSEUR3", "CHASSEUR4", "CHASSEUR5")

// Créer un tableau d'armes avec une taille de 8
// Remplir ce tableau avec
//     - "LEGENDAIREX" pour 2 armes avec X = 1..2
//     - "ARMEX" pour 6 armes avec X = 1..6
val armes = arrayOf("LENGENDAIRE1", "LENGENDAIRE2",
    "ARME1", "ARME2", "ARME3", "ARME4", "ARME5", "ARME6")

// Créer une matrice jeu avec pour indices i et j la position de l'objet sur le plateur
// et pour valeur le nom de l'objet.
// Positionner dans l'ordre d'abord les montres, les chasseurs puis les armes légendaires
// et enfin les armes classiques.
val jeu = arrayOf(
        arrayOf(*monstres, *chasseurs),
        arrayOf(*armes)
    )
// Le résultat attendu est
// MONSTRE1 MONSTRE2 .... MONSTRE5 CHASSEUR1 CHASSEUR2 ... CHASSEUR5
// LENGENDAIRE1 LEGENDAIRE2 ARME1 .. ARME6
fun main() {
    jeu.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }
}