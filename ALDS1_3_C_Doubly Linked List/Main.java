import java.util.Scanner;

class Main {
    Node nil = new Node();
    
    class Node {
        int key;
        Node next;
        Node prev;
    }

    private void init() {
        nil.next = nil;
        nil.prev = nil;
    }

    private void insert(int key) {
        Node x = new Node();
        x.key = key;
        x.next = nil.next;
        nil.next.prev = x;
        nil.next = x;
        x.prev = null;
    }

    private void deleteFirst() {
        deleteNode(nil.next);
    }

    private void deleteLast() {
        deleteNode(nil.prev);
    } 

    private void deleteKey(int key) {
        deleteNode(listSearch(key));
    }

    private void deleteNode(Node data) {
        if(data == null) return;
        data.prev.next = data.next;
        data.next.prev = data.prev;
    } 

    private Node listSearch(int key) {
        Node cur = nil.next;
        while(cur != nil && cur.key != key) {
            cur = cur.next;
        }
        return cur;
    }

    private void printList() {
        Node cur = nil.next;
        int cnt = 0;
        while(true) {
            if(cur == nil) break;
            if(cnt++ > 0) System.out.print(" ");
            System.out.print(cur.key);
            cur = cur.next;
        }
        System.out.print("\n");
    }

    Main() {
        init();
        int np = 0;
        int nd = 0;
        int size = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String action = sc.next();
            if(action.equals("insert")) {
                insert(sc.nextInt());
                np++;
                size++;
            } else {
                if(action.equals("deleteFirst")) {
                    deleteFirst();
                } else if(action.equals("deleteLast")) {
                    deleteLast();
                } else {
                    deleteKey(sc.nextInt());
                    nd++;
                }
                size--;
            }
        }
        sc.close();
        printList();
    }


    public static void main(String[] args) {
        new Main();
    }
}