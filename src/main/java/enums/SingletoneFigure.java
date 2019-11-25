package enums;

public class SingletoneFigure {
    private static SingletoneFigure instance;

    private SingletoneFigure() {
    }

    public static SingletoneFigure getInstance() {
        if (instance != null) return instance;
        instance = new SingletoneFigure();
        return instance;
    }

    public void print() {
        System.out.println("Я самый классный объект!");
    }
}