package oop.equals;

import java.util.Objects;

public class Cat {
    private String colorOfEyes;
    private boolean isFoldEar;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return this.isFoldEar == cat.isFoldEar &&
                colorOfEyes.equals(cat.colorOfEyes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorOfEyes, isFoldEar);
    }
}
