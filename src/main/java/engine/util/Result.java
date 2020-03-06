package engine.util;

public class Result {

    private int result = 0;
    private boolean intActivated;
    private String resultString = "";
    private boolean stringActivated;


    public void addInt(int res){
        result=res;
        intActivated=true;
    }

    public void addString(String res){
        resultString=res;
        stringActivated=true;
    }

    public boolean stringStored(){return stringActivated;}

    public boolean intStored(){return intActivated;}

    public String getResultString(){return resultString;}
    
    public int getResultInt(){return result;}
}
