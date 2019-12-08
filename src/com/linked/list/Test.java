package com.linked.list;

import com.book.Author;
import com.book.Book;

import java.util.LinkedList;

public class Test {

    public Test() {

        //Add elements
        MyLinkedList<Book> myLinkedList = new MyLinkedList<Book>();
        LinkedList<Book> linkedList = new LinkedList<Book>();
        long timeBegin = System.nanoTime();
        for(int i=0;i<100000; i++){
            myLinkedList.add(new Book());
        }
        long timeEnd = System.nanoTime();
        System.out.println("Time Add MyLinked List" + '\n'+  (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        for(int i=0;i<100000; i++){
            linkedList.add(new Book());
        }
        timeEnd = System.nanoTime();
        System.out.println("Time Add Linked List"+ '\n' + (timeEnd-timeBegin));

        //Add by index

        timeBegin = System.nanoTime();
        myLinkedList.add(9990, new Book("New", new Author[2], 200));
        timeEnd = System.nanoTime();
        System.out.println("Add by index MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.add(9990, new Book("New", new Author[2], 200));
        timeEnd = System.nanoTime();
        System.out.println("Add by index LinkedList" + '\n' + (timeEnd-timeBegin));


        //Get by index
        timeBegin = System.nanoTime();
        myLinkedList.get(99700);
        timeEnd = System.nanoTime();
        System.out.println("Get by index MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.get(99700);
        timeEnd = System.nanoTime();
        System.out.println("Get by index LinkedList" + '\n' + (timeEnd-timeBegin));


        //indexOf
        Book book = new Book("New", new Author[2], 200);
        timeBegin = System.nanoTime();
        myLinkedList.indexOf(book);
        timeEnd = System.nanoTime();
        System.out.println("IndexOf MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.indexOf(book);
        timeEnd = System.nanoTime();
        System.out.println("Get LinkedList" + '\n' + (timeEnd-timeBegin));

        //Remove
        timeBegin = System.nanoTime();
        myLinkedList.remove(88880);
        timeEnd = System.nanoTime();
        System.out.println("Remove by index MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.remove(88880);
        timeEnd = System.nanoTime();
        System.out.println("Remove by index LinkedList" + '\n' + (timeEnd-timeBegin));


        //Set
        timeBegin = System.nanoTime();
        myLinkedList.set(50000, book);
        timeEnd = System.nanoTime();
        System.out.println("Set MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.set(50000, book);
        timeEnd = System.nanoTime();
        System.out.println("Set LinkedList" + '\n' + (timeEnd-timeBegin));


        //Size
        timeBegin = System.nanoTime();
        myLinkedList.size();
        timeEnd = System.nanoTime();
        System.out.println("Size MyLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.size();
        timeEnd = System.nanoTime();
        System.out.println("Size LinkedList" + '\n' + (timeEnd-timeBegin));


        //Clear list
        timeBegin = System.nanoTime();
        myLinkedList.clear();
        timeEnd = System.nanoTime();
        System.out.println("Clear myLinkedList" + '\n' + (timeEnd-timeBegin));

        timeBegin = System.nanoTime();
        linkedList.clear();
        timeEnd = System.nanoTime();
        System.out.println("Clear LinkedList" + '\n' +(timeEnd-timeBegin));


        //forEach
        MyLinkedList<Integer> myLinkedList1 = new MyLinkedList<>();
        for(int i=0; i<10; i++){
            myLinkedList1.add(i);
        }

    }



}

