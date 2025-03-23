import java.util.Stack;
public class EditorTexto {
private Stack<String> texto; // Pila principal para almacenar líneas de texto
private Stack<String> historialDeshacer; // Pila para almacenar acciones deshechas
public EditorTexto() {
this.texto = new Stack<>();
this.historialDeshacer = new Stack<>();
}
public void agregarLinea(String linea) {
texto.push(linea);
historialDeshacer.clear(); // Limpiar historial de rehacer cuando se agrega una nueva línea
}
public void deshacer() {
if (!texto.isEmpty()) {
historialDeshacer.push(texto.pop());
}
}
public void rehacer() {
if (!historialDeshacer.isEmpty()) {
texto.push(historialDeshacer.pop());
}
}
public void mostrar() {
for (String linea : texto) {
System.out.println(linea);
}
}
}