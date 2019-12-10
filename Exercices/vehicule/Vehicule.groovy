package vehicule

abstract class Vehicule{
    def _coordX = 0
    def _coordY = 0
    def _coordZ = 0
    def _nom = "Nom par défaut"

    String toString(){
        return _nom + ": " + _coordX + " " + _coordY + " " + _coordZ
    }

    abstract avancer()

    abstract reculer()
}