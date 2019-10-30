package core;

/**
 * Created by Nezhinskij VV on 30.10.2019.
 */
public class DeskRunner {
    public static void main(String[] args) { //точка входа в программу
        Desk studentDesk = new Desk("wood", 1.75, 0.5, 0.7);
       System.out.println(studentDesk.getColor());

//        System.out.println("Color по умолчанию: " + studentDesk.color);
//        System.out.println("length по умолчанию: "+  studentDesk.length);

    }
}
