// Generated from io/cinsight/cel/parser/CEL.g4 by ANTLR 4.5

package io.cinsight.cel.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CELParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUALS=1, NOT_EQUALS=2, IN=3, LESS=4, LESS_EQUALS=5, GREATER_EQUALS=6, 
		GREATER=7, LOGICAL_AND=8, LOGICAL_OR=9, LBRACKET=10, RPRACKET=11, LBRACE=12, 
		RBRACE=13, LPAREN=14, RPAREN=15, DOT=16, COMMA=17, MINUS=18, EXCLAM=19, 
		QUESTIONMARK=20, COLON=21, PLUS=22, STAR=23, SLASH=24, PERCENT=25, CEL_TRUE=26, 
		CEL_FALSE=27, NUL=28, WHITESPACE=29, COMMENT=30, NUM_FLOAT=31, NUM_INT=32, 
		NUM_UINT=33, STRING=34, BYTES=35, IDENTIFIER=36;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_conditionalOr = 2, RULE_conditionalAnd = 3, 
		RULE_relation = 4, RULE_calc = 5, RULE_unary = 6, RULE_member = 7, RULE_primary = 8, 
		RULE_exprList = 9, RULE_fieldInitializerList = 10, RULE_mapInitializerList = 11, 
		RULE_literal = 12;
	public static final String[] ruleNames = {
		"start", "expr", "conditionalOr", "conditionalAnd", "relation", "calc", 
		"unary", "member", "primary", "exprList", "fieldInitializerList", "mapInitializerList", 
		"literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=='", "'!='", "'in'", "'<'", "'<='", "'>='", "'>'", "'&&'", "'||'", 
		"'['", "']'", "'{'", "'}'", "'('", "')'", "'.'", "','", "'-'", "'!'", 
		"'?'", "':'", "'+'", "'*'", "'/'", "'%'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUALS", "NOT_EQUALS", "IN", "LESS", "LESS_EQUALS", "GREATER_EQUALS", 
		"GREATER", "LOGICAL_AND", "LOGICAL_OR", "LBRACKET", "RPRACKET", "LBRACE", 
		"RBRACE", "LPAREN", "RPAREN", "DOT", "COMMA", "MINUS", "EXCLAM", "QUESTIONMARK", 
		"COLON", "PLUS", "STAR", "SLASH", "PERCENT", "CEL_TRUE", "CEL_FALSE", 
		"NUL", "WHITESPACE", "COMMENT", "NUM_FLOAT", "NUM_INT", "NUM_UINT", "STRING", 
		"BYTES", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CEL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CELParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExprContext e;
		public TerminalNode EOF() { return getToken(CELParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((StartContext)_localctx).e = expr();
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ConditionalOrContext e;
		public Token op;
		public ConditionalOrContext e1;
		public ExprContext e2;
		public List<ConditionalOrContext> conditionalOr() {
			return getRuleContexts(ConditionalOrContext.class);
		}
		public ConditionalOrContext conditionalOr(int i) {
			return getRuleContext(ConditionalOrContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((ExprContext)_localctx).e = conditionalOr();
			setState(35);
			_la = _input.LA(1);
			if (_la==QUESTIONMARK) {
				{
				setState(30);
				((ExprContext)_localctx).op = match(QUESTIONMARK);
				setState(31);
				((ExprContext)_localctx).e1 = conditionalOr();
				setState(32);
				match(COLON);
				setState(33);
				((ExprContext)_localctx).e2 = expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrContext extends ParserRuleContext {
		public ConditionalAndContext e;
		public Token s9;
		public List<Token> ops = new ArrayList<Token>();
		public ConditionalAndContext conditionalAnd;
		public List<ConditionalAndContext> e1 = new ArrayList<ConditionalAndContext>();
		public List<ConditionalAndContext> conditionalAnd() {
			return getRuleContexts(ConditionalAndContext.class);
		}
		public ConditionalAndContext conditionalAnd(int i) {
			return getRuleContext(ConditionalAndContext.class,i);
		}
		public ConditionalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterConditionalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitConditionalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitConditionalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrContext conditionalOr() throws RecognitionException {
		ConditionalOrContext _localctx = new ConditionalOrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditionalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((ConditionalOrContext)_localctx).e = conditionalAnd();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(38);
				((ConditionalOrContext)_localctx).s9 = match(LOGICAL_OR);
				((ConditionalOrContext)_localctx).ops.add(((ConditionalOrContext)_localctx).s9);
				setState(39);
				((ConditionalOrContext)_localctx).conditionalAnd = conditionalAnd();
				((ConditionalOrContext)_localctx).e1.add(((ConditionalOrContext)_localctx).conditionalAnd);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndContext extends ParserRuleContext {
		public RelationContext e;
		public Token s8;
		public List<Token> ops = new ArrayList<Token>();
		public RelationContext relation;
		public List<RelationContext> e1 = new ArrayList<RelationContext>();
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public ConditionalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterConditionalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitConditionalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitConditionalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndContext conditionalAnd() throws RecognitionException {
		ConditionalAndContext _localctx = new ConditionalAndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((ConditionalAndContext)_localctx).e = relation(0);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(46);
				((ConditionalAndContext)_localctx).s8 = match(LOGICAL_AND);
				((ConditionalAndContext)_localctx).ops.add(((ConditionalAndContext)_localctx).s8);
				setState(47);
				((ConditionalAndContext)_localctx).relation = relation(0);
				((ConditionalAndContext)_localctx).e1.add(((ConditionalAndContext)_localctx).relation);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public Token op;
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_relation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			calc(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(56);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(57);
					((RelationContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << IN) | (1L << LESS) | (1L << LESS_EQUALS) | (1L << GREATER_EQUALS) | (1L << GREATER))) != 0)) ) {
						((RelationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(58);
					relation(2);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CalcContext extends ParserRuleContext {
		public Token op;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public List<CalcContext> calc() {
			return getRuleContexts(CalcContext.class);
		}
		public CalcContext calc(int i) {
			return getRuleContext(CalcContext.class,i);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		return calc(0);
	}

	private CalcContext calc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalcContext _localctx = new CalcContext(_ctx, _parentState);
		CalcContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_calc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			unary();
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new CalcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						((CalcContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((CalcContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(69);
						calc(3);
						}
						break;
					case 2:
						{
						_localctx = new CalcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_calc);
						setState(70);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(71);
						((CalcContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((CalcContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(72);
						calc(2);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends UnaryContext {
		public Token s19;
		public List<Token> ops = new ArrayList<Token>();
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public LogicalNotContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberExprContext extends UnaryContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public MemberExprContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends UnaryContext {
		public Token s18;
		public List<Token> ops = new ArrayList<Token>();
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public NegateContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary);
		int _la;
		try {
			int _alt;
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new MemberExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				member(0);
				}
				break;
			case 2:
				_localctx = new LogicalNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					((LogicalNotContext)_localctx).s19 = match(EXCLAM);
					((LogicalNotContext)_localctx).ops.add(((LogicalNotContext)_localctx).s19);
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCLAM );
				setState(84);
				member(0);
				}
				break;
			case 3:
				_localctx = new NegateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(85);
						((NegateContext)_localctx).s18 = match(MINUS);
						((NegateContext)_localctx).ops.add(((NegateContext)_localctx).s18);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(88); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(90);
				member(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
	 
		public MemberContext() { }
		public void copyFrom(MemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectOrCallContext extends MemberContext {
		public Token op;
		public Token id;
		public Token open;
		public ExprListContext args;
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CELParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SelectOrCallContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterSelectOrCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitSelectOrCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitSelectOrCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends MemberContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends MemberContext {
		public Token op;
		public ExprContext index;
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMessageContext extends MemberContext {
		public Token op;
		public FieldInitializerListContext entries;
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public FieldInitializerListContext fieldInitializerList() {
			return getRuleContext(FieldInitializerListContext.class,0);
		}
		public CreateMessageContext(MemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterCreateMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitCreateMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitCreateMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		return member(0);
	}

	private MemberContext member(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberContext _localctx = new MemberContext(_ctx, _parentState);
		MemberContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_member, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(94);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new SelectOrCallContext(new MemberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_member);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						((SelectOrCallContext)_localctx).op = match(DOT);
						setState(98);
						((SelectOrCallContext)_localctx).id = match(IDENTIFIER);
						setState(104);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(99);
							((SelectOrCallContext)_localctx).open = match(LPAREN);
							setState(101);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << LBRACE) | (1L << LPAREN) | (1L << DOT) | (1L << MINUS) | (1L << EXCLAM) | (1L << CEL_TRUE) | (1L << CEL_FALSE) | (1L << NUL) | (1L << NUM_FLOAT) | (1L << NUM_INT) | (1L << NUM_UINT) | (1L << STRING) | (1L << BYTES) | (1L << IDENTIFIER))) != 0)) {
								{
								setState(100);
								((SelectOrCallContext)_localctx).args = exprList();
								}
							}

							setState(103);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new IndexContext(new MemberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_member);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						((IndexContext)_localctx).op = match(LBRACKET);
						setState(108);
						((IndexContext)_localctx).index = expr();
						setState(109);
						match(RPRACKET);
						}
						break;
					case 3:
						{
						_localctx = new CreateMessageContext(new MemberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_member);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						((CreateMessageContext)_localctx).op = match(LBRACE);
						setState(114);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(113);
							((CreateMessageContext)_localctx).entries = fieldInitializerList();
							}
						}

						setState(117);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(116);
							match(COMMA);
							}
						}

						setState(119);
						match(RBRACE);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateListContext extends PrimaryContext {
		public Token op;
		public ExprListContext elems;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CreateListContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterCreateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitCreateList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitCreateList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateStructContext extends PrimaryContext {
		public Token op;
		public MapInitializerListContext entries;
		public MapInitializerListContext mapInitializerList() {
			return getRuleContext(MapInitializerListContext.class,0);
		}
		public CreateStructContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterCreateStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitCreateStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitCreateStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantLiteralContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterConstantLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitConstantLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitConstantLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedContext extends PrimaryContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NestedContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentOrGlobalCallContext extends PrimaryContext {
		public Token leadingDot;
		public Token id;
		public Token op;
		public ExprListContext args;
		public TerminalNode IDENTIFIER() { return getToken(CELParser.IDENTIFIER, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentOrGlobalCallContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterIdentOrGlobalCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitIdentOrGlobalCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitIdentOrGlobalCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primary);
		int _la;
		try {
			setState(157);
			switch (_input.LA(1)) {
			case DOT:
			case IDENTIFIER:
				_localctx = new IdentOrGlobalCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(125);
					((IdentOrGlobalCallContext)_localctx).leadingDot = match(DOT);
					}
				}

				setState(128);
				((IdentOrGlobalCallContext)_localctx).id = match(IDENTIFIER);
				setState(134);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(129);
					((IdentOrGlobalCallContext)_localctx).op = match(LPAREN);
					setState(131);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << LBRACE) | (1L << LPAREN) | (1L << DOT) | (1L << MINUS) | (1L << EXCLAM) | (1L << CEL_TRUE) | (1L << CEL_FALSE) | (1L << NUL) | (1L << NUM_FLOAT) | (1L << NUM_INT) | (1L << NUM_UINT) | (1L << STRING) | (1L << BYTES) | (1L << IDENTIFIER))) != 0)) {
						{
						setState(130);
						((IdentOrGlobalCallContext)_localctx).args = exprList();
						}
					}

					setState(133);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case LPAREN:
				_localctx = new NestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(LPAREN);
				setState(137);
				((NestedContext)_localctx).e = expr();
				setState(138);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				_localctx = new CreateListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				((CreateListContext)_localctx).op = match(LBRACKET);
				setState(142);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << LBRACE) | (1L << LPAREN) | (1L << DOT) | (1L << MINUS) | (1L << EXCLAM) | (1L << CEL_TRUE) | (1L << CEL_FALSE) | (1L << NUL) | (1L << NUM_FLOAT) | (1L << NUM_INT) | (1L << NUM_UINT) | (1L << STRING) | (1L << BYTES) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(141);
					((CreateListContext)_localctx).elems = exprList();
					}
				}

				setState(145);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(144);
					match(COMMA);
					}
				}

				setState(147);
				match(RPRACKET);
				}
				break;
			case LBRACE:
				_localctx = new CreateStructContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				((CreateStructContext)_localctx).op = match(LBRACE);
				setState(150);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << LBRACE) | (1L << LPAREN) | (1L << DOT) | (1L << MINUS) | (1L << EXCLAM) | (1L << CEL_TRUE) | (1L << CEL_FALSE) | (1L << NUL) | (1L << NUM_FLOAT) | (1L << NUM_INT) | (1L << NUM_UINT) | (1L << STRING) | (1L << BYTES) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(149);
					((CreateStructContext)_localctx).entries = mapInitializerList();
					}
				}

				setState(153);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(152);
					match(COMMA);
					}
				}

				setState(155);
				match(RBRACE);
				}
				break;
			case MINUS:
			case CEL_TRUE:
			case CEL_FALSE:
			case NUL:
			case NUM_FLOAT:
			case NUM_INT:
			case NUM_UINT:
			case STRING:
			case BYTES:
				_localctx = new ConstantLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> e = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((ExprListContext)_localctx).expr = expr();
			((ExprListContext)_localctx).e.add(((ExprListContext)_localctx).expr);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					((ExprListContext)_localctx).expr = expr();
					((ExprListContext)_localctx).e.add(((ExprListContext)_localctx).expr);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldInitializerListContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> fields = new ArrayList<Token>();
		public Token s21;
		public List<Token> cols = new ArrayList<Token>();
		public ExprContext expr;
		public List<ExprContext> values = new ArrayList<ExprContext>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(CELParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CELParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FieldInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterFieldInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitFieldInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitFieldInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInitializerListContext fieldInitializerList() throws RecognitionException {
		FieldInitializerListContext _localctx = new FieldInitializerListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((FieldInitializerListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((FieldInitializerListContext)_localctx).fields.add(((FieldInitializerListContext)_localctx).IDENTIFIER);
			setState(168);
			((FieldInitializerListContext)_localctx).s21 = match(COLON);
			((FieldInitializerListContext)_localctx).cols.add(((FieldInitializerListContext)_localctx).s21);
			setState(169);
			((FieldInitializerListContext)_localctx).expr = expr();
			((FieldInitializerListContext)_localctx).values.add(((FieldInitializerListContext)_localctx).expr);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					match(COMMA);
					setState(171);
					((FieldInitializerListContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((FieldInitializerListContext)_localctx).fields.add(((FieldInitializerListContext)_localctx).IDENTIFIER);
					setState(172);
					((FieldInitializerListContext)_localctx).s21 = match(COLON);
					((FieldInitializerListContext)_localctx).cols.add(((FieldInitializerListContext)_localctx).s21);
					setState(173);
					((FieldInitializerListContext)_localctx).expr = expr();
					((FieldInitializerListContext)_localctx).values.add(((FieldInitializerListContext)_localctx).expr);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapInitializerListContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> keys = new ArrayList<ExprContext>();
		public Token s21;
		public List<Token> cols = new ArrayList<Token>();
		public List<ExprContext> values = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MapInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterMapInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitMapInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitMapInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapInitializerListContext mapInitializerList() throws RecognitionException {
		MapInitializerListContext _localctx = new MapInitializerListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mapInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((MapInitializerListContext)_localctx).expr = expr();
			((MapInitializerListContext)_localctx).keys.add(((MapInitializerListContext)_localctx).expr);
			setState(180);
			((MapInitializerListContext)_localctx).s21 = match(COLON);
			((MapInitializerListContext)_localctx).cols.add(((MapInitializerListContext)_localctx).s21);
			setState(181);
			((MapInitializerListContext)_localctx).expr = expr();
			((MapInitializerListContext)_localctx).values.add(((MapInitializerListContext)_localctx).expr);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(COMMA);
					setState(183);
					((MapInitializerListContext)_localctx).expr = expr();
					((MapInitializerListContext)_localctx).keys.add(((MapInitializerListContext)_localctx).expr);
					setState(184);
					((MapInitializerListContext)_localctx).s21 = match(COLON);
					((MapInitializerListContext)_localctx).cols.add(((MapInitializerListContext)_localctx).s21);
					setState(185);
					((MapInitializerListContext)_localctx).expr = expr();
					((MapInitializerListContext)_localctx).values.add(((MapInitializerListContext)_localctx).expr);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BytesContext extends LiteralContext {
		public Token tok;
		public TerminalNode BYTES() { return getToken(CELParser.BYTES, 0); }
		public BytesContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitBytes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UintContext extends LiteralContext {
		public Token tok;
		public TerminalNode NUM_UINT() { return getToken(CELParser.NUM_UINT, 0); }
		public UintContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterUint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitUint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitUint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends LiteralContext {
		public Token tok;
		public TerminalNode NUL() { return getToken(CELParser.NUL, 0); }
		public NullContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends LiteralContext {
		public Token tok;
		public TerminalNode CEL_FALSE() { return getToken(CELParser.CEL_FALSE, 0); }
		public BoolFalseContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends LiteralContext {
		public Token tok;
		public TerminalNode STRING() { return getToken(CELParser.STRING, 0); }
		public StringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends LiteralContext {
		public Token sign;
		public Token tok;
		public TerminalNode NUM_FLOAT() { return getToken(CELParser.NUM_FLOAT, 0); }
		public TerminalNode MINUS() { return getToken(CELParser.MINUS, 0); }
		public DoubleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTrueContext extends LiteralContext {
		public Token tok;
		public TerminalNode CEL_TRUE() { return getToken(CELParser.CEL_TRUE, 0); }
		public BoolTrueContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends LiteralContext {
		public Token sign;
		public Token tok;
		public TerminalNode NUM_INT() { return getToken(CELParser.NUM_INT, 0); }
		public TerminalNode MINUS() { return getToken(CELParser.MINUS, 0); }
		public IntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CELListener ) ((CELListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CELVisitor ) return ((CELVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(192);
					((IntContext)_localctx).sign = match(MINUS);
					}
				}

				setState(195);
				((IntContext)_localctx).tok = match(NUM_INT);
				}
				break;
			case 2:
				_localctx = new UintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				((UintContext)_localctx).tok = match(NUM_UINT);
				}
				break;
			case 3:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(197);
					((DoubleContext)_localctx).sign = match(MINUS);
					}
				}

				setState(200);
				((DoubleContext)_localctx).tok = match(NUM_FLOAT);
				}
				break;
			case 4:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				((StringContext)_localctx).tok = match(STRING);
				}
				break;
			case 5:
				_localctx = new BytesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				((BytesContext)_localctx).tok = match(BYTES);
				}
				break;
			case 6:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				((BoolTrueContext)_localctx).tok = match(CEL_TRUE);
				}
				break;
			case 7:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				((BoolFalseContext)_localctx).tok = match(CEL_FALSE);
				}
				break;
			case 8:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				((NullContext)_localctx).tok = match(NUL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 5:
			return calc_sempred((CalcContext)_localctx, predIndex);
		case 7:
			return member_sempred((MemberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean calc_sempred(CalcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean member_sempred(MemberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\7\5\63\n\5\f\5\16"+
		"\5\66\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\6\bS\n\b\r\b"+
		"\16\bT\3\b\3\b\6\bY\n\b\r\b\16\bZ\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\th\n\t\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n"+
		"\t\3\t\5\tx\n\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\5\n\u0081\n\n\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\n\5\n\u0089\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091"+
		"\n\n\3\n\5\n\u0094\n\n\3\n\3\n\3\n\5\n\u0099\n\n\3\n\5\n\u009c\n\n\3\n"+
		"\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\16\5"+
		"\16\u00c4\n\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00d1\n\16\3\16\2\5\n\f\20\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\5\3\2\3\t\3\2\31\33\4\2\24\24\30\30\u00ed\2\34\3\2\2\2\4\37\3\2"+
		"\2\2\6\'\3\2\2\2\b/\3\2\2\2\n\67\3\2\2\2\fB\3\2\2\2\16]\3\2\2\2\20_\3"+
		"\2\2\2\22\u009f\3\2\2\2\24\u00a1\3\2\2\2\26\u00a9\3\2\2\2\30\u00b5\3\2"+
		"\2\2\32\u00d0\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37%\5\6"+
		"\4\2 !\7\26\2\2!\"\5\6\4\2\"#\7\27\2\2#$\5\4\3\2$&\3\2\2\2% \3\2\2\2%"+
		"&\3\2\2\2&\5\3\2\2\2\',\5\b\5\2()\7\13\2\2)+\5\b\5\2*(\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\64\5\n\6\2\60\61\7\n\2\2"+
		"\61\63\5\n\6\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\t\3\2\2\2\66\64\3\2\2\2\678\b\6\1\289\5\f\7\29?\3\2\2\2:;\f\3\2\2"+
		";<\t\2\2\2<>\5\n\6\4=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2"+
		"\2A?\3\2\2\2BC\b\7\1\2CD\5\16\b\2DM\3\2\2\2EF\f\4\2\2FG\t\3\2\2GL\5\f"+
		"\7\5HI\f\3\2\2IJ\t\4\2\2JL\5\f\7\4KE\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2N\r\3\2\2\2OM\3\2\2\2P^\5\20\t\2QS\7\25\2\2RQ\3\2\2\2ST"+
		"\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2V^\5\20\t\2WY\7\24\2\2XW\3\2\2\2"+
		"YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\5\20\t\2]P\3\2\2\2]R\3\2"+
		"\2\2]X\3\2\2\2^\17\3\2\2\2_`\b\t\1\2`a\5\22\n\2a|\3\2\2\2bc\f\5\2\2cd"+
		"\7\22\2\2dj\7&\2\2eg\7\20\2\2fh\5\24\13\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2"+
		"\2ik\7\21\2\2je\3\2\2\2jk\3\2\2\2k{\3\2\2\2lm\f\4\2\2mn\7\f\2\2no\5\4"+
		"\3\2op\7\r\2\2p{\3\2\2\2qr\f\3\2\2rt\7\16\2\2su\5\26\f\2ts\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vx\7\23\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7\17\2\2z"+
		"b\3\2\2\2zl\3\2\2\2zq\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2"+
		"\2~|\3\2\2\2\177\u0081\7\22\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0088\7&\2\2\u0083\u0085\7\20\2\2\u0084\u0086"+
		"\5\24\13\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0089\7\21\2\2\u0088\u0083\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u00a0"+
		"\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\5\4\3\2\u008c\u008d\7\21\2\2"+
		"\u008d\u00a0\3\2\2\2\u008e\u0090\7\f\2\2\u008f\u0091\5\24\13\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\7\23\2\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a0"+
		"\7\r\2\2\u0096\u0098\7\16\2\2\u0097\u0099\5\30\r\2\u0098\u0097\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\7\23\2\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\7\17\2\2"+
		"\u009e\u00a0\5\32\16\2\u009f\u0080\3\2\2\2\u009f\u008a\3\2\2\2\u009f\u008e"+
		"\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2\2\u00a1"+
		"\u00a6\5\4\3\2\u00a2\u00a3\7\23\2\2\u00a3\u00a5\5\4\3\2\u00a4\u00a2\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ab\7\27\2"+
		"\2\u00ab\u00b2\5\4\3\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7&\2\2\u00ae\u00af"+
		"\7\27\2\2\u00af\u00b1\5\4\3\2\u00b0\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\27\2\2\u00b7\u00bf\5\4\3\2"+
		"\u00b8\u00b9\7\23\2\2\u00b9\u00ba\5\4\3\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc"+
		"\5\4\3\2\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00bf\3\2\2"+
		"\2\u00c2\u00c4\7\24\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00d1\7\"\2\2\u00c6\u00d1\7#\2\2\u00c7\u00c9\7\24"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00d1\7!\2\2\u00cb\u00d1\7$\2\2\u00cc\u00d1\7%\2\2\u00cd\u00d1\7\34\2"+
		"\2\u00ce\u00d1\7\35\2\2\u00cf\u00d1\7\36\2\2\u00d0\u00c3\3\2\2\2\u00d0"+
		"\u00c6\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2"+
		"\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\33\3\2\2\2\37%,\64?KMTZ]gjtwz|\u0080\u0085\u0088\u0090\u0093\u0098\u009b"+
		"\u009f\u00a6\u00b2\u00bf\u00c3\u00c8\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}