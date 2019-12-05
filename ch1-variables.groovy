// Typage faible: avec def
def a = 1                                   // Integer
a = 99999999999                             // Long
a = 999999999999999999999999999999999999    // BigInteger
a = 1.23                                    // BigDecimal
a = "coucou"                                // String
a = 'hello'                                 // String
def b = "*** $a world ***"                  // *** hello world ***
b = '*** $a world ***'                      // *** $a world ***
b = '''
    Bonjour
    tout
    le
    monde
''' // ou son équivalent:
b = """"
    Bonjour
    tout
    le
    monde
"""
def regExp = /.*foo.*/                      // String: pattern expression régulière
b = true                                    // Boolean

// Typage fort
int i = 123                                 // Integer
// i = 'coucou'                             // ERREUR
i = 12.34                                   // Interger : 12
// i = "12"                                 // Erreur
boolean bo = true                            // Boolean

// Conversion :  mot clé 'as'
def res = 12 as String                      // String "12"
res = "12" as int                           // Integer 12