import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteQueue tienda = new ClienteQueue();

        while (true) {
            System.out.print("Ingrese comando: ");
            String input = scanner.nextLine().trim();

            if (input.startsWith("LLEGAR")) {
                String[] partes = input.split(" ", 2);
                if (partes.length == 2) {
                    tienda.agregarCliente(partes[1]);
                } else {
                    System.out.println("Formato incorrecto. Use: LLEGAR [nombre]");
                }
            } else if (input.equals("ATENDER")) {
                tienda.atenderCliente();
            } else if (input.equals("MOSTRAR")) {
                tienda.mostrarFila();
            } else if (input.equals("SALIR")) {
                System.out.println("Saliendo del sistema...");
                break;
            } else {
                System.out.println("Comando no reconocido.");
            }
        }

        scanner.close();
    }
}
