package duomenys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Duomenys {

    public static void main(String[] args) {
//        String s = "Labas\r\npasauli";
//        System.out.println(s);

        try (
                FileInputStream fis = new FileInputStream("a.txt"); //irasom
                Reader fr = new InputStreamReader(fis, "UTF-8"); //ji sskiato byte(duomenis) is streamo ir byte isver i simbolius
                //          FileOutputStream fos = new FileOutputStream("ab.txt", true); //skaitom, true -tai append parametras(papildyti)
                BufferedReader br = new BufferedReader(fr); //
            ) {
                String s;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            
//            int b;
//            while ((b = fr.read()) != -1) { //skaito viena byte
//                char c = (char) b;
//                System.out.println(c);
////                fos.write(b);
//            }
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

        String s = "Labas pasauli ar viskas gerai"; //sukuriamas masyvas 5 elementu ir atspausdinam
        String[] parts = s.split(" ");
        
        List<String> l = new ArrayList(); //rusiavimas
        for (String part : parts) {
            l.add(part);
        }
        System.out.println(l);
        
        class Tikrintojas implements Comparator { //objekas comparator
//List turi metoda sort,kuriam reikalingas Comparator.
            //Comparator'ui reikia vieno metodo, kad implementuoti si interface.
            //Metodas compare tikrina,kuris is objektu dydesnis. Turim grazinti skaiciu: neigiama, nulis arba teigiama
            //jeigu o1<, tai teigiamas, jeigu o2< ,tai neigiamas, o jeigu lygus tai 0
            
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                
                return s1.length() - s2.length();
                
//                if(s1.length() > s2.length()) {
//                    return 1;
//                } else if (s1.length() == s2.length()) {
//                    return 0;
//                } else {
//                    return -1;
//                }
                
            }

        }
//        Comparator c = new Tikrintojas();
//        Comparator c = new Comparator() //interface. Abstrakti klase
//        {
//            int counter = 0;
//            @Override
//            public int compare(Object o1, Object o2) {
//                counter++;
//                String s1 = (String) o1;
//                String s2 = (String) o2;
//
//                return s1.length() - s2.length();
//            }
//            public int squareCounter() {
//                return this.counter * this.counter;
//            }
//        };
            Comparator<String> c = (o1, o2) -> { //lambda. Metodo implementacija
                String s1 = (String) o1; //neturi kintamojo this
                String s2 = (String) o2;
                System.out.println(s1);
                System.out.println(s2);
                
                return s2.length() - s1.length();
            };

            l.sort (c);
            System.out.println (l);
            System.out.println ("---------");
    }

}
