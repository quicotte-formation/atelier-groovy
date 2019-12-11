package vehicule

class Jante{
    def _dimension = 10
    def _marque = "Lotus"
    def _modele = "turbo"

    def Jante(diam, modele, marque){
        _modele = modele
        _dimension = diam
        _marque = marque
    }

    def String toString(){
        return "Jante: " + _dimension + " " + _marque + " " + _modele
    }
}