package main.java.linkedlist;

public class MyLinkedList {

    int size;
    SinglyListNode head;
    SinglyListNode tail;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    /** Get the value of the index-th node in the linked list.
     * If the index is invalid, return -1. */
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

    /** Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        SinglyListNode node = new SinglyListNode();
        node.setValue(val);
        node.setPrev(null);
        node.setNext(null);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.head.setPrev(node);
            node.setNext(this.head);
            this.head = node;
        }
        this.size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode node = new SinglyListNode();
        node.setValue(val);
        node.setPrev(null);
        node.setNext(null);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            node.setPrev(this.tail);
            this.tail = node;
        }
        this.size++;
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < this.size) {
            SinglyListNode nodeToBeAdded = new SinglyListNode();
            nodeToBeAdded.setValue(val);

            if (index == 0) {
                this.head.setPrev(nodeToBeAdded);
                nodeToBeAdded.setNext(this.head);
                this.head = nodeToBeAdded;
                this.size++;
            } else {
                SinglyListNode next = this.head;
                for (int i = 0; i < index - 1; i++) {
                    next = next.getNext();
                }
                SinglyListNode prev = next.prev;

                prev.setNext(nodeToBeAdded);
                nodeToBeAdded.setPrev(prev);
                next.setPrev(nodeToBeAdded);
                nodeToBeAdded.setNext(next);

                this.size++;
            }
        } else if (index == this.size) {
            this.addAtTail(val);

            this.size++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < this.size) {
            SinglyListNode formerPrev = this.head;
            if (index == 0) {
                this.head = this.head.getNext();
                this.head.setPrev(null);
            }
            for (int i = 0; i < index - 1; i++) {
                formerPrev = formerPrev.getNext();
            }

            SinglyListNode formerNext = formerPrev.getNext();

            formerPrev.setNext(formerNext);
            formerNext.setPrev(formerPrev);

            this.size--;

        }
    }

}
