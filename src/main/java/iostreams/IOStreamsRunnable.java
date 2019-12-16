package iostreams;

import java.io.*;

public class IOStreamsRunnable {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String inputString = bufferedReader.readLine();
//            System.out.println("Наша строка: " + inputString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        Integer.parseInt(s)
//        try {
//            bufferedReader.close();
//        } catch (IOException e) {
//            try {
//                bufferedReader.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//        try {
//            PrintWriter writer = new PrintWriter(new File("file.txt"));
//            writer.print("Даниил");
//            writer.flush();
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            System.out.println("Вывод файла");
            BufferedReader fileReader = new BufferedReader(new FileReader(new
                    File("C:\\Users\\Vitaliy Nezhinskiy\\IdeaProjects\\JavaFoundationNovember" +
                    "\\file.txt")));
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}