// Listes : ArrayList
def maListe = [1,"coucou", [1,2,3], true]       // [1,"coucou", [1,2,3], true]
couleurs = ["jaune"]    
couleurs << "rouge"                             // ["jaune", "rouge"]
couleurs.add(0, "vert")                         // ["vert", "jaune", "rouge"]
couleurs.add(0, "vert")                         // ["vert", "vert", "jaune", "rouge"]
couleurs -= "vert"                              // ["jaune", "rouge"]

// Tableaux Java classiques : à éviter
String[] couleurs = ["vert", "jaune", "rouge"]

// Maps : LinkedHashMap
def paysCapitales = [france: 'paris', belgique: 'bruxelles', espagne: 'madrid']
paysCapitales.italie = 'rome'
paysCapitales.espagne                           // Madrid
paysCapitales['espagne']                        // Madrid
paysCapitales.keySet()                          // [france, belgique, espagne, italie]