// Generated from Engine.g4 by ANTLR 4.0

package IcaroEngine;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

import Funcionalidades.Clima;
import Funcionalidades.Ubicacion;
import m.zapata.icaro.MainActivity;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EngineParser extends Parser {
    Activity mActivity;
    LayoutInflater mInflater;
    View mView;
    boolean networkStatus;
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            PETICION = 1, PREGUNTA = 2, ARTICULO = 3, PREPOSICION = 4, ADJETIVO = 5, CLIMA = 6,
            UBICACION = 7, STRING = 8, WS = 9;
    public static final String[] tokenNames = {
            "<INVALID>", "PETICION", "'donde'", "ARTICULO", "PREPOSICION", "'mi'",
            "CLIMA", "UBICACION", "STRING", "WS"
    };
    public static final int
            RULE_icaro = 0, RULE_funcion = 1, RULE_clima = 2, RULE_ubicacion = 3,
            RULE_lugar = 4;
    public static final String[] ruleNames = {
            "icaro", "funcion", "clima", "ubicacion", "lugar"
    };

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
    public ATN getATN() {
        return _ATN;
    }

    public EngineParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class IcaroContext extends ParserRuleContext {
        public FuncionContext funcion() {
            return getRuleContext(FuncionContext.class, 0);
        }

        public IcaroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_icaro;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).enterIcaro(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).exitIcaro(this);
        }
    }

    public final IcaroContext icaro(MainActivity mainActivity, LayoutInflater inflater, View vistaUI, boolean estadoRed) throws RecognitionException {
        mActivity = mainActivity;
        mInflater = inflater;
        mView = vistaUI;
        networkStatus = estadoRed;
        IcaroContext _localctx = new IcaroContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_icaro);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                funcion();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FuncionContext extends ParserRuleContext {
        public ClimaContext clima() {
            return getRuleContext(ClimaContext.class, 0);
        }

        public UbicacionContext ubicacion() {
            return getRuleContext(UbicacionContext.class, 0);
        }

        public FuncionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcion;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).enterFuncion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).exitFuncion(this);
        }
    }

    public final FuncionContext funcion() throws RecognitionException {
        FuncionContext _localctx = new FuncionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_funcion);
        try {
            setState(14);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(12);
                    clima();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(13);
                    ubicacion();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClimaContext extends ParserRuleContext {
        public LugarContext id;

        public TerminalNode PREPOSICION() {
            return getToken(EngineParser.PREPOSICION, 0);
        }

        public TerminalNode ARTICULO() {
            return getToken(EngineParser.ARTICULO, 0);
        }

        public LugarContext lugar() {
            return getRuleContext(LugarContext.class, 0);
        }

        public TerminalNode CLIMA() {
            return getToken(EngineParser.CLIMA, 0);
        }

        public TerminalNode PETICION() {
            return getToken(EngineParser.PETICION, 0);
        }

        public ClimaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_clima;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).enterClima(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).exitClima(this);
        }
    }

    public final ClimaContext clima() throws RecognitionException {
        ClimaContext _localctx = new ClimaContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_clima);
        int _la;
        try {
            setState(31);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(17);
                    _la = _input.LA(1);
                    if (_la == PETICION) {
                        {
                            setState(16);
                            match(PETICION);
                        }
                    }

                    {
                        setState(19);
                        match(ARTICULO);
                    }
                    setState(20);
                    match(CLIMA);

                    if (networkStatus == true) {
                        Clima clima = new Clima(mActivity, mInflater, mView);
                        clima.mostrarClima();
                        Log.d("Icaro", "IcaroEngine: Peticion clima");

                    } else {

                    }

                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(23);
                    _la = _input.LA(1);
                    if (_la == PETICION) {
                        {
                            setState(22);
                            match(PETICION);
                        }
                    }

                    {
                        setState(25);
                        match(ARTICULO);
                    }
                    setState(26);
                    match(CLIMA);
                    {
                        setState(27);
                        match(PREPOSICION);
                    }
                    {
                        setState(28);
                        ((ClimaContext) _localctx).id = lugar();
                    }

                    if (networkStatus == true) {
                        Clima clima = new Clima(mActivity, mInflater, mView);
                        clima.mostrarClima((((ClimaContext) _localctx).id != null ? _input.getText(((ClimaContext) _localctx).id.start, ((ClimaContext) _localctx).id.stop) : null));
                        Log.d("Icaro", "IcaroEngine: Peticion clima en " + (((ClimaContext) _localctx).id != null ? _input.getText(((ClimaContext) _localctx).id.start, ((ClimaContext) _localctx).id.stop) : null));
                    } else {

                    }

                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UbicacionContext extends ParserRuleContext {
        public TerminalNode ADJETIVO() {
            return getToken(EngineParser.ADJETIVO, 0);
        }

        public TerminalNode UBICACION() {
            return getToken(EngineParser.UBICACION, 0);
        }

        public TerminalNode PETICION() {
            return getToken(EngineParser.PETICION, 0);
        }

        public TerminalNode PREGUNTA() {
            return getToken(EngineParser.PREGUNTA, 0);
        }

        public UbicacionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ubicacion;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener)
                ((EngineListener) listener).enterUbicacion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).exitUbicacion(this);
        }
    }

    public final UbicacionContext ubicacion() throws RecognitionException {
        UbicacionContext _localctx = new UbicacionContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_ubicacion);
        try {
            setState(40);
            switch (_input.LA(1)) {
                case PETICION:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(33);
                        match(PETICION);
                    }
                    {
                        setState(34);
                        match(ADJETIVO);
                    }
                    setState(35);
                    match(UBICACION);

                    if (networkStatus == true) {                                                    //cambiar restriccion red por gps
                        Ubicacion ubicacion = new Ubicacion(mActivity, mInflater, mView);
                        ubicacion.ubicacionActual();
                        Log.d("Icaro", "IcaroEngine: Peticion ubicacion");
                    } else {

                    }

                }
                break;
                case PREGUNTA:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        setState(37);
                        match(PREGUNTA);
                    }
                    setState(38);
                    match(UBICACION);

                    if (networkStatus == true) {                                                    //cambiar restriccion red por gps
                        Ubicacion ubicacion = new Ubicacion(mActivity, mInflater, mView);
                        ubicacion.ubicacionActual();
                        Log.d("Icaro", "IcaroEngine: Peticion ubicacion");
                    } else {

                    }

                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LugarContext extends ParserRuleContext {
        public List<TerminalNode> WS() {
            return getTokens(EngineParser.WS);
        }

        public TerminalNode STRING(int i) {
            return getToken(EngineParser.STRING, i);
        }

        public TerminalNode WS(int i) {
            return getToken(EngineParser.WS, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(EngineParser.STRING);
        }

        public LugarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lugar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).enterLugar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof EngineListener) ((EngineListener) listener).exitLugar(this);
        }
    }

    public final LugarContext lugar() throws RecognitionException {
        LugarContext _localctx = new LugarContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_lugar);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(45);
                        switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                            case 1: {
                                {
                                    setState(42);
                                    match(STRING);
                                    setState(43);
                                    match(WS);
                                }
                            }
                            break;

                            case 2: {
                                {
                                    setState(44);
                                    match(STRING);
                                }
                            }
                            break;
                        }
                    }
                    setState(47);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == STRING);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\2\3\13\64\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\5\3" +
                    "\21\n\3\3\4\5\4\24\n\4\3\4\3\4\3\4\3\4\5\4\32\n\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\5\4\"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\6\6\60" +
                    "\n\6\r\6\16\6\61\3\6\2\7\2\4\6\b\n\2\2\65\2\f\3\2\2\2\4\20\3\2\2\2\6!" +
                    "\3\2\2\2\b*\3\2\2\2\n/\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\21\5\6\4\2\17" +
                    "\21\5\b\5\2\20\16\3\2\2\2\20\17\3\2\2\2\21\5\3\2\2\2\22\24\7\3\2\2\23" +
                    "\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\5\2\2\26\27\7\b\2\2\27" +
                    "\"\b\4\1\2\30\32\7\3\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33" +
                    "\34\7\5\2\2\34\35\7\b\2\2\35\36\7\6\2\2\36\37\5\n\6\2\37 \b\4\1\2 \"\3" +
                    "\2\2\2!\23\3\2\2\2!\31\3\2\2\2\"\7\3\2\2\2#$\7\3\2\2$%\7\7\2\2%&\7\t\2" +
                    "\2&+\b\5\1\2\'(\7\4\2\2()\7\t\2\2)+\b\5\1\2*#\3\2\2\2*\'\3\2\2\2+\t\3" +
                    "\2\2\2,-\7\n\2\2-\60\7\13\2\2.\60\7\n\2\2/,\3\2\2\2/.\3\2\2\2\60\61\3" +
                    "\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\t\20\23\31!*/\61";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}