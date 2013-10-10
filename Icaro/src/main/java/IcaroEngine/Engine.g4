grammar Engine;

@parser::header {
    package IcaroEngine;
}

@lexer::header {
    package IcaroEngine;
}


icaro       :   funcion
            ;

funcion     :   clima | ubicacion
            ;

clima       :   (PETICION)? (ARTICULO) CLIMA
                    {
                        if (networkStatus == true) {
                            Clima clima = new Clima(mActivity, mInflater, mView);
                           	clima.mostrarClima();
                            Log.d("Icaro", "IcaroEngine: Peticion clima");

                        } else {

                        }
                    }

            |   (PETICION)? (ARTICULO) CLIMA (PREPOSICION) (id=lugar)
                    {
                        if (networkStatus == true) {
                            Clima clima = new Clima(mActivity, mInflater, mView);
                    	    clima.mostrarClima($id.text);
                    	    Log.d("Icaro", "IcaroEngine: Peticion clima en "+$id.text);
                    	} else {

                        }
                    }
            ;

ubicacion   :   (PETICION) (ADJETIVO) UBICACION
                    {
                        if (networkStatus == true) {                                                    //cambiar restriccion red por gps
                            Ubicacion ubicacion = new Ubicacion(mActivity, mInflater, mView);
                            ubicacion.ubicacionActual();
                            Log.d("Icaro", "IcaroEngine: Peticion ubicacion");
                        } else {

                        }
                    }

            |   (PREGUNTA) UBICACION
                    {
                        if (networkStatus == true) {                                                    //cambiar restriccion red por gps
                            Ubicacion ubicacion = new Ubicacion(mActivity, mInflater, mView);
                            ubicacion.ubicacionActual();
                            Log.d("Icaro", "IcaroEngine: Peticion ubicacion");
                        } else {

                        }
                    }
            ;

//==================================================================================================

lugar		:	((STRING WS) | (STRING))+
			;

//==================================================================================================

PETICION    :   'dime' | 'cual es' | 'necesito saber'
			;

PREGUNTA    :   'donde'
            ;

ARTICULO	:   'el' | 'la'
            ;

PREPOSICION	:	'de' | 'en'
			;

ADJETIVO    :   'mi'
            ;

CLIMA      	:   'clima' | 'temperatura' | 'tiempo'
            ;

UBICACION   :   'ubicacion' | 'estoy'                                                               //estoy puede cambiarse por otro token
            ;

STRING		:	('a'..'z'|'A'..'Z')+
			;

WS 			:  	( '\t' | ' '| '\r'| '\n'| '\u000C')+ -> channel(HIDDEN)
			;
