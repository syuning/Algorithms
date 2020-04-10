package main.java.linkedlist;

public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode prev;
    SinglyListNode() {
    }
    public void setValue(int val) {
        this.val = val;
    }

    public int getValue() {
        return this.val;
    }

    public void setPrev(SinglyListNode prev) {
        this.prev = prev;
    }

    public SinglyListNode getPrev() {
        return this.prev;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    public SinglyListNode getNext() {
        return this.next;
    }

}
