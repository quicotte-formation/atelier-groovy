import groovy.json.JsonOutput

// Objet vers Json
class Pays {

    def pays
    def capitale
    def nbHabitants

    def Pays(pays, capitale, nbHabitants){
        this.pays = pays
        this.capitale = capitale
        this.nbHabitants = nbHabitants
    }
}
def mesPays = []
mesPays += new Pays('France', 'Paris', 100)
mesPays += new Pays('Belgique', 'Bruxelles', 5)
mesPays += new Pays('Jamaïque', 'Kingston', 2)

def jsonOutput = JsonOutput.toJson(mesPays)
print jsonOutput