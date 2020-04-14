package test.java.linkedlist;

import main.java.linkedlist.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {

    public static void printList(MyLinkedList list) {
        System.out.println("size = " + list.getSize());

        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + (i < list.getSize() - 1 ? " -> " : ""));
        }

        System.out.println();
    }

    @Test
    public void testAddAtTail() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtTail(5);
        obj.addAtTail(3);
        obj.addAtTail(2);
        obj.addAtTail(1);
        obj.addAtTail(6);
        obj.addAtTail(4);

        printList(obj);

        assertEquals(obj.get(0), 5);
        assertEquals(obj.get(1), 3);
        assertEquals(obj.get(2), 2);
        assertEquals(obj.get(3), 1);
        assertEquals(obj.get(4), 6);
        assertEquals(obj.get(5), 4);
    }

    @Test
    public void testAddAtHead() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(4);
        obj.addAtHead(6);
        obj.addAtHead(1);
        obj.addAtHead(2);
        obj.addAtHead(3);
        obj.addAtHead(5);

        printList(obj);

        assertEquals(obj.get(0), 5);
        assertEquals(obj.get(1), 3);
        assertEquals(obj.get(2), 2);
        assertEquals(obj.get(3), 1);
        assertEquals(obj.get(4), 6);
        assertEquals(obj.get(5), 4);
    }

    @Test
    public void testAddAtIndex() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtIndex(0, 5);
        obj.addAtIndex(1, 3);
        obj.addAtIndex(2, 2);
        obj.addAtIndex(3, 1);
        obj.addAtIndex(4, 6);
        obj.addAtIndex(5, 4);

        printList(obj);

         assertEquals(obj.get(0), 5);
         assertEquals(obj.get(1), 3);
         assertEquals(obj.get(2), 2);
         assertEquals(obj.get(3), 1);
         assertEquals(obj.get(4), 6);
         assertEquals(obj.get(5), 4);
    }

    @Test
    public void testDeleteAtIndex() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtIndex(0, 5);
        obj.addAtIndex(1, 3);
        obj.addAtIndex(2, 2);
        obj.addAtIndex(3, 1);
        obj.addAtIndex(4, 6);
        obj.addAtIndex(5, 4);

        printList(obj);

        obj.deleteAtIndex(0);
        printList(obj);
    }

}
