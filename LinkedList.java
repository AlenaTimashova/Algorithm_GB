package ru.geekbrains;

public class LinkedList {

    Node head;

    public class Node {
        int value;
        Node next;

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
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * @apiNote удаление первого элемента списка
     */
    public void removeFirst() {
        if (head != null) {
            head = head.next;
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

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    /**
     * @apiNote удаление последнего элемента из списка
     */

    public void removeLast() {
        if (head != null) {
            Node currentNode = head;
            if (currentNode.next == null) {
                head = null;
            } else {
                while (currentNode.next != null) {
                    if (currentNode.next.next == null) {
                        currentNode.next = null;
                        return;
                    }
                    currentNode = currentNode.next;
                }
            }
        }
    }

}

