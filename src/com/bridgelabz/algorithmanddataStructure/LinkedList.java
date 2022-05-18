package com.bridgelabz.algorithmanddataStructure;

public class LinkedList <E extends Comparable<E>> {
        Node<E> head;
        Node<E> tail;
        public void add(E data) {
            Node<E> newNode = new Node<E>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
        public void append(E data) {
            Node<E> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void insertBetween(E data) {
            Node<E> newNode = new Node<>(data);
            head.next = newNode;
            newNode.next = tail;
        }
        public void orderdList(E data) {
            Node<E> newNode = new Node<E>(data);
            Node<E> temp = head;
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else if(head.data.compareTo(data) > 0)
            {
                newNode.next = head;
                head = newNode;
                tail = newNode.next;
            }
            else if(tail.data.compareTo(data) > 0) {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void display() {
            Node<E> temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

