import java.util.LinkedList;

public class DesignCirCularQueue622Leet {
    LinkedList<Integer> ll;
    int size, front, rear;

    public DesignCirCularQueue622Leet(int k) {
        this.ll = new LinkedList<>();
        this.size = k;
        this.front = -1;
        this.rear = - 1;
    }

    public boolean enQueue(int value) {
        if ((front == 0 && rear == size - 1) ||
                (rear == (front - 1) % (size - 1))) {
            return false;
        }
        else if(front == -1)
        {
            front = 0;
            rear = 0;
            ll.add(rear, value);
        }
        else if(rear == size - 1 && front != 0)
        {
            rear = 0;
            ll.set(rear, value);
        }
        return true;
    }

    public boolean deQueue() {
        if (ll.size() == 0) {
            return false;
        }
        ll.removeFirst();
        return false;
    }

    public int Front() {
        if (ll.size() == 0) {
            return -1;
        }
        return ll.getFirst();
    }

    public int Rear() {
        if (ll.size() == 0) {
            return -1;
        }
        return ll.getLast();
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    public boolean isFull() {
        return false;
    }
}
