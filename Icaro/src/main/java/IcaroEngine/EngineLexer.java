// Generated from Engine.g4 by ANTLR 4.0

package IcaroEngine;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EngineLexer extends Lexer {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            PETICION = 1, PREGUNTA = 2, ARTICULO = 3, PREPOSICION = 4, ADJETIVO = 5, CLIMA = 6,
            UBICACION = 7, STRING = 8, WS = 9;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "<INVALID>",
            "PETICION", "'donde'", "ARTICULO", "PREPOSICION", "'mi'", "CLIMA", "UBICACION",
            "STRING", "WS"
    };
    public static final String[] ruleNames = {
            "PETICION", "PREGUNTA", "ARTICULO", "PREPOSICION", "ADJETIVO", "CLIMA",
            "UBICACION", "STRING", "WS"
    };


    public EngineLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Engine.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 8:
                WS_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void WS_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:
                _channel = HIDDEN;
                break;
        }
    }

    public static final String _serializedATN =
            "\2\4\13y\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4" +
                    "\t\t\t\4\n\t\n\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2" +
                    "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\b\5\bl\n\b\3\t\6\to\n\t\r\t\16\tp\3\n\6\nt\n\n\r\n\16\nu" +
                    "\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13" +
                    "\2\3\2\4\4C\\c|\5\13\f\16\17\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" +
                    "\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" +
                    "\23\3\2\2\2\3.\3\2\2\2\5\60\3\2\2\2\7:\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2" +
                    "\r[\3\2\2\2\17k\3\2\2\2\21n\3\2\2\2\23s\3\2\2\2\25\26\7f\2\2\26\27\7k" +
                    "\2\2\27\30\7o\2\2\30/\7g\2\2\31\32\7e\2\2\32\33\7w\2\2\33\34\7c\2\2\34" +
                    "\35\7n\2\2\35\36\7\"\2\2\36\37\7g\2\2\37/\7u\2\2 !\7p\2\2!\"\7g\2\2\"" +
                    "#\7e\2\2#$\7g\2\2$%\7u\2\2%&\7k\2\2&\'\7v\2\2\'(\7q\2\2()\7\"\2\2)*\7" +
                    "u\2\2*+\7c\2\2+,\7d\2\2,-\7g\2\2-/\7t\2\2.\25\3\2\2\2.\31\3\2\2\2. \3" +
                    "\2\2\2/\4\3\2\2\2\60\61\7f\2\2\61\62\7q\2\2\62\63\7p\2\2\63\64\7f\2\2" +
                    "\64\65\7g\2\2\65\6\3\2\2\2\66\67\7g\2\2\67;\7n\2\289\7n\2\29;\7c\2\2:" +
                    "\66\3\2\2\2:8\3\2\2\2;\b\3\2\2\2<=\7f\2\2=A\7g\2\2>?\7g\2\2?A\7p\2\2@" +
                    "<\3\2\2\2@>\3\2\2\2A\n\3\2\2\2BC\7o\2\2CD\7k\2\2D\f\3\2\2\2EF\7e\2\2F" +
                    "G\7n\2\2GH\7k\2\2HI\7o\2\2I\\\7c\2\2JK\7v\2\2KL\7g\2\2LM\7o\2\2MN\7r\2" +
                    "\2NO\7g\2\2OP\7t\2\2PQ\7c\2\2QR\7v\2\2RS\7w\2\2ST\7t\2\2T\\\7c\2\2UV\7" +
                    "v\2\2VW\7k\2\2WX\7g\2\2XY\7o\2\2YZ\7r\2\2Z\\\7q\2\2[E\3\2\2\2[J\3\2\2" +
                    "\2[U\3\2\2\2\\\16\3\2\2\2]^\7w\2\2^_\7d\2\2_`\7k\2\2`a\7e\2\2ab\7c\2\2" +
                    "bc\7e\2\2cd\7k\2\2de\7q\2\2el\7p\2\2fg\7g\2\2gh\7u\2\2hi\7v\2\2ij\7q\2" +
                    "\2jl\7{\2\2k]\3\2\2\2kf\3\2\2\2l\20\3\2\2\2mo\t\2\2\2nm\3\2\2\2op\3\2" +
                    "\2\2pn\3\2\2\2pq\3\2\2\2q\22\3\2\2\2rt\t\3\2\2sr\3\2\2\2tu\3\2\2\2us\3" +
                    "\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\n\2\2x\24\3\2\2\2\n\2.:@[kpu";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}