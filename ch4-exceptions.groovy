def a = "aaa"
try{
    a as int
    // null.print()
    // 0 / 0   
}
catch(ArithmeticException e){
    println "Petite erreur de calcul"
}
catch(NumberFormatException e){
    println "Petite erreur de conversion"
}
catch(e){
    throw new Exception("Erreur indéterminée")
}
finally{
    println "Passe ici quoi qu'il en soit !"
}

print "Suite du programme"