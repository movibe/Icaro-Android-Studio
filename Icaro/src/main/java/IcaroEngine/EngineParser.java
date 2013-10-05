// Generated from Engine.g4 by ANTLR 4.0

package IcaroEngine;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

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
import m.zapata.icaro.MainActivity;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EngineParser extends Parser {
    Activity mActivity;
    LayoutInflater mInflater;
    View mView;

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            PETICION = 1, ARTICULO = 2, CLIMA = 3, PREPOSICION = 4, STRING = 5, WS = 6;
    public static final String[] tokenNames = {
            "<INVALID>", "PETICION", "ARTICULO", "CLIMA", "PREPOSICION", "STRING",
            "WS"
    };
    public static final int
            RULE_icaro = 0, RULE_funcion = 1, RULE_clima = 2, RULE_lugar = 3;
    public static final String[] ruleNames = {
            "icaro", "funcion", "clima", "lugar"
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

    public final IcaroContext icaro(MainActivity activity, LayoutInflater inflater, View vistaUI, boolean networkStatus) throws RecognitionException {
        mActivity = activity;
        mInflater = inflater;
        mView = vistaUI;

        IcaroContext _localctx = new IcaroContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_icaro);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                clima();
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
            setState(27);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(13);
                    _la = _input.LA(1);
                    if (_la == PETICION) {
                        {
                            setState(12);
                            match(PETICION);
                        }
                    }

                    setState(15);
                    match(ARTICULO);
                    setState(16);
                    match(CLIMA);

                    Clima clima = new Clima(mActivity, mInflater, mView);
                    clima.mostrarClima();
                    Log.d("Icaro", "IcaroEngine: Peticion clima");

                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(19);
                    _la = _input.LA(1);
                    if (_la == PETICION) {
                        {
                            setState(18);
                            match(PETICION);
                        }
                    }

                    setState(21);
                    match(ARTICULO);
                    setState(22);
                    match(CLIMA);
                    setState(23);
                    match(PREPOSICION);
                    {
                        setState(24);
                        ((ClimaContext) _localctx).id = lugar();
                    }

                    Clima clima = new Clima(mActivity, mInflater, mView);
                    clima.mostrarClima((((ClimaContext) _localctx).id != null ? _input.getText(((ClimaContext) _localctx).id.start, ((ClimaContext) _localctx).id.stop) : null));
                    Log.d("Icaro", "IcaroEngine: Peticion clima en " + (((ClimaContext) _localctx).id != null ? _input.getText(((ClimaContext) _localctx).id.start, ((ClimaContext) _localctx).id.stop) : null));

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
        enterRule(_localctx, 6, RULE_lugar);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(32);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                {
                                    setState(29);
                                    match(STRING);
                                    setState(30);
                                    match(WS);
                                }
                            }
                            break;

                            case 2: {
                                {
                                    setState(31);
                                    match(STRING);
                                }
                            }
                            break;
                        }
                    }
                    setState(34);
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
            "\2\3\b\'\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\4\5\4\20\n" +
                    "\4\3\4\3\4\3\4\3\4\5\4\26\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3" +
                    "\5\3\5\6\5#\n\5\r\5\16\5$\3\5\2\6\2\4\6\b\2\2\'\2\n\3\2\2\2\4\f\3\2\2" +
                    "\2\6\35\3\2\2\2\b\"\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\5\6\4\2\r\5" +
                    "\3\2\2\2\16\20\7\3\2\2\17\16\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22" +
                    "\7\4\2\2\22\23\7\5\2\2\23\36\b\4\1\2\24\26\7\3\2\2\25\24\3\2\2\2\25\26" +
                    "\3\2\2\2\26\27\3\2\2\2\27\30\7\4\2\2\30\31\7\5\2\2\31\32\7\6\2\2\32\33" +
                    "\5\b\5\2\33\34\b\4\1\2\34\36\3\2\2\2\35\17\3\2\2\2\35\25\3\2\2\2\36\7" +
                    "\3\2\2\2\37 \7\7\2\2 #\7\b\2\2!#\7\7\2\2\"\37\3\2\2\2\"!\3\2\2\2#$\3\2" +
                    "\2\2$\"\3\2\2\2$%\3\2\2\2%\t\3\2\2\2\7\17\25\35\"$";
    public static final ATN _ATN =
            ATNSimulator.deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    }
}