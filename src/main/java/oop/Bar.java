package oop;

public class Bar {
    public static void main(String[] args) {
        System.out.println("Small bottle");
        Bottle smallBottle = new Bottle(400.00d);
        smallBottle.printIsItBig();
        System.out.println("Big bottle");
        Bottle bigBottle = new Bottle(600.00d);
        bigBottle.printIsItBig();

        System.out.println("Small water bottle");
        WaterBottle smallWaterBottle = new WaterBottle(50.00d);
        smallWaterBottle.printIsItBig();

        System.out.println("Big water bottle");
        WaterBottle bigWaterBottle = new WaterBottle(200.00d);
        bigWaterBottle.printIsItBig();

        System.out.println("Small beer bottle");
        WaterBottle smallBeerBottle = new WaterBottle(900.00d);
        smallWaterBottle.printIsItBig();

        System.out.println("Big beer bottle");
        WaterBottle bigBeerBottle = new WaterBottle(1100.00d);
        bigWaterBottle.printIsItBig();

        System.out.println("________________________");
        printMyBottle(bigBottle);
        printMyBottle(smallBeerBottle);
        printMyBottle(bigBeerBottle);
    }

    public static void printMyBottle(Bottle bottle) {
//        if (bottle instanceof BeerBottle) {
//            BeerBottle beerBottle = (BeerBottle) bottle;
//            beerBottle.printIsItBig();
//        }
        bottle.printIsItBig();
    }

    public static void printWaterBottle(WaterBottle waterBottle) {
        waterBottle.printIsItBig();
    }

    public static void printBeerBottle(BeerBottle beerBottle) {
        beerBottle.printIsItBig();
    }
}

// ДЗ иерархия классов
//           Computer (price, screenLength)
//        /                               \
//       PC                              Notebook
//     /     \                         /     |     \
//    Intel   Amd                   Acer    Mac    Hp
//
// В потомках реализовать класс isItCool()   //зависит от ширины экрана и цены//
// (Computer, можно сделать абстрактными (ключевое слово abstract)

