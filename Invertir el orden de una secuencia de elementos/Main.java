import java.util.Stack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Lista original
        int[] lista = {1, 2, 3, 4, 5};

        // Imprimir original
        System.out.println("Lista original: " + Arrays.toString(lista));

        // Crear pila
        Stack<Integer> pila = new Stack<>();

        // Empujar elementos a la pila
        for (int num : lista) {
            pila.push(num);
        }

        // Sacar elementos de la pila e invertir la lista
        for (int i = 0; i < lista.length; i++) {
            lista[i] = pila.pop();
        }

        // Lista invertida
        System.out.println("Lista invertida: " + Arrays.toString(lista));
    }
}
