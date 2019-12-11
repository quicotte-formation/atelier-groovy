package vehicule

class Pneu{
    def _dimension = 10
    def _marque = "Lotus"
    def _modele = "turbo"

    def Pneu(diam, modele, marque){

        if( marque!='michelin' ){
            throw new MarqueException()
        }

        _modele = modele
        _dimension = diam
        _marque = marque
    }

    def String toString(){
        return "Pneu: " + _dimension + " " + _marque + " " + _modele
    }
}