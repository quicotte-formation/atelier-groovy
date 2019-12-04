// Conditions parmi une plage de valeurs
def cuisine = System.console().readLine("Type de cuisine [bio, épicé, sucré-salé]: ")
switch(cuisine) {
    case "sucré-salé":
        println "Porc aigre-doux"
        break
    case "épicé":
        println "Poulet tikka"
        break
    default:
        println "Déso plus rien à manger : ("
        break
}