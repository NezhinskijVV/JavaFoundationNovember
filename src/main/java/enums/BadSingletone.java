package enums;

public class BadSingletone {
    public final static BadSingletone INSTANCE = new BadSingletone();

    private BadSingletone(){}

}
