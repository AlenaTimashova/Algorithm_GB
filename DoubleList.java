package ru.geekbrains;

public class DoubleList {
    Node head;
    Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /**
     * @param value добавляемое значение
     * @apiNote добавление элемента в связанный список
     */
    public void addFirst(int value) {

        Node newNode = new Node();
        newNode.value = value;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * @apiNote удаление первого элемента списка
     */
    public void removeFirst() {
        if (head != null && head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
    }

    /**
     * @param value искомый элемент
     * @return значение boolean true если элемент найден, в противном случае - false
     * @apiNote проверка есть ли элемент в списке
     */
    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * @param value добавляемый элемент
     * @apiNote добавление элемента в конец списка
     */

    public void addLast(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (tail != null) {
            tail.next = newNode;
            newNode.previous = tail;
        } else {
            head = newNode;
        }
        tail = newNode;
    }

    /**
     * @apiNote удаление последнего элемента из списка
     */

    public void removeLast() {
        if (tail != null && tail.previous != null) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            head = null;
            tail = null;
        }
    }

    public void revertList() {

        Node currentNode = head;

        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null) {
                tail = currentNode;
            }

            if (next == null) {
                head = currentNode;
            }

            currentNode = next;
        }
    }

}
