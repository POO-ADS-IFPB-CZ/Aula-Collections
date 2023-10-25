import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.offer("João");
        fila.offer("Maria");
        fila.offer("Pedro");

        System.out.println("Primeiro da fila: "+fila.peek());

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }


    }
}