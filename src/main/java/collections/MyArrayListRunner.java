package collections;

import interfaces.Man;

import java.util.List;

public class MyArrayListRunner {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Object());

//        String[] array = new String[10];
//        for(String s: array){
//            if (s == null){
//                s = "5";
//            }
//        }
//
//        for (String s: array
//             ) {
//            System.out.println(s);
//        }
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("1");
        stringMyArrayList.add("2");
        stringMyArrayList.add("3");
        stringMyArrayList.add("4");
        stringMyArrayList.add("5");
        stringMyArrayList.add("6");
        stringMyArrayList.add("7");
        stringMyArrayList.add("8");
        stringMyArrayList.add("9");
        stringMyArrayList.add("10");
//        stringMyArrayList.add("11");
//        stringMyArrayList.add("12");

        System.out.println(stringMyArrayList);

        System.out.println("Size: " + stringMyArrayList.size());
        System.out.println("indexOf " + stringMyArrayList.indexOf("4"));

//        Object object = null;
//        Object object2 = null;
//        System.out.println(object.equals(object2));
    }
}
