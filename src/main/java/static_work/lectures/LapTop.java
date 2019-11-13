package static_work.lectures;

public class LapTop {
    static String color = "black";
    private double screenSize;
    String companyName;

    public LapTop(double screenSize, String companyName) {
        this.screenSize = screenSize;
        this.companyName = companyName;
    }

    public void setColor(String color) {
        LapTop.color = color;
    }

    public String getColor() {
        return color;
    }
}
