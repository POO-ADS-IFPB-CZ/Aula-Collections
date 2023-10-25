import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Pessoa> conjunto = new TreeSet<>();

        Pessoa pessoa = new Pessoa("111.111.111-01", "João");

        conjunto.add(pessoa);
        conjunto.add(new Pessoa("222.222.222-02", "Maria"));

        System.out.println(conjunto.contains(
                pessoa));

    }
}