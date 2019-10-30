package core;

/**
 * Created by Nezhinskij VV on 30.10.2019.
 */
public class Desk {  //класс
    private String color;  //поля класса
    private String material;
    private double length;
    private double width;
    private double high;

    public Desk(String material, double length, double width, double high) {  //конструктор
        this.material = material;
        this.length = length;
        this.width = width;
        this.high = high;
        this.color = "white";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public String toString(){
//
//    }

}
