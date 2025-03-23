import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("DESHACER")) {
                editor.deshacer();
            } else if (entrada.equalsIgnoreCase("REHACER")) {
                editor.rehacer();
            } else if (entrada.equalsIgnoreCase("MOSTRAR")) {
                editor.mostrar();
            } else if (entrada.equalsIgnoreCase("SALIR")) {
                break;
            } else {
                editor.agregarLinea(entrada);
            }
        }

        scanner.close();
    }
}
