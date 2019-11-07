package core;

/**
 * Created by Nezhinskij VV on 06.11.2019.
 */
public class Cat {
    private int countLegs;
    private String colorEyes;

    public Cat(){}

    public Cat(int countLegs, String colorEyes) {
        this.countLegs = countLegs;
        this.colorEyes = colorEyes;
    }

    public void sayMeow(){
        System.out.println("I'm Cat. Meeeeeeooooowwwww!");
    }
}