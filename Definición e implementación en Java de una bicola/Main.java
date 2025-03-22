public class Main {
    public static void main(String[] args) {
        Deque miDeque = new Deque(5);

        System.out.println("Insertando por el final: 10, 20");
        miDeque.insertRear(10);
        miDeque.insertRear(20);

        System.out.println("Insertando por el frente: 5");
        miDeque.insertFront(5);

        System.out.println("Elemento al frente: " + miDeque.getFront());
        System.out.println("Elemento al final: " + miDeque.getRear());

        System.out.println("Eliminando del frente...");
        miDeque.deleteFront();
        System.out.println("Nuevo frente: " + miDeque.getFront());

        System.out.println("Eliminando del final...");
        miDeque.deleteRear();
        System.out.println("Nuevo final: " + miDeque.getRear());
    }
}
