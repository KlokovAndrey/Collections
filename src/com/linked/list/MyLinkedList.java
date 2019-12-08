package com.linked.list;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> root = null;



    public class Node<E> {
        private E element;
        private Node<E> nextNode;

        public Node(E element) {
            this.element = element;
        }
    }


    @Override
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            private Node<E> current = root;

            @Override
            public boolean hasNext() {
                return current.nextNode != null;
            }

            @Override
            public E next() {
                current = current.nextNode;
                return current.element;
            }

            @Override
            public void remove() {
                Node tmp = root;
                while(hasNext() && tmp.nextNode != current){
                    tmp = tmp.nextNode;
                }
                tmp.nextNode = current.nextNode;
                next();
            }


            void forEach(Consumer<? super E> action) {
                Objects.requireNonNull(action);
                Node<E> tmp = root;
                while (tmp!=null) {
                    action.accept(tmp.element);
                    tmp = tmp.nextNode;
                }
            }
        };
    }

    @Override
    public void add(E element) {
        if(root==null){
            root = new Node<E>(element);
        }
        else{
            Node<E> tmp = root;
            while(tmp.nextNode!=null){
                tmp = tmp.nextNode;
            }
            tmp.nextNode = new Node<E>(element);
        }
    }

    @Override
    public void add(int index, E element) {
        if(index==0){
            Node<E> tmp = root;
            root = new Node<E>(element);
            root.nextNode = tmp;
        }
        else {
            int idx = 0;
            Node<E> curr = root;
            while (curr.nextNode != null && idx + 1 != index) {
                curr = curr.nextNode;
                idx++;
            }
            if (idx + 1 == index) {
                Node<E> tmp = curr.nextNode;
                Node<E> tmpIns = new Node(element);
                tmpIns.nextNode = tmp;
                curr.nextNode = tmpIns;
            }
            else{
                System.out.println("Index is bigger then size of Linked List");
            }
        }
    }

    @Override
    public void clear() {
        Node<E> curr = root;
        while (curr != null) {
            Node<E> next = curr.nextNode;
            //root = null;
            curr.nextNode = null;
            curr = next;
        }
        root = null;
    }

    @Override
    public E get(int index) {
        if (root != null) {
            int idx = 0;
            Node<E> curr = root;
            while (curr.nextNode != null && idx != index) {
                curr = curr.nextNode;
                idx++;
            }
            if (idx == index) {
                return curr.element;
            } else {
                System.out.println("Index is bigger then size of Linked List");
                return null;
            }
        } else return null;
    }

    @Override
    public int indexOf(E element) {
        if(root==null) return -1;
        int idx = 0;
        Node<E> curr = root;
        while(curr.nextNode!=null && curr.element!=element){
            curr = curr.nextNode;
            idx++;
        }
        if(curr.element==element){
            return idx;
        } else return -1;
    }

    @Override
    public E remove(int index) {
        if(root==null) return null;
        if(index==0){
            E tmp = root.element;
            root = root.nextNode;
            return tmp;
        }
        int idx = 0;
        Node<E> curr = root;
        while(curr.nextNode!=null && idx+1!=index){
            curr = curr.nextNode;
            idx++;
        }
        if(idx+1==index){
            E tmp = curr.nextNode.element;
            curr.nextNode = curr.nextNode.nextNode;
            return tmp;
        } else return null;
    }

    @Override
    public E set(int index, E element) {
        if(root==null) return null;
        if(index==0){
            E tmp = root.element;
            root.element = element;
            return tmp;
        }
        int idx = 0;
        Node<E> curr = root;
        while(curr.nextNode!=null && idx!=index){
            curr = curr.nextNode;
            idx++;
        }
        if(idx==index){
            E tmp = curr.element;
            curr.element = element;
            return tmp;
        } else return null;
    }

    @Override
    public int size() {
        if(root==null) return 0;
        int count = 1;
        Node<E> curr = root;
        while(curr.nextNode!=null){
            curr = curr.nextNode;
            count++;
        }
        return count;
    }

    @Override
    public E[] toArray() {
        int s = size();
        E a = root.element;
        E[] arr = (E[]) Array.newInstance(a.getClass(), size());
        Node<E> curr = root;
        int idx = 0;
        while(curr!=null){
            arr[idx]=curr.element;
            curr = curr.nextNode;
            idx++;
        }
        //E[] a = (E[]) Array.newInstance(arr, size());
        return arr;
    }


    public String toString(){
        if(root == null) return "error";
        Node<E> curr = root;
        String s = "";
        while(curr!=null){
            s=s+curr.element+" ";
            curr = curr.nextNode;
        }
        return s;
    }
}
