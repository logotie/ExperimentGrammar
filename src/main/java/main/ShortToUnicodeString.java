package main;
import grammar.*;

/** Convert short array inits like {1,2,3} to "\u0001\u0002\u0003" */
public class ShortToUnicodeString extends SimpleDraftGBaseListener {
    /**
     * Translate { to "
     */
    @Override
    public void enterStat(SimpleDraftGParser.StatContext ctx) {
        System.out.println("Enter Stat");
    }

    /**
     * Translate } to "
     */
    @Override
    public void exitStat(SimpleDraftGParser.StatContext ctx) {
        System.out.print("Exit Stat");
    }

    /**
     * Translate integers to 4-digit hexadecimal strings prefixed with \\u
     */
    @Override
    public void enterBlock(SimpleDraftGParser.BlockContext ctx) {
// Assumes no nested array initializers
        //int value = Integer.valueOf(ctx.INT().getText());
        //System.out.printf("\\u%04x", value);

        //System.out.println("Found a block");

        Starter.Global_Blocks_iq.add(ctx);
        //System.out.println(ctx.start.toString());
        //System.out.println(ctx.stop.toString());


    }


    @Override
    public void enterForloop(SimpleDraftGParser.ForloopContext forloopContext){
        System.out.println("For loop");
    }

    @Override
    public void enterIfstat(SimpleDraftGParser.IfstatContext ifStatementContext){
        System.out.println("if statement");
    }


}