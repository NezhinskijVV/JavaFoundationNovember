package iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamsRunnable {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = bufferedReader.readLine();
            System.out.println("Наша строка: " + inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Integer.parseInt(s)
        try {
            bufferedReader.close();
        } catch (IOException e) {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

//try with resources
//        BufferedReader bufferedReader;
//        try ( InputStreamReader inputStreamReader = new InputStreamReader(System.in))){
//
//        }
    }
}