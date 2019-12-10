package vehicule

import vehicule.Vehicule

class Voiture extends Vehicule{

    def avancer(){
        _coordZ += 5
    }

    def reculer(){
        _coordZ -= 3
    }
}