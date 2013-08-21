grammar IcaroEngine;

@parser::header {
    package IcaroEngine;
}

@lexer::header {
    package IcaroEngine;
}


icaro   :   frase
        ;

frase   :   funcion
        ;

funcion :   pre mid post
        ;