class SoldeInsuffisantException extends Exception {}

class CompteBloqueException extends Exception {}

class CompteService{

    def transfert(int idCpteA, int idCpteB, double montant){

        // Déclenche une exception solde insuffisant sur cpte A
        try{
            if( idCpteA==10 ){
                throw new SoldeInsuffisantException()
            }
        }catch(Exception e){
            // Erreur connue
            println "WAR"
            throw e
        }
        finally{
            // Déclenche une exception si compte emetteur ou destinataire bloqué
            if( idCpteA==20 || idCpteB==20 ){
                throw new CompteBloqueException()
            }
        }

        // Logique applicative
    }
}

    def service = new CompteService()
    service.transfert(10,20,1000)