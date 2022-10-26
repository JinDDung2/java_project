package week6.algorithm;

import java.util.ArrayList;
import java.util.List;

public class HashTableV2 {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    List<Node>[] table = new ArrayList[1000];

    public int hash(String str) {
        int asciiSum = 0;
        for (int i = 0; i < str.length(); i++) {
            asciiSum += str.charAt(i);
        }
        return asciiSum % 1000;
    }

    public void insert(String key, int value) {
        int hashCode = hash(key);
        if (table[hashCode] == null) {
            table[hashCode] = new ArrayList<>();
        }
        table[hashCode].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTableV2 ht = new HashTableV2();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);
        Integer result = ht.get("Yoonseo");
        Integer result2 = ht.get("Seoyoon");

        if (result == 1) {
            System.out.println("success");
        } else {
            System.out.printf("fail, value:%d", result);
        }

        if (result2 == 2) {
            System.out.println("success");
        } else {
            System.out.printf("fail, value:%d", result2);
        }


    }

}
