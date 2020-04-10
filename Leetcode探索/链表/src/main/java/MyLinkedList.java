package Leetcode探索.链表.src.main.java;

public class MyLinkedList {

    int size;
    SinglyListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index > this.size) {
            return -1;
        }

        SinglyListNode current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        SinglyListNode node = new SinglyListNode();
        node.setValue(val);
        if (this.size == 0) {
            this.head = node;
        } else {
            this.head.prev = node;
        }
        this.size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode node = new SinglyListNode();
        node.setValue(val);
        if (this.size == 0) {
            this.head = node;
        } else {
            this.head.next = node;
        }
        this.size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index <= this.size) {
            SinglyListNode nodeTodeAdded = new SinglyListNode();
            nodeTodeAdded.setValue(val);

            SinglyListNode formerPrev = this.head;
            for (int i = 0; i < index; i++) {
                formerPrev = formerPrev.getNext();
            }

            SinglyListNode formerNext = formerPrev.getNext();

            nodeTodeAdded.setPrev(formerPrev);
            nodeTodeAdded.setNext(formerNext);
            formerPrev.setNext(nodeTodeAdded);
            formerNext.setPrev(nodeTodeAdded);

            this.size++;
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < this.size) {
            SinglyListNode formerPrev = this.head;
            for (int i = 0; i < index - 1; i++) {
                formerPrev = formerPrev.getNext();
            }

            SinglyListNode formerNext = formerPrev.getNext();

            formerPrev.setNext(formerNext);
            formerNext.setPrev(formerPrev);
            this.size--;

        }

    }

    public static void main (String args[]) {
        MyLinkedList obj = new MyLinkedList();

        obj.addAtHead(4);
        obj.addAtTail(6);
        obj.addAtIndex(2,1);
        obj.addAtTail(2);
        obj.addAtTail(3);
        obj.addAtTail(5);

        System.out.println(obj.size);
        // for (int i = 0; i < obj.size; i++) {
        //     System.out.print(obj.get(i) + " -> ");
        // }

        // obj.deleteAtIndex(3);


        // System.out.println(obj.get(0) + " -> " + obj.get(1) + " -> " + obj.get(2) + " -> " + obj.get(3) + " -> " + obj.get(4) + " -> " + obj.get(5));
        // 4 -> 6 -> 1 -> 2 -> 3 -> 5
    }
}
