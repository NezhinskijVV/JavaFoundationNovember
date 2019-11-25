package enums;

public class SingletoneRunner {
    public static void main(String[] args) {
       SingletoneFigure singletoneFigure = SingletoneFigure.getInstance();
       singletoneFigure.print();
      //SingletoneFigure singletoneFigure1 = new SingletoneFigure();   <-- ошибка (приватный конструктор)

        EnumSingletone.INSTANCE.print();
    }
}
//HW:
//1. Понять и Выучить реализацию синглтона (через Enum)
//1.+ Разобраться в чем отличие 3 реализаций и какая лучше и чем?
//2. Поиграться с методами String