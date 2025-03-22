import java.util.Stack;

public class CarameloProcessor {

    public static Stack<String> procesarCaramelos(Stack<String> pilaOriginal) {
        Stack<String> pilaAux = new Stack<>();
        Stack<String> pilaFinal = new Stack<>();

        // Paso 1: sacar los caramelos y comer los amarillos
        while (!pilaOriginal.isEmpty()) {
            String caramelo = pilaOriginal.pop();
            if (caramelo.equalsIgnoreCase("amarillo")) {
                System.out.println("El niño come caramelo: " + caramelo);
            } else {
                pilaAux.push(caramelo); // guardar los que no son amarillos
            }
        }

        // Paso 2: regresar los caramelos en orden original
        while (!pilaAux.isEmpty()) {
            pilaFinal.push(pilaAux.pop());
        }

        return pilaFinal;
    }
}
