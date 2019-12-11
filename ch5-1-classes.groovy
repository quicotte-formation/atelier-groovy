class Personne {
    static elements = 0

    def nom
    def prenom

    def Personne(){
        Personne.elements++
    }
    def Personne(String nom, String prenom){
        Personne.elements++
        this.nom = nom
        this.prenom = prenom
    }
    def affiche(){
        println nom + " " + prenom
    }
    String toString(){
        return nom + " " + prenom
    }
}

p = new Personne()
p.prenom = "Funk fu"
p.nom = "Panda"
p.affiche()

p = new Personne("Ferigno", "Lou")
println p

println "Nombre de personnes : " + Personne.elements