package vehicule

import vehicule.Vehicule

class Velo extends Vehicule{

    def avancer(){
        _coordZ ++
    }

    def reculer(){
        _coordZ --
    }
}