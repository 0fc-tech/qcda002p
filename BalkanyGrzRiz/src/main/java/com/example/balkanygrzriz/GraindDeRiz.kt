package com.example.balkanygrzriz

import java.math.BigInteger

class GrainDeRiz

fun main() {
    //64 cases
    //Combien de grain de riz totaux
    //Case 1 : 1 riz : 2^0
    //Case 2 : 2     : 2^1
    //Case 3 : 4 etc.: 2^2
    var grRizTotaux = BigInteger.ZERO
    var grzRizEnCours = BigInteger.ZERO
    for(nbCase  in 0..63){
        grzRizEnCours = BigInteger("2").pow(nbCase)
        println("Case ${nbCase+1} : $grzRizEnCours ")
        grRizTotaux += grzRizEnCours
    }
    println("Grain de riz Totaux $grRizTotaux")
}