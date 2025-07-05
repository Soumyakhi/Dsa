import java.util.HashMap;
import java.util.Map;

class Node {
    int key, val, freq;
    Node prev, next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.freq = 1;
    }
}

class Dll {
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    Dll() {
        head.next = tail;
        tail.prev = head;
    }

    void insertFirst(Node n) {
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }

    void del(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    boolean isEmpty() {
        return head.next == tail;
    }

    Node delLast() {
        if (isEmpty()) return null;
        Node n = tail.prev;
        del(n);
        return n;
    }
}
public class LFUCache460Leet {
    int cap, minFreq;
    Map<Integer, Node> keyMap = new HashMap<>();
    Map<Integer, Dll> freqMap = new HashMap<>();
    public LFUCache460Leet(int capacity) {
        cap = capacity;
    }
    public int get(int key) {
        if (!keyMap.containsKey(key)) return -1;

        Node n = keyMap.get(key);
        updateFreq(n);
        return n.val;
    }
    public void put(int key, int value) {
        if (cap == 0) return;
        if (keyMap.containsKey(key)) {
            Node n = keyMap.get(key);
            n.val = value;
            updateFreq(n);
        } else {
            if (keyMap.size() == cap) {
                Dll minList = freqMap.get(minFreq);
                Node toRemove = minList.delLast();
                keyMap.remove(toRemove.key);
            }

            Node n = new Node(key, value);
            keyMap.put(key, n);
            freqMap.putIfAbsent(1, new Dll());
            freqMap.get(1).insertFirst(n);
            minFreq = 1;
        }
    }

    void updateFreq(Node n) {
        int oldFreq = n.freq;
        freqMap.get(oldFreq).del(n);
        if (oldFreq == minFreq && freqMap.get(oldFreq).isEmpty()) {
            minFreq++;
        }
        n.freq++;
        freqMap.putIfAbsent(n.freq, new Dll());
        freqMap.get(n.freq).insertFirst(n);
    }
}
