package edu.escuelaing.arep.Utils;

public class LinkedList {

    private Node head;

    /**
     * Insert a number in a the linked list
     * @param data number that is going to be inserted.
     * @return list with the number inserted.
     */
    public LinkedList insert(float data)
    {

        Node new_node = new Node(data);
        new_node.next = null;


        if (this.head == null) {
            this.head = new_node;
        }
        else {

            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return this;
    }

    /**
     * Delete a item from the linked list by its key.
     *
     * @param key key to be deleted.
     * @return list without the key.
     * @throws Exception When the key was not founded on the list
     */
    public LinkedList deleteByKey(int key) throws Exception {

        Node currNode = this.head;
        Node prev = null;

        if (currNode != null && currNode.data == key) {
            this.head = currNode.next;
            return this;
        }

        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }


        if (currNode != null) {
            prev.next = currNode.next;
        }

        if (currNode == null) {
            throw new Exception("Key not found");
        }

        return this;
    }

    /**
     * Gets a item from the linked list by its index.
     *
     * @param index index to be wrapped.
     * @return data found in the index;
     * @throws Exception When the the index is out of range of the list length.
     */
    public double get(int index) throws Exception {
        if (index > size()) {
            throw new Exception("Index out of range");
        }
        double answ = 0;
        Node node;
        node = head;
        if (index == 0) {
            answ = head.data;
        } else {
            node = node.next;
            while (index > 0) {
                index--;
                answ = node.data;
                node = node.next;
            }
        }
        return answ;
    }

    /**
     * Delete a item from the linked list by its index.
     *
     * @param index index to be deleted.
     * @return list without the key that was in the index.
     * @throws Exception When the the index is out of range of the list length.
     */
    public LinkedList deleteAtPosition(int index) throws Exception {

        Node currNode = this.head, prev = null;
        if (index == 0 && currNode != null) {
            this.head = currNode.next;
            return this;
        }
        int counter = 0;
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            throw new Exception("Index out of range");
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");

        Node node;
        node = head;

        while (node != null) {
            str.append(node.data).append(" ");

            node = node.next;
        }
        str.append("]");
        return str.toString();
    }

    /**
     * Gets the number of keys in the linked list.
     *
     * @return number of keys.
     */
    public int size() {
        int size = 0;
        Node node;
        node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;

    }

    /**
     * Represents a node of the linked list
     */
    static class Node {
        float data;
        Node next;


        Node(float d) {
            data = d;
            next = null;
        }
    }


}

