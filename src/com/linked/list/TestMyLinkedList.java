package com.linked.list;


import java.util.Arrays;


public class TestMyLinkedList {

    public TestMyLinkedList() {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.forEach(System.out::println);
        System.out.println(myLinkedList.size());
        myLinkedList.set(3, 12);
        myLinkedList.remove(2);
        System.out.println(myLinkedList.indexOf(2));
        System.out.println(myLinkedList.get(2));
        myLinkedList.add(3, 5);
        Integer arr[] = myLinkedList.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(myLinkedList.toString());
        myLinkedList.clear();

    }


}
