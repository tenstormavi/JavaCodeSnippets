package HashMapInternal;

import java.util.HashMap;

public class MyHashMap<K, V> {

    // The size of hashmap will always be 2^something.
    private static final int INITIAL_SIZE = 1 << 4; // 16 -> 2^4
    private static final int MAXIMUM_CAPACITY = 1 << 30; // 2^30

    Entry[] hashTable;

    class Entry<K,V> {

        K key;
        V value;
        Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    MyHashMap(int capacity) {
        // Find the next bigger 2^something value
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V value) {
        // Find the bucket index using key's hashcode
        int hashcode = key.hashCode() % hashTable.length; // % to get the value inside the limit only
        Entry node = hashTable[hashcode];

        if (node == null) {
            Entry newNode = new Entry<>(key, value);
            hashTable[hashcode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry<>(key, value);
            previousNode.next = newNode;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while(node != null) {
            if (node.key == key) {
                return (V) node.value;
            }
            node= node.next;
        }
        return null;
    }

    public static void main(String args[]) {
        MyHashMap<Integer, String> map = new MyHashMap<>(7);
        map.put(1, "hello");
        map.put(2, "Hi");

        String value = map.get(2);
        System.out.println(value);
    }
}
