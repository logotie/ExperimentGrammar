package engine.util;

public class EngineConstants {

    public enum Types{
        ARITHMETIC, ASSIGNMUTABLE;
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
