import groovy.json.JsonOutput
import groovy.json.JsonSlurper

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

// JSON vers objet
File f = new File('pays.json')
InputStream fis = f.newInputStream()
def slurper = new JsonSlurper()
def objet = slurper.parse( fis )
print objet