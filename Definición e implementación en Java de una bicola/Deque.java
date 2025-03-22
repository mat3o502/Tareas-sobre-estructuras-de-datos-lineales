public class Deque {
    private int[] deque;
    private int front, rear, size, capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFront(int x) {
        if (isFull()) {
            System.out.println("Overflow al insertar al frente");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0)
            front = capacity - 1;
        else
            front--;

        deque[front] = x;
        size++;
    }

    public void insertRear(int x) {
        if (isFull()) {
            System.out.println("Overflow al insertar al final");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1)
            rear = 0;
        else
            rear++;

        deque[rear] = x;
        size++;
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Underflow al eliminar del frente");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1)
            front = 0;
        else
            front++;

        size--;
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Underflow al eliminar del final");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = capacity - 1;
        else
            rear--;

        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque vacío");
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque vacío");
            return -1;
        }
        return deque[rear];
    }
}
