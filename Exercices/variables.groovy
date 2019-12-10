def drapeaux = [:]
while( true ){

    continuer = System.console().readLine("Entrer un pays o/n [n]:")
    if( continuer=="o" ){
        def drapeau = System.console().readLine("Drapeau:")
        def pays = System.console().readLine("Pays:")
        drapeaux[ drapeau ] = pays
    }

    break;

    
}

// Saisie et affichage
drap = System.console().readLine("Drapeau à rechercher: ")
print "=>" + drapeaux[drap]