package interfaces;

import java.util.Arrays;

public class House {
    public static void main(String[] args) {
        Cookable person1 = new Man();
        Cookable person2 = new Woman();

        person1.cook();
        person2.cook();

        Washable washable1 = new Woman();
        Washable washable2 = new WashingMachine();

        washable1.wash();
        washable2.wash();

        Cleanable cleanable = new Man();
        cleanable.clean();

        Man man = new Man("Vitalik");
        System.out.println("man1: " + man.getName());

        try {
//            Man man2 = ;
            System.out.println("man2: " + ((Man) man.clone()).getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

//        Woman trans = (Woman) new Object();  <-- ClassCastException
        Man vitalik = new Man("Vitalik", 29);
        Man einar = new Man("Einar", 33);
        Man gosha = new Man("Gosha", 25);
        Man daniil = new Man("Daniil", 27);
        Man andrey = new Man ("Andrey", 29);

        Man[] arrayRealMans = new Man[]{vitalik, einar,gosha,daniil,andrey};
        System.out.println("Мужики");
        System.out.println(Arrays.toString(arrayRealMans));
        Arrays.sort(arrayRealMans);
        System.out.println(Arrays.toString(arrayRealMans));

    }
}
