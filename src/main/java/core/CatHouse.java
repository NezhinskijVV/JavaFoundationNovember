package core;

/**
 * Created by Nezhinskij VV on 06.11.2019.
 */
public class CatHouse {
    public static void main(String[] args) {
        System.out.println("I'm Barsik");
        Cat barsik = new Cat();
        barsik.sayMeow();

        System.out.println("I'm Leva");
        Cat leva = new Lion(false);
        leva.sayMeow();
//      leva.killOtherAnimal()  <- ошибка

        System.out.println("I'm killer!");
        Lion killer = new Lion(true);
        killer.killOtherAnimal();
    }
}

