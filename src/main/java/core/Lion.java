package core;

/**
 * Created by Nezhinskij VV on 06.11.2019.
 */
public class Lion extends Cat {
    private boolean isWild;


    public Lion(boolean isWild){
//        super(4, "green");
        this.isWild = isWild;
    }

    public void killOtherAnimal(){
        System.out.println("Animal has been killed!");
    }

    @Override
    public void sayMeow() {
        System.out.println("I'm Simba!Meeeeeeooooowwwww!");
    }
}
