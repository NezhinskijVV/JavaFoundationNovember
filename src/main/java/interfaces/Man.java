package interfaces;

public class Man implements Cookable, Cloneable, Comparable<Man> {
    private String name;
    private int age;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void cook() {
        System.out.println("I can cook only eggs");
    }

    @Override
    public void clean() {
        System.out.println("Everything is clean!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Man o) {
//        return this.getName().compareTo(o.getName());
//        return  (this.getAge() - o.getAge());   //лучше -1, 1 0
        int res = this.getAge() - o.getAge();
        if (res < 0) return -1;
        if (res > 0) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}

//HW: 1. Comparable, Cloneable для Woman
//    2. Создать Юлию и других женщин добавить в массив  и отсортировать.