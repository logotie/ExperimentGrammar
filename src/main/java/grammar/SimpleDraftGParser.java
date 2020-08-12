// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleDraftG.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleDraftGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, VARIDENT=3, PRINTLN=4, PRINT=5, COMMENTSIGN=6, NONMUTABLE=7, 
		ADD=8, MINUS=9, DIV=10, MUL=11, THEN=12, LESSTHAN=13, MORETHAN=14, EQUALS=15, 
		DOUBLEDOTKEYWORDFORLOOP=16, DOKEYWORDFORLOOP=17, ARRIDENT=18, ARRNUMIDENT=19, 
		ARRSTRIDENT=20, STRINGIDENT=21, NUMIDENT=22, STRINGCHARACTER=23, FORIDENT=24, 
		IF=25, ENDSTATEMENT=26, STARTBRACKET=27, ENDBRACKET=28, ID=29, INT=30, 
		SINGLESPACE=31, EQUALSIGN=32, NEWLINE2=33, WS=34, SPACE=35, ARRSTART=36, 
		ARREND=37, COMMA=38;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_block = 2, RULE_sysfunc = 3, RULE_assignment = 4, 
		RULE_forloop = 5, RULE_ifstat = 6, RULE_expr = 7, RULE_conditon = 8, RULE_arrvalue = 9, 
		RULE_comment = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "block", "sysfunc", "assignment", "forloop", "ifstat", 
			"expr", "conditon", "arrvalue", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'var'", "'println'", "'print'", "'#'", "':'", "'+'", 
			"'-'", "'/'", "'*'", "'then'", "'<'", "'>'", "'=='", "'..'", "'do'", 
			"'arr'", "'arrnum'", "'arrstr'", "'str'", "'num'", "'\"'", "'for'", "'if'", 
			"';'", "'{'", "'}'", null, null, null, "'='", null, null, null, "'['", 
			"']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "VARIDENT", "PRINTLN", "PRINT", "COMMENTSIGN", "NONMUTABLE", 
			"ADD", "MINUS", "DIV", "MUL", "THEN", "LESSTHAN", "MORETHAN", "EQUALS", 
			"DOUBLEDOTKEYWORDFORLOOP", "DOKEYWORDFORLOOP", "ARRIDENT", "ARRNUMIDENT", 
			"ARRSTRIDENT", "STRINGIDENT", "NUMIDENT", "STRINGCHARACTER", "FORIDENT", 
			"IF", "ENDSTATEMENT", "STARTBRACKET", "ENDBRACKET", "ID", "INT", "SINGLESPACE", 
			"EQUALSIGN", "NEWLINE2", "WS", "SPACE", "ARRSTART", "ARREND", "COMMA"
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
	public String getGrammarFileName() { return "SimpleDraftG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleDraftGParser(TokenStream input) {
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
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
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
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIDENT:
			case PRINTLN:
			case PRINT:
			case ARRIDENT:
			case STRINGIDENT:
			case NUMIDENT:
			case FORIDENT:
			case IF:
			case SINGLESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					block();
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIDENT) | (1L << PRINTLN) | (1L << PRINT) | (1L << ARRIDENT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << SINGLESPACE))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BlockContext extends ParserRuleContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public SysfuncContext sysfunc() {
			return getRuleContext(SysfuncContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORIDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				forloop();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				ifstat();
				}
				break;
			case VARIDENT:
			case ARRIDENT:
			case STRINGIDENT:
			case NUMIDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				assignment();
				}
				break;
			case SINGLESPACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(36); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(35);
						match(SINGLESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(38); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PRINTLN:
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				sysfunc();
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

	public static class SysfuncContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SimpleDraftGParser.PRINT, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleDraftGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleDraftGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDSTATEMENT() { return getToken(SimpleDraftGParser.ENDSTATEMENT, 0); }
		public TerminalNode PRINTLN() { return getToken(SimpleDraftGParser.PRINTLN, 0); }
		public SysfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterSysfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitSysfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitSysfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysfuncContext sysfunc() throws RecognitionException {
		SysfuncContext _localctx = new SysfuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sysfunc);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(PRINT);
				setState(44);
				match(T__0);
				setState(45);
				match(STRINGCHARACTER);
				setState(46);
				expr(0);
				setState(47);
				match(STRINGCHARACTER);
				setState(48);
				match(T__1);
				setState(49);
				match(ENDSTATEMENT);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(PRINTLN);
				setState(52);
				match(T__0);
				setState(53);
				match(STRINGCHARACTER);
				setState(54);
				expr(0);
				setState(55);
				match(STRINGCHARACTER);
				setState(56);
				match(T__1);
				setState(57);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignObjArrayContext extends AssignmentContext {
		public TerminalNode ARRIDENT() { return getToken(SimpleDraftGParser.ARRIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleDraftGParser.EQUALSIGN, 0); }
		public TerminalNode ARRSTART() { return getToken(SimpleDraftGParser.ARRSTART, 0); }
		public TerminalNode ARREND() { return getToken(SimpleDraftGParser.ARREND, 0); }
		public List<ArrvalueContext> arrvalue() {
			return getRuleContexts(ArrvalueContext.class);
		}
		public ArrvalueContext arrvalue(int i) {
			return getRuleContext(ArrvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleDraftGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleDraftGParser.COMMA, i);
		}
		public AssignObjArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAssignObjArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAssignObjArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAssignObjArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarDigitsContext extends AssignmentContext {
		public TerminalNode VARIDENT() { return getToken(SimpleDraftGParser.VARIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleDraftGParser.EQUALSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarDigitsContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAssignVarDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAssignVarDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAssignVarDigits(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStringContext extends AssignmentContext {
		public TerminalNode STRINGIDENT() { return getToken(SimpleDraftGParser.STRINGIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleDraftGParser.EQUALSIGN, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleDraftGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleDraftGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStringContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAssignString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAssignString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAssignString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignDigitsContext extends AssignmentContext {
		public TerminalNode NUMIDENT() { return getToken(SimpleDraftGParser.NUMIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleDraftGParser.EQUALSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignDigitsContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAssignDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAssignDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAssignDigits(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarStringContext extends AssignmentContext {
		public TerminalNode VARIDENT() { return getToken(SimpleDraftGParser.VARIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleDraftGParser.EQUALSIGN, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleDraftGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleDraftGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignVarStringContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAssignVarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAssignVarString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAssignVarString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(STRINGIDENT);
				setState(62);
				match(SINGLESPACE);
				setState(63);
				match(ID);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(64);
					match(SINGLESPACE);
					}
				}

				setState(67);
				match(EQUALSIGN);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(68);
					match(SINGLESPACE);
					}
				}

				setState(71);
				match(STRINGCHARACTER);
				setState(72);
				expr(0);
				setState(73);
				match(STRINGCHARACTER);
				}
				break;
			case 2:
				_localctx = new AssignDigitsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(NUMIDENT);
				setState(76);
				match(SINGLESPACE);
				setState(77);
				match(ID);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(78);
					match(SINGLESPACE);
					}
				}

				setState(81);
				match(EQUALSIGN);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(82);
					match(SINGLESPACE);
					}
				}

				setState(85);
				expr(0);
				}
				break;
			case 3:
				_localctx = new AssignObjArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(ARRIDENT);
				setState(87);
				match(SINGLESPACE);
				setState(88);
				match(ID);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(89);
					match(SINGLESPACE);
					}
				}

				setState(92);
				match(EQUALSIGN);
				setState(93);
				match(ARRSTART);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(94);
						arrvalue();
						setState(95);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(97);
						arrvalue();
						}
						break;
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGCHARACTER || _la==INT );
				setState(102);
				match(ARREND);
				}
				break;
			case 4:
				_localctx = new AssignVarStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(VARIDENT);
				setState(105);
				match(SINGLESPACE);
				setState(106);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(107);
					match(SINGLESPACE);
					}
				}

				setState(110);
				match(EQUALSIGN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(111);
					match(SINGLESPACE);
					}
				}

				setState(114);
				match(STRINGCHARACTER);
				setState(115);
				expr(0);
				setState(116);
				match(STRINGCHARACTER);
				}
				break;
			case 5:
				_localctx = new AssignVarDigitsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(VARIDENT);
				setState(119);
				match(SINGLESPACE);
				setState(120);
				match(ID);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(121);
					match(SINGLESPACE);
					}
				}

				setState(124);
				match(EQUALSIGN);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SINGLESPACE) {
					{
					setState(125);
					match(SINGLESPACE);
					}
				}

				setState(128);
				expr(0);
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FORIDENT() { return getToken(SimpleDraftGParser.FORIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleDraftGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleDraftGParser.INT, i);
		}
		public TerminalNode DOUBLEDOTKEYWORDFORLOOP() { return getToken(SimpleDraftGParser.DOUBLEDOTKEYWORDFORLOOP, 0); }
		public TerminalNode DOKEYWORDFORLOOP() { return getToken(SimpleDraftGParser.DOKEYWORDFORLOOP, 0); }
		public TerminalNode STARTBRACKET() { return getToken(SimpleDraftGParser.STARTBRACKET, 0); }
		public TerminalNode ENDBRACKET() { return getToken(SimpleDraftGParser.ENDBRACKET, 0); }
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
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(FORIDENT);
			setState(132);
			match(SINGLESPACE);
			setState(133);
			match(INT);
			setState(134);
			match(DOUBLEDOTKEYWORDFORLOOP);
			setState(135);
			match(INT);
			setState(136);
			match(SINGLESPACE);
			setState(137);
			match(DOKEYWORDFORLOOP);
			setState(138);
			match(STARTBRACKET);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				block();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIDENT) | (1L << PRINTLN) | (1L << PRINT) | (1L << ARRIDENT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << SINGLESPACE))) != 0) );
			setState(144);
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
		public TerminalNode IF() { return getToken(SimpleDraftGParser.IF, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleDraftGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleDraftGParser.SINGLESPACE, i);
		}
		public ConditonContext conditon() {
			return getRuleContext(ConditonContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SimpleDraftGParser.THEN, 0); }
		public TerminalNode STARTBRACKET() { return getToken(SimpleDraftGParser.STARTBRACKET, 0); }
		public TerminalNode ENDBRACKET() { return getToken(SimpleDraftGParser.ENDBRACKET, 0); }
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
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitIfstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(SINGLESPACE);
			setState(148);
			conditon(0);
			setState(149);
			match(SINGLESPACE);
			setState(150);
			match(THEN);
			setState(151);
			match(STARTBRACKET);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				block();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIDENT) | (1L << PRINTLN) | (1L << PRINT) | (1L << ARRIDENT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << SINGLESPACE))) != 0) );
			setState(157);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(SimpleDraftGParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SimpleDraftGParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SimpleDraftGParser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessthancompareContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(SimpleDraftGParser.LESSTHAN, 0); }
		public LessthancompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterLessthancompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitLessthancompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitLessthancompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SimpleDraftGParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdendContext extends ExprContext {
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public IdendContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterIdend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitIdend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitIdend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MorethancompareContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MORETHAN() { return getToken(SimpleDraftGParser.MORETHAN, 0); }
		public MorethancompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterMorethancompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitMorethancompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitMorethancompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntendContext extends ExprContext {
		public TerminalNode INT() { return getToken(SimpleDraftGParser.INT, 0); }
		public IntendContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterIntend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitIntend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitIntend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SimpleDraftGParser.EQUALS, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitEquality(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(165);
						match(MUL);
						}
						setState(166);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(168);
						match(DIV);
						}
						setState(169);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(171);
						match(ADD);
						}
						setState(172);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(174);
						match(MINUS);
						}
						setState(175);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new LessthancompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(177);
						match(LESSTHAN);
						}
						setState(178);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new MorethancompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(180);
						match(MORETHAN);
						}
						setState(181);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(EQUALS);
						setState(184);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public ConditonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditon; }
	 
		public ConditonContext() { }
		public void copyFrom(ConditonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondequalityContext extends ConditonContext {
		public List<ConditonContext> conditon() {
			return getRuleContexts(ConditonContext.class);
		}
		public ConditonContext conditon(int i) {
			return getRuleContext(ConditonContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SimpleDraftGParser.EQUALS, 0); }
		public CondequalityContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondequality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondequality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondintContext extends ConditonContext {
		public TerminalNode INT() { return getToken(SimpleDraftGParser.INT, 0); }
		public CondintContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondidContext extends ConditonContext {
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public CondidContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondmultdivContext extends ConditonContext {
		public List<ConditonContext> conditon() {
			return getRuleContexts(ConditonContext.class);
		}
		public ConditonContext conditon(int i) {
			return getRuleContext(ConditonContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SimpleDraftGParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleDraftGParser.DIV, 0); }
		public CondmultdivContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondmultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondmultdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondmultdiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondlessgreaterContext extends ConditonContext {
		public List<ConditonContext> conditon() {
			return getRuleContexts(ConditonContext.class);
		}
		public ConditonContext conditon(int i) {
			return getRuleContext(ConditonContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(SimpleDraftGParser.LESSTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(SimpleDraftGParser.MORETHAN, 0); }
		public CondlessgreaterContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondlessgreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondlessgreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondlessgreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondplusminusContext extends ConditonContext {
		public List<ConditonContext> conditon() {
			return getRuleContexts(ConditonContext.class);
		}
		public ConditonContext conditon(int i) {
			return getRuleContext(ConditonContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SimpleDraftGParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SimpleDraftGParser.MINUS, 0); }
		public CondplusminusContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterCondplusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitCondplusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitCondplusminus(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_conditon, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new CondintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new CondidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new CondmultdivContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						conditon(7);
						}
						break;
					case 2:
						{
						_localctx = new CondplusminusContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(198);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						conditon(6);
						}
						break;
					case 3:
						{
						_localctx = new CondlessgreaterContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(201);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(202);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==MORETHAN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						conditon(5);
						}
						break;
					case 4:
						{
						_localctx = new CondequalityContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						match(EQUALS);
						setState(206);
						conditon(4);
						}
						break;
					}
					} 
				}
				setState(211);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrvalueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SimpleDraftGParser.INT, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleDraftGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleDraftGParser.STRINGCHARACTER, i);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleDraftGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleDraftGParser.ID, i);
		}
		public ArrvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterArrvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitArrvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitArrvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrvalueContext arrvalue() throws RecognitionException {
		ArrvalueContext _localctx = new ArrvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrvalue);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(INT);
				}
				break;
			case STRINGCHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					match(STRINGCHARACTER);
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGCHARACTER );
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					match(ID);
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(223);
				match(STRINGCHARACTER);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENTSIGN() { return getToken(SimpleDraftGParser.COMMENTSIGN, 0); }
		public TerminalNode ID() { return getToken(SimpleDraftGParser.ID, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleDraftGListener ) ((SimpleDraftGListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleDraftGVisitor ) return ((SimpleDraftGVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(COMMENTSIGN);
			setState(227);
			match(ID);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return conditon_sempred((ConditonContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean conditon_sempred(ConditonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\3\5\3!\n\3\3\4\3\4\3"+
		"\4\3\4\6\4\'\n\4\r\4\16\4(\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\5\6D\n\6\3"+
		"\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3\6\5\6V"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6e\n\6\r\6"+
		"\16\6f\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\5\6s\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\6\3\6\5\6\u0081\n\6\3\6\5\6\u0084\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u008f\n\7\r\7\16\7\u0090\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009c\n\b\r\b\16\b\u009d\3\b\3\b\3"+
		"\t\3\t\3\t\5\t\u00a5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bc\n\t\f\t\16\t\u00bf\13"+
		"\t\3\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\6\13\u00d9\n\13\r\13"+
		"\16\13\u00da\3\13\6\13\u00de\n\13\r\13\16\13\u00df\3\13\5\13\u00e3\n\13"+
		"\3\f\3\f\3\f\3\f\2\4\20\22\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\f\r\3"+
		"\2\n\13\3\2\17\20\2\u0105\2\30\3\2\2\2\4 \3\2\2\2\6+\3\2\2\2\b=\3\2\2"+
		"\2\n\u0083\3\2\2\2\f\u0085\3\2\2\2\16\u0094\3\2\2\2\20\u00a4\3\2\2\2\22"+
		"\u00c3\3\2\2\2\24\u00e2\3\2\2\2\26\u00e4\3\2\2\2\30\31\5\4\3\2\31\3\3"+
		"\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36!\3\2\2\2\37!\3\2\2\2 \33\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\",\5"+
		"\f\7\2#,\5\16\b\2$,\5\n\6\2%\'\7!\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2),\3\2\2\2*,\5\b\5\2+\"\3\2\2\2+#\3\2\2\2+$\3\2\2\2+&\3\2\2\2"+
		"+*\3\2\2\2,\7\3\2\2\2-.\7\7\2\2./\7\3\2\2/\60\7\31\2\2\60\61\5\20\t\2"+
		"\61\62\7\31\2\2\62\63\7\4\2\2\63\64\7\34\2\2\64>\3\2\2\2\65\66\7\6\2\2"+
		"\66\67\7\3\2\2\678\7\31\2\289\5\20\t\29:\7\31\2\2:;\7\4\2\2;<\7\34\2\2"+
		"<>\3\2\2\2=-\3\2\2\2=\65\3\2\2\2>\t\3\2\2\2?@\7\27\2\2@A\7!\2\2AC\7\37"+
		"\2\2BD\7!\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\7\"\2\2FH\7!\2\2GF\3\2\2"+
		"\2GH\3\2\2\2HI\3\2\2\2IJ\7\31\2\2JK\5\20\t\2KL\7\31\2\2L\u0084\3\2\2\2"+
		"MN\7\30\2\2NO\7!\2\2OQ\7\37\2\2PR\7!\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
		"SU\7\"\2\2TV\7!\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W\u0084\5\20\t\2XY\7"+
		"\24\2\2YZ\7!\2\2Z\\\7\37\2\2[]\7!\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2"+
		"^_\7\"\2\2_d\7&\2\2`a\5\24\13\2ab\7(\2\2be\3\2\2\2ce\5\24\13\2d`\3\2\2"+
		"\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\'\2\2i\u0084"+
		"\3\2\2\2jk\7\5\2\2kl\7!\2\2ln\7\37\2\2mo\7!\2\2nm\3\2\2\2no\3\2\2\2op"+
		"\3\2\2\2pr\7\"\2\2qs\7!\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\31\2\2u"+
		"v\5\20\t\2vw\7\31\2\2w\u0084\3\2\2\2xy\7\5\2\2yz\7!\2\2z|\7\37\2\2{}\7"+
		"!\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\"\2\2\177\u0081\7!\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\5\20"+
		"\t\2\u0083?\3\2\2\2\u0083M\3\2\2\2\u0083X\3\2\2\2\u0083j\3\2\2\2\u0083"+
		"x\3\2\2\2\u0084\13\3\2\2\2\u0085\u0086\7\32\2\2\u0086\u0087\7!\2\2\u0087"+
		"\u0088\7 \2\2\u0088\u0089\7\22\2\2\u0089\u008a\7 \2\2\u008a\u008b\7!\2"+
		"\2\u008b\u008c\7\23\2\2\u008c\u008e\7\35\2\2\u008d\u008f\5\6\4\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\36\2\2\u0093\r\3\2\2\2\u0094\u0095"+
		"\7\33\2\2\u0095\u0096\7!\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7!\2\2\u0098"+
		"\u0099\7\16\2\2\u0099\u009b\7\35\2\2\u009a\u009c\5\6\4\2\u009b\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\b\t\1"+
		"\2\u00a2\u00a5\7 \2\2\u00a3\u00a5\7\37\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00bd\3\2\2\2\u00a6\u00a7\f\13\2\2\u00a7\u00a8\7\r\2\2"+
		"\u00a8\u00bc\5\20\t\f\u00a9\u00aa\f\n\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00bc"+
		"\5\20\t\13\u00ac\u00ad\f\t\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00bc\5\20\t"+
		"\n\u00af\u00b0\f\b\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00bc\5\20\t\t\u00b2"+
		"\u00b3\f\7\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00bc\5\20\t\b\u00b5\u00b6\f"+
		"\6\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00bc\5\20\t\7\u00b8\u00b9\f\5\2\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bc\5\20\t\6\u00bb\u00a6\3\2\2\2\u00bb\u00a9\3"+
		"\2\2\2\u00bb\u00ac\3\2\2\2\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\b\n\1\2\u00c1\u00c4\7 \2\2\u00c2\u00c4\7\37\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00d3\3\2\2\2\u00c5\u00c6\f\b\2\2\u00c6\u00c7\t\2"+
		"\2\2\u00c7\u00d2\5\22\n\t\u00c8\u00c9\f\7\2\2\u00c9\u00ca\t\3\2\2\u00ca"+
		"\u00d2\5\22\n\b\u00cb\u00cc\f\6\2\2\u00cc\u00cd\t\4\2\2\u00cd\u00d2\5"+
		"\22\n\7\u00ce\u00cf\f\5\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00d2\5\22\n\6"+
		"\u00d1\u00c5\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e3\7 \2\2\u00d7\u00d9\7\31\2"+
		"\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\7\37\2\2\u00dd\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e3\7\31\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00d8\3\2\2\2"+
		"\u00e3\25\3\2\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7\37\2\2\u00e6\27\3"+
		"\2\2\2\36\35 (+=CGQU\\dfnr|\u0080\u0083\u0090\u009d\u00a4\u00bb\u00bd"+
		"\u00c3\u00d1\u00d3\u00da\u00df\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}