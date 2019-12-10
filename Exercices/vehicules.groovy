import vehicule.*

def vehicules = []

vehicules += new Velo()
vehicules += new Voiture()


for(Vehicule v in vehicules){

    v.avancer()
}

print vehicules