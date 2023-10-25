import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> minhaLista = new ArrayList<>();

        minhaLista.add(new Pessoa("111.111.111-01", "João"));
        minhaLista.add(new Pessoa("222.222.222-02", "Maria"));

        minhaLista.add(0, new Pessoa("333.333.333-03", "Pedro"));

        System.out.println(minhaLista);

        System.out.println("Tamanho: "+minhaLista.size());

        System.out.println(minhaLista.contains(
                new Pessoa("111.111.111-01", "João")));

        System.out.println(minhaLista.indexOf(new Pessoa(
                "333.333.333-03", "Pedro")));

        //Só funciona de 0 até size()
        minhaLista.add(3, new Pessoa("444.444.444-04",
                "José"));

        System.out.println(minhaLista);


    }
}