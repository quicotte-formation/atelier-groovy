class Personne{
    def nom
    def prenom

    def Personne(prenom, nom){
        this.nom = nom
        this.prenom = prenom
    }

    String toString(){
        return nom + " " + prenom
    }

    boolean equals(Object objetADroite){

        if(prenom == objetADroite.prenom){
            return true
        }else{
            return false
        }
    }
}

class PersonneComparator<Personne> implements Comparator{

    int compare(Personne p1, Personne p2){

        def concat1 = p1.nom + p1.prenom
        def concat2 = p2.nom + p2.prenom

        if( concat1==concat2 ){
            return 0
        }

        if( concat1>concat2 ){
            return 1
        }
        return -1
    }
}

List<Personne> personnes = []
personnes += new Personne('mickey', 'trump')
personnes += new Personne('donald', 'duck')
personnes += new Personne('mickey', 'rourke')
personnes += new Personne('condelaza', 'rice')
personnes += new Personne('anne', 'rice')

Comparator c = new PersonneComparator()
personnes.sort( c )
print personnes