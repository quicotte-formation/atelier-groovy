package vehicule

import vehicule.*

class Velo extends Vehicule{

    List<Roue> _roues=[]

    def Velo(){
        _roues += new Roue()// Roue avant
        _roues += new Roue()// Roue arrière
    }

    def avancer(){
        _coordZ ++
    }

    def reculer(){
        _coordZ --
    }
}