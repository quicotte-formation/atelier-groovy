import vehicule.*

def vehicules = []

try{
    vehicules += new Voiture("r4")
}
catch(MarqueException e){
    println "Erreur de marque"
}

print vehicules