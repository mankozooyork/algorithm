class MyLinkedList {

    public class Node{
        int val;
        Node next;
        Node(int x) { val = x; }
    }
    
    Node head;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new Node(0);
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        
        Node cur = head; 
        for(int i=0; i < index+1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        size++;
        
        Node cur = head;
        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }
        
        Node newNode = new Node(val);
        newNode.next = cur.next;
        cur.next = newNode;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {        
        
        if(index < 0 || index >= size) {
            return;
        }
        
        Node cur = head;
        for(int i = 0; i < index; i++) { 
            cur = cur.next;
        }
        
        cur.next = cur.next.next;
        
        size--;
    }
}