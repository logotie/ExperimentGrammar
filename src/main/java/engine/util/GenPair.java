package engine.util;

public class GenPair<T, T2> {

    // T stands for "Type"
    private T t; private T2 t2;

    public GenPair(T t, T2 t2){
        this.t = t;
        this.t2 = t2;
    }

    public T getT() { return t; }

    public T2 getT2() {return t2;}

}
