package com.example.moyennedesnotes

class MoyenneDesNotes

fun main() {
    moyenneNoteNbFois()
}
fun moyenneNoteNbFois(){
    println("Veuillez entrer le nombre de note à saisir")
    val inputUser = readln()
    var nbFois :Int = inputUser.toIntOrNull() ?: -1
    if(nbFois == -1){
        println("Veuillez rentrer un entier")
        moyenneNoteNbFois();
    }
    var listNote = mutableListOf<Double>()

    for(nbNote in 1..nbFois){
        println("Rentrer votre note?")
        val note = readln().toDoubleOrNull()
        if(note == null) {
            //nbFois += 1
            //continue
            break;
        }else{
            listNote += note
        }
    }
    print("La moyenne est de ${listNote.average()}")
}