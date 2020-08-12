package engine.util;

public class EngineConstants {

    public final String ASSIGNSTRING = "ASTR";
    public final String ASSIGNNUM = "ANUM";
    public final String ASSIGNSTRARR = "ANUM";
    public final String ASSIGNNUMARR = "ANUM";

    public enum Types{
        ARITHMETIC, ASSIGNMUTABLE;
    }

    public enum InstructionType{
        ARITHMETIC, ASSIGNMENT, LOOP, CONDITION, SYSTEMFUNCTION
    }

    public enum VarTypes{
        MUTABLENUM, MUTABLESTR, NONMUTABLESTR, NONMUTABLENUM;
    }

    public enum LiteralTypes{
        NUM, STR
    }

    public enum InstructionTypes{
        ASSIGNMENT, EXPR, ARRVALUES
    }

    public enum TerminalTypes{
        ARRVALUE, EXPR, FORLOOPCOUNTER, IFSTATEMENTCOUNTER
    }

}
