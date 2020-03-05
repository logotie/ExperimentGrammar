// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
package test;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, THEN=9, 
		LESSTHAN=10, MORETHAN=11, EQUALS=12, VARIDENT=13, FORIDENT=14, IF=15, 
		ENDSTATEMENT=16, STARTBRACKET=17, ENDBRACKET=18, ID=19, INT=20, SINGLESPACE=21, 
		EQUALSIGN=22, NEWLINE2=23, WS=24, SPACE=25;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_block = 2, RULE_assignment = 3, RULE_forloop = 4, 
		RULE_ifstat = 5, RULE_expr = 6, RULE_conditon = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "block", "assignment", "forloop", "ifstat", "expr", "conditon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'to'", "'do'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'then'", 
			"'<'", "'>'", "'=='", "'var'", "'for'", "'if'", "';'", "'{'", "'}'", 
			null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "THEN", "LESSTHAN", 
			"MORETHAN", "EQUALS", "VARIDENT", "FORIDENT", "IF", "ENDSTATEMENT", "STARTBRACKET", 
			"ENDBRACKET", "ID", "INT", "SINGLESPACE", "EQUALSIGN", "NEWLINE2", "WS", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SimpleG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			stat();
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

	public static class StatContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				block();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << VARIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
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

	public static class BlockContext extends ParserRuleContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleGParser.SINGLESPACE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				forloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				ifstat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(27);
						match(SINGLESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(30); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIDENT() { return getToken(SimpleGParser.VARIDENT, 0); }
		public TerminalNode SINGLESPACE() { return getToken(SimpleGParser.SINGLESPACE, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(SimpleGParser.ENDSTATEMENT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(VARIDENT);
				setState(35);
				match(SINGLESPACE);
				setState(36);
				match(ID);
				setState(37);
				match(EQUALSIGN);
				setState(38);
				expr(0);
				setState(39);
				match(ENDSTATEMENT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(ID);
				setState(42);
				match(EQUALSIGN);
				setState(43);
				expr(0);
				setState(44);
				match(ENDSTATEMENT);
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FORIDENT() { return getToken(SimpleGParser.FORIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleGParser.SINGLESPACE, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGParser.INT, i);
		}
		public TerminalNode STARTBRACKET() { return getToken(SimpleGParser.STARTBRACKET, 0); }
		public TerminalNode ENDBRACKET() { return getToken(SimpleGParser.ENDBRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FORIDENT);
			setState(49);
			match(SINGLESPACE);
			setState(50);
			match(INT);
			setState(51);
			match(SINGLESPACE);
			setState(52);
			match(T__0);
			setState(53);
			match(SINGLESPACE);
			setState(54);
			match(INT);
			setState(55);
			match(SINGLESPACE);
			setState(56);
			match(T__1);
			setState(57);
			match(STARTBRACKET);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				block();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << VARIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
			setState(63);
			match(ENDBRACKET);
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

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleGParser.IF, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleGParser.SINGLESPACE, i);
		}
		public ConditonContext conditon() {
			return getRuleContext(ConditonContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SimpleGParser.THEN, 0); }
		public TerminalNode STARTBRACKET() { return getToken(SimpleGParser.STARTBRACKET, 0); }
		public TerminalNode ENDBRACKET() { return getToken(SimpleGParser.ENDBRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitIfstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			match(SINGLESPACE);
			setState(67);
			conditon(0);
			setState(68);
			match(SINGLESPACE);
			setState(69);
			match(THEN);
			setState(70);
			match(STARTBRACKET);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				block();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << VARIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
			setState(76);
			match(ENDBRACKET);
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
		public TerminalNode INT() { return getToken(SimpleGParser.INT, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(SimpleGParser.ENDSTATEMENT, 0); }
		public TerminalNode LESSTHAN() { return getToken(SimpleGParser.LESSTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(SimpleGParser.MORETHAN, 0); }
		public TerminalNode EQUALS() { return getToken(SimpleGParser.EQUALS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(79);
				match(INT);
				}
				break;
			case ID:
				{
				setState(80);
				match(ID);
				}
				break;
			case T__6:
				{
				setState(81);
				match(T__6);
				setState(82);
				expr(0);
				setState(83);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(89);
							expr(0);
							}
						}

						setState(92);
						match(ENDSTATEMENT);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(95);
							expr(0);
							}
						}

						setState(98);
						match(ENDSTATEMENT);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==MORETHAN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(101);
							expr(0);
							}
						}

						setState(104);
						match(ENDSTATEMENT);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						match(EQUALS);
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << INT))) != 0)) {
							{
							setState(107);
							expr(0);
							}
						}

						setState(110);
						match(ENDSTATEMENT);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ConditonContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleGParser.INT, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public List<ConditonContext> conditon() {
			return getRuleContexts(ConditonContext.class);
		}
		public ConditonContext conditon(int i) {
			return getRuleContext(ConditonContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(SimpleGParser.LESSTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(SimpleGParser.MORETHAN, 0); }
		public TerminalNode EQUALS() { return getToken(SimpleGParser.EQUALS, 0); }
		public ConditonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterConditon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitConditon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitConditon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditonContext conditon() throws RecognitionException {
		return conditon(0);
	}

	private ConditonContext conditon(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditonContext _localctx = new ConditonContext(_ctx, _parentState);
		ConditonContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_conditon, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(117);
				match(INT);
				}
				break;
			case ID:
				{
				setState(118);
				match(ID);
				}
				break;
			case T__6:
				{
				setState(119);
				match(T__6);
				setState(120);
				conditon(0);
				setState(121);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ConditonContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						conditon(8);
						}
						break;
					case 2:
						{
						_localctx = new ConditonContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						conditon(7);
						}
						break;
					case 3:
						{
						_localctx = new ConditonContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==MORETHAN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						conditon(6);
						}
						break;
					case 4:
						{
						_localctx = new ConditonContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						match(EQUALS);
						setState(136);
						conditon(5);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return conditon_sempred((ConditonContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean conditon_sempred(ConditonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6"+
		"\3\26\n\3\r\3\16\3\27\3\4\3\4\3\4\3\4\3\4\6\4\37\n\4\r\4\16\4 \5\4#\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\6\7K\n\7\r\7\16\7L\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bX\n\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\b\3"+
		"\b\3\b\3\b\5\bi\n\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\7\br\n\b\f\b\16\bu\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\t\2\4\16\20\n\2"+
		"\4\6\b\n\f\16\20\2\5\3\2\5\6\3\2\7\b\3\2\f\r\2\u00a1\2\22\3\2\2\2\4\25"+
		"\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\fC\3\2\2\2\16W\3\2\2\2"+
		"\20}\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26"+
		"\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31#\5\n\6\2\32#\5"+
		"\f\7\2\33#\5\16\b\2\34#\5\b\5\2\35\37\7\27\2\2\36\35\3\2\2\2\37 \3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"\31\3\2\2\2\"\32\3\2\2\2\"\33\3\2"+
		"\2\2\"\34\3\2\2\2\"\36\3\2\2\2#\7\3\2\2\2$%\7\17\2\2%&\7\27\2\2&\'\7\25"+
		"\2\2\'(\7\30\2\2()\5\16\b\2)*\7\22\2\2*\61\3\2\2\2+,\7\25\2\2,-\7\30\2"+
		"\2-.\5\16\b\2./\7\22\2\2/\61\3\2\2\2\60$\3\2\2\2\60+\3\2\2\2\61\t\3\2"+
		"\2\2\62\63\7\20\2\2\63\64\7\27\2\2\64\65\7\26\2\2\65\66\7\27\2\2\66\67"+
		"\7\3\2\2\678\7\27\2\289\7\26\2\29:\7\27\2\2:;\7\4\2\2;=\7\23\2\2<>\5\6"+
		"\4\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\24\2\2B\13"+
		"\3\2\2\2CD\7\21\2\2DE\7\27\2\2EF\5\20\t\2FG\7\27\2\2GH\7\13\2\2HJ\7\23"+
		"\2\2IK\5\6\4\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\24"+
		"\2\2O\r\3\2\2\2PQ\b\b\1\2QX\7\26\2\2RX\7\25\2\2ST\7\t\2\2TU\5\16\b\2U"+
		"V\7\n\2\2VX\3\2\2\2WP\3\2\2\2WR\3\2\2\2WS\3\2\2\2Xs\3\2\2\2YZ\f\t\2\2"+
		"Z\\\t\2\2\2[]\5\16\b\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^r\7\22\2\2_`\f"+
		"\b\2\2`b\t\3\2\2ac\5\16\b\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dr\7\22\2\2e"+
		"f\f\7\2\2fh\t\4\2\2gi\5\16\b\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jr\7\22\2"+
		"\2kl\f\6\2\2ln\7\16\2\2mo\5\16\b\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\22"+
		"\2\2qY\3\2\2\2q_\3\2\2\2qe\3\2\2\2qk\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2t\17\3\2\2\2us\3\2\2\2vw\b\t\1\2w~\7\26\2\2x~\7\25\2\2yz\7\t\2\2z"+
		"{\5\20\t\2{|\7\n\2\2|~\3\2\2\2}v\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\u008d\3"+
		"\2\2\2\177\u0080\f\t\2\2\u0080\u0081\t\2\2\2\u0081\u008c\5\20\t\n\u0082"+
		"\u0083\f\b\2\2\u0083\u0084\t\3\2\2\u0084\u008c\5\20\t\t\u0085\u0086\f"+
		"\7\2\2\u0086\u0087\t\4\2\2\u0087\u008c\5\20\t\b\u0088\u0089\f\6\2\2\u0089"+
		"\u008a\7\16\2\2\u008a\u008c\5\20\t\7\u008b\177\3\2\2\2\u008b\u0082\3\2"+
		"\2\2\u008b\u0085\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\22\27 \"\60?LW\\bhnqs}\u008b\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}