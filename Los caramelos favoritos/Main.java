import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> caramelos = new Stack<>();

        // Simula el paquete original
        caramelos.push("rojo");
        caramelos.push("amarillo");
        caramelos.push("verde");
        caramelos.push("amarillo");
        caramelos.push("naranja");

        System.out.println("Paquete original: " + caramelos);

        Stack<String> resultado = CarameloProcessor.procesarCaramelos(caramelos);

        System.out.println("Caramelos devueltos al paquete: " + resultado);
    }
}
