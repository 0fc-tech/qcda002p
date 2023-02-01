package com.example.palindrome

import java.text.Normalizer

class PalindromeTester

fun String.isPalindrome() : Boolean{
    var stringCleaned = this
        .replace(" ","")
        .lowercase()
    stringCleaned = Normalizer.normalize(stringCleaned, Normalizer.Form.NFD);
    stringCleaned = stringCleaned.replace("[^\\p{ASCII}]".toRegex(), "")
    stringCleaned = stringCleaned.replace("[^{a-z}]".toRegex(), "")
    return stringCleaned.reversed() == stringCleaned;
}

fun main() {
    val listTestPlaindrome = listOf(
        "Bob",
        "Kayak",
        "Laval",
        "Bernard",
        "FSDJHIOémskjdfàè",
        "Esope reste ici et se repose",
        "Engage le jeu que je le gagne",
        "Eh ! ça va, la vache ?",
        "Léon, émir cornu, d'un roc rime Noël",
        "À révéler mon nom, mon nom relèvera")
    listTestPlaindrome.forEach { palindrome ->
        if(palindrome.isPalindrome()) println("$palindrome est un palindrome") else
            println("$palindrome n'est  pas un palindrome")
    }
}
//fun isPalindrome(stringToTest : String) : Boolean{
//
//}