package interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Woman implements Cookable, Washable {
   private String name;
   private int age;

    public Woman() {}

    @Override
    public void cook() {
        System.out.println("I can cook all from fridge");
    }

    @Override
    public void wash() {
        System.out.println("I'm a woman. But I'm not washing machine.");
    }

    @Override
    public void clean() {
        System.out.println("I will clean all house.");
    }
}
