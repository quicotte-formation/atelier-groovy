// Conditions : if else
def age = System.console().readLine("Votre age: ") as int
if( age<10 ){
    println "Entrée gratuite"
}else if( age<30 ){
    println "Entrée 5 euros !"
}else{
    println "Trop vieux, vous restez sur la touche ; )"
}