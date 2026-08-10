package LinkedList;

import java.time.chrono.MinguoDate;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


    //***********Print statement start******* //
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Head: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    //Add value at end
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;

        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    //***********Print statement End******* //

    //Add value at start
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    //remove the last element of list
    public Node removeLast() {
        Node temp = head;
        Node pre = head;

        if (length == 0) return null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            tail = null;
            head = null;
        }

        return temp;

    }

    public Node removeFirst() {
        Node temp = head;

        if (length == 0) return null;

        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    public Node get(int index) {

        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;

    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        Node newNode = new Node(value);

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;


    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node pre = get(index - 1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;


    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }

    }

    public Node findMiddleMan() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public boolean hasLoop() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;

        }
        return false;
    }

    public Node findKNode(int k) {
        Node slow = head;
        Node fast = head;
        if (k <= 0) return null;
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public void removeDuplicates() {

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.value == runner.next.value) {
                    runner.next = runner.next.next;
                    length--;
                } else {
                    runner = runner.next;
                }

            }
            current = current.next;
        }

    }

    public int binaryToInteger() {
        Node current = head;
        int num = 0;

        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }

        return num;
    }

    public void partitionList(int x) {
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node prev1 = d1;
        Node prev2 = d2;
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = d2.next;
        head = d1.next;

    }

    public void reverseBetween(int m, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < m; i++) {
            prev = prev.next;
        }

        Node current = prev.next;

        for (int i = 0; i < n - m; i++) {
            Node temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        head = dummy.next;

    }


    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        if (head == null || head.next == null) {
            return;
        }

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            //
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first;

        }
        head = dummy.next;

    }

}
