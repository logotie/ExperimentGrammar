// Generated from C:/Users/pro/IdeaProjects/ExperimentGrammar/src/main/java\SimpleG.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.UUID;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PRINTLN=3, PRINT=4, COMMENTSIGN=5, NONMUTABLE=6, ADD=7, 
		MINUS=8, DIV=9, MUL=10, THEN=11, LESSTHAN=12, MORETHAN=13, EQUALS=14, 
		DOUBLEDOTKEYWORDFORLOOP=15, DOKEYWORDFORLOOP=16, STRINGIDENT=17, NUMIDENT=18, 
		STRINGCHARACTER=19, FORIDENT=20, IF=21, ENDSTATEMENT=22, STARTBRACKET=23, 
		ENDBRACKET=24, ID=25, INT=26, SINGLESPACE=27, EQUALSIGN=28, NEWLINE2=29, 
		WS=30, SPACE=31, ARRSTART=32, ARREND=33, COMMA=34;
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
			null, "'('", "')'", "'println'", "'print'", "'#'", "':'", "'+'", "'-'", 
			"'/'", "'*'", "'then'", "'<'", "'>'", "'=='", "'..'", "'do'", "'string'", 
			"'num'", "'\"'", "'for'", "'if'", "';'", "'{'", "'}'", null, null, null, 
			"'='", null, null, null, "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINTLN", "PRINT", "COMMENTSIGN", "NONMUTABLE", "ADD", 
			"MINUS", "DIV", "MUL", "THEN", "LESSTHAN", "MORETHAN", "EQUALS", "DOUBLEDOTKEYWORDFORLOOP", 
			"DOKEYWORDFORLOOP", "STRINGIDENT", "NUMIDENT", "STRINGCHARACTER", "FORIDENT", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
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
			UUID uuid = UUID.randomUUID();
			return getRuleContext(ForloopContext.class,0);
		}
		public IfstatContext ifstat() {
			UUID uuid = UUID.randomUUID();
			return getRuleContext(IfstatContext.class,0);
		}
		public ExprContext expr() {
			UUID uuid = UUID.randomUUID();
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext assignment() {
			UUID uuid = UUID.randomUUID();
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleGParser.SINGLESPACE, i);
		}
		public SysfuncContext sysfunc() {
			UUID uuid = UUID.randomUUID();
			return getRuleContext(SysfuncContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
			UUID uuid = UUID.randomUUID();

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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				forloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				ifstat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(33);
						match(SINGLESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				sysfunc();
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

	public static class SysfuncContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SimpleGParser.PRINT, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(SimpleGParser.PRINTLN, 0); }
		public SysfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterSysfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitSysfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitSysfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysfuncContext sysfunc() throws RecognitionException {
		SysfuncContext _localctx = new SysfuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sysfunc);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(PRINT);
				setState(42);
				match(T__0);
				setState(43);
				match(STRINGCHARACTER);
				setState(44);
				expr(0);
				setState(45);
				match(STRINGCHARACTER);
				setState(46);
				match(T__1);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(PRINTLN);
				setState(49);
				match(T__0);
				setState(50);
				match(STRINGCHARACTER);
				setState(51);
				expr(0);
				setState(52);
				match(STRINGCHARACTER);
				setState(53);
				match(T__1);
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
	public static class AssignmutableContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmutableContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignmutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignmutable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigndigitsnonmutableContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode NONMUTABLE() { return getToken(SimpleGParser.NONMUTABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigndigitsnonmutableContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssigndigitsnonmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssigndigitsnonmutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssigndigitsnonmutable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigndigitsmutablesingletypeContext extends AssignmentContext {
		public TerminalNode NUMIDENT() { return getToken(SimpleGParser.NUMIDENT, 0); }
		public TerminalNode SINGLESPACE() { return getToken(SimpleGParser.SINGLESPACE, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigndigitsmutablesingletypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssigndigitsmutablesingletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssigndigitsmutablesingletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssigndigitsmutablesingletype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraymutableassignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public TerminalNode ARRSTART() { return getToken(SimpleGParser.ARRSTART, 0); }
		public TerminalNode ARREND() { return getToken(SimpleGParser.ARREND, 0); }
		public List<ArrvalueContext> arrvalue() {
			return getRuleContexts(ArrvalueContext.class);
		}
		public ArrvalueContext arrvalue(int i) {
			return getRuleContext(ArrvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleGParser.COMMA, i);
		}
		public ArraymutableassignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterArraymutableassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitArraymutableassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitArraymutableassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignstringnonmutableContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode NONMUTABLE() { return getToken(SimpleGParser.NONMUTABLE, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignstringnonmutableContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignstringnonmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignstringnonmutable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignstringnonmutable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignstringnonmutablesingletypeContext extends AssignmentContext {
		public TerminalNode STRINGIDENT() { return getToken(SimpleGParser.STRINGIDENT, 0); }
		public TerminalNode SINGLESPACE() { return getToken(SimpleGParser.SINGLESPACE, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode NONMUTABLE() { return getToken(SimpleGParser.NONMUTABLE, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignstringnonmutablesingletypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignstringnonmutablesingletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignstringnonmutablesingletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignstringnonmutablesingletype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArraynonmutableassignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode NONMUTABLE() { return getToken(SimpleGParser.NONMUTABLE, 0); }
		public TerminalNode ARRSTART() { return getToken(SimpleGParser.ARRSTART, 0); }
		public TerminalNode ARREND() { return getToken(SimpleGParser.ARREND, 0); }
		public List<ArrvalueContext> arrvalue() {
			return getRuleContexts(ArrvalueContext.class);
		}
		public ArrvalueContext arrvalue(int i) {
			return getRuleContext(ArrvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleGParser.COMMA, i);
		}
		public ArraynonmutableassignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterArraynonmutableassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitArraynonmutableassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitArraynonmutableassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignstringmutablesingletypeContext extends AssignmentContext {
		public TerminalNode STRINGIDENT() { return getToken(SimpleGParser.STRINGIDENT, 0); }
		public TerminalNode SINGLESPACE() { return getToken(SimpleGParser.SINGLESPACE, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignstringmutablesingletypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignstringmutablesingletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignstringmutablesingletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignstringmutablesingletype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignstringmutablechangetypeContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode EQUALSIGN() { return getToken(SimpleGParser.EQUALSIGN, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignstringmutablechangetypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssignstringmutablechangetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssignstringmutablechangetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssignstringmutablechangetype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigndigitsnonmutablesingletypeContext extends AssignmentContext {
		public TerminalNode NUMIDENT() { return getToken(SimpleGParser.NUMIDENT, 0); }
		public TerminalNode SINGLESPACE() { return getToken(SimpleGParser.SINGLESPACE, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public TerminalNode NONMUTABLE() { return getToken(SimpleGParser.NONMUTABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigndigitsnonmutablesingletypeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAssigndigitsnonmutablesingletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAssigndigitsnonmutablesingletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAssigndigitsnonmutablesingletype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new AssignstringmutablesingletypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(STRINGIDENT);
				setState(58);
				match(SINGLESPACE);
				setState(59);
				match(ID);
				setState(60);
				match(EQUALSIGN);
				setState(61);
				match(STRINGCHARACTER);
				setState(62);
				expr(0);
				setState(63);
				match(STRINGCHARACTER);
				}
				break;
			case 2:
				_localctx = new AssigndigitsmutablesingletypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(NUMIDENT);
				setState(66);
				match(SINGLESPACE);
				setState(67);
				match(ID);
				setState(68);
				match(EQUALSIGN);
				setState(69);
				expr(0);
				}
				break;
			case 3:
				_localctx = new AssignstringmutablechangetypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(ID);
				setState(71);
				match(EQUALSIGN);
				setState(72);
				match(STRINGCHARACTER);
				setState(73);
				expr(0);
				setState(74);
				match(STRINGCHARACTER);
				}
				break;
			case 4:
				_localctx = new AssignmutableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(ID);
				setState(77);
				match(EQUALSIGN);
				setState(78);
				expr(0);
				}
				break;
			case 5:
				_localctx = new AssignstringnonmutablesingletypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(STRINGIDENT);
				setState(80);
				match(SINGLESPACE);
				setState(81);
				match(ID);
				setState(82);
				match(NONMUTABLE);
				setState(83);
				match(STRINGCHARACTER);
				setState(84);
				expr(0);
				setState(85);
				match(STRINGCHARACTER);
				}
				break;
			case 6:
				_localctx = new AssigndigitsnonmutablesingletypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(NUMIDENT);
				setState(88);
				match(SINGLESPACE);
				setState(89);
				match(ID);
				setState(90);
				match(NONMUTABLE);
				setState(91);
				expr(0);
				}
				break;
			case 7:
				_localctx = new AssignstringnonmutableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(ID);
				setState(93);
				match(NONMUTABLE);
				setState(94);
				match(STRINGCHARACTER);
				setState(95);
				expr(0);
				setState(96);
				match(STRINGCHARACTER);
				}
				break;
			case 8:
				_localctx = new AssigndigitsnonmutableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(ID);
				setState(99);
				match(NONMUTABLE);
				setState(100);
				expr(0);
				}
				break;
			case 9:
				_localctx = new ArraymutableassignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(ID);
				setState(102);
				match(EQUALSIGN);
				setState(103);
				match(ARRSTART);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(104);
						arrvalue();
						setState(105);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(107);
						arrvalue();
						}
						break;
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGCHARACTER || _la==INT );
				setState(112);
				match(ARREND);
				}
				break;
			case 10:
				_localctx = new ArraynonmutableassignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				match(ID);
				setState(115);
				match(NONMUTABLE);
				setState(116);
				match(ARRSTART);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(117);
						arrvalue();
						setState(118);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(120);
						arrvalue();
						}
						break;
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGCHARACTER || _la==INT );
				setState(125);
				match(ARREND);
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
		public TerminalNode FORIDENT() { return getToken(SimpleGParser.FORIDENT, 0); }
		public List<TerminalNode> SINGLESPACE() { return getTokens(SimpleGParser.SINGLESPACE); }
		public TerminalNode SINGLESPACE(int i) {
			return getToken(SimpleGParser.SINGLESPACE, i);
		}
		public List<TerminalNode> INT() { return getTokens(SimpleGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGParser.INT, i);
		}
		public TerminalNode DOUBLEDOTKEYWORDFORLOOP() { return getToken(SimpleGParser.DOUBLEDOTKEYWORDFORLOOP, 0); }
		public TerminalNode DOKEYWORDFORLOOP() { return getToken(SimpleGParser.DOKEYWORDFORLOOP, 0); }
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
		enterRule(_localctx, 10, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FORIDENT);
			setState(130);
			match(SINGLESPACE);
			setState(131);
			match(INT);
			setState(132);
			match(DOUBLEDOTKEYWORDFORLOOP);
			setState(133);
			match(INT);
			setState(134);
			match(SINGLESPACE);
			setState(135);
			match(DOKEYWORDFORLOOP);
			setState(136);
			match(STARTBRACKET);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				block();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
			setState(142);
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
		enterRule(_localctx, 12, RULE_ifstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IF);
			setState(145);
			match(SINGLESPACE);
			setState(146);
			conditon(0);
			setState(147);
			match(SINGLESPACE);
			setState(148);
			match(THEN);
			setState(149);
			match(STARTBRACKET);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				block();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << STRINGIDENT) | (1L << NUMIDENT) | (1L << FORIDENT) | (1L << IF) | (1L << ID) | (1L << INT) | (1L << SINGLESPACE))) != 0) );
			setState(155);
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
		public TerminalNode DIV() { return getToken(SimpleGParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitDiv(this);
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
		public TerminalNode ADD() { return getToken(SimpleGParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitAdd(this);
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
		public TerminalNode MINUS() { return getToken(SimpleGParser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitMinus(this);
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
		public TerminalNode LESSTHAN() { return getToken(SimpleGParser.LESSTHAN, 0); }
		public LessthancompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterLessthancompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitLessthancompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitLessthancompare(this);
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
		public TerminalNode MUL() { return getToken(SimpleGParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdendContext extends ExprContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public IdendContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterIdend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitIdend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitIdend(this);
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
		public TerminalNode MORETHAN() { return getToken(SimpleGParser.MORETHAN, 0); }
		public MorethancompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterMorethancompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitMorethancompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitMorethancompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntendContext extends ExprContext {
		public TerminalNode INT() { return getToken(SimpleGParser.INT, 0); }
		public IntendContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterIntend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitIntend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitIntend(this);
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
		public TerminalNode EQUALS() { return getToken(SimpleGParser.EQUALS, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitEquality(this);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(163);
						match(MUL);
						}
						setState(164);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(166);
						match(DIV);
						}
						setState(167);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(169);
						match(ADD);
						}
						setState(170);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(172);
						match(MINUS);
						}
						setState(173);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new LessthancompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(175);
						match(LESSTHAN);
						}
						setState(176);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new MorethancompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(178);
						match(MORETHAN);
						}
						setState(179);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(EQUALS);
						setState(182);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode EQUALS() { return getToken(SimpleGParser.EQUALS, 0); }
		public CondequalityContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondequality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondequality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondintContext extends ConditonContext {
		public TerminalNode INT() { return getToken(SimpleGParser.INT, 0); }
		public CondintContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondidContext extends ConditonContext {
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public CondidContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondid(this);
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
		public TerminalNode MUL() { return getToken(SimpleGParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimpleGParser.DIV, 0); }
		public CondmultdivContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondmultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondmultdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondmultdiv(this);
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
		public TerminalNode LESSTHAN() { return getToken(SimpleGParser.LESSTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(SimpleGParser.MORETHAN, 0); }
		public CondlessgreaterContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondlessgreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondlessgreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondlessgreater(this);
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
		public TerminalNode ADD() { return getToken(SimpleGParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(SimpleGParser.MINUS, 0); }
		public CondplusminusContext(ConditonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterCondplusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitCondplusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitCondplusminus(this);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new CondintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new CondidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new CondmultdivContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						conditon(7);
						}
						break;
					case 2:
						{
						_localctx = new CondplusminusContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						conditon(6);
						}
						break;
					case 3:
						{
						_localctx = new CondlessgreaterContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==LESSTHAN || _la==MORETHAN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						conditon(5);
						}
						break;
					case 4:
						{
						_localctx = new CondequalityContext(new ConditonContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditon);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						match(EQUALS);
						setState(204);
						conditon(4);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TerminalNode> INT() { return getTokens(SimpleGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SimpleGParser.INT, i);
		}
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public List<TerminalNode> STRINGCHARACTER() { return getTokens(SimpleGParser.STRINGCHARACTER); }
		public TerminalNode STRINGCHARACTER(int i) {
			return getToken(SimpleGParser.STRINGCHARACTER, i);
		}
		public ArrvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterArrvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitArrvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitArrvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrvalueContext arrvalue() throws RecognitionException {
		ArrvalueContext _localctx = new ArrvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrvalue);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(211);
					match(STRINGCHARACTER);
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRINGCHARACTER );
				setState(216);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217);
					match(INT);
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(222);
				match(STRINGCHARACTER);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENTSIGN() { return getToken(SimpleGParser.COMMENTSIGN, 0); }
		public TerminalNode ID() { return getToken(SimpleGParser.ID, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleGListener ) ((SimpleGListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleGVisitor ) return ((SimpleGVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(COMMENTSIGN);
			setState(226);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\4\3\4\3\4\6\4"+
		"%\n\4\r\4\16\4&\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\6\6o\n\6\r\6\16\6p\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6|\n\6\r\6\16\6}\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\6\7\u008d\n\7\r\7\16\7\u008e\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\6\b\u009a\n\b\r\b\16\b\u009b\3\b\3\b\3\t\3\t\3\t\5\t\u00a3\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u00ba\n\t\f\t\16\t\u00bd\13\t\3\n\3\n\3\n\5\n\u00c2"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d0\n\n\f\n"+
		"\16\n\u00d3\13\n\3\13\3\13\6\13\u00d7\n\13\r\13\16\13\u00d8\3\13\3\13"+
		"\6\13\u00dd\n\13\r\13\16\13\u00de\3\13\5\13\u00e2\n\13\3\f\3\f\3\f\3\f"+
		"\2\4\20\22\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\13\f\3\2\t\n\3\2\16\17"+
		"\2\u0103\2\30\3\2\2\2\4\33\3\2\2\2\6)\3\2\2\2\b9\3\2\2\2\n\u0081\3\2\2"+
		"\2\f\u0083\3\2\2\2\16\u0092\3\2\2\2\20\u00a2\3\2\2\2\22\u00c1\3\2\2\2"+
		"\24\u00e1\3\2\2\2\26\u00e3\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\34\5"+
		"\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3"+
		"\2\2\2\37*\5\f\7\2 *\5\16\b\2!*\5\20\t\2\"*\5\n\6\2#%\7\35\2\2$#\3\2\2"+
		"\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(*\5\b\5\2)\37\3\2\2\2) \3"+
		"\2\2\2)!\3\2\2\2)\"\3\2\2\2)$\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\7\6\2\2,"+
		"-\7\3\2\2-.\7\25\2\2./\5\20\t\2/\60\7\25\2\2\60\61\7\4\2\2\61:\3\2\2\2"+
		"\62\63\7\5\2\2\63\64\7\3\2\2\64\65\7\25\2\2\65\66\5\20\t\2\66\67\7\25"+
		"\2\2\678\7\4\2\28:\3\2\2\29+\3\2\2\29\62\3\2\2\2:\t\3\2\2\2;<\7\23\2\2"+
		"<=\7\35\2\2=>\7\33\2\2>?\7\36\2\2?@\7\25\2\2@A\5\20\t\2AB\7\25\2\2B\u0082"+
		"\3\2\2\2CD\7\24\2\2DE\7\35\2\2EF\7\33\2\2FG\7\36\2\2G\u0082\5\20\t\2H"+
		"I\7\33\2\2IJ\7\36\2\2JK\7\25\2\2KL\5\20\t\2LM\7\25\2\2M\u0082\3\2\2\2"+
		"NO\7\33\2\2OP\7\36\2\2P\u0082\5\20\t\2QR\7\23\2\2RS\7\35\2\2ST\7\33\2"+
		"\2TU\7\b\2\2UV\7\25\2\2VW\5\20\t\2WX\7\25\2\2X\u0082\3\2\2\2YZ\7\24\2"+
		"\2Z[\7\35\2\2[\\\7\33\2\2\\]\7\b\2\2]\u0082\5\20\t\2^_\7\33\2\2_`\7\b"+
		"\2\2`a\7\25\2\2ab\5\20\t\2bc\7\25\2\2c\u0082\3\2\2\2de\7\33\2\2ef\7\b"+
		"\2\2f\u0082\5\20\t\2gh\7\33\2\2hi\7\36\2\2in\7\"\2\2jk\5\24\13\2kl\7$"+
		"\2\2lo\3\2\2\2mo\5\24\13\2nj\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2rs\7#\2\2s\u0082\3\2\2\2tu\7\33\2\2uv\7\b\2\2v{\7\"\2"+
		"\2wx\5\24\13\2xy\7$\2\2y|\3\2\2\2z|\5\24\13\2{w\3\2\2\2{z\3\2\2\2|}\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7#\2\2\u0080\u0082\3"+
		"\2\2\2\u0081;\3\2\2\2\u0081C\3\2\2\2\u0081H\3\2\2\2\u0081N\3\2\2\2\u0081"+
		"Q\3\2\2\2\u0081Y\3\2\2\2\u0081^\3\2\2\2\u0081d\3\2\2\2\u0081g\3\2\2\2"+
		"\u0081t\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\35"+
		"\2\2\u0085\u0086\7\34\2\2\u0086\u0087\7\21\2\2\u0087\u0088\7\34\2\2\u0088"+
		"\u0089\7\35\2\2\u0089\u008a\7\22\2\2\u008a\u008c\7\31\2\2\u008b\u008d"+
		"\5\6\4\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\32\2\2\u0091\r\3\2\2"+
		"\2\u0092\u0093\7\27\2\2\u0093\u0094\7\35\2\2\u0094\u0095\5\22\n\2\u0095"+
		"\u0096\7\35\2\2\u0096\u0097\7\r\2\2\u0097\u0099\7\31\2\2\u0098\u009a\5"+
		"\6\4\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\32\2\2\u009e\17\3\2\2"+
		"\2\u009f\u00a0\b\t\1\2\u00a0\u00a3\7\34\2\2\u00a1\u00a3\7\33\2\2\u00a2"+
		"\u009f\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00bb\3\2\2\2\u00a4\u00a5\f\13"+
		"\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00ba\5\20\t\f\u00a7\u00a8\f\n\2\2\u00a8"+
		"\u00a9\7\13\2\2\u00a9\u00ba\5\20\t\13\u00aa\u00ab\f\t\2\2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ba\5\20\t\n\u00ad\u00ae\f\b\2\2\u00ae\u00af\7\n\2\2"+
		"\u00af\u00ba\5\20\t\t\u00b0\u00b1\f\7\2\2\u00b1\u00b2\7\16\2\2\u00b2\u00ba"+
		"\5\20\t\b\u00b3\u00b4\f\6\2\2\u00b4\u00b5\7\17\2\2\u00b5\u00ba\5\20\t"+
		"\7\u00b6\u00b7\f\5\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00ba\5\20\t\6\u00b9"+
		"\u00a4\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ad\3\2"+
		"\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\21\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\n\1\2\u00bf\u00c2\7\34\2\2\u00c0"+
		"\u00c2\7\33\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00d1\3"+
		"\2\2\2\u00c3\u00c4\f\b\2\2\u00c4\u00c5\t\2\2\2\u00c5\u00d0\5\22\n\t\u00c6"+
		"\u00c7\f\7\2\2\u00c7\u00c8\t\3\2\2\u00c8\u00d0\5\22\n\b\u00c9\u00ca\f"+
		"\6\2\2\u00ca\u00cb\t\4\2\2\u00cb\u00d0\5\22\n\7\u00cc\u00cd\f\5\2\2\u00cd"+
		"\u00ce\7\20\2\2\u00ce\u00d0\5\22\n\6\u00cf\u00c3\3\2\2\2\u00cf\u00c6\3"+
		"\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00e2\7\34\2\2\u00d5\u00d7\7\25\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00e2\7\33\2\2\u00db\u00dd\7\34\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\7\25\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\7\33\2"+
		"\2\u00e5\27\3\2\2\2\26\35&)9np{}\u0081\u008e\u009b\u00a2\u00b9\u00bb\u00c1"+
		"\u00cf\u00d1\u00d8\u00de\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}