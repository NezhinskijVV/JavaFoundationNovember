package enums;

public class EnumsRunner {
    public static void main(String[] args) {
        Figure figure = Figure.valueOf("CIRCLE");
        System.out.println(figure);

        figure.print();

    }
}
