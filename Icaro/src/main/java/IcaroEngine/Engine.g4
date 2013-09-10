grammar Engine;

@parser::header {
    package IcaroEngine;
}

@lexer::header {
    package IcaroEngine;
}


icaro       :   funcion
            ;

funcion     :   clima
            ;

clima       :   (PETICION)? (ARTICULO) CLIMA
                    {
                        if (networkStatus == true) {
                            Clima clima = new Clima(mActivity, mInflater, mView);
                           	clima.mostrarClima();
                            Log.d("Icaro", "IcaroEngine: Peticion clima");

                        } else {
                            layout.setVisibility(View.INVISIBLE);
                            Toast.makeText(activity, R.string.sin_red, Toast.LENGTH_LONG).show();
                        }
                    }

            |   (PETICION)? (ARTICULO) CLIMA (PREPOSICION) (id=lugar)
                    {
                        if (networkStatus == true) {
                            Clima clima = new Clima(mActivity, mInflater, mView);
                    	    clima.mostrarClima($id.text);
                    	    Log.d("Icaro", "IcaroEngine: Peticion clima en "+$id.text);
                    	} else {
                    	    layout.setVisibility(View.INVISIBLE);
                            Toast.makeText(activity, R.string.sin_red, Toast.LENGTH_LONG).show();
                        }

                    }
            ;

//==================================================================================================

lugar		:	((STRING WS) | (STRING))+
			;

//==================================================================================================

PETICION    :   'dime' | 'cual es' | 'necesito saber'
			;

ARTICULO	:   'el' | 'la' | 'los' | 'las' | 'un' | 'una' | 'unos' | 'unas'
            ;

CLIMA      	:   'clima' | 'temperatura' | 'tiempo'
            ;

PREPOSICION	:	'de' | 'en' | 'sobre'
			;


STRING		:	('a'..'z'|'A'..'Z')+
			;

WS 			:  	( '\t' | ' '| '\r'| '\n'| '\u000C')+ -> channel(HIDDEN)
			;
