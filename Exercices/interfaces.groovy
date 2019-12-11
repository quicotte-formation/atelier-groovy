interface Dessinable{

    def dessine()
}

interface Calculable{

    def calculeAire()
    def calculePerimetre()
}

class Rectangle implements Calculable, Dessinable{
    def largeur
    def hauteur

    def Rectangle(l, h){
        largeur = l
        hauteur = h
    }

    def dessine(){
        for(def i=0;i<hauteur;i++){
            for(def j=0;j<largeur;j++){
                print "- "
            }
            println ""
        }
    }

    def calculeAire(){

        return largeur*hauteur
    }
    def calculePerimetre(){

        return (largeur+hauteur)*2
    }
}

class Carre implements Calculable, Dessinable{

    def cote

    def Carre(cote=10){
        this.cote = cote
    }

    def dessine(){
        for(def i=0;i<cote;i++){
            for(def j=0;j<cote;j++){
                print "- "
            }
            println ""
        }
    }

    def calculeAire(){

        return cote**2
    }
    def calculePerimetre(){

        return cote*4
    }
}

def rect = new Rectangle(8,4)
rect.dessine()

List<Dessinable> paletteOutils = []



// remplissage de ma palette
for(elem in palette){
    elem.dessine()
}