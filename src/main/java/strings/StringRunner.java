package strings;

public class StringRunner {
    public static void main(String[] args) {
        String str1 = "Я замечательная строка";
        String str2 = "Я замечательная строка";

        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("==: " + (str1 == str2));


        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1 == obj2: " + (obj1 == obj2));

        obj2 = obj1;

        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        //== проверка ссылаются ли 2 ссылки на один на тот же объект

//        Object obj3 = new Object();
//        System.out.println("equals:" + obj1.equals(obj3));

        //создание строки без пула
        String s1 = new String("Я строка вне пула");
        String s2 = new String("Я строка вне пула");
        System.out.println("s1 == s2 (вне пула) " + (s1 == s2));
        System.out.println("s1.intern() == s2.intern() (в пуле) "
                + (s1.intern() == s2.intern()));
        System.out.println("s1 == s2 (вне пула) " + (s1 == s2));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(57);
        stringBuilder.append('c');
        System.out.println("stringBuilder " + stringBuilder);

        System.out.println("Циклично конкатенируем строку (создаем новые объекты)");
        System.out.println("Начало для строки");
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
        System.out.println("Конец для строки");

        System.out.println("Делаем тоже самое для StringBuilder");
        System.out.println("Начало для StringBuilder");
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder1.append(i);
        }
        System.out.println("Конец для StringBuilder");

        StringBuffer stringBuffer = new StringBuffer();
    }
}