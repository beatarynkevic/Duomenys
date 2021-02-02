package duomenys;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Duomenys {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt");) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println(b);
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
        System.out.println("pabaiga");

//        InputStream is; //duomenu ivedimui, is isore i java
//        OutputStream os; //duomenu isvedimui, is javos i isore
//        //statinis kintamasis out
//        System.out.println("Hello World!");
//        System.err.println("Hello RED");
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        System.out.println(line);
    }

}
