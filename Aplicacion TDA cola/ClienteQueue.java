import java.util.LinkedList;
import java.util.Queue;

public class ClienteQueue {
    private Queue<String> fila;

    public ClienteQueue() {
        fila = new LinkedList<>();
    }

    // Agregar cliente a la fila
    public void agregarCliente(String nombre) {
        fila.add(nombre);
        System.out.println(nombre + " ha llegado y está en la fila.");
    }

    // Atender al primer cliente en la fila
    public void atenderCliente() {
        if (!fila.isEmpty()) {
            String atendido = fila.poll();
            System.out.println("Atendiendo a: " + atendido);
        } else {
            System.out.println("No hay clientes en la fila.");
        }
    }

    // Mostrar el estado actual de la fila
    public void mostrarFila() {
        System.out.println("Fila actual: " + fila);
    }

    // Verificar si la fila está vacía
    public boolean estaVacia() {
        return fila.isEmpty();
    }
}
