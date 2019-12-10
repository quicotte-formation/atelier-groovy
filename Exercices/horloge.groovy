class Horloge{

    def _heure = 0
    def _min = 0

    def Horloge(h, m){
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

def h1 = new Horloge( 10, 0 )
print h1