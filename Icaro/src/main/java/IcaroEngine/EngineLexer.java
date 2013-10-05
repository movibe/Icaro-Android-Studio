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
            PETICION = 1, ARTICULO = 2, CLIMA = 3, PREPOSICION = 4, STRING = 5, WS = 6;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] tokenNames = {
            "<INVALID>",
            "PETICION", "ARTICULO", "CLIMA", "PREPOSICION", "STRING", "WS"
    };
    public static final String[] ruleNames = {
            "PETICION", "ARTICULO", "CLIMA", "PREPOSICION", "STRING", "WS"
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
            case 5:
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
            "\2\4\br\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3" +
                    "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2" +
                    "\3\2\3\2\3\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5\3\6\6" +
                    "\6h\n\6\r\6\16\6i\3\7\6\7m\n\7\r\7\16\7n\3\7\3\7\2\b\3\3\1\5\4\1\7\5\1" +
                    "\t\6\1\13\7\1\r\b\2\3\2\4\4C\\c|\5\13\f\16\17\"\"\u0080\2\3\3\2\2\2\2" +
                    "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3(\3\2\2\2" +
                    "\5A\3\2\2\2\7Y\3\2\2\2\td\3\2\2\2\13g\3\2\2\2\rl\3\2\2\2\17\20\7f\2\2" +
                    "\20\21\7k\2\2\21\22\7o\2\2\22)\7g\2\2\23\24\7e\2\2\24\25\7w\2\2\25\26" +
                    "\7c\2\2\26\27\7n\2\2\27\30\7\"\2\2\30\31\7g\2\2\31)\7u\2\2\32\33\7p\2" +
                    "\2\33\34\7g\2\2\34\35\7e\2\2\35\36\7g\2\2\36\37\7u\2\2\37 \7k\2\2 !\7" +
                    "v\2\2!\"\7q\2\2\"#\7\"\2\2#$\7u\2\2$%\7c\2\2%&\7d\2\2&\'\7g\2\2\')\7t" +
                    "\2\2(\17\3\2\2\2(\23\3\2\2\2(\32\3\2\2\2)\4\3\2\2\2*+\7g\2\2+B\7n\2\2" +
                    ",-\7n\2\2-B\7c\2\2./\7n\2\2/\60\7q\2\2\60B\7u\2\2\61\62\7n\2\2\62\63\7" +
                    "c\2\2\63B\7u\2\2\64\65\7w\2\2\65B\7p\2\2\66\67\7w\2\2\678\7p\2\28B\7c" +
                    "\2\29:\7w\2\2:;\7p\2\2;<\7q\2\2<B\7u\2\2=>\7w\2\2>?\7p\2\2?@\7c\2\2@B" +
                    "\7u\2\2A*\3\2\2\2A,\3\2\2\2A.\3\2\2\2A\61\3\2\2\2A\64\3\2\2\2A\66\3\2" +
                    "\2\2A9\3\2\2\2A=\3\2\2\2B\6\3\2\2\2CD\7e\2\2DE\7n\2\2EF\7k\2\2FG\7o\2" +
                    "\2GZ\7c\2\2HI\7v\2\2IJ\7g\2\2JK\7o\2\2KL\7r\2\2LM\7g\2\2MN\7t\2\2NO\7" +
                    "c\2\2OP\7v\2\2PQ\7w\2\2QR\7t\2\2RZ\7c\2\2ST\7v\2\2TU\7k\2\2UV\7g\2\2V" +
                    "W\7o\2\2WX\7r\2\2XZ\7q\2\2YC\3\2\2\2YH\3\2\2\2YS\3\2\2\2Z\b\3\2\2\2[\\" +
                    "\7f\2\2\\e\7g\2\2]^\7g\2\2^e\7p\2\2_`\7u\2\2`a\7q\2\2ab\7d\2\2bc\7t\2" +
                    "\2ce\7g\2\2d[\3\2\2\2d]\3\2\2\2d_\3\2\2\2e\n\3\2\2\2fh\t\2\2\2gf\3\2\2" +
                    "\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\f\3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2" +
                    "\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\7\2\2q\16\3\2\2\2\t\2(AYdin";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}