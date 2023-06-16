package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);
        linkList.printList();

        linkList.addLast(25);
        linkList.addLast(22);
        linkList.addLast(21);
        linkList.printList();

        System.out.println("linkList.contains(55) = " + linkList.contains(55));
        System.out.println("linkList.contains(22) = " + linkList.contains(22));

        linkList.removeLast();
        linkList.printList();
        linkList.removeFirst();
        linkList.printList();

        DoubleList doubList = new DoubleList();
        doubList.addFirst(1);
        doubList.addFirst(2);
        doubList.addFirst(3);
        doubList.addFirst(4);
        doubList.printList();
        doubList.removeFirst();
        doubList.printList();
        doubList.addLast(33);
        doubList.printList();
        doubList.removeLast();
        doubList.printList();
        doubList.revertList();
        doubList.printList();
    }
}