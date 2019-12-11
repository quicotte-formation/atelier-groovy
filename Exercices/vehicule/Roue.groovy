package vehicule

import vehicule.*

class Roue{

    Jante   jante
    Pneu    pneu

    def Roue(String modele="porsche 911"){

        switch( modele ){
            case "porsche 911":
                jante = new Jante( 9, 'chrome', 'michelin' )
                pneu = new Pneu( 9, 'chrome', 'michelin' )
                break

            case "r4":
                jante = new Jante( 7, 'platique', 'pirelli' )
                pneu = new Pneu( 7, 'platique', 'pirelli' )
                break
            
            default:
                jante = new Jante( 8, 'alu', 'bridgestone' )
                pneu = new Pneu( 8, 'alu', 'bridgestone' )
                break
        }
    }

    def String toString(){
        return jante.toString() + " " + pneu.toString()
    }
}