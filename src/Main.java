import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto = new TreeSet<>();

        conjunto.add("João");
        conjunto.add("Maria");
        conjunto.add("Pedro");

        for(String s: conjunto){
            System.out.println(s);
        }

        System.out.println(conjunto.contains("João"));

    }
}