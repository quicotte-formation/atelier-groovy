class HeureInvalideException extends Exception {
    def HeureInvalideException(String msg){
        super(msg)
    }
 }

class Horloge{

    def _heure = 0
    def _min = 0

    def Horloge(h, m){
        if( h<0 || h>23 ){
            throw new HeureInvalideException("heure invalide")
        }
        if( m<0 || m>59 ){
            throw new HeureInvalideException("minutes invalides")
        }
        _heure = h
        _min = m
    }

    String toString(){
        return String.format("%02d:%02d", _heure, _min)
    }

    def avancer1Min(){
        _min++
        if( _min>59 ){
            _heure++
            _min = 0

            if( _heure>23 ){
                _heure=0
            }
        }
    }
}

def h1 = new Horloge( 0, 100 )
print h1