import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();
        pilha.push("João");
        pilha.push("Maria");
        pilha.push("Pedro");

        System.out.println("Topo da pilha: "+pilha.peek());

        while(!pilha.empty()){
            System.out.println(pilha.pop());
        }


    }
}