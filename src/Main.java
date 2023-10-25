import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> minhaLista = new ArrayList<>();

        minhaLista.add("João");
        minhaLista.add("Maria");
        minhaLista.add(0, "Pedro");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.set(1, "João da Silva"));
        minhaLista.remove("Pedro");

        System.out.println(minhaLista);


    }
}