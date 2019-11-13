package static_work.lectures;

public class Key {
    public static void main(String[] args) {
        LapTop hp = new LapTop(14.0, "HP");
        LapTop lenovo = new LapTop(3000.0, "Lenovo");

        System.out.println("hp " + hp.getColor());
        hp.setColor("blue");
        System.out.println("After blue");
        System.out.println("lenovo " + lenovo.getColor());

        LapTop.color = "purple";
        System.out.println("After purple");
        System.out.println("lenovo " + lenovo.getColor());
        System.out.println("hp " + hp.getColor());

        Math.sqrt(5.0);


    }
}
