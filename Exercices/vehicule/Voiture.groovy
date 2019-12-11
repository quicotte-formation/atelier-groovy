package vehicule

import vehicule.*

class Voiture extends Vehicule{

    List<Roue> _roues=[]

    def Voiture(String modele = "r4"){
        _roues += new Roue( modele )
        _roues += new Roue( modele )
        _roues += new Roue( modele )
        _roues += new Roue( modele )
    }

    def avancer(){
        _coordZ += 5
    }

    def reculer(){
        _coordZ -= 3
    }

    def String toString(){
        return "Voiture: " + _nom + ", roues: " + _roues
    }
}